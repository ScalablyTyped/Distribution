package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Labels")
@js.native
class ResourceUsersLabels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.labels.create
    * @desc Creates a new label.
    * @alias gmail.users.labels.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaLabel] = js.native
  def create(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def create(params: ParamsResourceUsersLabelsCreate): GaxiosPromise[SchemaLabel] = js.native
  def create(params: ParamsResourceUsersLabelsCreate, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def create(
    params: ParamsResourceUsersLabelsCreate,
    options: BodyResponseCallback[SchemaLabel],
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  def create(params: ParamsResourceUsersLabelsCreate, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def create(
    params: ParamsResourceUsersLabelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * gmail.users.labels.delete
    * @desc Immediately and permanently deletes the specified label and removes
    * it from any messages and threads that it is applied to.
    * @alias gmail.users.labels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceUsersLabelsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersLabelsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersLabelsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersLabelsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersLabelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.labels.get
    * @desc Gets the specified label.
    * @alias gmail.users.labels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to retrieve.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLabel] = js.native
  def get(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def get(params: ParamsResourceUsersLabelsGet): GaxiosPromise[SchemaLabel] = js.native
  def get(params: ParamsResourceUsersLabelsGet, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def get(
    params: ParamsResourceUsersLabelsGet,
    options: BodyResponseCallback[SchemaLabel],
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  def get(params: ParamsResourceUsersLabelsGet, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def get(
    params: ParamsResourceUsersLabelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * gmail.users.labels.list
    * @desc Lists all labels in the user's mailbox.
    * @alias gmail.users.labels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLabelsResponse]): Unit = js.native
  def list(params: ParamsResourceUsersLabelsList): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(params: ParamsResourceUsersLabelsList, callback: BodyResponseCallback[SchemaListLabelsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersLabelsList,
    options: BodyResponseCallback[SchemaListLabelsResponse],
    callback: BodyResponseCallback[SchemaListLabelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersLabelsList, options: MethodOptions): GaxiosPromise[SchemaListLabelsResponse] = js.native
  def list(
    params: ParamsResourceUsersLabelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLabelsResponse]
  ): Unit = js.native
  /**
    * gmail.users.labels.patch
    * @desc Updates the specified label. This method supports patch semantics.
    * @alias gmail.users.labels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLabel] = js.native
  def patch(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def patch(params: ParamsResourceUsersLabelsPatch): GaxiosPromise[SchemaLabel] = js.native
  def patch(params: ParamsResourceUsersLabelsPatch, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def patch(
    params: ParamsResourceUsersLabelsPatch,
    options: BodyResponseCallback[SchemaLabel],
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersLabelsPatch, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def patch(
    params: ParamsResourceUsersLabelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  /**
    * gmail.users.labels.update
    * @desc Updates the specified label.
    * @alias gmail.users.labels.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the label to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().Label} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLabel] = js.native
  def update(callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def update(params: ParamsResourceUsersLabelsUpdate): GaxiosPromise[SchemaLabel] = js.native
  def update(params: ParamsResourceUsersLabelsUpdate, callback: BodyResponseCallback[SchemaLabel]): Unit = js.native
  def update(
    params: ParamsResourceUsersLabelsUpdate,
    options: BodyResponseCallback[SchemaLabel],
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
  def update(params: ParamsResourceUsersLabelsUpdate, options: MethodOptions): GaxiosPromise[SchemaLabel] = js.native
  def update(
    params: ParamsResourceUsersLabelsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabel]
  ): Unit = js.native
}


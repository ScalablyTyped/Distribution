package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Contacts")
@js.native
class ResourceContacts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.contacts.delete
    * @desc Deletes a contact.
    * @alias mirror.contacts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceContactsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContactsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceContactsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceContactsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContactsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * mirror.contacts.get
    * @desc Gets a single contact by ID.
    * @alias mirror.contacts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaContact] = js.native
  def get(callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def get(params: ParamsResourceContactsGet): GaxiosPromise[SchemaContact] = js.native
  def get(params: ParamsResourceContactsGet, callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def get(
    params: ParamsResourceContactsGet,
    options: BodyResponseCallback[SchemaContact],
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  def get(params: ParamsResourceContactsGet, options: MethodOptions): GaxiosPromise[SchemaContact] = js.native
  def get(
    params: ParamsResourceContactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  /**
    * mirror.contacts.insert
    * @desc Inserts a new contact.
    * @alias mirror.contacts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaContact] = js.native
  def insert(callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def insert(params: ParamsResourceContactsInsert): GaxiosPromise[SchemaContact] = js.native
  def insert(params: ParamsResourceContactsInsert, callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def insert(
    params: ParamsResourceContactsInsert,
    options: BodyResponseCallback[SchemaContact],
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  def insert(params: ParamsResourceContactsInsert, options: MethodOptions): GaxiosPromise[SchemaContact] = js.native
  def insert(
    params: ParamsResourceContactsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  /**
    * mirror.contacts.list
    * @desc Retrieves a list of contacts for the authenticated user.
    * @alias mirror.contacts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaContactsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaContactsListResponse]): Unit = js.native
  def list(params: ParamsResourceContactsList): GaxiosPromise[SchemaContactsListResponse] = js.native
  def list(params: ParamsResourceContactsList, callback: BodyResponseCallback[SchemaContactsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceContactsList,
    options: BodyResponseCallback[SchemaContactsListResponse],
    callback: BodyResponseCallback[SchemaContactsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceContactsList, options: MethodOptions): GaxiosPromise[SchemaContactsListResponse] = js.native
  def list(
    params: ParamsResourceContactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContactsListResponse]
  ): Unit = js.native
  /**
    * mirror.contacts.patch
    * @desc Updates a contact in place. This method supports patch semantics.
    * @alias mirror.contacts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaContact] = js.native
  def patch(callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def patch(params: ParamsResourceContactsPatch): GaxiosPromise[SchemaContact] = js.native
  def patch(params: ParamsResourceContactsPatch, callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def patch(
    params: ParamsResourceContactsPatch,
    options: BodyResponseCallback[SchemaContact],
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  def patch(params: ParamsResourceContactsPatch, options: MethodOptions): GaxiosPromise[SchemaContact] = js.native
  def patch(
    params: ParamsResourceContactsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  /**
    * mirror.contacts.update
    * @desc Updates a contact in place.
    * @alias mirror.contacts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the contact.
    * @param {().Contact} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaContact] = js.native
  def update(callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def update(params: ParamsResourceContactsUpdate): GaxiosPromise[SchemaContact] = js.native
  def update(params: ParamsResourceContactsUpdate, callback: BodyResponseCallback[SchemaContact]): Unit = js.native
  def update(
    params: ParamsResourceContactsUpdate,
    options: BodyResponseCallback[SchemaContact],
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
  def update(params: ParamsResourceContactsUpdate, options: MethodOptions): GaxiosPromise[SchemaContact] = js.native
  def update(
    params: ParamsResourceContactsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContact]
  ): Unit = js.native
}


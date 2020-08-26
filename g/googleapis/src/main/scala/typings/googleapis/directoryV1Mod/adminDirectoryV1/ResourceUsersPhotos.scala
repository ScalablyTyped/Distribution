package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users$Photos")
@js.native
class ResourceUsersPhotos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.users.photos.delete
    * @desc Remove photos for the user
    * @alias directory.users.photos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersPhotosDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersPhotosDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersPhotosDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersPhotosDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersPhotosDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.photos.get
    * @desc Retrieve photo of a user
    * @alias directory.users.photos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(params: ParamsResourceUsersPhotosGet): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(params: ParamsResourceUsersPhotosGet, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def get(
    params: ParamsResourceUsersPhotosGet,
    options: BodyResponseCallback[SchemaUserPhoto],
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  def get(params: ParamsResourceUsersPhotosGet, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(
    params: ParamsResourceUsersPhotosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  /**
    * directory.users.photos.patch
    * @desc Add a photo for the user. This method supports patch semantics.
    * @alias directory.users.photos.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().UserPhoto} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(params: ParamsResourceUsersPhotosPatch): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(params: ParamsResourceUsersPhotosPatch, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPhotosPatch,
    options: BodyResponseCallback[SchemaUserPhoto],
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPhotosPatch, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(
    params: ParamsResourceUsersPhotosPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  /**
    * directory.users.photos.update
    * @desc Add a photo for the user
    * @alias directory.users.photos.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().UserPhoto} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(params: ParamsResourceUsersPhotosUpdate): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(params: ParamsResourceUsersPhotosUpdate, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def update(
    params: ParamsResourceUsersPhotosUpdate,
    options: BodyResponseCallback[SchemaUserPhoto],
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  def update(params: ParamsResourceUsersPhotosUpdate, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(
    params: ParamsResourceUsersPhotosUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
}


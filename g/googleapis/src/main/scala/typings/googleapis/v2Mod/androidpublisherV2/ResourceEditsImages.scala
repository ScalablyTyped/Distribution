package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Edits$Images")
@js.native
class ResourceEditsImages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.edits.images.delete
    * @desc Deletes the image (specified by id) from the edit.
    * @alias androidpublisher.edits.images.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageId Unique identifier an image within the set of images attached to this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceEditsImagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsImagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsImagesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsImagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEditsImagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.deleteall
    * @desc Deletes all images for the specified language and image type.
    * @alias androidpublisher.edits.images.deleteall
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteall(): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]): Unit = js.native
  def deleteall(params: ParamsResourceEditsImagesDeleteall): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    options: BodyResponseCallback[SchemaImagesDeleteAllResponse],
    callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  def deleteall(params: ParamsResourceEditsImagesDeleteall, options: MethodOptions): GaxiosPromise[SchemaImagesDeleteAllResponse] = js.native
  def deleteall(
    params: ParamsResourceEditsImagesDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesDeleteAllResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.list
    * @desc Lists all images for the specified language and image type.
    * @alias androidpublisher.edits.images.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaImagesListResponse]): Unit = js.native
  def list(params: ParamsResourceEditsImagesList): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(params: ParamsResourceEditsImagesList, callback: BodyResponseCallback[SchemaImagesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEditsImagesList,
    options: BodyResponseCallback[SchemaImagesListResponse],
    callback: BodyResponseCallback[SchemaImagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsImagesList, options: MethodOptions): GaxiosPromise[SchemaImagesListResponse] = js.native
  def list(
    params: ParamsResourceEditsImagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.edits.images.upload
    * @desc Uploads a new image and adds it to the list of images for the
    * specified language and image type.
    * @alias androidpublisher.edits.images.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.editId Unique identifier for this edit.
    * @param {string} params.imageType
    * @param {string} params.language The language code (a BCP-47 language tag) of the localized listing whose images are to read or modified. For example, to select Austrian German, pass "de-AT".
    * @param {string} params.packageName Unique identifier for the Android app that is being updated; for example, "com.spiffygame".
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaImagesUploadResponse]): Unit = js.native
  def upload(params: ParamsResourceEditsImagesUpload): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    callback: BodyResponseCallback[SchemaImagesUploadResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    options: BodyResponseCallback[SchemaImagesUploadResponse],
    callback: BodyResponseCallback[SchemaImagesUploadResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceEditsImagesUpload, options: MethodOptions): GaxiosPromise[SchemaImagesUploadResponse] = js.native
  def upload(
    params: ParamsResourceEditsImagesUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImagesUploadResponse]
  ): Unit = js.native
}


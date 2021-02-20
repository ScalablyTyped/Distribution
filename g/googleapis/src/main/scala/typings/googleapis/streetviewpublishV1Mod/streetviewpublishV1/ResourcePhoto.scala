package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Resource$Photo")
@js.native
class ResourcePhoto protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * streetviewpublish.photo.create
    * @desc After the client finishes uploading the photo with the returned
    * UploadRef, CreatePhoto publishes the uploaded Photo to Street View on
    * Google Maps.  Currently, the only way to set heading, pitch, and roll in
    * CreatePhoto is through the [Photo Sphere XMP
    * metadata](https://developers.google.com/streetview/spherical-metadata) in
    * the photo bytes. CreatePhoto ignores the  `pose.heading`, `pose.pitch`,
    * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.  This
    * method returns the following error codes:  *
    * google.rpc.Code.INVALID_ARGUMENT if the request is malformed or if the
    * uploaded photo is not a 360 photo. * google.rpc.Code.NOT_FOUND if the
    * upload reference does not exist. * google.rpc.Code.RESOURCE_EXHAUSTED if
    * the account has reached the storage limit.
    * @alias streetviewpublish.photo.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Photo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaPhoto] = js.native
  def create(callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def create(params: ParamsResourcePhotoCreate): GaxiosPromise[SchemaPhoto] = js.native
  def create(params: ParamsResourcePhotoCreate, callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def create(
    params: ParamsResourcePhotoCreate,
    options: BodyResponseCallback[SchemaPhoto],
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
  def create(params: ParamsResourcePhotoCreate, options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def create(
    params: ParamsResourcePhotoCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
  
  /**
    * streetviewpublish.photo.delete
    * @desc Deletes a Photo and its metadata.  This method returns the
    * following error codes:  * google.rpc.Code.PERMISSION_DENIED if the
    * requesting user did not create the requested photo. *
    * google.rpc.Code.NOT_FOUND if the photo ID does not exist.
    * @alias streetviewpublish.photo.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.photoId Required. ID of the Photo.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePhotoDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourcePhotoDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourcePhotoDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePhotoDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourcePhotoDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * streetviewpublish.photo.get
    * @desc Gets the metadata of the specified Photo.  This method returns the
    * following error codes:  * google.rpc.Code.PERMISSION_DENIED if the
    * requesting user did not create the requested Photo. *
    * google.rpc.Code.NOT_FOUND if the requested Photo does not exist. *
    * google.rpc.Code.UNAVAILABLE if the requested Photo is still being
    * indexed.
    * @alias streetviewpublish.photo.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    * @param {string} params.photoId Required. ID of the Photo.
    * @param {string=} params.view Specifies if a download URL for the photo bytes should be returned in the Photo response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPhoto] = js.native
  def get(callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def get(params: ParamsResourcePhotoGet): GaxiosPromise[SchemaPhoto] = js.native
  def get(params: ParamsResourcePhotoGet, callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def get(
    params: ParamsResourcePhotoGet,
    options: BodyResponseCallback[SchemaPhoto],
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
  def get(params: ParamsResourcePhotoGet, options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def get(
    params: ParamsResourcePhotoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
  
  /**
    * streetviewpublish.photo.startUpload
    * @desc Creates an upload session to start uploading photo bytes.  The
    * method uses the upload URL of the returned UploadRef to upload the bytes
    * for the Photo.  In addition to the photo requirements shown in
    * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604,
    * the photo must meet the following requirements:  * Photo Sphere XMP
    * metadata must be included in the photo medadata. See
    * https://developers.google.com/streetview/spherical-metadata for the
    * required fields. * The pixel size of the photo must meet the size
    * requirements listed in
    * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604,
    * and the photo must be a full 360 horizontally.  After the upload
    * completes, the method uses UploadRef with CreatePhoto to create the Photo
    * object entry.
    * @alias streetviewpublish.photo.startUpload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Empty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startUpload(): GaxiosPromise[SchemaUploadRef] = js.native
  def startUpload(callback: BodyResponseCallback[SchemaUploadRef]): Unit = js.native
  def startUpload(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUploadRef] = js.native
  def startUpload(params: ParamsResourcePhotoStartupload): GaxiosPromise[SchemaUploadRef] = js.native
  def startUpload(params: ParamsResourcePhotoStartupload, callback: BodyResponseCallback[SchemaUploadRef]): Unit = js.native
  def startUpload(
    params: ParamsResourcePhotoStartupload,
    options: BodyResponseCallback[SchemaUploadRef],
    callback: BodyResponseCallback[SchemaUploadRef]
  ): Unit = js.native
  def startUpload(params: ParamsResourcePhotoStartupload, options: MethodOptions): GaxiosPromise[SchemaUploadRef] = js.native
  def startUpload(
    params: ParamsResourcePhotoStartupload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadRef]
  ): Unit = js.native
  
  /**
    * streetviewpublish.photo.update
    * @desc Updates the metadata of a Photo, such as pose, place association,
    * connections, etc. Changing the pixels of a photo is not supported.  Only
    * the fields specified in the updateMask field are used. If `updateMask` is
    * not present, the update applies to all fields.  This method returns the
    * following error codes:  * google.rpc.Code.PERMISSION_DENIED if the
    * requesting user did not create the requested photo. *
    * google.rpc.Code.INVALID_ARGUMENT if the request is malformed. *
    * google.rpc.Code.NOT_FOUND if the requested photo does not exist. *
    * google.rpc.Code.UNAVAILABLE if the requested Photo is still being
    * indexed.
    * @alias streetviewpublish.photo.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Required. A unique identifier for a photo.
    * @param {string=} params.updateMask Mask that identifies fields on the photo metadata to update. If not present, the old Photo metadata is entirely replaced with the new Photo metadata in this request. The update fails if invalid fields are specified. Multiple fields can be specified in a comma-delimited list.  The following fields are valid:  * `pose.heading` * `pose.latLngPair` * `pose.pitch` * `pose.roll` * `pose.level` * `pose.altitude` * `connections` * `places`   <aside class="note"><b>Note:</b> When updateMask contains repeated fields, the entire set of repeated values get replaced with the new contents. For example, if updateMask contains `connections` and `UpdatePhotoRequest.photo.connections` is empty, all connections are removed.</aside>
    * @param {().Photo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPhoto] = js.native
  def update(callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def update(params: ParamsResourcePhotoUpdate): GaxiosPromise[SchemaPhoto] = js.native
  def update(params: ParamsResourcePhotoUpdate, callback: BodyResponseCallback[SchemaPhoto]): Unit = js.native
  def update(
    params: ParamsResourcePhotoUpdate,
    options: BodyResponseCallback[SchemaPhoto],
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
  def update(params: ParamsResourcePhotoUpdate, options: MethodOptions): GaxiosPromise[SchemaPhoto] = js.native
  def update(
    params: ParamsResourcePhotoUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPhoto]
  ): Unit = js.native
}

package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Uploads")
@js.native
class ResourceManagementUploads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.uploads.deleteUploadData
    * @desc Delete data associated with a previous upload.
    * @alias analytics.management.uploads.deleteUploadData
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the uploads to be deleted.
    * @param {string} params.customDataSourceId Custom data source Id for the uploads to be deleted.
    * @param {string} params.webPropertyId Web property Id for the uploads to be deleted.
    * @param {().AnalyticsDataimportDeleteUploadDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteUploadData(): GaxiosPromise[Unit] = js.native
  def deleteUploadData(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteUploadData(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata): GaxiosPromise[Unit] = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteUploadData(
    params: ParamsResourceManagementUploadsDeleteuploaddata,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteUploadData(
    params: ParamsResourceManagementUploadsDeleteuploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.uploads.get
    * @desc List uploads to which the user has access.
    * @alias analytics.management.uploads.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the upload to retrieve.
    * @param {string} params.customDataSourceId Custom data source Id for upload to retrieve.
    * @param {string} params.uploadId Upload Id to retrieve.
    * @param {string} params.webPropertyId Web property Id for the upload to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUpload] = js.native
  def get(callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def get(params: ParamsResourceManagementUploadsGet): GaxiosPromise[SchemaUpload] = js.native
  def get(params: ParamsResourceManagementUploadsGet, callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def get(
    params: ParamsResourceManagementUploadsGet,
    options: BodyResponseCallback[SchemaUpload],
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
  def get(params: ParamsResourceManagementUploadsGet, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def get(
    params: ParamsResourceManagementUploadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
  /**
    * analytics.management.uploads.list
    * @desc List uploads to which the user has access.
    * @alias analytics.management.uploads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the uploads to retrieve.
    * @param {string} params.customDataSourceId Custom data source Id for uploads to retrieve.
    * @param {integer=} params.max-results The maximum number of uploads to include in this response.
    * @param {integer=} params.start-index A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property Id for the uploads to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUploads] = js.native
  def list(callback: BodyResponseCallback[SchemaUploads]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUploads] = js.native
  def list(params: ParamsResourceManagementUploadsList): GaxiosPromise[SchemaUploads] = js.native
  def list(params: ParamsResourceManagementUploadsList, callback: BodyResponseCallback[SchemaUploads]): Unit = js.native
  def list(
    params: ParamsResourceManagementUploadsList,
    options: BodyResponseCallback[SchemaUploads],
    callback: BodyResponseCallback[SchemaUploads]
  ): Unit = js.native
  def list(params: ParamsResourceManagementUploadsList, options: MethodOptions): GaxiosPromise[SchemaUploads] = js.native
  def list(
    params: ParamsResourceManagementUploadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploads]
  ): Unit = js.native
  /**
    * analytics.management.uploads.uploadData
    * @desc Upload data for a custom data source.
    * @alias analytics.management.uploads.uploadData
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id associated with the upload.
    * @param {string} params.customDataSourceId Custom data source Id to which the data being uploaded belongs.
    * @param {string} params.webPropertyId Web property UA-string associated with the upload.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def uploadData(): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def uploadData(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata, callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def uploadData(
    params: ParamsResourceManagementUploadsUploaddata,
    options: BodyResponseCallback[SchemaUpload],
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(
    params: ParamsResourceManagementUploadsUploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
}


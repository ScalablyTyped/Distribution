package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Uploads")
@js.native
open class ResourceManagementUploads protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def deleteUploadData(): GaxiosPromise[Unit] = js.native
  def deleteUploadData(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteUploadData(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata): GaxiosPromise[Unit] = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteUploadData(
    params: ParamsResourceManagementUploadsDeleteuploaddata,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteUploadData(
    params: ParamsResourceManagementUploadsDeleteuploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete data associated with a previous upload.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.uploads.deleteUploadData({
    *     // Account Id for the uploads to be deleted.
    *     accountId: 'd+',
    *     // Custom data source Id for the uploads to be deleted.
    *     customDataSourceId: '.{22}',
    *     // Web property Id for the uploads to be deleted.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customDataImportUids": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def deleteUploadData(params: ParamsResourceManagementUploadsDeleteuploaddata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteUploadData(
    params: ParamsResourceManagementUploadsDeleteuploaddata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUpload] = js.native
  def get(callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def get(params: ParamsResourceManagementUploadsGet): GaxiosPromise[SchemaUpload] = js.native
  def get(params: ParamsResourceManagementUploadsGet, callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def get(
    params: ParamsResourceManagementUploadsGet,
    options: BodyResponseCallback[Readable | SchemaUpload],
    callback: BodyResponseCallback[Readable | SchemaUpload]
  ): Unit = js.native
  def get(params: ParamsResourceManagementUploadsGet, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def get(
    params: ParamsResourceManagementUploadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
  /**
    * List uploads to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.uploads.get({
    *     // Account Id for the upload to retrieve.
    *     accountId: 'd+',
    *     // Custom data source Id for upload to retrieve.
    *     customDataSourceId: '.{22}',
    *     // Upload Id to retrieve.
    *     uploadId: '.{22}',
    *     // Web property Id for the upload to retrieve.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "customDataSourceId": "my_customDataSourceId",
    *   //   "errors": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "status": "my_status",
    *   //   "uploadTime": "my_uploadTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceManagementUploadsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementUploadsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUploads] = js.native
  def list(callback: BodyResponseCallback[SchemaUploads]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUploads] = js.native
  def list(params: ParamsResourceManagementUploadsList): GaxiosPromise[SchemaUploads] = js.native
  def list(params: ParamsResourceManagementUploadsList, callback: BodyResponseCallback[SchemaUploads]): Unit = js.native
  def list(
    params: ParamsResourceManagementUploadsList,
    options: BodyResponseCallback[Readable | SchemaUploads],
    callback: BodyResponseCallback[Readable | SchemaUploads]
  ): Unit = js.native
  def list(params: ParamsResourceManagementUploadsList, options: MethodOptions): GaxiosPromise[SchemaUploads] = js.native
  def list(
    params: ParamsResourceManagementUploadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploads]
  ): Unit = js.native
  /**
    * List uploads to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.uploads.list({
    *     // Account Id for the uploads to retrieve.
    *     accountId: 'd+',
    *     // Custom data source Id for uploads to retrieve.
    *     customDataSourceId: '.{22}',
    *     // The maximum number of uploads to include in this response.
    *     'max-results': 'placeholder-value',
    *     // A 1-based index of the first upload to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property Id for the uploads to retrieve.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "startIndex": 0,
    *   //   "totalResults": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceManagementUploadsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementUploadsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def uploadData(): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def uploadData(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata, callback: BodyResponseCallback[SchemaUpload]): Unit = js.native
  def uploadData(
    params: ParamsResourceManagementUploadsUploaddata,
    options: BodyResponseCallback[Readable | SchemaUpload],
    callback: BodyResponseCallback[Readable | SchemaUpload]
  ): Unit = js.native
  def uploadData(params: ParamsResourceManagementUploadsUploaddata, options: MethodOptions): GaxiosPromise[SchemaUpload] = js.native
  def uploadData(
    params: ParamsResourceManagementUploadsUploaddata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpload]
  ): Unit = js.native
  /**
    * Upload data for a custom data source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.uploads.uploadData({
    *     // Account Id associated with the upload.
    *     accountId: 'd+',
    *     // Custom data source Id to which the data being uploaded belongs.
    *     customDataSourceId: 'placeholder-value',
    *     // Web property UA-string associated with the upload.
    *     webPropertyId: 'UA-d+-d+',
    *
    *     requestBody: {
    *       // request body parameters
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "customDataSourceId": "my_customDataSourceId",
    *   //   "errors": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "status": "my_status",
    *   //   "uploadTime": "my_uploadTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def uploadData(params: ParamsResourceManagementUploadsUploaddata, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def uploadData(
    params: ParamsResourceManagementUploadsUploaddata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

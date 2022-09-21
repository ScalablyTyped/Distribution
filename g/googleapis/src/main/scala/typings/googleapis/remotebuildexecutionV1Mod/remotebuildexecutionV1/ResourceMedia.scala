package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Resource$Media")
@js.native
open class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def download(): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia],
    callback: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  /**
    * Downloads media. Download is supported on the URI `/v1/media/{+name\}?alt=media`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await remotebuildexecution.media.download({
    *     // Name of the media that is being downloaded. See ReadRequest.resource_name.
    *     resourceName: '.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "resourceName": "my_resourceName"
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
  def download(params: ParamsResourceMediaDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(params: ParamsResourceMediaUpload): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(params: ParamsResourceMediaUpload, callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]): Unit = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia],
    callback: BodyResponseCallback[Readable | SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  def upload(params: ParamsResourceMediaUpload, options: MethodOptions): GaxiosPromise[SchemaGoogleBytestreamMedia] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleBytestreamMedia]
  ): Unit = js.native
  /**
    * Uploads media. Upload is supported on the URI `/upload/v1/media/{+name\}`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await remotebuildexecution.media.upload({
    *     // Name of the media that is being downloaded. See ReadRequest.resource_name.
    *     resourceName: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "resourceName": "my_resourceName"
    *       // }
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
    *   //   "resourceName": "my_resourceName"
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
  def upload(params: ParamsResourceMediaUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceMediaUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

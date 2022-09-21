package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Monitoredresourcedescriptors")
@js.native
open class ResourceMonitoredresourcedescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(params: ParamsResourceMonitoredresourcedescriptorsList): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    options: BodyResponseCallback[Readable | SchemaListMonitoredResourceDescriptorsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMonitoredresourcedescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  /**
    * Lists the descriptors for monitored resource types used by Logging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/logging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const logging = google.logging('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/logging.admin',
    *       'https://www.googleapis.com/auth/logging.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await logging.monitoredResourceDescriptors.list({
    *     // Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    *     pageSize: 'placeholder-value',
    *     // Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resourceDescriptors": []
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
  def list(params: ParamsResourceMonitoredresourcedescriptorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMonitoredresourcedescriptorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

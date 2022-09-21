package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Uptimecheckips")
@js.native
open class ResourceUptimecheckips protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(params: ParamsResourceUptimecheckipsList): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    options: BodyResponseCallback[Readable | SchemaListUptimeCheckIpsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUptimecheckipsList, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
  /**
    * Returns the list of IP addresses that checkers run from
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.uptimeCheckIps.list({
    *     // The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned. NOTE: this field is not yet implemented
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call. NOTE: this field is not yet implemented
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "uptimeCheckIps": []
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
  def list(params: ParamsResourceUptimecheckipsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

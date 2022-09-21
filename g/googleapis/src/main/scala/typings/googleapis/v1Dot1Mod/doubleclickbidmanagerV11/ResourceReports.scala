package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1.1", "doubleclickbidmanager_v1_1.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listreports(): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def listreports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(params: ParamsResourceReportsListreports): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    options: BodyResponseCallback[Readable | SchemaListReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReportsResponse]
  ): Unit = js.native
  def listreports(params: ParamsResourceReportsListreports, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  /**
    * Retrieves stored reports.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/doubleclickbidmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const doubleclickbidmanager = google.doubleclickbidmanager('v1.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/doubleclickbidmanager'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await doubleclickbidmanager.reports.listreports({
    *     // Maximum number of results per page. Must be between 1 and 100. Defaults to 100 if unspecified.
    *     pageSize: 'placeholder-value',
    *     // Optional pagination token.
    *     pageToken: 'placeholder-value',
    *     // Query ID with which the reports are associated.
    *     queryId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reports": []
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
  def listreports(params: ParamsResourceReportsListreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

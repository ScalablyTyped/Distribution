package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urltestingtools$Mobilefriendlytest")
@js.native
open class ResourceUrltestingtoolsMobilefriendlytest protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def run(): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    options: BodyResponseCallback[Readable | SchemaRunMobileFriendlyTestResponse],
    callback: BodyResponseCallback[Readable | SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun, options: MethodOptions): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
  /**
    * Runs Mobile-Friendly Test for a given URL.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await searchconsole.urlTestingTools.mobileFriendlyTest.run({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requestScreenshot": false,
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mobileFriendliness": "my_mobileFriendliness",
    *   //   "mobileFriendlyIssues": [],
    *   //   "resourceIssues": [],
    *   //   "screenshot": {},
    *   //   "testStatus": {}
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
  def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

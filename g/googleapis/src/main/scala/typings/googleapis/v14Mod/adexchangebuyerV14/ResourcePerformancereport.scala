package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Performancereport")
@js.native
open class ResourcePerformancereport protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(callback: BodyResponseCallback[SchemaPerformanceReportList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(params: ParamsResourcePerformancereportList): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    callback: BodyResponseCallback[SchemaPerformanceReportList]
  ): Unit = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    options: BodyResponseCallback[Readable | SchemaPerformanceReportList],
    callback: BodyResponseCallback[Readable | SchemaPerformanceReportList]
  ): Unit = js.native
  def list(params: ParamsResourcePerformancereportList, options: MethodOptions): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerformanceReportList]
  ): Unit = js.native
  /**
    * Retrieves the authenticated user's list of performance metrics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.performanceReport.list({
    *     // The account id to get the reports.
    *     accountId: 'placeholder-value',
    *     // The end time of the report in ISO 8601 timestamp format using UTC.
    *     endDateTime: 'placeholder-value',
    *     // Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through performance reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    *     pageToken: 'placeholder-value',
    *     // The start time of the report in ISO 8601 timestamp format using UTC.
    *     startDateTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "performanceReport": []
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
  def list(params: ParamsResourcePerformancereportList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

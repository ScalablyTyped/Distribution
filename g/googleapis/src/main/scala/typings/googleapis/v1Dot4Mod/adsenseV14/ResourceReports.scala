package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Reports")
@js.native
open class ResourceReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(params: ParamsResourceReportsGenerate): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: BodyResponseCallback[Readable | SchemaAdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[Readable | SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceReportsGenerate, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.reports.generate({
    *     // Accounts upon which to report.
    *     accountId: 'placeholder-value',
    *     // Optional currency to use when reporting on monetary metrics. Defaults to the account's currency if not set.
    *     currency: '[a-zA-Z]+',
    *     // Dimensions to base the report on.
    *     dimension: '[a-zA-Z_]+',
    *     // End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    *     endDate:
    *       'd{4}-d{2}-d{2}|(today|startOfMonth|startOfYear)(([-+]d+[dwmy]){0,3}?)|(latest-(d{2})-(d{2})(-d+y)?)|(latest-latest-(d{2})(-d+m)?)',
    *     // Filters to be run on the report.
    *     filter: '[a-zA-Z_]+(==|=@).+',
    *     // Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    *     locale: '[a-zA-Z_]+',
    *     // The maximum number of rows of report data to return.
    *     maxResults: 'placeholder-value',
    *     // Numeric columns to include in the report.
    *     metric: '[a-zA-Z_]+',
    *     // The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no prefix is specified, the column is sorted ascending.
    *     sort: '(+|-)?[a-zA-Z_]+',
    *     // Start of the date range to report on in "YYYY-MM-DD" format, inclusive.
    *     startDate:
    *       'd{4}-d{2}-d{2}|(today|startOfMonth|startOfYear)(([-+]d+[dwmy]){0,3}?)|(latest-(d{2})-(d{2})(-d+y)?)|(latest-latest-(d{2})(-d+m)?)',
    *     // Index of the first row of report data to return.
    *     startIndex: 'placeholder-value',
    *     // Whether the report should be generated in the AdSense account's local timezone. If false default PST/PDT timezone will be used.
    *     useTimezoneReporting: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averages": [],
    *   //   "endDate": "my_endDate",
    *   //   "headers": [],
    *   //   "kind": "my_kind",
    *   //   "rows": [],
    *   //   "startDate": "my_startDate",
    *   //   "totalMatchedRows": "my_totalMatchedRows",
    *   //   "totals": [],
    *   //   "warnings": []
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
  def generate(params: ParamsResourceReportsGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceReportsGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var saved: ResourceReportsSaved = js.native
}

package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Reports")
@js.native
open class ResourceAccountsReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaReport] = js.native
  def generate(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(
    params: ParamsResourceAccountsReportsGenerate,
    options: BodyResponseCallback[Readable | SchemaReport],
    callback: BodyResponseCallback[Readable | SchemaReport]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(
    params: ParamsResourceAccountsReportsGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.accounts.reports.generate({
    *     // Hosted account upon which to report.
    *     accountId: 'placeholder-value',
    *     // Dimensions to base the report on.
    *     dimension: '[a-zA-Z_]+',
    *     // End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    *     endDate:
    *       'd{4}-d{2}-d{2}|(today|startOfMonth|startOfYear)(([-+]d+[dwmy]){0,3}?)',
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
    *       'd{4}-d{2}-d{2}|(today|startOfMonth|startOfYear)(([-+]d+[dwmy]){0,3}?)',
    *     // Index of the first row of report data to return.
    *     startIndex: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averages": [],
    *   //   "headers": [],
    *   //   "kind": "my_kind",
    *   //   "rows": [],
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
  def generate(params: ParamsResourceAccountsReportsGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceAccountsReportsGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

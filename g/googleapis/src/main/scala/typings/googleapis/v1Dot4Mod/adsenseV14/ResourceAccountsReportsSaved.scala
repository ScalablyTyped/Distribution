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

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Reports$Saved")
@js.native
open class ResourceAccountsReportsSaved protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: BodyResponseCallback[Readable | SchemaAdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[Readable | SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  /**
    * Generate an AdSense report based on the saved report ID sent in the query parameters.
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
    *   const res = await adsense.accounts.reports.saved.generate({
    *     // Account to which the saved reports belong.
    *     accountId: 'placeholder-value',
    *     // Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    *     locale: '[a-zA-Z_]+',
    *     // The maximum number of rows of report data to return.
    *     maxResults: 'placeholder-value',
    *     // The saved report to retrieve.
    *     savedReportId: 'placeholder-value',
    *     // Index of the first row of report data to return.
    *     startIndex: 'placeholder-value',
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
  def generate(params: ParamsResourceAccountsReportsSavedGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSavedReports] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedReports] = js.native
  def list(params: ParamsResourceAccountsReportsSavedList): GaxiosPromise[SchemaSavedReports] = js.native
  def list(params: ParamsResourceAccountsReportsSavedList, callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: BodyResponseCallback[Readable | SchemaSavedReports],
    callback: BodyResponseCallback[Readable | SchemaSavedReports]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsReportsSavedList, options: MethodOptions): GaxiosPromise[SchemaSavedReports] = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedReports]
  ): Unit = js.native
  /**
    * List all saved reports in the specified AdSense account.
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
    *   const res = await adsense.accounts.reports.saved.list({
    *     // Account to which the saved reports belong.
    *     accountId: 'placeholder-value',
    *     // The maximum number of saved reports to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through saved reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAccountsReportsSavedList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

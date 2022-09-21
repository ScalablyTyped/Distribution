package typings.googleapis.v2Mod.adsenseV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Reports$Saved")
@js.native
open class ResourceAccountsReportsSaved protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaReportResult] = js.native
  def generate(callback: BodyResponseCallback[SchemaReportResult]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportResult] = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate): GaxiosPromise[SchemaReportResult] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    callback: BodyResponseCallback[SchemaReportResult]
  ): Unit = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: BodyResponseCallback[Readable | SchemaReportResult],
    callback: BodyResponseCallback[Readable | SchemaReportResult]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate, options: MethodOptions): GaxiosPromise[SchemaReportResult] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportResult]
  ): Unit = js.native
  /**
    * Generates a saved report.
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
    * const adsense = google.adsense('v2');
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
    *     // The [ISO-4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) to use when reporting on monetary metrics. Defaults to the account's currency if not set.
    *     currencyCode: 'placeholder-value',
    *     // Date range of the report, if unset the range will be considered CUSTOM.
    *     dateRange: 'placeholder-value',
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'endDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'endDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'endDate.year': 'placeholder-value',
    *     // The language to use for translating report output. If unspecified, this defaults to English ("en"). If the given language is not supported, report output will be returned in English. The language is specified as an [IETF BCP-47 language code](https://en.wikipedia.org/wiki/IETF_language_tag).
    *     languageCode: 'placeholder-value',
    *     // Required. Name of the saved report. Format: accounts/{account\}/reports/{report\}
    *     name: 'accounts/my-account/reports/my-report',
    *     // Timezone in which to generate the report. If unspecified, this defaults to the account timezone. For more information, see [changing the time zone of your reports](https://support.google.com/adsense/answer/9830725).
    *     reportingTimeZone: 'placeholder-value',
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'startDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'startDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'startDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averages": {},
    *   //   "endDate": {},
    *   //   "headers": [],
    *   //   "rows": [],
    *   //   "startDate": {},
    *   //   "totalMatchedRows": "my_totalMatchedRows",
    *   //   "totals": {},
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
  
  def generateCsv(): GaxiosPromise[SchemaHttpBody] = js.native
  def generateCsv(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def generateCsv(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def generateCsv(params: ParamsResourceAccountsReportsSavedGeneratecsv): GaxiosPromise[SchemaHttpBody] = js.native
  def generateCsv(
    params: ParamsResourceAccountsReportsSavedGeneratecsv,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def generateCsv(
    params: ParamsResourceAccountsReportsSavedGeneratecsv,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def generateCsv(params: ParamsResourceAccountsReportsSavedGeneratecsv, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def generateCsv(
    params: ParamsResourceAccountsReportsSavedGeneratecsv,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * Generates a csv formatted saved report.
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
    * const adsense = google.adsense('v2');
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
    *   const res = await adsense.accounts.reports.saved.generateCsv({
    *     // The [ISO-4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) to use when reporting on monetary metrics. Defaults to the account's currency if not set.
    *     currencyCode: 'placeholder-value',
    *     // Date range of the report, if unset the range will be considered CUSTOM.
    *     dateRange: 'placeholder-value',
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'endDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'endDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'endDate.year': 'placeholder-value',
    *     // The language to use for translating report output. If unspecified, this defaults to English ("en"). If the given language is not supported, report output will be returned in English. The language is specified as an [IETF BCP-47 language code](https://en.wikipedia.org/wiki/IETF_language_tag).
    *     languageCode: 'placeholder-value',
    *     // Required. Name of the saved report. Format: accounts/{account\}/reports/{report\}
    *     name: 'accounts/my-account/reports/my-report',
    *     // Timezone in which to generate the report. If unspecified, this defaults to the account timezone. For more information, see [changing the time zone of your reports](https://support.google.com/adsense/answer/9830725).
    *     reportingTimeZone: 'placeholder-value',
    *     // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    *     'startDate.day': 'placeholder-value',
    *     // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    *     'startDate.month': 'placeholder-value',
    *     // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    *     'startDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def generateCsv(params: ParamsResourceAccountsReportsSavedGeneratecsv, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateCsv(
    params: ParamsResourceAccountsReportsSavedGeneratecsv,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSavedReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSavedReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSavedReportsResponse] = js.native
  def list(params: ParamsResourceAccountsReportsSavedList): GaxiosPromise[SchemaListSavedReportsResponse] = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    callback: BodyResponseCallback[SchemaListSavedReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: BodyResponseCallback[Readable | SchemaListSavedReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSavedReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsReportsSavedList, options: MethodOptions): GaxiosPromise[SchemaListSavedReportsResponse] = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSavedReportsResponse]
  ): Unit = js.native
  /**
    * Lists saved reports.
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
    * const adsense = google.adsense('v2');
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
    *     // The maximum number of reports to include in the response, used for paging. If unspecified, at most 10000 reports will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListPayments` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPayments` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The account which owns the collection of reports. Format: accounts/{account\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "savedReports": []
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

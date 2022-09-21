package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1alpha1", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors$Reports")
@js.native
open class ResourceVitalsErrorsReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse] = js.native
  def search(
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse]
  ): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse] = js.native
  def search(params: ParamsResourceVitalsErrorsReportsSearch): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse] = js.native
  def search(
    params: ParamsResourceVitalsErrorsReportsSearch,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceVitalsErrorsReportsSearch,
    options: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceVitalsErrorsReportsSearch, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse] = js.native
  def search(
    params: ParamsResourceVitalsErrorsReportsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1SearchErrorReportsResponse]
  ): Unit = js.native
  /**
    * Searches all error reports received for an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/playdeveloperreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const playdeveloperreporting = google.playdeveloperreporting('v1alpha1');
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
    *   const res = await playdeveloperreporting.vitals.errors.reports.search({
    *     // A selection predicate to retrieve only a subset of the reports. For filtering basics, please check [AIP-160](https://google.aip.dev/160). ** Supported field names:** * `apiLevel`: Matches error reports that occurred in the requested Android versions (specified as the numeric API level) only. Example: `apiLevel = 28 OR apiLevel = 29`. * `versionCode`: Matches error reports that occurred in the requested app version codes only. Example: `versionCode = 123 OR versionCode = 456`. * `deviceModel`: Matches error reports that occurred in the requested devices. Example: `deviceModel = "walleye" OR deviceModel = "marlin"`. * `deviceType`: Matches error reports that occurred in the requested device types. Example: `deviceType = "PHONE"`. * `errorIssueType`: Matches error reports of the requested types only. Valid candidates: `JAVA_CRASH`, `NATIVE_CRASH`, `ANR`. Example: `errorIssueType = JAVA_CRASH OR errorIssueType = NATIVE_CRASH`. * `errorIssueId`: Matches error reports belonging to the requested error issue ids only. Example: `errorIssueId = 1234 OR errorIssueId = 4567`. ** Supported operators:** * Comparison operators: The only supported comparison operator is equality. The filtered field must appear on the left hand side of the comparison. * Logical Operators: Logical operators `AND` and `OR` can be used to build complex filters following a conjunctive normal form (CNF), i.e., conjunctions of disjunctions. The `OR` operator takes precedence over `AND` so the use of parenthesis is not necessary when building CNF. The `OR` operator is only supported to build disjunctions that apply to the same field, e.g., `versionCode = 123 OR versionCode = ANR`. The filter expression `versionCode = 123 OR errorIssueType = ANR` is not valid. ** Examples ** Some valid filtering expressions: * `versionCode = 123 AND errorIssueType = ANR` * `versionCode = 123 AND errorIssueType = OR errorIssueType = CRASH` * `versionCode = 123 AND (errorIssueType = OR errorIssueType = CRASH)`
    *     filter: 'placeholder-value',
    *     // Optional. Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a datetime without a day.
    *     'interval.endTime.day': 'placeholder-value',
    *     // Optional. Hours of day in 24 hour format. Should be from 0 to 23, defaults to 0 (midnight). An API may choose to allow the value "24:00:00" for scenarios like business closing time.
    *     'interval.endTime.hours': 'placeholder-value',
    *     // Optional. Minutes of hour of day. Must be from 0 to 59, defaults to 0.
    *     'interval.endTime.minutes': 'placeholder-value',
    *     // Optional. Month of year. Must be from 1 to 12, or 0 if specifying a datetime without a month.
    *     'interval.endTime.month': 'placeholder-value',
    *     // Optional. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999, defaults to 0.
    *     'interval.endTime.nanos': 'placeholder-value',
    *     // Optional. Seconds of minutes of the time. Must normally be from 0 to 59, defaults to 0. An API may allow the value 60 if it allows leap-seconds.
    *     'interval.endTime.seconds': 'placeholder-value',
    *     // IANA Time Zone Database time zone, e.g. "America/New_York".
    *     'interval.endTime.timeZone.id': 'placeholder-value',
    *     // Optional. IANA Time Zone Database version number, e.g. "2019a".
    *     'interval.endTime.timeZone.version': 'placeholder-value',
    *     // UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 \}.
    *     'interval.endTime.utcOffset': 'placeholder-value',
    *     // Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year.
    *     'interval.endTime.year': 'placeholder-value',
    *     // Optional. Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a datetime without a day.
    *     'interval.startTime.day': 'placeholder-value',
    *     // Optional. Hours of day in 24 hour format. Should be from 0 to 23, defaults to 0 (midnight). An API may choose to allow the value "24:00:00" for scenarios like business closing time.
    *     'interval.startTime.hours': 'placeholder-value',
    *     // Optional. Minutes of hour of day. Must be from 0 to 59, defaults to 0.
    *     'interval.startTime.minutes': 'placeholder-value',
    *     // Optional. Month of year. Must be from 1 to 12, or 0 if specifying a datetime without a month.
    *     'interval.startTime.month': 'placeholder-value',
    *     // Optional. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999, defaults to 0.
    *     'interval.startTime.nanos': 'placeholder-value',
    *     // Optional. Seconds of minutes of the time. Must normally be from 0 to 59, defaults to 0. An API may allow the value 60 if it allows leap-seconds.
    *     'interval.startTime.seconds': 'placeholder-value',
    *     // IANA Time Zone Database time zone, e.g. "America/New_York".
    *     'interval.startTime.timeZone.id': 'placeholder-value',
    *     // Optional. IANA Time Zone Database version number, e.g. "2019a".
    *     'interval.startTime.timeZone.version': 'placeholder-value',
    *     // UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 \}.
    *     'interval.startTime.utcOffset': 'placeholder-value',
    *     // Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year.
    *     'interval.startTime.year': 'placeholder-value',
    *     // The maximum number of reports to return. The service may return fewer than this value. If unspecified, at most 50 reports will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `SearchErrorReports` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `SearchErrorReports` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource of the reports, indicating the application for which they were received. Format: apps/{app\}
    *     parent: 'apps/my-app',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errorReports": [],
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
  def search(params: ParamsResourceVitalsErrorsReportsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceVitalsErrorsReportsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

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

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1alpha1", "playdeveloperreporting_v1alpha1.Resource$Anomalies")
@js.native
open class ResourceAnomalies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse] = js.native
  def list(params: ParamsResourceAnomaliesList): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse] = js.native
  def list(
    params: ParamsResourceAnomaliesList,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAnomaliesList,
    options: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAnomaliesList, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse] = js.native
  def list(
    params: ParamsResourceAnomaliesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ListAnomaliesResponse]
  ): Unit = js.native
  /**
    * Lists anomalies in any of the datasets.
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
    *   const res = await playdeveloperreporting.anomalies.list({
    *     // Filtering criteria for anomalies. For basic filter guidance, please check: https://google.aip.dev/160. **Supported functions:** * `activeBetween(startTime, endTime)`: If specified, only list anomalies that were active in between `startTime` (inclusive) and `endTime` (exclusive). Both parameters are expected to conform to an RFC-3339 formatted string (e.g. `2012-04-21T11:30:00-04:00`). UTC offsets are supported. Both `startTime` and `endTime` accept the special value `UNBOUNDED`, to signify intervals with no lower or upper bound, respectively. Examples: * `activeBetween("2021-04-21T11:30:00Z", "2021-07-21T00:00:00Z")` * `activeBetween(UNBOUNDED, "2021-11-21T00:00:00-04:00")` * `activeBetween("2021-07-21T00:00:00-04:00", UNBOUNDED)`
    *     filter: 'placeholder-value',
    *     // Maximum size of the returned data. If unspecified, at most 10 anomalies will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListErrorReports` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListErrorReports` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent app for which anomalies were detected. Format: apps/{app\}
    *     parent: 'apps/my-app',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anomalies": [],
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
  def list(params: ParamsResourceAnomaliesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAnomaliesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

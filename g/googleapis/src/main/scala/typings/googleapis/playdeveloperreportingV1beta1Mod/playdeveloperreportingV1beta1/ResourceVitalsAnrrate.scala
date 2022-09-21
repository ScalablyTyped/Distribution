package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1beta1", "playdeveloperreporting_v1beta1.Resource$Vitals$Anrrate")
@js.native
open class ResourceVitalsAnrrate protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet] = js.native
  def get(params: ParamsResourceVitalsAnrrateGet): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet] = js.native
  def get(
    params: ParamsResourceVitalsAnrrateGet,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceVitalsAnrrateGet,
    options: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet],
    callback: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet]
  ): Unit = js.native
  def get(params: ParamsResourceVitalsAnrrateGet, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet] = js.native
  def get(
    params: ParamsResourceVitalsAnrrateGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1AnrRateMetricSet]
  ): Unit = js.native
  /**
    * Describes the properties of the metric set.
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
    * const playdeveloperreporting = google.playdeveloperreporting('v1beta1');
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
    *   const res = await playdeveloperreporting.vitals.anrrate.get({
    *     // Required. The resource name. Format: apps/{app\}/anrRateMetricSet
    *     name: 'apps/my-app/anrRateMetricSet',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "freshnessInfo": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceVitalsAnrrateGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceVitalsAnrrateGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def query(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse] = js.native
  def query(
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse]
  ): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse] = js.native
  def query(params: ParamsResourceVitalsAnrrateQuery): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse] = js.native
  def query(
    params: ParamsResourceVitalsAnrrateQuery,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceVitalsAnrrateQuery,
    options: BodyResponseCallback[
      Readable | SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse
    ]
  ): Unit = js.native
  def query(params: ParamsResourceVitalsAnrrateQuery, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse] = js.native
  def query(
    params: ParamsResourceVitalsAnrrateQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1beta1QueryAnrRateMetricSetResponse]
  ): Unit = js.native
  /**
    * Queries the metrics in the metric set.
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
    * const playdeveloperreporting = google.playdeveloperreporting('v1beta1');
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
    *   const res = await playdeveloperreporting.vitals.anrrate.query({
    *     // Required. The resource name. Format: apps/{app\}/anrRateMetricSet
    *     name: 'apps/my-app/anrRateMetricSet',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dimensions": [],
    *       //   "filter": "my_filter",
    *       //   "metrics": [],
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "timelineSpec": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rows": []
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
  def query(params: ParamsResourceVitalsAnrrateQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceVitalsAnrrateQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

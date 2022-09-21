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

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1alpha1", "playdeveloperreporting_v1alpha1.Resource$Vitals$Errors$Counts")
@js.native
open class ResourceVitalsErrorsCounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet] = js.native
  def get(params: ParamsResourceVitalsErrorsCountsGet): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet] = js.native
  def get(
    params: ParamsResourceVitalsErrorsCountsGet,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceVitalsErrorsCountsGet,
    options: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet],
    callback: BodyResponseCallback[Readable | SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet]
  ): Unit = js.native
  def get(params: ParamsResourceVitalsErrorsCountsGet, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet] = js.native
  def get(
    params: ParamsResourceVitalsErrorsCountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1ErrorCountMetricSet]
  ): Unit = js.native
  /**
    * Describes the properties of the metrics set.
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
    *   const res = await playdeveloperreporting.vitals.errors.counts.get({
    *     // Required. Name of the errors metric set. Format: apps/{app\}/errorCountMetricSet
    *     name: 'apps/my-app/errorCountMetricSet',
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
  def get(params: ParamsResourceVitalsErrorsCountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceVitalsErrorsCountsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def query(): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse] = js.native
  def query(
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse]
  ): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse] = js.native
  def query(params: ParamsResourceVitalsErrorsCountsQuery): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse] = js.native
  def query(
    params: ParamsResourceVitalsErrorsCountsQuery,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceVitalsErrorsCountsQuery,
    options: BodyResponseCallback[
      Readable | SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse
    ]
  ): Unit = js.native
  def query(params: ParamsResourceVitalsErrorsCountsQuery, options: MethodOptions): GaxiosPromise[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse] = js.native
  def query(
    params: ParamsResourceVitalsErrorsCountsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePlayDeveloperReportingV1alpha1QueryErrorCountMetricSetResponse]
  ): Unit = js.native
  /**
    * Queries the metrics in the metrics set.
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
    *   const res = await playdeveloperreporting.vitals.errors.counts.query({
    *     // Required. The resource name. Format: apps/{app\}/errorCountMetricSet
    *     name: 'apps/my-app/errorCountMetricSet',
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
  def query(params: ParamsResourceVitalsErrorsCountsQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceVitalsErrorsCountsQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

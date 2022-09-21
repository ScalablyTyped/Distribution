package typings.googleapis.recommenderV1Mod.recommenderV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recommender/v1", "recommender_v1.Resource$Billingaccounts$Locations$Insighttypes$Insights")
@js.native
open class ResourceBillingaccountsLocationsInsighttypesInsights protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def get(params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def get(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  def get(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1Insight],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  def get(params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def get(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  /**
    * Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommender.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommender = google.recommender('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await recommender.billingAccounts.locations.insightTypes.insights.get({
    *       // Required. Name of the insight.
    *       name: 'billingAccounts/my-billingAccount/locations/my-location/insightTypes/my-insightType/insights/my-insight',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associatedRecommendations": [],
    *   //   "category": "my_category",
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "insightSubtype": "my_insightSubtype",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "observationPeriod": "my_observationPeriod",
    *   //   "severity": "my_severity",
    *   //   "stateInfo": {},
    *   //   "targetResources": []
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
  def get(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecommenderV1ListInsightsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1ListInsightsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1ListInsightsResponse] = js.native
  def list(params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList): GaxiosPromise[SchemaGoogleCloudRecommenderV1ListInsightsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1ListInsightsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1ListInsightsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1ListInsightsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1ListInsightsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1ListInsightsResponse]
  ): Unit = js.native
  /**
    * Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommender.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommender = google.recommender('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await recommender.billingAccounts.locations.insightTypes.insights.list({
    *       // Optional. Filter expression to restrict the insights returned. Supported filter fields: * `stateInfo.state` * `insightSubtype` * `severity` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `insightSubtype = PERMISSIONS_USAGE` * `severity = CRITICAL OR severity = HIGH` * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)` (These expressions are based on the filter language described at https://google.aip.dev/160)
    *       filter: 'placeholder-value',
    *       // Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
    *       pageSize: 'placeholder-value',
    *       // Optional. If present, retrieves the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters must be identical to those in the previous call.
    *       pageToken: 'placeholder-value',
    *       // Required. The container resource on which to execute the request. Acceptable formats: * `projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]` * `projects/[PROJECT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]` * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]` * `folders/[FOLDER_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]` * `organizations/[ORGANIZATION_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]` LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/ INSIGHT_TYPE_ID refers to supported insight types: https://cloud.google.com/recommender/docs/insights/insight-types.
    *       parent:
    *         'billingAccounts/my-billingAccount/locations/my-location/insightTypes/my-insightType',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "insights": [],
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
  def list(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def markAccepted(): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def markAccepted(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]): Unit = js.native
  def markAccepted(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def markAccepted(params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1Insight],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommenderV1Insight] = js.native
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1Insight]
  ): Unit = js.native
  /**
    * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommender.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommender = google.recommender('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await recommender.billingAccounts.locations.insightTypes.insights.markAccepted(
    *       {
    *         // Required. Name of the insight.
    *         name: 'billingAccounts/my-billingAccount/locations/my-location/insightTypes/my-insightType/insights/my-insight',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "etag": "my_etag",
    *           //   "stateMetadata": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associatedRecommendations": [],
    *   //   "category": "my_category",
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "insightSubtype": "my_insightSubtype",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "observationPeriod": "my_observationPeriod",
    *   //   "severity": "my_severity",
    *   //   "stateInfo": {},
    *   //   "targetResources": []
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
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def markAccepted(
    params: ParamsResourceBillingaccountsLocationsInsighttypesInsightsMarkaccepted,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

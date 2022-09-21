package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recommender/v1beta1", "recommender_v1beta1.Resource$Projects$Locations$Recommenders$Recommendations")
@js.native
open class ResourceProjectsLocationsRecommendersRecommendations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def get(params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  /**
    * Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender.
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
    * const recommender = google.recommender('v1beta1');
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
    *     await recommender.projects.locations.recommenders.recommendations.get({
    *       // Required. Name of the recommendation.
    *       name: 'projects/my-project/locations/my-location/recommenders/my-recommender/recommendations/my-recommendation',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalImpact": [],
    *   //   "associatedInsights": [],
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "primaryImpact": {},
    *   //   "priority": "my_priority",
    *   //   "recommenderSubtype": "my_recommenderSubtype",
    *   //   "stateInfo": {},
    *   //   "xorGroupId": "my_xorGroupId"
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
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRecommendersRecommendationsList): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRecommendersRecommendationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse]
  ): Unit = js.native
  /**
    * Lists recommendations for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified recommender.
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
    * const recommender = google.recommender('v1beta1');
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
    *     await recommender.projects.locations.recommenders.recommendations.list({
    *       // Filter expression to restrict the recommendations returned. Supported filter fields: * `state_info.state` * `recommenderSubtype` * `priority` Examples: * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED` * `recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE` * `priority = P1 OR priority = P2` * `stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)` (These expressions are based on the filter language described at https://google.aip.dev/160)
    *       filter: 'placeholder-value',
    *       // Optional. The maximum number of results to return from this request. Non-positive values are ignored. If not specified, the server will determine the number of results to return.
    *       pageSize: 'placeholder-value',
    *       // Optional. If present, retrieves the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of other method parameters must be identical to those in the previous call.
    *       pageToken: 'placeholder-value',
    *       // Required. The container resource on which to execute the request. Acceptable formats: * `projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]` * `projects/[PROJECT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]` * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]` * `folders/[FOLDER_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]` * `organizations/[ORGANIZATION_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]` LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/ RECOMMENDER_ID refers to supported recommenders: https://cloud.google.com/recommender/docs/recommenders.
    *       parent:
    *         'projects/my-project/locations/my-location/recommenders/my-recommender',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "recommendations": []
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
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def markClaimed(): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markClaimed(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]): Unit = js.native
  def markClaimed(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markClaimed(params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  /**
    * Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
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
    * const recommender = google.recommender('v1beta1');
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
    *     await recommender.projects.locations.recommenders.recommendations.markClaimed(
    *       {
    *         // Required. Name of the recommendation.
    *         name: 'projects/my-project/locations/my-location/recommenders/my-recommender/recommendations/my-recommendation',
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
    *   //   "additionalImpact": [],
    *   //   "associatedInsights": [],
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "primaryImpact": {},
    *   //   "priority": "my_priority",
    *   //   "recommenderSubtype": "my_recommenderSubtype",
    *   //   "stateInfo": {},
    *   //   "xorGroupId": "my_xorGroupId"
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
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def markClaimed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkclaimed,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def markFailed(): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markFailed(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]): Unit = js.native
  def markFailed(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markFailed(params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  /**
    * Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
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
    * const recommender = google.recommender('v1beta1');
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
    *     await recommender.projects.locations.recommenders.recommendations.markFailed(
    *       {
    *         // Required. Name of the recommendation.
    *         name: 'projects/my-project/locations/my-location/recommenders/my-recommender/recommendations/my-recommendation',
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
    *   //   "additionalImpact": [],
    *   //   "associatedInsights": [],
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "primaryImpact": {},
    *   //   "priority": "my_priority",
    *   //   "recommenderSubtype": "my_recommenderSubtype",
    *   //   "stateInfo": {},
    *   //   "xorGroupId": "my_xorGroupId"
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
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def markFailed(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarkfailed,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def markSucceeded(): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markSucceeded(callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]): Unit = js.native
  def markSucceeded(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markSucceeded(params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommenderV1beta1Recommendation] = js.native
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommenderV1beta1Recommendation]
  ): Unit = js.native
  /**
    * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
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
    * const recommender = google.recommender('v1beta1');
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
    *     await recommender.projects.locations.recommenders.recommendations.markSucceeded(
    *       {
    *         // Required. Name of the recommendation.
    *         name: 'projects/my-project/locations/my-location/recommenders/my-recommender/recommendations/my-recommendation',
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
    *   //   "additionalImpact": [],
    *   //   "associatedInsights": [],
    *   //   "content": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "lastRefreshTime": "my_lastRefreshTime",
    *   //   "name": "my_name",
    *   //   "primaryImpact": {},
    *   //   "priority": "my_priority",
    *   //   "recommenderSubtype": "my_recommenderSubtype",
    *   //   "stateInfo": {},
    *   //   "xorGroupId": "my_xorGroupId"
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
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def markSucceeded(
    params: ParamsResourceProjectsLocationsRecommendersRecommendationsMarksucceeded,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

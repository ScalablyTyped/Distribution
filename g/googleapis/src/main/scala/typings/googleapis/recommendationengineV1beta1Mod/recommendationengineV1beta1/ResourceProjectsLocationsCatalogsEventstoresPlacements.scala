package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recommendationengine/v1beta1", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Placements")
@js.native
open class ResourceProjectsLocationsCatalogsEventstoresPlacements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def predict(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  def predict(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse]): Unit = js.native
  def predict(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  def predict(params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse]
  ): Unit = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1PredictResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1PredictResponse]
  ): Unit = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse]
  ): Unit = js.native
  /**
    * Makes a recommendation prediction. If using API Key based authentication, the API Key must be registered using the PredictionApiKeyRegistry service. [Learn more](https://cloud.google.com/recommendations-ai/docs/setting-up#register-key).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *     await recommendationengine.projects.locations.catalogs.eventStores.placements.predict(
    *       {
    *         name: 'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore/placements/my-placement',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "dryRun": false,
    *           //   "filter": "my_filter",
    *           //   "labels": {},
    *           //   "pageSize": 0,
    *           //   "pageToken": "my_pageToken",
    *           //   "params": {},
    *           //   "userEvent": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dryRun": false,
    *   //   "itemsMissingInCatalog": [],
    *   //   "metadata": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "recommendationToken": "my_recommendationToken",
    *   //   "results": []
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
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPlacementsPredict,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

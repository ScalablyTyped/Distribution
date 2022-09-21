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

@JSImport("googleapis/build/src/apis/recommendationengine/v1beta1", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Predictionapikeyregistrations")
@js.native
open class ResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  def create(
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  ): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration
    ]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  ): Unit = js.native
  /**
    * Register an API key for use with predict method.
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
    *     await recommendationengine.projects.locations.catalogs.eventStores.predictionApiKeyRegistrations.create(
    *       {
    *         // Required. The parent resource path. `projects/x/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "predictionApiKeyRegistration": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKey": "my_apiKey"
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
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Unregister an apiKey from using for predict method.
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
    *     await recommendationengine.projects.locations.catalogs.eventStores.predictionApiKeyRegistrations.delete(
    *       {
    *         // Required. The API key to unregister including full resource path. `projects/x/locations/global/catalogs/default_catalog/eventStores/default_event_store/predictionApiKeyRegistrations/`
    *         name: 'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore/predictionApiKeyRegistrations/my-predictionApiKeyRegistration',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[
    SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
  ] = js.native
  def list(
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
    ]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[
    SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
  ] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList): GaxiosPromise[
    SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
  ] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
    ]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
    ]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    options: MethodOptions
  ): GaxiosPromise[
    SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
  ] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[
      SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse
    ]
  ): Unit = js.native
  /**
    * List the registered apiKeys for use with predict method.
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
    *     await recommendationengine.projects.locations.catalogs.eventStores.predictionApiKeyRegistrations.list(
    *       {
    *         // Optional. Maximum number of results to return per page. If unset, the service will choose a reasonable default.
    *         pageSize: 'placeholder-value',
    *         // Optional. The previous `ListPredictionApiKeyRegistration.nextPageToken`.
    *         pageToken: 'placeholder-value',
    *         // Required. The parent placement resource name such as `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "predictionApiKeyRegistrations": []
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
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

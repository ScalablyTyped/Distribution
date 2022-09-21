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

@JSImport("googleapis/build/src/apis/recommendationengine/v1beta1", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs")
@js.native
open class ResourceProjectsLocationsCatalogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var catalogItems: ResourceProjectsLocationsCatalogsCatalogitems = js.native
  
  var context: APIRequestContext = js.native
  
  var eventStores: ResourceProjectsLocationsCatalogsEventstores = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsList): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  ): Unit = js.native
  /**
    * Lists all the catalog configurations associated with the project.
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
    *   const res = await recommendationengine.projects.locations.catalogs.list({
    *     // Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListCatalogs` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The account resource name with an associated location.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "catalogs": [],
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
  def list(params: ParamsResourceProjectsLocationsCatalogsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsCatalogsOperations = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1Catalog] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1Catalog]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1Catalog] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsPatch): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1Catalog] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1Catalog]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1Catalog],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1Catalog]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1Catalog] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1Catalog]
  ): Unit = js.native
  /**
    * Updates the catalog configuration.
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
    *   const res = await recommendationengine.projects.locations.catalogs.patch({
    *     // The fully qualified resource name of the catalog.
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *     // Optional. Indicates which fields in the provided 'catalog' to update. If not set, will only update the catalog_item_level_config field. Currently only fields that can be updated are catalog_item_level_config.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "catalogItemLevelConfig": {},
    *       //   "defaultEventStoreId": "my_defaultEventStoreId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "catalogItemLevelConfig": {},
    *   //   "defaultEventStoreId": "my_defaultEventStoreId",
    *   //   "displayName": "my_displayName",
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

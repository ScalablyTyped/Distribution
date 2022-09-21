package typings.googleapis.retailV2Mod.retailV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2", "retail_v2.Resource$Projects$Locations$Catalogs$Placements")
@js.native
open class ResourceProjectsLocationsCatalogsPlacements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def predict(): GaxiosPromise[SchemaGoogleCloudRetailV2PredictResponse] = js.native
  def predict(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2PredictResponse]): Unit = js.native
  def predict(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2PredictResponse] = js.native
  def predict(params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict): GaxiosPromise[SchemaGoogleCloudRetailV2PredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2PredictResponse]
  ): Unit = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2PredictResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2PredictResponse]
  ): Unit = js.native
  def predict(params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2PredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2PredictResponse]
  ): Unit = js.native
  /**
    * Makes a recommendation prediction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2');
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
    *   const res = await retail.projects.locations.catalogs.placements.predict({
    *     // Required. Full resource name of the format: `{placement=projects/x/locations/global/catalogs/default_catalog/servingConfigs/x\}` or `{placement=projects/x/locations/global/catalogs/default_catalog/placements/x\}`. We recommend using the `servingConfigs` resource. `placements` is a legacy resource. The ID of the Recommendations AI serving config or placement. Before you can request predictions from your model, you must create at least one serving config or placement for it. For more information, see [Managing serving configurations] (https://cloud.google.com/retail/docs/manage-configs). The full list of available serving configs can be seen at https://console.cloud.google.com/ai/retail/catalogs/default_catalog/configs
    *     placement:
    *       'projects/my-project/locations/my-location/catalogs/my-catalog/placements/my-placement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter",
    *       //   "labels": {},
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "params": {},
    *       //   "userEvent": {},
    *       //   "validateOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributionToken": "my_attributionToken",
    *   //   "missingIds": [],
    *   //   "results": [],
    *   //   "validateOnly": false
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
  def predict(params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsPredict,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudRetailV2SearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2SearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2SearchResponse] = js.native
  def search(params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch): GaxiosPromise[SchemaGoogleCloudRetailV2SearchResponse] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2SearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2SearchResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2SearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2SearchResponse] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2SearchResponse]
  ): Unit = js.native
  /**
    * Performs a search. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2');
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
    *   const res = await retail.projects.locations.catalogs.placements.search({
    *     // Required. The resource name of the Retail Search serving config, such as `projects/x/locations/global/catalogs/default_catalog/servingConfigs/default_serving_config` or the name of the legacy placement resource, such as `projects/x/locations/global/catalogs/default_catalog/placements/default_search`. This field is used to identify the serving configuration name and the set of models that will be used to make the search.
    *     placement:
    *       'projects/my-project/locations/my-location/catalogs/my-catalog/placements/my-placement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "boostSpec": {},
    *       //   "branch": "my_branch",
    *       //   "canonicalFilter": "my_canonicalFilter",
    *       //   "dynamicFacetSpec": {},
    *       //   "facetSpecs": [],
    *       //   "filter": "my_filter",
    *       //   "labels": {},
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageCategories": [],
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "personalizationSpec": {},
    *       //   "query": "my_query",
    *       //   "queryExpansionSpec": {},
    *       //   "searchMode": "my_searchMode",
    *       //   "spellCorrectionSpec": {},
    *       //   "userInfo": {},
    *       //   "variantRollupKeys": [],
    *       //   "visitorId": "my_visitorId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appliedControls": [],
    *   //   "attributionToken": "my_attributionToken",
    *   //   "correctedQuery": "my_correctedQuery",
    *   //   "facets": [],
    *   //   "invalidConditionBoostSpecs": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "queryExpansionInfo": {},
    *   //   "redirectUri": "my_redirectUri",
    *   //   "results": [],
    *   //   "totalSize": 0
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
  def search(params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsPlacementsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.retailV2alphaMod.retailV2alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2alpha", "retail_v2alpha.Resource$Projects$Locations$Catalogs$Servingconfigs")
@js.native
open class ResourceProjectsLocationsCatalogsServingconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addControl(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def addControl(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]): Unit = js.native
  def addControl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def addControl(params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def addControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def addControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def addControl(params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def addControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  /**
    * Enables a Control on the specified ServingConfig. The control is added in the last position of the list of controls it belongs to (e.g. if it's a facet spec control it will be applied in the last position of servingConfig.facetSpecIds) Returns a ALREADY_EXISTS error if the control has already been applied. Returns a FAILED_PRECONDITION error if the addition could exceed maximum number of control allowed for that type of control.
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
    * const retail = google.retail('v2alpha');
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
    *     await retail.projects.locations.catalogs.servingConfigs.addControl({
    *       // Required. The source ServingConfig resource name . Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    *       servingConfig:
    *         'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "controlId": "my_controlId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boostControlIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "diversityLevel": "my_diversityLevel",
    *   //   "doNotAssociateControlIds": [],
    *   //   "dynamicFacetSpec": {},
    *   //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *   //   "facetControlIds": [],
    *   //   "filterControlIds": [],
    *   //   "ignoreControlIds": [],
    *   //   "modelId": "my_modelId",
    *   //   "name": "my_name",
    *   //   "onewaySynonymsControlIds": [],
    *   //   "priceRerankingLevel": "my_priceRerankingLevel",
    *   //   "redirectControlIds": [],
    *   //   "replacementControlIds": [],
    *   //   "solutionTypes": [],
    *   //   "twowaySynonymsControlIds": []
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
  def addControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def addControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsAddcontrol,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  /**
    * Creates a ServingConfig. A maximum of 100 ServingConfigs are allowed in a Catalog, otherwise a FAILED_PRECONDITION error is returned.
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.create({
    *     // Required. Full resource name of parent. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}`
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *     // Required. The ID to use for the ServingConfig, which will become the final component of the ServingConfig's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/.
    *     servingConfigId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "boostControlIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "diversityLevel": "my_diversityLevel",
    *       //   "doNotAssociateControlIds": [],
    *       //   "dynamicFacetSpec": {},
    *       //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *       //   "facetControlIds": [],
    *       //   "filterControlIds": [],
    *       //   "ignoreControlIds": [],
    *       //   "modelId": "my_modelId",
    *       //   "name": "my_name",
    *       //   "onewaySynonymsControlIds": [],
    *       //   "priceRerankingLevel": "my_priceRerankingLevel",
    *       //   "redirectControlIds": [],
    *       //   "replacementControlIds": [],
    *       //   "solutionTypes": [],
    *       //   "twowaySynonymsControlIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boostControlIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "diversityLevel": "my_diversityLevel",
    *   //   "doNotAssociateControlIds": [],
    *   //   "dynamicFacetSpec": {},
    *   //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *   //   "facetControlIds": [],
    *   //   "filterControlIds": [],
    *   //   "ignoreControlIds": [],
    *   //   "modelId": "my_modelId",
    *   //   "name": "my_name",
    *   //   "onewaySynonymsControlIds": [],
    *   //   "priceRerankingLevel": "my_priceRerankingLevel",
    *   //   "redirectControlIds": [],
    *   //   "replacementControlIds": [],
    *   //   "solutionTypes": [],
    *   //   "twowaySynonymsControlIds": []
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
  def create(params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.delete({
    *     // Required. The resource name of the ServingConfig to delete. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
    *   });
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
  def delete(params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  /**
    * Gets a ServingConfig. Returns a NotFound error if the ServingConfig does not exist.
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.get({
    *     // Required. The resource name of the ServingConfig to get. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boostControlIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "diversityLevel": "my_diversityLevel",
    *   //   "doNotAssociateControlIds": [],
    *   //   "dynamicFacetSpec": {},
    *   //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *   //   "facetControlIds": [],
    *   //   "filterControlIds": [],
    *   //   "ignoreControlIds": [],
    *   //   "modelId": "my_modelId",
    *   //   "name": "my_name",
    *   //   "onewaySynonymsControlIds": [],
    *   //   "priceRerankingLevel": "my_priceRerankingLevel",
    *   //   "redirectControlIds": [],
    *   //   "replacementControlIds": [],
    *   //   "solutionTypes": [],
    *   //   "twowaySynonymsControlIds": []
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
  def get(params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsServingconfigsList): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListServingConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaListServingConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsServingconfigsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse]
  ): Unit = js.native
  /**
    * Lists all ServingConfigs linked to this catalog.
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.list({
    *     // Optional. Maximum number of results to return. If unspecified, defaults to 100. If a value greater than 100 is provided, at most 100 results are returned.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListServingConfigs` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The catalog resource name. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "servingConfigs": []
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
  def list(params: ParamsResourceProjectsLocationsCatalogsServingconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  /**
    * Updates a ServingConfig.
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.patch({
    *     // Immutable. Fully qualified name `projects/x/locations/global/catalogs/x/servingConfig/x`
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
    *     // Indicates which fields in the provided ServingConfig to update. The following are NOT supported: * ServingConfig.name If not set, all supported fields are updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "boostControlIds": [],
    *       //   "displayName": "my_displayName",
    *       //   "diversityLevel": "my_diversityLevel",
    *       //   "doNotAssociateControlIds": [],
    *       //   "dynamicFacetSpec": {},
    *       //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *       //   "facetControlIds": [],
    *       //   "filterControlIds": [],
    *       //   "ignoreControlIds": [],
    *       //   "modelId": "my_modelId",
    *       //   "name": "my_name",
    *       //   "onewaySynonymsControlIds": [],
    *       //   "priceRerankingLevel": "my_priceRerankingLevel",
    *       //   "redirectControlIds": [],
    *       //   "replacementControlIds": [],
    *       //   "solutionTypes": [],
    *       //   "twowaySynonymsControlIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boostControlIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "diversityLevel": "my_diversityLevel",
    *   //   "doNotAssociateControlIds": [],
    *   //   "dynamicFacetSpec": {},
    *   //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *   //   "facetControlIds": [],
    *   //   "filterControlIds": [],
    *   //   "ignoreControlIds": [],
    *   //   "modelId": "my_modelId",
    *   //   "name": "my_name",
    *   //   "onewaySynonymsControlIds": [],
    *   //   "priceRerankingLevel": "my_priceRerankingLevel",
    *   //   "redirectControlIds": [],
    *   //   "replacementControlIds": [],
    *   //   "solutionTypes": [],
    *   //   "twowaySynonymsControlIds": []
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def predict(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaPredictResponse] = js.native
  def predict(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaPredictResponse]): Unit = js.native
  def predict(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaPredictResponse] = js.native
  def predict(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict): GaxiosPromise[SchemaGoogleCloudRetailV2alphaPredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaPredictResponse]
  ): Unit = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaPredictResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaPredictResponse]
  ): Unit = js.native
  def predict(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaPredictResponse] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaPredictResponse]
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.predict({
    *     // Required. Full resource name of the format: `{placement=projects/x/locations/global/catalogs/default_catalog/servingConfigs/x\}` or `{placement=projects/x/locations/global/catalogs/default_catalog/placements/x\}`. We recommend using the `servingConfigs` resource. `placements` is a legacy resource. The ID of the Recommendations AI serving config or placement. Before you can request predictions from your model, you must create at least one serving config or placement for it. For more information, see [Managing serving configurations] (https://cloud.google.com/retail/docs/manage-configs). The full list of available serving configs can be seen at https://console.cloud.google.com/ai/retail/catalogs/default_catalog/configs
    *     placement:
    *       'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
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
  def predict(params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def predict(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsPredict,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeControl(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def removeControl(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]): Unit = js.native
  def removeControl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def removeControl(params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def removeControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def removeControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  def removeControl(params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaServingConfig] = js.native
  def removeControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaServingConfig]
  ): Unit = js.native
  /**
    * Disables a Control on the specified ServingConfig. The control is removed from the ServingConfig. Returns a NOT_FOUND error if the Control is not enabled for the ServingConfig.
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
    * const retail = google.retail('v2alpha');
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
    *     await retail.projects.locations.catalogs.servingConfigs.removeControl({
    *       // Required. The source ServingConfig resource name . Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/servingConfigs/{serving_config_id\}
    *       servingConfig:
    *         'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "controlId": "my_controlId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boostControlIds": [],
    *   //   "displayName": "my_displayName",
    *   //   "diversityLevel": "my_diversityLevel",
    *   //   "doNotAssociateControlIds": [],
    *   //   "dynamicFacetSpec": {},
    *   //   "enableCategoryFilterLevel": "my_enableCategoryFilterLevel",
    *   //   "facetControlIds": [],
    *   //   "filterControlIds": [],
    *   //   "ignoreControlIds": [],
    *   //   "modelId": "my_modelId",
    *   //   "name": "my_name",
    *   //   "onewaySynonymsControlIds": [],
    *   //   "priceRerankingLevel": "my_priceRerankingLevel",
    *   //   "redirectControlIds": [],
    *   //   "replacementControlIds": [],
    *   //   "solutionTypes": [],
    *   //   "twowaySynonymsControlIds": []
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
  def removeControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeControl(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsRemovecontrol,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaSearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaSearchResponse] = js.native
  def search(params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch): GaxiosPromise[SchemaGoogleCloudRetailV2alphaSearchResponse] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaSearchResponse] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaSearchResponse]
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
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.servingConfigs.search({
    *     // Required. The resource name of the Retail Search serving config, such as `projects/x/locations/global/catalogs/default_catalog/servingConfigs/default_serving_config` or the name of the legacy placement resource, such as `projects/x/locations/global/catalogs/default_catalog/placements/default_search`. This field is used to identify the serving configuration name and the set of models that will be used to make the search.
    *     placement:
    *       'projects/my-project/locations/my-location/catalogs/my-catalog/servingConfigs/my-servingConfig',
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
    *       //   "relevanceThreshold": "my_relevanceThreshold",
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
  def search(params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsLocationsCatalogsServingconfigsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

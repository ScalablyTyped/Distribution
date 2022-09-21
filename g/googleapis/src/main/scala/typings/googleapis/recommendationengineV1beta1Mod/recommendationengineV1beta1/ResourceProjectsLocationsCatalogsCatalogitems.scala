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

@JSImport("googleapis/build/src/apis/recommendationengine/v1beta1", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Catalogitems")
@js.native
open class ResourceProjectsLocationsCatalogsCatalogitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  /**
    * Creates a catalog item.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.create({
    *       // Required. The parent catalog resource name, such as `projects/x/locations/global/catalogs/default_catalog`.
    *       parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "categoryHierarchies": [],
    *         //   "description": "my_description",
    *         //   "id": "my_id",
    *         //   "itemAttributes": {},
    *         //   "itemGroupId": "my_itemGroupId",
    *         //   "languageCode": "my_languageCode",
    *         //   "productMetadata": {},
    *         //   "tags": [],
    *         //   "title": "my_title"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categoryHierarchies": [],
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "itemAttributes": {},
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "languageCode": "my_languageCode",
    *   //   "productMetadata": {},
    *   //   "tags": [],
    *   //   "title": "my_title"
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
  def create(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a catalog item.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.delete({
    *       // Required. Full resource name of catalog item, such as `projects/x/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id`.
    *       name: 'projects/my-project/locations/my-location/catalogs/my-catalog/catalogItems/.*',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  /**
    * Gets a specific catalog item.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.get({
    *       // Required. Full resource name of catalog item, such as `projects/x/locations/global/catalogs/default_catalog/catalogitems/some_catalog_item_id`.
    *       name: 'projects/my-project/locations/my-location/catalogs/my-catalog/catalogItems/.*',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categoryHierarchies": [],
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "itemAttributes": {},
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "languageCode": "my_languageCode",
    *   //   "productMetadata": {},
    *   //   "tags": [],
    *   //   "title": "my_title"
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
  def get(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Bulk import of multiple catalog items. Request processing may be synchronous. No partial updating supported. Non-existing items will be created. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully updated.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.import({
    *       // Required. `projects/1234/locations/global/catalogs/default_catalog` If no updateMask is specified, requires catalogItems.create permission. If updateMask is specified, requires catalogItems.update permission.
    *       parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "errorsConfig": {},
    *         //   "inputConfig": {},
    *         //   "requestId": "my_requestId",
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `import`(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  ): Unit = js.native
  /**
    * Gets a list of catalog items.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.list({
    *       // Optional. Use of this field is not supported by version v1beta1.
    *       filter: 'placeholder-value',
    *       // Optional. Maximum number of results to return per page. If zero, the service will choose a reasonable default.
    *       pageSize: 'placeholder-value',
    *       // Optional. The previous ListCatalogItemsResponse.next_page_token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent catalog resource name, such as `projects/x/locations/global/catalogs/default_catalog`.
    *       parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "catalogItems": [],
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
  def list(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  ): Unit = js.native
  /**
    * Updates a catalog item. Partial updating is supported. Non-existing items will be created.
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
    *     await recommendationengine.projects.locations.catalogs.catalogItems.patch({
    *       // Required. Full resource name of catalog item, such as `projects/x/locations/global/catalogs/default_catalog/catalogItems/some_catalog_item_id`.
    *       name: 'projects/my-project/locations/my-location/catalogs/my-catalog/catalogItems/.*',
    *       // Optional. Indicates which fields in the provided 'item' to update. If not set, will by default update all fields.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "categoryHierarchies": [],
    *         //   "description": "my_description",
    *         //   "id": "my_id",
    *         //   "itemAttributes": {},
    *         //   "itemGroupId": "my_itemGroupId",
    *         //   "languageCode": "my_languageCode",
    *         //   "productMetadata": {},
    *         //   "tags": [],
    *         //   "title": "my_title"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "categoryHierarchies": [],
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "itemAttributes": {},
    *   //   "itemGroupId": "my_itemGroupId",
    *   //   "languageCode": "my_languageCode",
    *   //   "productMetadata": {},
    *   //   "tags": [],
    *   //   "title": "my_title"
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsCatalogitemsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

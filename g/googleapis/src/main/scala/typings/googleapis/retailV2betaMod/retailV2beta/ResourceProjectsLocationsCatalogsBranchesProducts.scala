package typings.googleapis.retailV2betaMod.retailV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2beta", "retail_v2beta.Resource$Projects$Locations$Catalogs$Branches$Products")
@js.native
open class ResourceProjectsLocationsCatalogsBranchesProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addFulfillmentPlaces(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addFulfillmentPlaces(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def addFulfillmentPlaces(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addFulfillmentPlaces(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Incrementally adds place IDs to Product.fulfillment_info.place_ids. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, the added place IDs are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
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
    * const retail = google.retail('v2beta');
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
    *     await retail.projects.locations.catalogs.branches.products.addFulfillmentPlaces(
    *       {
    *         // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned.
    *         product:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "addTime": "my_addTime",
    *           //   "allowMissing": false,
    *           //   "placeIds": [],
    *           //   "type": "my_type"
    *           // }
    *         },
    *       }
    *     );
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
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def addFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddfulfillmentplaces,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addLocalInventories(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addLocalInventories(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def addLocalInventories(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addLocalInventories(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates local inventory information for a Product at a list of places, while respecting the last update timestamps of each inventory field. This process is asynchronous and does not require the Product to exist before updating inventory information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, updates are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. Local inventory information can only be modified using this method. ProductService.CreateProduct and ProductService.UpdateProduct has no effect on local inventories. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
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
    * const retail = google.retail('v2beta');
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
    *     await retail.projects.locations.catalogs.branches.products.addLocalInventories(
    *       {
    *         // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned.
    *         product:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "addMask": "my_addMask",
    *           //   "addTime": "my_addTime",
    *           //   "allowMissing": false,
    *           //   "localInventories": []
    *           // }
    *         },
    *       }
    *     );
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
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def addLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsAddlocalinventories,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  /**
    * Creates a Product.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.create(
    *     {
    *       // Required. The parent catalog resource name, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch`.
    *       parent:
    *         'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche',
    *       // Required. The ID to use for the Product, which will become the final component of the Product.name. If the caller does not have permission to create the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned. This field must be unique among all Products with the same parent. Otherwise, an ALREADY_EXISTS error is returned. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    *       productId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "attributes": {},
    *         //   "audience": {},
    *         //   "availability": "my_availability",
    *         //   "availableQuantity": 0,
    *         //   "availableTime": "my_availableTime",
    *         //   "brands": [],
    *         //   "categories": [],
    *         //   "collectionMemberIds": [],
    *         //   "colorInfo": {},
    *         //   "conditions": [],
    *         //   "description": "my_description",
    *         //   "expireTime": "my_expireTime",
    *         //   "fulfillmentInfo": [],
    *         //   "gtin": "my_gtin",
    *         //   "id": "my_id",
    *         //   "images": [],
    *         //   "languageCode": "my_languageCode",
    *         //   "materials": [],
    *         //   "name": "my_name",
    *         //   "patterns": [],
    *         //   "priceInfo": {},
    *         //   "primaryProductId": "my_primaryProductId",
    *         //   "promotions": [],
    *         //   "publishTime": "my_publishTime",
    *         //   "rating": {},
    *         //   "retrievableFields": "my_retrievableFields",
    *         //   "sizes": [],
    *         //   "tags": [],
    *         //   "title": "my_title",
    *         //   "ttl": "my_ttl",
    *         //   "type": "my_type",
    *         //   "uri": "my_uri",
    *         //   "variants": []
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "audience": {},
    *   //   "availability": "my_availability",
    *   //   "availableQuantity": 0,
    *   //   "availableTime": "my_availableTime",
    *   //   "brands": [],
    *   //   "categories": [],
    *   //   "collectionMemberIds": [],
    *   //   "colorInfo": {},
    *   //   "conditions": [],
    *   //   "description": "my_description",
    *   //   "expireTime": "my_expireTime",
    *   //   "fulfillmentInfo": [],
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "materials": [],
    *   //   "name": "my_name",
    *   //   "patterns": [],
    *   //   "priceInfo": {},
    *   //   "primaryProductId": "my_primaryProductId",
    *   //   "promotions": [],
    *   //   "publishTime": "my_publishTime",
    *   //   "rating": {},
    *   //   "retrievableFields": "my_retrievableFields",
    *   //   "sizes": [],
    *   //   "tags": [],
    *   //   "title": "my_title",
    *   //   "ttl": "my_ttl",
    *   //   "type": "my_type",
    *   //   "uri": "my_uri",
    *   //   "variants": []
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
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a Product.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.delete(
    *     {
    *       // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to delete the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned. If the Product to delete does not exist, a NOT_FOUND error is returned. The Product to delete can neither be a Product.Type.COLLECTION Product member nor a Product.Type.PRIMARY Product with more than one variants. Otherwise, an INVALID_ARGUMENT error is returned. All inventory information for the named Product will be deleted.
    *       name: 'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *     }
    *   );
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
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  /**
    * Gets a Product.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.get({
    *     // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned. If the requested Product does not exist, a NOT_FOUND error is returned.
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "audience": {},
    *   //   "availability": "my_availability",
    *   //   "availableQuantity": 0,
    *   //   "availableTime": "my_availableTime",
    *   //   "brands": [],
    *   //   "categories": [],
    *   //   "collectionMemberIds": [],
    *   //   "colorInfo": {},
    *   //   "conditions": [],
    *   //   "description": "my_description",
    *   //   "expireTime": "my_expireTime",
    *   //   "fulfillmentInfo": [],
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "materials": [],
    *   //   "name": "my_name",
    *   //   "patterns": [],
    *   //   "priceInfo": {},
    *   //   "primaryProductId": "my_primaryProductId",
    *   //   "promotions": [],
    *   //   "publishTime": "my_publishTime",
    *   //   "rating": {},
    *   //   "retrievableFields": "my_retrievableFields",
    *   //   "sizes": [],
    *   //   "tags": [],
    *   //   "title": "my_title",
    *   //   "ttl": "my_ttl",
    *   //   "type": "my_type",
    *   //   "uri": "my_uri",
    *   //   "variants": []
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
  def get(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Bulk import of multiple Products. Request processing may be synchronous. Non-existing items are created. Note that it is possible for a subset of the Products to be successfully updated.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.import(
    *     {
    *       // Required. `projects/1234/locations/global/catalogs/default_catalog/branches/default_branch` If no updateMask is specified, requires products.create permission. If updateMask is specified, requires products.update permission.
    *       parent:
    *         'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "errorsConfig": {},
    *         //   "inputConfig": {},
    *         //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *         //   "reconciliationMode": "my_reconciliationMode",
    *         //   "requestId": "my_requestId",
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     }
    *   );
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
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRetailV2betaListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaListProductsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaListProductsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList): GaxiosPromise[SchemaGoogleCloudRetailV2betaListProductsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaListProductsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaListProductsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaListProductsResponse]
  ): Unit = js.native
  /**
    * Gets a list of Products.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.list({
    *     // A filter to apply on the list results. Supported features: * List all the products under the parent branch if filter is unset. * List Product.Type.VARIANT Products sharing the same Product.Type.PRIMARY Product. For example: `primary_product_id = "some_product_id"` * List Products bundled in a Product.Type.COLLECTION Product. For example: `collection_product_id = "some_product_id"` * List Products with a partibular type. For example: `type = "PRIMARY"` `type = "VARIANT"` `type = "COLLECTION"` If the field is unrecognizable, an INVALID_ARGUMENT error is returned. If the specified Product.Type.PRIMARY Product or Product.Type.COLLECTION Product does not exist, a NOT_FOUND error is returned.
    *     filter: 'placeholder-value',
    *     // Maximum number of Products to return. If unspecified, defaults to 100. The maximum allowed value is 1000. Values above 1000 will be coerced to 1000. If this field is negative, an INVALID_ARGUMENT error is returned.
    *     pageSize: 'placeholder-value',
    *     // A page token ListProductsResponse.next_page_token, received from a previous ProductService.ListProducts call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ProductService.ListProducts must match the call that provided the page token. Otherwise, an INVALID_ARGUMENT error is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent branch resource name, such as `projects/x/locations/global/catalogs/default_catalog/branches/0`. Use `default_branch` as the branch ID, to list products under the default branch. If the caller does not have permission to list Products under this branch, regardless of whether or not this branch exists, a PERMISSION_DENIED error is returned.
    *     parent:
    *       'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche',
    *     // The fields of Product to return in the responses. If not set or empty, the following fields are returned: * Product.name * Product.id * Product.title * Product.uri * Product.images * Product.price_info * Product.brands If "*" is provided, all fields are returned. Product.name is always returned no matter what mask is set. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "products": []
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
  def list(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2betaProduct] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2betaProduct]
  ): Unit = js.native
  /**
    * Updates a Product.
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
    * const retail = google.retail('v2beta');
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
    *   const res = await retail.projects.locations.catalogs.branches.products.patch({
    *     // If set to true, and the Product is not found, a new Product will be created. In this situation, `update_mask` is ignored.
    *     allowMissing: 'placeholder-value',
    *     // Immutable. Full resource name of the product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/product_id`.
    *     name: 'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *     // Indicates which fields in the provided Product to update. The immutable and output only fields are NOT supported. If not set, all supported fields (the fields that are neither immutable nor output only) are updated. If an unsupported or unknown field is provided, an INVALID_ARGUMENT error is returned. The attribute key can be updated by setting the mask path as "attributes.${key_name\}". If a key name is present in the mask but not in the patching product from the request, this key will be deleted after the update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributes": {},
    *       //   "audience": {},
    *       //   "availability": "my_availability",
    *       //   "availableQuantity": 0,
    *       //   "availableTime": "my_availableTime",
    *       //   "brands": [],
    *       //   "categories": [],
    *       //   "collectionMemberIds": [],
    *       //   "colorInfo": {},
    *       //   "conditions": [],
    *       //   "description": "my_description",
    *       //   "expireTime": "my_expireTime",
    *       //   "fulfillmentInfo": [],
    *       //   "gtin": "my_gtin",
    *       //   "id": "my_id",
    *       //   "images": [],
    *       //   "languageCode": "my_languageCode",
    *       //   "materials": [],
    *       //   "name": "my_name",
    *       //   "patterns": [],
    *       //   "priceInfo": {},
    *       //   "primaryProductId": "my_primaryProductId",
    *       //   "promotions": [],
    *       //   "publishTime": "my_publishTime",
    *       //   "rating": {},
    *       //   "retrievableFields": "my_retrievableFields",
    *       //   "sizes": [],
    *       //   "tags": [],
    *       //   "title": "my_title",
    *       //   "ttl": "my_ttl",
    *       //   "type": "my_type",
    *       //   "uri": "my_uri",
    *       //   "variants": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "audience": {},
    *   //   "availability": "my_availability",
    *   //   "availableQuantity": 0,
    *   //   "availableTime": "my_availableTime",
    *   //   "brands": [],
    *   //   "categories": [],
    *   //   "collectionMemberIds": [],
    *   //   "colorInfo": {},
    *   //   "conditions": [],
    *   //   "description": "my_description",
    *   //   "expireTime": "my_expireTime",
    *   //   "fulfillmentInfo": [],
    *   //   "gtin": "my_gtin",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "materials": [],
    *   //   "name": "my_name",
    *   //   "patterns": [],
    *   //   "priceInfo": {},
    *   //   "primaryProductId": "my_primaryProductId",
    *   //   "promotions": [],
    *   //   "publishTime": "my_publishTime",
    *   //   "rating": {},
    *   //   "retrievableFields": "my_retrievableFields",
    *   //   "sizes": [],
    *   //   "tags": [],
    *   //   "title": "my_title",
    *   //   "ttl": "my_ttl",
    *   //   "type": "my_type",
    *   //   "uri": "my_uri",
    *   //   "variants": []
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
  def patch(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeFulfillmentPlaces(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeFulfillmentPlaces(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def removeFulfillmentPlaces(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeFulfillmentPlaces(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Incrementally removes place IDs from a Product.fulfillment_info.place_ids. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, the removed place IDs are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
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
    * const retail = google.retail('v2beta');
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
    *     await retail.projects.locations.catalogs.branches.products.removeFulfillmentPlaces(
    *       {
    *         // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned.
    *         product:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "allowMissing": false,
    *           //   "placeIds": [],
    *           //   "removeTime": "my_removeTime",
    *           //   "type": "my_type"
    *           // }
    *         },
    *       }
    *     );
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
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeFulfillmentPlaces(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovefulfillmentplaces,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeLocalInventories(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeLocalInventories(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def removeLocalInventories(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeLocalInventories(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Remove local inventory information for a Product at a list of places at a removal timestamp. This process is asynchronous. If the request is valid, the removal will be enqueued and processed downstream. As a consequence, when a response is returned, removals are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. Local inventory information can only be removed using this method. ProductService.CreateProduct and ProductService.UpdateProduct has no effect on local inventories. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
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
    * const retail = google.retail('v2beta');
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
    *     await retail.projects.locations.catalogs.branches.products.removeLocalInventories(
    *       {
    *         // Required. Full resource name of Product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`. If the caller does not have permission to access the Product, regardless of whether or not it exists, a PERMISSION_DENIED error is returned.
    *         product:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "allowMissing": false,
    *           //   "placeIds": [],
    *           //   "removeTime": "my_removeTime"
    *           // }
    *         },
    *       }
    *     );
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
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeLocalInventories(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsRemovelocalinventories,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setInventory(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setInventory(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def setInventory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setInventory(params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates inventory information for a Product while respecting the last update timestamps of each inventory field. This process is asynchronous and does not require the Product to exist before updating fulfillment information. If the request is valid, the update will be enqueued and processed downstream. As a consequence, when a response is returned, updates are not immediately manifested in the Product queried by ProductService.GetProduct or ProductService.ListProducts. When inventory is updated with ProductService.CreateProduct and ProductService.UpdateProduct, the specified inventory field value(s) will overwrite any existing value(s) while ignoring the last update time for this field. Furthermore, the last update time for the specified inventory fields will be overwritten to the time of the ProductService.CreateProduct or ProductService.UpdateProduct request. If no inventory fields are set in CreateProductRequest.product, then any pre-existing inventory information for this product will be used. If no inventory fields are set in SetInventoryRequest.set_mask, then any existing inventory information will be preserved. Pre-existing inventory information can only be updated with ProductService.SetInventory, ProductService.AddFulfillmentPlaces, and ProductService.RemoveFulfillmentPlaces. The returned Operations will be obsolete after 1 day, and GetOperation API will return NOT_FOUND afterwards. If conflicting updates are issued, the Operations associated with the stale updates will not be marked as done until being obsolete. This feature is only available for users who have Retail Search enabled. Please enable Retail Search on Cloud Console before using this feature.
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
    * const retail = google.retail('v2beta');
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
    *     await retail.projects.locations.catalogs.branches.products.setInventory({
    *       // Immutable. Full resource name of the product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/product_id`.
    *       name: 'projects/my-project/locations/my-location/catalogs/my-catalog/branches/my-branche/products/.*',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "allowMissing": false,
    *         //   "inventory": {},
    *         //   "setMask": "my_setMask",
    *         //   "setTime": "my_setTime"
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
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setInventory(
    params: ParamsResourceProjectsLocationsCatalogsBranchesProductsSetinventory,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

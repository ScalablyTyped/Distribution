package typings.googleapis.manufacturersV1Mod.manufacturersV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/manufacturers/v1", "manufacturers_v1.Resource$Accounts$Products")
@js.native
open class ResourceAccountsProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAccountsProductsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAccountsProductsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsProductsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsProductsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsProductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the product from a Manufacturer Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/manufacturers.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const manufacturers = google.manufacturers('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/manufacturercenter'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await manufacturers.accounts.products.delete({
    *     // Name in the format `{target_country\}:{content_language\}:{product_id\}`. `target_country` - The target country of the product as a CLDR territory code (for example, US). `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    *     name: '[^/]+',
    *     // Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    *     parent: 'accounts/my-account',
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
  def delete(params: ParamsResourceAccountsProductsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsProductsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceAccountsProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Gets the product from a Manufacturer Center account, including product issues. A recently updated product takes around 15 minutes to process. Changes are only visible after it has been processed. While some issues may be available once the product has been processed, other issues may take days to appear.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/manufacturers.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const manufacturers = google.manufacturers('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/manufacturercenter'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await manufacturers.accounts.products.get({
    *     // The information to be included in the response. Only sections listed here will be returned.
    *     include: 'placeholder-value',
    *     // Name in the format `{target_country\}:{content_language\}:{product_id\}`. `target_country` - The target country of the product as a CLDR territory code (for example, US). `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    *     name: '[^/]+',
    *     // Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "destinationStatuses": [],
    *   //   "issues": [],
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "productId": "my_productId",
    *   //   "targetCountry": "my_targetCountry"
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
  def get(params: ParamsResourceAccountsProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(params: ParamsResourceAccountsProductsList): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: BodyResponseCallback[Readable | SchemaListProductsResponse],
    callback: BodyResponseCallback[Readable | SchemaListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  /**
    * Lists all the products in a Manufacturer Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/manufacturers.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const manufacturers = google.manufacturers('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/manufacturercenter'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await manufacturers.accounts.products.list({
    *     // The information to be included in the response. Only sections listed here will be returned.
    *     include: 'placeholder-value',
    *     // Maximum number of product statuses to return in the response, used for paging.
    *     pageSize: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    *     parent: 'accounts/my-account',
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
  def list(params: ParamsResourceAccountsProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEmpty] = js.native
  def update(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def update(params: ParamsResourceAccountsProductsUpdate): GaxiosPromise[SchemaEmpty] = js.native
  def update(params: ParamsResourceAccountsProductsUpdate, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def update(
    params: ParamsResourceAccountsProductsUpdate,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsProductsUpdate, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def update(
    params: ParamsResourceAccountsProductsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Inserts or updates the attributes of the product in a Manufacturer Center account. Creates a product with the provided attributes. If the product already exists, then all attributes are replaced with the new ones. The checks at upload time are minimal. All required attributes need to be present for a product to be valid. Issues may show up later after the API has accepted a new upload for a product and it is possible to overwrite an existing valid product with an invalid product. To detect this, you should retrieve the product and check it for issues once the new version is available. Uploaded attributes first need to be processed before they can be retrieved. Until then, new products will be unavailable, and retrieval of previously uploaded products will return the original state of the product.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/manufacturers.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const manufacturers = google.manufacturers('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/manufacturercenter'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await manufacturers.accounts.products.update({
    *     // Name in the format `{target_country\}:{content_language\}:{product_id\}`. `target_country` - The target country of the product as a CLDR territory code (for example, US). `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    *     name: '[^/]+',
    *     // Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalImageLink": [],
    *       //   "ageGroup": "my_ageGroup",
    *       //   "brand": "my_brand",
    *       //   "capacity": {},
    *       //   "color": "my_color",
    *       //   "count": {},
    *       //   "description": "my_description",
    *       //   "disclosureDate": "my_disclosureDate",
    *       //   "excludedDestination": [],
    *       //   "featureDescription": [],
    *       //   "flavor": "my_flavor",
    *       //   "format": "my_format",
    *       //   "gender": "my_gender",
    *       //   "grocery": {},
    *       //   "gtin": [],
    *       //   "imageLink": {},
    *       //   "includedDestination": [],
    *       //   "itemGroupId": "my_itemGroupId",
    *       //   "material": "my_material",
    *       //   "mpn": "my_mpn",
    *       //   "nutrition": {},
    *       //   "pattern": "my_pattern",
    *       //   "productDetail": [],
    *       //   "productHighlight": [],
    *       //   "productLine": "my_productLine",
    *       //   "productName": "my_productName",
    *       //   "productPageUrl": "my_productPageUrl",
    *       //   "productType": [],
    *       //   "releaseDate": "my_releaseDate",
    *       //   "richProductContent": [],
    *       //   "scent": "my_scent",
    *       //   "size": "my_size",
    *       //   "sizeSystem": "my_sizeSystem",
    *       //   "sizeType": [],
    *       //   "suggestedRetailPrice": {},
    *       //   "targetClientId": "my_targetClientId",
    *       //   "theme": "my_theme",
    *       //   "title": "my_title",
    *       //   "videoLink": []
    *       // }
    *     },
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
  def update(params: ParamsResourceAccountsProductsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsProductsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

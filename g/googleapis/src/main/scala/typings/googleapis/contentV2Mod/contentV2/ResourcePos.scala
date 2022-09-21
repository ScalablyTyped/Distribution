package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Pos")
@js.native
open class ResourcePos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaPosCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourcePosCustombatch): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourcePosCustombatch, callback: BodyResponseCallback[SchemaPosCustomBatchResponse]): Unit = js.native
  def custombatch(
    params: ParamsResourcePosCustombatch,
    options: BodyResponseCallback[Readable | SchemaPosCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaPosCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourcePosCustombatch, options: MethodOptions): GaxiosPromise[SchemaPosCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourcePosCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosCustomBatchResponse]
  ): Unit = js.native
  /**
    * Batches multiple POS-related calls in a single request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.custombatch({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourcePosCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourcePosCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePosDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePosDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePosDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a store for the given merchant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.delete({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // A store code that is unique per merchant.
    *     storeCode: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourcePosDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePosDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPosStore] = js.native
  def get(callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def get(params: ParamsResourcePosGet): GaxiosPromise[SchemaPosStore] = js.native
  def get(params: ParamsResourcePosGet, callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def get(
    params: ParamsResourcePosGet,
    options: BodyResponseCallback[Readable | SchemaPosStore],
    callback: BodyResponseCallback[Readable | SchemaPosStore]
  ): Unit = js.native
  def get(params: ParamsResourcePosGet, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def get(
    params: ParamsResourcePosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  /**
    * Retrieves information about the given store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.get({
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // A store code that is unique per merchant.
    *     storeCode: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "gcidCategory": [],
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "placeId": "my_placeId",
    *   //   "storeAddress": "my_storeAddress",
    *   //   "storeCode": "my_storeCode",
    *   //   "storeName": "my_storeName",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def get(params: ParamsResourcePosGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePosGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPosStore] = js.native
  def insert(callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def insert(params: ParamsResourcePosInsert): GaxiosPromise[SchemaPosStore] = js.native
  def insert(params: ParamsResourcePosInsert, callback: BodyResponseCallback[SchemaPosStore]): Unit = js.native
  def insert(
    params: ParamsResourcePosInsert,
    options: BodyResponseCallback[Readable | SchemaPosStore],
    callback: BodyResponseCallback[Readable | SchemaPosStore]
  ): Unit = js.native
  def insert(params: ParamsResourcePosInsert, options: MethodOptions): GaxiosPromise[SchemaPosStore] = js.native
  def insert(
    params: ParamsResourcePosInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosStore]
  ): Unit = js.native
  /**
    * Creates a store for the given merchant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.insert({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "gcidCategory": [],
    *       //   "kind": "my_kind",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "placeId": "my_placeId",
    *       //   "storeAddress": "my_storeAddress",
    *       //   "storeCode": "my_storeCode",
    *       //   "storeName": "my_storeName",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "gcidCategory": [],
    *   //   "kind": "my_kind",
    *   //   "phoneNumber": "my_phoneNumber",
    *   //   "placeId": "my_placeId",
    *   //   "storeAddress": "my_storeAddress",
    *   //   "storeCode": "my_storeCode",
    *   //   "storeName": "my_storeName",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def insert(params: ParamsResourcePosInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePosInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def inventory(): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(callback: BodyResponseCallback[SchemaPosInventoryResponse]): Unit = js.native
  def inventory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(params: ParamsResourcePosInventory): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(params: ParamsResourcePosInventory, callback: BodyResponseCallback[SchemaPosInventoryResponse]): Unit = js.native
  def inventory(
    params: ParamsResourcePosInventory,
    options: BodyResponseCallback[Readable | SchemaPosInventoryResponse],
    callback: BodyResponseCallback[Readable | SchemaPosInventoryResponse]
  ): Unit = js.native
  def inventory(params: ParamsResourcePosInventory, options: MethodOptions): GaxiosPromise[SchemaPosInventoryResponse] = js.native
  def inventory(
    params: ParamsResourcePosInventory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosInventoryResponse]
  ): Unit = js.native
  /**
    * Submit inventory for the given merchant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.inventory({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "gtin": "my_gtin",
    *       //   "itemId": "my_itemId",
    *       //   "price": {},
    *       //   "quantity": "my_quantity",
    *       //   "storeCode": "my_storeCode",
    *       //   "targetCountry": "my_targetCountry",
    *       //   "timestamp": "my_timestamp"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "gtin": "my_gtin",
    *   //   "itemId": "my_itemId",
    *   //   "kind": "my_kind",
    *   //   "price": {},
    *   //   "quantity": "my_quantity",
    *   //   "storeCode": "my_storeCode",
    *   //   "targetCountry": "my_targetCountry",
    *   //   "timestamp": "my_timestamp"
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
  def inventory(params: ParamsResourcePosInventory, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def inventory(
    params: ParamsResourcePosInventory,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPosListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(params: ParamsResourcePosList): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(params: ParamsResourcePosList, callback: BodyResponseCallback[SchemaPosListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePosList,
    options: BodyResponseCallback[Readable | SchemaPosListResponse],
    callback: BodyResponseCallback[Readable | SchemaPosListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePosList, options: MethodOptions): GaxiosPromise[SchemaPosListResponse] = js.native
  def list(
    params: ParamsResourcePosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosListResponse]
  ): Unit = js.native
  /**
    * Lists the stores of the target merchant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.list({
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "resources": []
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
  def list(params: ParamsResourcePosList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePosList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sale(): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(callback: BodyResponseCallback[SchemaPosSaleResponse]): Unit = js.native
  def sale(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(params: ParamsResourcePosSale): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(params: ParamsResourcePosSale, callback: BodyResponseCallback[SchemaPosSaleResponse]): Unit = js.native
  def sale(
    params: ParamsResourcePosSale,
    options: BodyResponseCallback[Readable | SchemaPosSaleResponse],
    callback: BodyResponseCallback[Readable | SchemaPosSaleResponse]
  ): Unit = js.native
  def sale(params: ParamsResourcePosSale, options: MethodOptions): GaxiosPromise[SchemaPosSaleResponse] = js.native
  def sale(
    params: ParamsResourcePosSale,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPosSaleResponse]
  ): Unit = js.native
  /**
    * Submit a sale event for the given merchant.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.pos.sale({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the POS or inventory data provider.
    *     merchantId: 'placeholder-value',
    *     // The ID of the target merchant.
    *     targetMerchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "gtin": "my_gtin",
    *       //   "itemId": "my_itemId",
    *       //   "price": {},
    *       //   "quantity": "my_quantity",
    *       //   "saleId": "my_saleId",
    *       //   "storeCode": "my_storeCode",
    *       //   "targetCountry": "my_targetCountry",
    *       //   "timestamp": "my_timestamp"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "gtin": "my_gtin",
    *   //   "itemId": "my_itemId",
    *   //   "kind": "my_kind",
    *   //   "price": {},
    *   //   "quantity": "my_quantity",
    *   //   "saleId": "my_saleId",
    *   //   "storeCode": "my_storeCode",
    *   //   "targetCountry": "my_targetCountry",
    *   //   "timestamp": "my_timestamp"
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
  def sale(params: ParamsResourcePosSale, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sale(
    params: ParamsResourcePosSale,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Collections")
@js.native
open class ResourceCollections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCollection] = js.native
  def create(callback: BodyResponseCallback[SchemaCollection]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCollection] = js.native
  def create(params: ParamsResourceCollectionsCreate): GaxiosPromise[SchemaCollection] = js.native
  def create(params: ParamsResourceCollectionsCreate, callback: BodyResponseCallback[SchemaCollection]): Unit = js.native
  def create(
    params: ParamsResourceCollectionsCreate,
    options: BodyResponseCallback[Readable | SchemaCollection],
    callback: BodyResponseCallback[Readable | SchemaCollection]
  ): Unit = js.native
  def create(params: ParamsResourceCollectionsCreate, options: MethodOptions): GaxiosPromise[SchemaCollection] = js.native
  def create(
    params: ParamsResourceCollectionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCollection]
  ): Unit = js.native
  /**
    * Uploads a collection to your Merchant Center account. If a collection with the same collectionId already exists, this method updates that entry. In each update, the collection is completely replaced by the fields in the body of the update request.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.collections.create({
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customLabel0": "my_customLabel0",
    *       //   "customLabel1": "my_customLabel1",
    *       //   "customLabel2": "my_customLabel2",
    *       //   "customLabel3": "my_customLabel3",
    *       //   "customLabel4": "my_customLabel4",
    *       //   "featuredProduct": [],
    *       //   "headline": [],
    *       //   "id": "my_id",
    *       //   "imageLink": [],
    *       //   "language": "my_language",
    *       //   "link": "my_link",
    *       //   "mobileLink": "my_mobileLink",
    *       //   "productCountry": "my_productCountry"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customLabel0": "my_customLabel0",
    *   //   "customLabel1": "my_customLabel1",
    *   //   "customLabel2": "my_customLabel2",
    *   //   "customLabel3": "my_customLabel3",
    *   //   "customLabel4": "my_customLabel4",
    *   //   "featuredProduct": [],
    *   //   "headline": [],
    *   //   "id": "my_id",
    *   //   "imageLink": [],
    *   //   "language": "my_language",
    *   //   "link": "my_link",
    *   //   "mobileLink": "my_mobileLink",
    *   //   "productCountry": "my_productCountry"
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
  def create(params: ParamsResourceCollectionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCollectionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCollectionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCollectionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCollectionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCollectionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCollectionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a collection from your Merchant Center account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.collections.delete({
    *     // Required. The collectionId of the collection. CollectionId is the same as the REST ID of the collection.
    *     collectionId: 'placeholder-value',
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
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
  def delete(params: ParamsResourceCollectionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCollectionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCollection] = js.native
  def get(callback: BodyResponseCallback[SchemaCollection]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCollection] = js.native
  def get(params: ParamsResourceCollectionsGet): GaxiosPromise[SchemaCollection] = js.native
  def get(params: ParamsResourceCollectionsGet, callback: BodyResponseCallback[SchemaCollection]): Unit = js.native
  def get(
    params: ParamsResourceCollectionsGet,
    options: BodyResponseCallback[Readable | SchemaCollection],
    callback: BodyResponseCallback[Readable | SchemaCollection]
  ): Unit = js.native
  def get(params: ParamsResourceCollectionsGet, options: MethodOptions): GaxiosPromise[SchemaCollection] = js.native
  def get(
    params: ParamsResourceCollectionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCollection]
  ): Unit = js.native
  /**
    * Retrieves a collection from your Merchant Center account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.collections.get({
    *     // Required. The REST ID of the collection.
    *     collectionId: 'placeholder-value',
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customLabel0": "my_customLabel0",
    *   //   "customLabel1": "my_customLabel1",
    *   //   "customLabel2": "my_customLabel2",
    *   //   "customLabel3": "my_customLabel3",
    *   //   "customLabel4": "my_customLabel4",
    *   //   "featuredProduct": [],
    *   //   "headline": [],
    *   //   "id": "my_id",
    *   //   "imageLink": [],
    *   //   "language": "my_language",
    *   //   "link": "my_link",
    *   //   "mobileLink": "my_mobileLink",
    *   //   "productCountry": "my_productCountry"
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
  def get(params: ParamsResourceCollectionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCollectionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCollectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCollectionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCollectionsResponse] = js.native
  def list(params: ParamsResourceCollectionsList): GaxiosPromise[SchemaListCollectionsResponse] = js.native
  def list(
    params: ParamsResourceCollectionsList,
    callback: BodyResponseCallback[SchemaListCollectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCollectionsList,
    options: BodyResponseCallback[Readable | SchemaListCollectionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCollectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCollectionsList, options: MethodOptions): GaxiosPromise[SchemaListCollectionsResponse] = js.native
  def list(
    params: ParamsResourceCollectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCollectionsResponse]
  ): Unit = js.native
  /**
    * Lists the collections in your Merchant Center account. The response might contain fewer items than specified by page_size. Rely on next_page_token to determine if there are more items to be requested.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.collections.list({
    *     // Required. The ID of the account that contains the collection. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The maximum number of collections to return in the response, used for paging. Defaults to 50; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Token (if provided) to retrieve the subsequent page. All other parameters must match the original call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceCollectionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCollectionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

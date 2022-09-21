package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Contentcategories")
@js.native
open class ResourceContentcategories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContentcategoriesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContentcategoriesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceContentcategoriesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceContentcategoriesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceContentcategoriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing content category.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.delete({
    *     // Content category ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
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
  def delete(params: ParamsResourceContentcategoriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceContentcategoriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaContentCategory] = js.native
  def get(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def get(params: ParamsResourceContentcategoriesGet): GaxiosPromise[SchemaContentCategory] = js.native
  def get(params: ParamsResourceContentcategoriesGet, callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def get(
    params: ParamsResourceContentcategoriesGet,
    options: BodyResponseCallback[Readable | SchemaContentCategory],
    callback: BodyResponseCallback[Readable | SchemaContentCategory]
  ): Unit = js.native
  def get(params: ParamsResourceContentcategoriesGet, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def get(
    params: ParamsResourceContentcategoriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  /**
    * Gets one content category by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.get({
    *     // Content category ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceContentcategoriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceContentcategoriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(params: ParamsResourceContentcategoriesInsert): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    options: BodyResponseCallback[Readable | SchemaContentCategory],
    callback: BodyResponseCallback[Readable | SchemaContentCategory]
  ): Unit = js.native
  def insert(params: ParamsResourceContentcategoriesInsert, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  /**
    * Inserts a new content category.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def insert(params: ParamsResourceContentcategoriesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaContentCategoriesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(params: ParamsResourceContentcategoriesList): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    callback: BodyResponseCallback[SchemaContentCategoriesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    options: BodyResponseCallback[Readable | SchemaContentCategoriesListResponse],
    callback: BodyResponseCallback[Readable | SchemaContentCategoriesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceContentcategoriesList, options: MethodOptions): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategoriesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of content categories, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.list({
    *     // Select only content categories with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "contentcategory*2015" will return objects with names like "contentcategory June 2015", "contentcategory April 2015", or simply "contentcategory 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "contentcategory" will match objects with name "my contentcategory", "contentcategory 2015", or simply "contentcategory".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentCategories": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceContentcategoriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(params: ParamsResourceContentcategoriesPatch): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    options: BodyResponseCallback[Readable | SchemaContentCategory],
    callback: BodyResponseCallback[Readable | SchemaContentCategory]
  ): Unit = js.native
  def patch(params: ParamsResourceContentcategoriesPatch, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  /**
    * Updates an existing content category. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.patch({
    *     // ContentCategory ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def patch(params: ParamsResourceContentcategoriesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaContentCategory] = js.native
  def update(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def update(params: ParamsResourceContentcategoriesUpdate): GaxiosPromise[SchemaContentCategory] = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    options: BodyResponseCallback[Readable | SchemaContentCategory],
    callback: BodyResponseCallback[Readable | SchemaContentCategory]
  ): Unit = js.native
  def update(params: ParamsResourceContentcategoriesUpdate, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  /**
    * Updates an existing content category.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.contentCategories.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def update(params: ParamsResourceContentcategoriesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Savedqueries")
@js.native
open class ResourceMattersSavedqueries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def create(
    params: ParamsResourceMattersSavedqueriesCreate,
    options: BodyResponseCallback[Readable | SchemaSavedQuery],
    callback: BodyResponseCallback[Readable | SchemaSavedQuery]
  ): Unit = js.native
  def create(params: ParamsResourceMattersSavedqueriesCreate, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def create(
    params: ParamsResourceMattersSavedqueriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * Creates a saved query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ediscovery'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.savedQueries.create({
    *     // The ID of the matter to create the saved query in.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "matterId": "my_matterId",
    *       //   "query": {},
    *       //   "savedQueryId": "my_savedQueryId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "matterId": "my_matterId",
    *   //   "query": {},
    *   //   "savedQueryId": "my_savedQueryId"
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
  def create(params: ParamsResourceMattersSavedqueriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMattersSavedqueriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersSavedqueriesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersSavedqueriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersSavedqueriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified saved query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ediscovery'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.savedQueries.delete({
    *     // The ID of the matter to delete the saved query from.
    *     matterId: 'placeholder-value',
    *     // ID of the saved query to delete.
    *     savedQueryId: 'placeholder-value',
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
  def delete(params: ParamsResourceMattersSavedqueriesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMattersSavedqueriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet, callback: BodyResponseCallback[SchemaSavedQuery]): Unit = js.native
  def get(
    params: ParamsResourceMattersSavedqueriesGet,
    options: BodyResponseCallback[Readable | SchemaSavedQuery],
    callback: BodyResponseCallback[Readable | SchemaSavedQuery]
  ): Unit = js.native
  def get(params: ParamsResourceMattersSavedqueriesGet, options: MethodOptions): GaxiosPromise[SchemaSavedQuery] = js.native
  def get(
    params: ParamsResourceMattersSavedqueriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedQuery]
  ): Unit = js.native
  /**
    * Retrieves the specified saved query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/ediscovery',
    *       'https://www.googleapis.com/auth/ediscovery.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.savedQueries.get({
    *     // The ID of the matter to get the saved query from.
    *     matterId: 'placeholder-value',
    *     // ID of the saved query to retrieve.
    *     savedQueryId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "matterId": "my_matterId",
    *   //   "query": {},
    *   //   "savedQueryId": "my_savedQueryId"
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
  def get(params: ParamsResourceMattersSavedqueriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMattersSavedqueriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSavedQueriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(params: ParamsResourceMattersSavedqueriesList): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    options: BodyResponseCallback[Readable | SchemaListSavedQueriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSavedQueriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersSavedqueriesList, options: MethodOptions): GaxiosPromise[SchemaListSavedQueriesResponse] = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSavedQueriesResponse]
  ): Unit = js.native
  /**
    * Lists the saved queries in a matter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vault.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vault = google.vault('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/ediscovery',
    *       'https://www.googleapis.com/auth/ediscovery.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vault.matters.savedQueries.list({
    *     // The ID of the matter to get the saved queries for.
    *     matterId: 'placeholder-value',
    *     // The maximum number of saved queries to return.
    *     pageSize: 'placeholder-value',
    *     // The pagination token as returned in the previous response. An empty token means start from the beginning.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "savedQueries": []
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
  def list(params: ParamsResourceMattersSavedqueriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMattersSavedqueriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

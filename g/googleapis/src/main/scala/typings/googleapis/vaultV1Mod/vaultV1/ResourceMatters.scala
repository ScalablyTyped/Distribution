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

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters")
@js.native
open class ResourceMatters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addPermissions(): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(callback: BodyResponseCallback[SchemaMatterPermission]): Unit = js.native
  def addPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(params: ParamsResourceMattersAddpermissions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    callback: BodyResponseCallback[SchemaMatterPermission]
  ): Unit = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    options: BodyResponseCallback[Readable | SchemaMatterPermission],
    callback: BodyResponseCallback[Readable | SchemaMatterPermission]
  ): Unit = js.native
  def addPermissions(params: ParamsResourceMattersAddpermissions, options: MethodOptions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatterPermission]
  ): Unit = js.native
  /**
    * Adds an account as a matter collaborator.
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
    *   const res = await vault.matters.addPermissions({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ccMe": false,
    *       //   "matterPermission": {},
    *       //   "sendEmails": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "role": "my_role"
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
  def addPermissions(params: ParamsResourceMattersAddpermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def close(): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(callback: BodyResponseCallback[SchemaCloseMatterResponse]): Unit = js.native
  def close(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(params: ParamsResourceMattersClose): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(params: ParamsResourceMattersClose, callback: BodyResponseCallback[SchemaCloseMatterResponse]): Unit = js.native
  def close(
    params: ParamsResourceMattersClose,
    options: BodyResponseCallback[Readable | SchemaCloseMatterResponse],
    callback: BodyResponseCallback[Readable | SchemaCloseMatterResponse]
  ): Unit = js.native
  def close(params: ParamsResourceMattersClose, options: MethodOptions): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(
    params: ParamsResourceMattersClose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCloseMatterResponse]
  ): Unit = js.native
  /**
    * Closes the specified matter. Returns the matter with updated state.
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
    *   const res = await vault.matters.close({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "matter": {}
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
  def close(params: ParamsResourceMattersClose, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def close(
    params: ParamsResourceMattersClose,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def count(): GaxiosPromise[SchemaOperation] = js.native
  def count(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def count(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def count(params: ParamsResourceMattersCount): GaxiosPromise[SchemaOperation] = js.native
  def count(params: ParamsResourceMattersCount, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def count(
    params: ParamsResourceMattersCount,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def count(params: ParamsResourceMattersCount, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def count(
    params: ParamsResourceMattersCount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Counts the accounts processed by the specified query.
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
    *   const res = await vault.matters.count({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "query": {},
    *       //   "view": "my_view"
    *       // }
    *     },
    *   });
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
  def count(params: ParamsResourceMattersCount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def count(
    params: ParamsResourceMattersCount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def create(): GaxiosPromise[SchemaMatter] = js.native
  def create(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def create(params: ParamsResourceMattersCreate): GaxiosPromise[SchemaMatter] = js.native
  def create(params: ParamsResourceMattersCreate, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def create(
    params: ParamsResourceMattersCreate,
    options: BodyResponseCallback[Readable | SchemaMatter],
    callback: BodyResponseCallback[Readable | SchemaMatter]
  ): Unit = js.native
  def create(params: ParamsResourceMattersCreate, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def create(
    params: ParamsResourceMattersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  /**
    * Creates a matter with the given name and description. The initial state is open, and the owner is the method caller. Returns the created matter with default view.
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
    *   const res = await vault.matters.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "matterId": "my_matterId",
    *       //   "matterPermissions": [],
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "matterId": "my_matterId",
    *   //   "matterPermissions": [],
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def create(params: ParamsResourceMattersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMattersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaMatter] = js.native
  def delete(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def delete(params: ParamsResourceMattersDelete): GaxiosPromise[SchemaMatter] = js.native
  def delete(params: ParamsResourceMattersDelete, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def delete(
    params: ParamsResourceMattersDelete,
    options: BodyResponseCallback[Readable | SchemaMatter],
    callback: BodyResponseCallback[Readable | SchemaMatter]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersDelete, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def delete(
    params: ParamsResourceMattersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  /**
    * Deletes the specified matter. Returns the matter with updated state.
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
    *   const res = await vault.matters.delete({
    *     // The matter ID
    *     matterId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "matterId": "my_matterId",
    *   //   "matterPermissions": [],
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def delete(params: ParamsResourceMattersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMattersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var exports: ResourceMattersExports = js.native
  
  def get(): GaxiosPromise[SchemaMatter] = js.native
  def get(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def get(params: ParamsResourceMattersGet): GaxiosPromise[SchemaMatter] = js.native
  def get(params: ParamsResourceMattersGet, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def get(
    params: ParamsResourceMattersGet,
    options: BodyResponseCallback[Readable | SchemaMatter],
    callback: BodyResponseCallback[Readable | SchemaMatter]
  ): Unit = js.native
  def get(params: ParamsResourceMattersGet, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def get(
    params: ParamsResourceMattersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  /**
    * Gets the specified matter.
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
    *   const res = await vault.matters.get({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *     // Specifies how much information about the matter to return in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "matterId": "my_matterId",
    *   //   "matterPermissions": [],
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceMattersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMattersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var holds: ResourceMattersHolds = js.native
  
  def list(): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMattersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(params: ParamsResourceMattersList): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(params: ParamsResourceMattersList, callback: BodyResponseCallback[SchemaListMattersResponse]): Unit = js.native
  def list(
    params: ParamsResourceMattersList,
    options: BodyResponseCallback[Readable | SchemaListMattersResponse],
    callback: BodyResponseCallback[Readable | SchemaListMattersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersList, options: MethodOptions): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(
    params: ParamsResourceMattersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMattersResponse]
  ): Unit = js.native
  /**
    * Lists matters the requestor has access to.
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
    *   const res = await vault.matters.list({
    *     // The number of matters to return in the response. Default and maximum are 100.
    *     pageSize: 'placeholder-value',
    *     // The pagination token as returned in the response.
    *     pageToken: 'placeholder-value',
    *     // If set, lists only matters with the specified state. The default lists matters of all states.
    *     state: 'placeholder-value',
    *     // Specifies how much information about the matter to return in response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "matters": [],
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
  def list(params: ParamsResourceMattersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMattersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removePermissions(): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removePermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removePermissions(
    params: ParamsResourceMattersRemovepermissions,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(
    params: ParamsResourceMattersRemovepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes an account as a matter collaborator.
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
    *   const res = await vault.matters.removePermissions({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId"
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
  def removePermissions(params: ParamsResourceMattersRemovepermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removePermissions(
    params: ParamsResourceMattersRemovepermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reopen(): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(callback: BodyResponseCallback[SchemaReopenMatterResponse]): Unit = js.native
  def reopen(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(params: ParamsResourceMattersReopen): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(params: ParamsResourceMattersReopen, callback: BodyResponseCallback[SchemaReopenMatterResponse]): Unit = js.native
  def reopen(
    params: ParamsResourceMattersReopen,
    options: BodyResponseCallback[Readable | SchemaReopenMatterResponse],
    callback: BodyResponseCallback[Readable | SchemaReopenMatterResponse]
  ): Unit = js.native
  def reopen(params: ParamsResourceMattersReopen, options: MethodOptions): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(
    params: ParamsResourceMattersReopen,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReopenMatterResponse]
  ): Unit = js.native
  /**
    * Reopens the specified matter. Returns the matter with updated state.
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
    *   const res = await vault.matters.reopen({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "matter": {}
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
  def reopen(params: ParamsResourceMattersReopen, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reopen(
    params: ParamsResourceMattersReopen,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var savedQueries: ResourceMattersSavedqueries = js.native
  
  def undelete(): GaxiosPromise[SchemaMatter] = js.native
  def undelete(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def undelete(params: ParamsResourceMattersUndelete): GaxiosPromise[SchemaMatter] = js.native
  def undelete(params: ParamsResourceMattersUndelete, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def undelete(
    params: ParamsResourceMattersUndelete,
    options: BodyResponseCallback[Readable | SchemaMatter],
    callback: BodyResponseCallback[Readable | SchemaMatter]
  ): Unit = js.native
  def undelete(params: ParamsResourceMattersUndelete, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def undelete(
    params: ParamsResourceMattersUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  /**
    * Undeletes the specified matter. Returns the matter with updated state.
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
    *   const res = await vault.matters.undelete({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "matterId": "my_matterId",
    *   //   "matterPermissions": [],
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def undelete(params: ParamsResourceMattersUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceMattersUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaMatter] = js.native
  def update(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def update(params: ParamsResourceMattersUpdate): GaxiosPromise[SchemaMatter] = js.native
  def update(params: ParamsResourceMattersUpdate, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def update(
    params: ParamsResourceMattersUpdate,
    options: BodyResponseCallback[Readable | SchemaMatter],
    callback: BodyResponseCallback[Readable | SchemaMatter]
  ): Unit = js.native
  def update(params: ParamsResourceMattersUpdate, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def update(
    params: ParamsResourceMattersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  /**
    * Updates the specified matter. This updates only the name and description of the matter, identified by matter ID. Changes to any other fields are ignored. Returns the default view of the matter.
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
    *   const res = await vault.matters.update({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "matterId": "my_matterId",
    *       //   "matterPermissions": [],
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "matterId": "my_matterId",
    *   //   "matterPermissions": [],
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def update(params: ParamsResourceMattersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceMattersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

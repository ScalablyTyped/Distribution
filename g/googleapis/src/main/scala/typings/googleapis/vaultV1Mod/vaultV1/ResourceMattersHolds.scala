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

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds")
@js.native
open class ResourceMattersHolds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var accounts: ResourceMattersHoldsAccounts = js.native
  
  def addHeldAccounts(): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]): Unit = js.native
  def addHeldAccounts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(params: ParamsResourceMattersHoldsAddheldaccounts): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    options: BodyResponseCallback[Readable | SchemaAddHeldAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(params: ParamsResourceMattersHoldsAddheldaccounts, options: MethodOptions): GaxiosPromise[SchemaAddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddHeldAccountsResponse]
  ): Unit = js.native
  /**
    * Adds accounts to a hold. Returns a list of accounts that have been successfully added. Accounts can be added only to an existing account-based hold.
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
    *   const res = await vault.matters.holds.addHeldAccounts({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountIds": [],
    *       //   "emails": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def addHeldAccounts(params: ParamsResourceMattersHoldsAddheldaccounts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addHeldAccounts(
    params: ParamsResourceMattersHoldsAddheldaccounts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaHold] = js.native
  def create(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def create(params: ParamsResourceMattersHoldsCreate): GaxiosPromise[SchemaHold] = js.native
  def create(params: ParamsResourceMattersHoldsCreate, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def create(
    params: ParamsResourceMattersHoldsCreate,
    options: BodyResponseCallback[Readable | SchemaHold],
    callback: BodyResponseCallback[Readable | SchemaHold]
  ): Unit = js.native
  def create(params: ParamsResourceMattersHoldsCreate, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def create(
    params: ParamsResourceMattersHoldsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  /**
    * Creates a hold in the specified matter.
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
    *   const res = await vault.matters.holds.create({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accounts": [],
    *       //   "corpus": "my_corpus",
    *       //   "holdId": "my_holdId",
    *       //   "name": "my_name",
    *       //   "orgUnit": {},
    *       //   "query": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": [],
    *   //   "corpus": "my_corpus",
    *   //   "holdId": "my_holdId",
    *   //   "name": "my_name",
    *   //   "orgUnit": {},
    *   //   "query": {},
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceMattersHoldsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceMattersHoldsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMattersHoldsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMattersHoldsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersHoldsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMattersHoldsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes the specified hold and releases the accounts or organizational unit covered by the hold. If the data is not preserved by another hold or retention rule, it might be purged.
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
    *   const res = await vault.matters.holds.delete({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
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
  def delete(params: ParamsResourceMattersHoldsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMattersHoldsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaHold] = js.native
  def get(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def get(params: ParamsResourceMattersHoldsGet): GaxiosPromise[SchemaHold] = js.native
  def get(params: ParamsResourceMattersHoldsGet, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def get(
    params: ParamsResourceMattersHoldsGet,
    options: BodyResponseCallback[Readable | SchemaHold],
    callback: BodyResponseCallback[Readable | SchemaHold]
  ): Unit = js.native
  def get(params: ParamsResourceMattersHoldsGet, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def get(
    params: ParamsResourceMattersHoldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  /**
    * Gets the specified hold.
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
    *   const res = await vault.matters.holds.get({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *     // The amount of detail to return for a hold.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": [],
    *   //   "corpus": "my_corpus",
    *   //   "holdId": "my_holdId",
    *   //   "name": "my_name",
    *   //   "orgUnit": {},
    *   //   "query": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceMattersHoldsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMattersHoldsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHoldsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsList): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(params: ParamsResourceMattersHoldsList, callback: BodyResponseCallback[SchemaListHoldsResponse]): Unit = js.native
  def list(
    params: ParamsResourceMattersHoldsList,
    options: BodyResponseCallback[Readable | SchemaListHoldsResponse],
    callback: BodyResponseCallback[Readable | SchemaListHoldsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersHoldsList, options: MethodOptions): GaxiosPromise[SchemaListHoldsResponse] = js.native
  def list(
    params: ParamsResourceMattersHoldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHoldsResponse]
  ): Unit = js.native
  /**
    * Lists the holds in a matter.
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
    *   const res = await vault.matters.holds.list({
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *     // The number of holds to return in the response, between 0 and 100 inclusive. Leaving this empty, or as 0, is the same as **page_size** = 100.
    *     pageSize: 'placeholder-value',
    *     // The pagination token as returned in the response. An empty token means start from the beginning.
    *     pageToken: 'placeholder-value',
    *     // The amount of detail to return for a hold.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "holds": [],
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
  def list(params: ParamsResourceMattersHoldsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMattersHoldsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeHeldAccounts(): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]): Unit = js.native
  def removeHeldAccounts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(params: ParamsResourceMattersHoldsRemoveheldaccounts): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    options: BodyResponseCallback[Readable | SchemaRemoveHeldAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(params: ParamsResourceMattersHoldsRemoveheldaccounts, options: MethodOptions): GaxiosPromise[SchemaRemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemoveHeldAccountsResponse]
  ): Unit = js.native
  /**
    * Removes the specified accounts from a hold. Returns a list of statuses in the same order as the request.
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
    *   const res = await vault.matters.holds.removeHeldAccounts({
    *     // The hold ID.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "statuses": []
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
  def removeHeldAccounts(params: ParamsResourceMattersHoldsRemoveheldaccounts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeHeldAccounts(
    params: ParamsResourceMattersHoldsRemoveheldaccounts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaHold] = js.native
  def update(callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def update(params: ParamsResourceMattersHoldsUpdate): GaxiosPromise[SchemaHold] = js.native
  def update(params: ParamsResourceMattersHoldsUpdate, callback: BodyResponseCallback[SchemaHold]): Unit = js.native
  def update(
    params: ParamsResourceMattersHoldsUpdate,
    options: BodyResponseCallback[Readable | SchemaHold],
    callback: BodyResponseCallback[Readable | SchemaHold]
  ): Unit = js.native
  def update(params: ParamsResourceMattersHoldsUpdate, options: MethodOptions): GaxiosPromise[SchemaHold] = js.native
  def update(
    params: ParamsResourceMattersHoldsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHold]
  ): Unit = js.native
  /**
    * Updates the scope (organizational unit or accounts) and query parameters of a hold. You cannot add accounts to a hold that covers an organizational unit, nor can you add organizational units to a hold that covers individual accounts. If you try, the unsupported values are ignored.
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
    *   const res = await vault.matters.holds.update({
    *     // The ID of the hold.
    *     holdId: 'placeholder-value',
    *     // The matter ID.
    *     matterId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accounts": [],
    *       //   "corpus": "my_corpus",
    *       //   "holdId": "my_holdId",
    *       //   "name": "my_name",
    *       //   "orgUnit": {},
    *       //   "query": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": [],
    *   //   "corpus": "my_corpus",
    *   //   "holdId": "my_holdId",
    *   //   "name": "my_name",
    *   //   "orgUnit": {},
    *   //   "query": {},
    *   //   "updateTime": "my_updateTime"
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
  def update(params: ParamsResourceMattersHoldsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceMattersHoldsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

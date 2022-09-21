package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients$Users")
@js.native
open class ResourceAccountsClientsUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaClientUser] = js.native
  def get(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def get(params: ParamsResourceAccountsClientsUsersGet): GaxiosPromise[SchemaClientUser] = js.native
  def get(params: ParamsResourceAccountsClientsUsersGet, callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def get(
    params: ParamsResourceAccountsClientsUsersGet,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsClientsUsersGet, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def get(
    params: ParamsResourceAccountsClientsUsersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Retrieves an existing client user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.clients.users.get({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer that the user to be retrieved is associated with. (required)
    *     clientAccountId: 'placeholder-value',
    *     // Numerical identifier of the user to retrieve. (required)
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "email": "my_email",
    *   //   "status": "my_status",
    *   //   "userId": "my_userId"
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
  def get(params: ParamsResourceAccountsClientsUsersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsClientsUsersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientUsersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(params: ParamsResourceAccountsClientsUsersList): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsUsersList,
    callback: BodyResponseCallback[SchemaListClientUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsClientsUsersList,
    options: BodyResponseCallback[Readable | SchemaListClientUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsClientsUsersList, options: MethodOptions): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientUsersResponse]
  ): Unit = js.native
  /**
    * Lists all the known client users for a specified sponsor buyer account ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.clients.users.list({
    *     // Numerical account ID of the sponsor buyer of the client to list users for. (required)
    *     accountId: 'placeholder-value',
    *     // The account ID of the client buyer to list users for. (required) You must specify either a string representation of a numerical account identifier or the `-` character to list all the client users for all the clients of a given sponsor buyer.
    *     clientAccountId: 'placeholder-value',
    *     // Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListClientUsersResponse.nextPageToken returned from the previous call to the accounts.clients.users.list method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "users": []
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
  def list(params: ParamsResourceAccountsClientsUsersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsClientsUsersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaClientUser] = js.native
  def update(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def update(params: ParamsResourceAccountsClientsUsersUpdate): GaxiosPromise[SchemaClientUser] = js.native
  def update(params: ParamsResourceAccountsClientsUsersUpdate, callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def update(
    params: ParamsResourceAccountsClientsUsersUpdate,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsClientsUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def update(
    params: ParamsResourceAccountsClientsUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Updates an existing client user. Only the user status can be changed on update.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.clients.users.update({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer that the user to be retrieved is associated with. (required)
    *     clientAccountId: 'placeholder-value',
    *     // Numerical identifier of the user to retrieve. (required)
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientAccountId": "my_clientAccountId",
    *       //   "email": "my_email",
    *       //   "status": "my_status",
    *       //   "userId": "my_userId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "email": "my_email",
    *   //   "status": "my_status",
    *   //   "userId": "my_userId"
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
  def update(params: ParamsResourceAccountsClientsUsersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsClientsUsersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

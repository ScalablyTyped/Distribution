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

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients")
@js.native
open class ResourceAccountsClients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClient] = js.native
  def create(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceAccountsClientsCreate): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceAccountsClientsCreate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(
    params: ParamsResourceAccountsClientsCreate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsClientsCreate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(
    params: ParamsResourceAccountsClientsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Creates a new client buyer.
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
    *   const res = await adexchangebuyer2.accounts.clients.create({
    *     // Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to create a client for. (required)
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientAccountId": "my_clientAccountId",
    *       //   "clientName": "my_clientName",
    *       //   "entityId": "my_entityId",
    *       //   "entityName": "my_entityName",
    *       //   "entityType": "my_entityType",
    *       //   "partnerClientId": "my_partnerClientId",
    *       //   "role": "my_role",
    *       //   "status": "my_status",
    *       //   "visibleToSeller": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "clientName": "my_clientName",
    *   //   "entityId": "my_entityId",
    *   //   "entityName": "my_entityName",
    *   //   "entityType": "my_entityType",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
    *   //   "visibleToSeller": false
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
  def create(params: ParamsResourceAccountsClientsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsClientsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaClient] = js.native
  def get(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceAccountsClientsGet): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceAccountsClientsGet, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(
    params: ParamsResourceAccountsClientsGet,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsClientsGet, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(
    params: ParamsResourceAccountsClientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Gets a client buyer with a given client account ID.
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
    *   const res = await adexchangebuyer2.accounts.clients.get({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer to retrieve. (required)
    *     clientAccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "clientName": "my_clientName",
    *   //   "entityId": "my_entityId",
    *   //   "entityName": "my_entityName",
    *   //   "entityType": "my_entityType",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
    *   //   "visibleToSeller": false
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
  def get(params: ParamsResourceAccountsClientsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsClientsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var invitations: ResourceAccountsClientsInvitations = js.native
  
  def list(): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(params: ParamsResourceAccountsClientsList): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    options: BodyResponseCallback[Readable | SchemaListClientsResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsClientsList, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  /**
    * Lists all the clients for the current sponsor buyer.
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
    *   const res = await adexchangebuyer2.accounts.clients.list({
    *     // Unique numerical account ID of the sponsor buyer to list the clients for.
    *     accountId: 'placeholder-value',
    *     // Requested page size. The server may return fewer clients than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListClientsResponse.nextPageToken returned from the previous call to the accounts.clients.list method.
    *     pageToken: 'placeholder-value',
    *     // Optional unique identifier (from the standpoint of an Ad Exchange sponsor buyer partner) of the client to return. If specified, at most one client will be returned in the response.
    *     partnerClientId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clients": [],
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
  def list(params: ParamsResourceAccountsClientsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsClientsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaClient] = js.native
  def update(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(params: ParamsResourceAccountsClientsUpdate): GaxiosPromise[SchemaClient] = js.native
  def update(params: ParamsResourceAccountsClientsUpdate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def update(
    params: ParamsResourceAccountsClientsUpdate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsClientsUpdate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def update(
    params: ParamsResourceAccountsClientsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Updates an existing client buyer.
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
    *   const res = await adexchangebuyer2.accounts.clients.update({
    *     // Unique numerical account ID for the buyer of which the client buyer is a customer; the sponsor buyer to update a client for. (required)
    *     accountId: 'placeholder-value',
    *     // Unique numerical account ID of the client to update. (required)
    *     clientAccountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientAccountId": "my_clientAccountId",
    *       //   "clientName": "my_clientName",
    *       //   "entityId": "my_entityId",
    *       //   "entityName": "my_entityName",
    *       //   "entityType": "my_entityType",
    *       //   "partnerClientId": "my_partnerClientId",
    *       //   "role": "my_role",
    *       //   "status": "my_status",
    *       //   "visibleToSeller": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "clientName": "my_clientName",
    *   //   "entityId": "my_entityId",
    *   //   "entityName": "my_entityName",
    *   //   "entityType": "my_entityType",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "status": "my_status",
    *   //   "visibleToSeller": false
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
  def update(params: ParamsResourceAccountsClientsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsClientsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var users: ResourceAccountsClientsUsers = js.native
}

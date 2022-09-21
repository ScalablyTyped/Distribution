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

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Clients$Invitations")
@js.native
open class ResourceAccountsClientsInvitations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(callback: BodyResponseCallback[SchemaClientUserInvitation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(params: ParamsResourceAccountsClientsInvitationsCreate): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    options: BodyResponseCallback[Readable | SchemaClientUserInvitation],
    callback: BodyResponseCallback[Readable | SchemaClientUserInvitation]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsClientsInvitationsCreate, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  /**
    * Creates and sends out an email invitation to access an Ad Exchange client buyer account.
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
    *   const res = await adexchangebuyer2.accounts.clients.invitations.create({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer that the user should be associated with. (required)
    *     clientAccountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientAccountId": "my_clientAccountId",
    *       //   "email": "my_email",
    *       //   "invitationId": "my_invitationId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "email": "my_email",
    *   //   "invitationId": "my_invitationId"
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
  def create(params: ParamsResourceAccountsClientsInvitationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsClientsInvitationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(callback: BodyResponseCallback[SchemaClientUserInvitation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(params: ParamsResourceAccountsClientsInvitationsGet): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    options: BodyResponseCallback[Readable | SchemaClientUserInvitation],
    callback: BodyResponseCallback[Readable | SchemaClientUserInvitation]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsClientsInvitationsGet, options: MethodOptions): GaxiosPromise[SchemaClientUserInvitation] = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUserInvitation]
  ): Unit = js.native
  /**
    * Retrieves an existing client user invitation.
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
    *   const res = await adexchangebuyer2.accounts.clients.invitations.get({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer that the user invitation to be retrieved is associated with. (required)
    *     clientAccountId: 'placeholder-value',
    *     // Numerical identifier of the user invitation to retrieve. (required)
    *     invitationId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientAccountId": "my_clientAccountId",
    *   //   "email": "my_email",
    *   //   "invitationId": "my_invitationId"
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
  def get(params: ParamsResourceAccountsClientsInvitationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsClientsInvitationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(params: ParamsResourceAccountsClientsInvitationsList): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    options: BodyResponseCallback[Readable | SchemaListClientUserInvitationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsClientsInvitationsList, options: MethodOptions): GaxiosPromise[SchemaListClientUserInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientUserInvitationsResponse]
  ): Unit = js.native
  /**
    * Lists all the client users invitations for a client with a given account ID.
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
    *   const res = await adexchangebuyer2.accounts.clients.invitations.list({
    *     // Numerical account ID of the client's sponsor buyer. (required)
    *     accountId: 'placeholder-value',
    *     // Numerical account ID of the client buyer to list invitations for. (required) You must either specify a string representation of a numerical account identifier or the `-` character to list all the invitations for all the clients of a given sponsor buyer.
    *     clientAccountId: 'placeholder-value',
    *     // Requested page size. Server may return fewer clients than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListClientUserInvitationsResponse.nextPageToken returned from the previous call to the clients.invitations.list method.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "invitations": [],
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
  def list(params: ParamsResourceAccountsClientsInvitationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsClientsInvitationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessaccountmanagement/v1", "mybusinessaccountmanagement_v1.Resource$Accounts$Invitations")
@js.native
open class ResourceAccountsInvitations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def accept(): GaxiosPromise[SchemaEmpty] = js.native
  def accept(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def accept(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def accept(params: ParamsResourceAccountsInvitationsAccept): GaxiosPromise[SchemaEmpty] = js.native
  def accept(params: ParamsResourceAccountsInvitationsAccept, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def accept(
    params: ParamsResourceAccountsInvitationsAccept,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def accept(params: ParamsResourceAccountsInvitationsAccept, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def accept(
    params: ParamsResourceAccountsInvitationsAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Accepts the specified invitation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.accounts.invitations.accept({
    *     // Required. The name of the invitation that is being accepted. `accounts/{account_id\}/invitations/{invitation_id\}`
    *     name: 'accounts/my-account/invitations/my-invitation',
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
  def accept(params: ParamsResourceAccountsInvitationsAccept, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def accept(
    params: ParamsResourceAccountsInvitationsAccept,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def decline(): GaxiosPromise[SchemaEmpty] = js.native
  def decline(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def decline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def decline(params: ParamsResourceAccountsInvitationsDecline): GaxiosPromise[SchemaEmpty] = js.native
  def decline(params: ParamsResourceAccountsInvitationsDecline, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def decline(
    params: ParamsResourceAccountsInvitationsDecline,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def decline(params: ParamsResourceAccountsInvitationsDecline, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def decline(
    params: ParamsResourceAccountsInvitationsDecline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Declines the specified invitation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.accounts.invitations.decline({
    *     // Required. The name of the account invitation that is being declined. `accounts/{account_id\}/invitations/{invitation_id\}`
    *     name: 'accounts/my-account/invitations/my-invitation',
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
  def decline(params: ParamsResourceAccountsInvitationsDecline, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def decline(
    params: ParamsResourceAccountsInvitationsDecline,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInvitationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInvitationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInvitationsResponse] = js.native
  def list(params: ParamsResourceAccountsInvitationsList): GaxiosPromise[SchemaListInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsInvitationsList,
    callback: BodyResponseCallback[SchemaListInvitationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsInvitationsList,
    options: BodyResponseCallback[Readable | SchemaListInvitationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListInvitationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsInvitationsList, options: MethodOptions): GaxiosPromise[SchemaListInvitationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsInvitationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInvitationsResponse]
  ): Unit = js.native
  /**
    * Lists pending invitations for the specified account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.accounts.invitations.list({
    *     // Optional. Filtering the response is supported via the Invitation.target_type field.
    *     filter: 'placeholder-value',
    *     // Required. The name of the account from which the list of invitations is being retrieved. `accounts/{account_id\}/invitations`
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "invitations": []
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
  def list(params: ParamsResourceAccountsInvitationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsInvitationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

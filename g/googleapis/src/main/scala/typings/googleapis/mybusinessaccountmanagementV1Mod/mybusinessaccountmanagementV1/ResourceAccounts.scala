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

@JSImport("googleapis/build/src/apis/mybusinessaccountmanagement/v1", "mybusinessaccountmanagement_v1.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var admins: ResourceAccountsAdmins = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAccount] = js.native
  def create(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def create(params: ParamsResourceAccountsCreate): GaxiosPromise[SchemaAccount] = js.native
  def create(params: ParamsResourceAccountsCreate, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def create(
    params: ParamsResourceAccountsCreate,
    options: BodyResponseCallback[Readable | SchemaAccount],
    callback: BodyResponseCallback[Readable | SchemaAccount]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCreate, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def create(
    params: ParamsResourceAccountsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * Creates an account with the specified name and type under the given parent. - Personal accounts and Organizations cannot be created. - User Groups cannot be created with a Personal account as primary owner. - Location Groups cannot be created with a primary owner of a Personal account if the Personal account is in an Organization. - Location Groups cannot own Location Groups.
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
    *   const res = await mybusinessaccountmanagement.accounts.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountName": "my_accountName",
    *       //   "accountNumber": "my_accountNumber",
    *       //   "name": "my_name",
    *       //   "organizationInfo": {},
    *       //   "permissionLevel": "my_permissionLevel",
    *       //   "primaryOwner": "my_primaryOwner",
    *       //   "role": "my_role",
    *       //   "type": "my_type",
    *       //   "verificationState": "my_verificationState",
    *       //   "vettedState": "my_vettedState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountName": "my_accountName",
    *   //   "accountNumber": "my_accountNumber",
    *   //   "name": "my_name",
    *   //   "organizationInfo": {},
    *   //   "permissionLevel": "my_permissionLevel",
    *   //   "primaryOwner": "my_primaryOwner",
    *   //   "role": "my_role",
    *   //   "type": "my_type",
    *   //   "verificationState": "my_verificationState",
    *   //   "vettedState": "my_vettedState"
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
  def create(params: ParamsResourceAccountsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def get(params: ParamsResourceAccountsGet): GaxiosPromise[SchemaAccount] = js.native
  def get(params: ParamsResourceAccountsGet, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: BodyResponseCallback[Readable | SchemaAccount],
    callback: BodyResponseCallback[Readable | SchemaAccount]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsGet, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * Gets the specified account. Returns `NOT_FOUND` if the account does not exist or if the caller does not have access rights to it.
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
    *   const res = await mybusinessaccountmanagement.accounts.get({
    *     // Required. The name of the account to fetch.
    *     name: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountName": "my_accountName",
    *   //   "accountNumber": "my_accountNumber",
    *   //   "name": "my_name",
    *   //   "organizationInfo": {},
    *   //   "permissionLevel": "my_permissionLevel",
    *   //   "primaryOwner": "my_primaryOwner",
    *   //   "role": "my_role",
    *   //   "type": "my_type",
    *   //   "verificationState": "my_verificationState",
    *   //   "vettedState": "my_vettedState"
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
  def get(params: ParamsResourceAccountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var invitations: ResourceAccountsInvitations = js.native
  
  def list(): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaListAccountsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[Readable | SchemaListAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaListAccountsResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountsResponse]
  ): Unit = js.native
  /**
    * Lists all of the accounts for the authenticated user. This includes all accounts that the user owns, as well as any accounts for which the user has management rights.
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
    *   const res = await mybusinessaccountmanagement.accounts.list({
    *     // Optional. A filter constraining the accounts to return. The response includes only entries that match the filter. If `filter` is empty, then no constraints are applied and all accounts (paginated) are retrieved for the requested account. For example, a request with the filter `type=USER_GROUP` will only return user groups. The `type` field is the only supported filter.
    *     filter: 'placeholder-value',
    *     // Optional. How many accounts to fetch per page. The default and maximum is 20.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, the next page of accounts is retrieved. The `pageToken` is returned when a call to `accounts.list` returns more results than can fit into the requested page size.
    *     pageToken: 'placeholder-value',
    *     // Optional. The resource name of the account for which the list of directly accessible accounts is to be retrieved. This only makes sense for Organizations and User Groups. If empty, will return `ListAccounts` for the authenticated user. `accounts/{account_id\}`.
    *     parentAccount: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accounts": [],
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
  def list(params: ParamsResourceAccountsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def patch(params: ParamsResourceAccountsPatch): GaxiosPromise[SchemaAccount] = js.native
  def patch(params: ParamsResourceAccountsPatch, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: BodyResponseCallback[Readable | SchemaAccount],
    callback: BodyResponseCallback[Readable | SchemaAccount]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsPatch, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * Updates the specified business account. Personal accounts cannot be updated using this method.
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
    *   const res = await mybusinessaccountmanagement.accounts.patch({
    *     // Immutable. The resource name, in the format `accounts/{account_id\}`.
    *     name: 'accounts/my-account',
    *     // Required. The specific fields that should be updated. The only editable field is `accountName`.
    *     updateMask: 'placeholder-value',
    *     // Optional. If true, the request is validated without actually updating the account.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountName": "my_accountName",
    *       //   "accountNumber": "my_accountNumber",
    *       //   "name": "my_name",
    *       //   "organizationInfo": {},
    *       //   "permissionLevel": "my_permissionLevel",
    *       //   "primaryOwner": "my_primaryOwner",
    *       //   "role": "my_role",
    *       //   "type": "my_type",
    *       //   "verificationState": "my_verificationState",
    *       //   "vettedState": "my_vettedState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountName": "my_accountName",
    *   //   "accountNumber": "my_accountNumber",
    *   //   "name": "my_name",
    *   //   "organizationInfo": {},
    *   //   "permissionLevel": "my_permissionLevel",
    *   //   "primaryOwner": "my_primaryOwner",
    *   //   "role": "my_role",
    *   //   "type": "my_type",
    *   //   "verificationState": "my_verificationState",
    *   //   "vettedState": "my_vettedState"
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
  def patch(params: ParamsResourceAccountsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

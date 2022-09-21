package typings.googleapis.v2Mod.adsenseV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var adclients: ResourceAccountsAdclients = js.native
  
  var alerts: ResourceAccountsAlerts = js.native
  
  var context: APIRequestContext = js.native
  
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
    * Gets information about the selected AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.get({
    *     // Required. Account to get information about. Format: accounts/{account\}
    *     name: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "pendingTasks": [],
    *   //   "premium": false,
    *   //   "state": "my_state",
    *   //   "timeZone": {}
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
  
  def getAdBlockingRecoveryTag(): GaxiosPromise[SchemaAdBlockingRecoveryTag] = js.native
  def getAdBlockingRecoveryTag(callback: BodyResponseCallback[SchemaAdBlockingRecoveryTag]): Unit = js.native
  def getAdBlockingRecoveryTag(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdBlockingRecoveryTag] = js.native
  def getAdBlockingRecoveryTag(params: ParamsResourceAccountsGetadblockingrecoverytag): GaxiosPromise[SchemaAdBlockingRecoveryTag] = js.native
  def getAdBlockingRecoveryTag(
    params: ParamsResourceAccountsGetadblockingrecoverytag,
    callback: BodyResponseCallback[SchemaAdBlockingRecoveryTag]
  ): Unit = js.native
  def getAdBlockingRecoveryTag(
    params: ParamsResourceAccountsGetadblockingrecoverytag,
    options: BodyResponseCallback[Readable | SchemaAdBlockingRecoveryTag],
    callback: BodyResponseCallback[Readable | SchemaAdBlockingRecoveryTag]
  ): Unit = js.native
  def getAdBlockingRecoveryTag(params: ParamsResourceAccountsGetadblockingrecoverytag, options: MethodOptions): GaxiosPromise[SchemaAdBlockingRecoveryTag] = js.native
  def getAdBlockingRecoveryTag(
    params: ParamsResourceAccountsGetadblockingrecoverytag,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdBlockingRecoveryTag]
  ): Unit = js.native
  /**
    * Gets the ad blocking recovery tag of an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsense'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.getAdBlockingRecoveryTag({
    *     // Required. The name of the account to get the tag for. Format: accounts/{account\}
    *     name: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errorProtectionCode": "my_errorProtectionCode",
    *   //   "tag": "my_tag"
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
  def getAdBlockingRecoveryTag(params: ParamsResourceAccountsGetadblockingrecoverytag, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAdBlockingRecoveryTag(
    params: ParamsResourceAccountsGetadblockingrecoverytag,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Lists all accounts available to this user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.list({
    *     // The maximum number of accounts to include in the response, used for paging. If unspecified, at most 10000 accounts will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAccounts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAccounts` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
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
  
  def listChildAccounts(): GaxiosPromise[SchemaListChildAccountsResponse] = js.native
  def listChildAccounts(callback: BodyResponseCallback[SchemaListChildAccountsResponse]): Unit = js.native
  def listChildAccounts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListChildAccountsResponse] = js.native
  def listChildAccounts(params: ParamsResourceAccountsListchildaccounts): GaxiosPromise[SchemaListChildAccountsResponse] = js.native
  def listChildAccounts(
    params: ParamsResourceAccountsListchildaccounts,
    callback: BodyResponseCallback[SchemaListChildAccountsResponse]
  ): Unit = js.native
  def listChildAccounts(
    params: ParamsResourceAccountsListchildaccounts,
    options: BodyResponseCallback[Readable | SchemaListChildAccountsResponse],
    callback: BodyResponseCallback[Readable | SchemaListChildAccountsResponse]
  ): Unit = js.native
  def listChildAccounts(params: ParamsResourceAccountsListchildaccounts, options: MethodOptions): GaxiosPromise[SchemaListChildAccountsResponse] = js.native
  def listChildAccounts(
    params: ParamsResourceAccountsListchildaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListChildAccountsResponse]
  ): Unit = js.native
  /**
    * Lists all accounts directly managed by the given AdSense account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.listChildAccounts({
    *     // The maximum number of accounts to include in the response, used for paging. If unspecified, at most 10000 accounts will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAccounts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAccounts` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent account, which owns the child accounts. Format: accounts/{account\}
    *     parent: 'accounts/my-account',
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
  def listChildAccounts(params: ParamsResourceAccountsListchildaccounts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listChildAccounts(
    params: ParamsResourceAccountsListchildaccounts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var payments: ResourceAccountsPayments = js.native
  
  var reports: ResourceAccountsReports = js.native
  
  var sites: ResourceAccountsSites = js.native
}

package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def authinfo(): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]): Unit = js.native
  def authinfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(params: ParamsResourceAccountsAuthinfo): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    options: BodyResponseCallback[Readable | SchemaAccountsAuthInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(params: ParamsResourceAccountsAuthinfo, options: MethodOptions): GaxiosPromise[SchemaAccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsAuthInfoResponse]
  ): Unit = js.native
  /**
    * Returns information about the authenticated user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.authinfo({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountIdentifiers": [],
    *   //   "kind": "my_kind"
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
  def authinfo(params: ParamsResourceAccountsAuthinfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def authinfo(
    params: ParamsResourceAccountsAuthinfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def claimwebsite(): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]): Unit = js.native
  def claimwebsite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(params: ParamsResourceAccountsClaimwebsite): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    options: BodyResponseCallback[Readable | SchemaAccountsClaimWebsiteResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(params: ParamsResourceAccountsClaimwebsite, options: MethodOptions): GaxiosPromise[SchemaAccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsClaimWebsiteResponse]
  ): Unit = js.native
  /**
    * Claims the website of a Merchant Center sub-account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.claimwebsite({
    *     // The ID of the account whose website is claimed.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *     // Only available to selected merchants. When set to `True`, this flag removes any existing claim on the requested website by another account and replaces it with a claim from this account.
    *     overwrite: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind"
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
  def claimwebsite(params: ParamsResourceAccountsClaimwebsite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def claimwebsite(
    params: ParamsResourceAccountsClaimwebsite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceAccountsCustombatch): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    options: BodyResponseCallback[Readable | SchemaAccountsCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceAccountsCustombatch, options: MethodOptions): GaxiosPromise[SchemaAccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsCustomBatchResponse]
  ): Unit = js.native
  /**
    * Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.custombatch({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourceAccountsCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceAccountsCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a Merchant Center sub-account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.delete({
    *     // The ID of the account.
    *     accountId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // Flag to delete sub-accounts with products. The default value is false.
    *     force: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account, and accountId must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsDelete,
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
    * Retrieves a Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.get({
    *     // The ID of the account.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adultContent": false,
    *   //   "adwordsLinks": [],
    *   //   "businessInformation": {},
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "reviewsUrl": "my_reviewsUrl",
    *   //   "sellerId": "my_sellerId",
    *   //   "users": [],
    *   //   "websiteUrl": "my_websiteUrl",
    *   //   "youtubeChannelLinks": []
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
  
  def insert(): GaxiosPromise[SchemaAccount] = js.native
  def insert(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def insert(params: ParamsResourceAccountsInsert): GaxiosPromise[SchemaAccount] = js.native
  def insert(params: ParamsResourceAccountsInsert, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def insert(
    params: ParamsResourceAccountsInsert,
    options: BodyResponseCallback[Readable | SchemaAccount],
    callback: BodyResponseCallback[Readable | SchemaAccount]
  ): Unit = js.native
  def insert(params: ParamsResourceAccountsInsert, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def insert(
    params: ParamsResourceAccountsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * Creates a Merchant Center sub-account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.insert({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adultContent": false,
    *       //   "adwordsLinks": [],
    *       //   "businessInformation": {},
    *       //   "googleMyBusinessLink": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "reviewsUrl": "my_reviewsUrl",
    *       //   "sellerId": "my_sellerId",
    *       //   "users": [],
    *       //   "websiteUrl": "my_websiteUrl",
    *       //   "youtubeChannelLinks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adultContent": false,
    *   //   "adwordsLinks": [],
    *   //   "businessInformation": {},
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "reviewsUrl": "my_reviewsUrl",
    *   //   "sellerId": "my_sellerId",
    *   //   "users": [],
    *   //   "websiteUrl": "my_websiteUrl",
    *   //   "youtubeChannelLinks": []
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
  def insert(params: ParamsResourceAccountsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAccountsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def link(): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(callback: BodyResponseCallback[SchemaAccountsLinkResponse]): Unit = js.native
  def link(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(params: ParamsResourceAccountsLink): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(params: ParamsResourceAccountsLink, callback: BodyResponseCallback[SchemaAccountsLinkResponse]): Unit = js.native
  def link(
    params: ParamsResourceAccountsLink,
    options: BodyResponseCallback[Readable | SchemaAccountsLinkResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsLinkResponse]
  ): Unit = js.native
  def link(params: ParamsResourceAccountsLink, options: MethodOptions): GaxiosPromise[SchemaAccountsLinkResponse] = js.native
  def link(
    params: ParamsResourceAccountsLink,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsLinkResponse]
  ): Unit = js.native
  /**
    * Performs an action on a link between two Merchant Center accounts, namely accountId and linkedAccountId.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.link({
    *     // The ID of the account that should be linked.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "linkType": "my_linkType",
    *       //   "linkedAccountId": "my_linkedAccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind"
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
  def link(params: ParamsResourceAccountsLink, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def link(
    params: ParamsResourceAccountsLink,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaAccountsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: BodyResponseCallback[Readable | SchemaAccountsListResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccountsListResponse] = js.native
  def list(
    params: ParamsResourceAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsListResponse]
  ): Unit = js.native
  /**
    * Lists the sub-accounts in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.list({
    *     // The maximum number of accounts to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  
  def update(): GaxiosPromise[SchemaAccount] = js.native
  def update(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def update(params: ParamsResourceAccountsUpdate): GaxiosPromise[SchemaAccount] = js.native
  def update(params: ParamsResourceAccountsUpdate, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
  def update(
    params: ParamsResourceAccountsUpdate,
    options: BodyResponseCallback[Readable | SchemaAccount],
    callback: BodyResponseCallback[Readable | SchemaAccount]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
  def update(
    params: ParamsResourceAccountsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccount]
  ): Unit = js.native
  /**
    * Updates a Merchant Center account. Any fields that are not provided are deleted from the resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.accounts.update({
    *     // The ID of the account.
    *     accountId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adultContent": false,
    *       //   "adwordsLinks": [],
    *       //   "businessInformation": {},
    *       //   "googleMyBusinessLink": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "reviewsUrl": "my_reviewsUrl",
    *       //   "sellerId": "my_sellerId",
    *       //   "users": [],
    *       //   "websiteUrl": "my_websiteUrl",
    *       //   "youtubeChannelLinks": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adultContent": false,
    *   //   "adwordsLinks": [],
    *   //   "businessInformation": {},
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "reviewsUrl": "my_reviewsUrl",
    *   //   "sellerId": "my_sellerId",
    *   //   "users": [],
    *   //   "websiteUrl": "my_websiteUrl",
    *   //   "youtubeChannelLinks": []
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
  def update(params: ParamsResourceAccountsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

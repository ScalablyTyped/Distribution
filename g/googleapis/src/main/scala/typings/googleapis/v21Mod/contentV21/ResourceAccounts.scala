package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts")
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
    * const content = google.content('v2.1');
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
    * const content = google.content('v2.1');
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
    *     // Only available to selected merchants, for example multi-client accounts (MCAs) and their sub-accounts. When set to `True`, this option removes any existing claim on the requested website and replaces it with a claim from the account that makes the request.
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
  
  var credentials: ResourceAccountsCredentials = js.native
  
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
    * const content = google.content('v2.1');
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
    * const content = google.content('v2.1');
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
    *     // Option to delete sub-accounts with products. The default value is false.
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
    * const content = google.content('v2.1');
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
    *     // Controls which fields will be populated. Acceptable values are: "merchant" and "css". The default value is "merchant".
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountManagement": "my_accountManagement",
    *   //   "adsLinks": [],
    *   //   "adultContent": false,
    *   //   "automaticImprovements": {},
    *   //   "automaticLabelIds": [],
    *   //   "businessInformation": {},
    *   //   "cssId": "my_cssId",
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labelIds": [],
    *   //   "name": "my_name",
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
    * const content = google.content('v2.1');
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
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountManagement": "my_accountManagement",
    *       //   "adsLinks": [],
    *       //   "adultContent": false,
    *       //   "automaticImprovements": {},
    *       //   "automaticLabelIds": [],
    *       //   "businessInformation": {},
    *       //   "cssId": "my_cssId",
    *       //   "googleMyBusinessLink": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labelIds": [],
    *       //   "name": "my_name",
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
    *   //   "accountManagement": "my_accountManagement",
    *   //   "adsLinks": [],
    *   //   "adultContent": false,
    *   //   "automaticImprovements": {},
    *   //   "automaticLabelIds": [],
    *   //   "businessInformation": {},
    *   //   "cssId": "my_cssId",
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labelIds": [],
    *   //   "name": "my_name",
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
  
  var labels: ResourceAccountsLabels = js.native
  
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
    * const content = google.content('v2.1');
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
    *       //   "eCommercePlatformLinkInfo": {},
    *       //   "linkType": "my_linkType",
    *       //   "linkedAccountId": "my_linkedAccountId",
    *       //   "paymentServiceProviderLinkInfo": {},
    *       //   "services": []
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
    * const content = google.content('v2.1');
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
    *     // If view is set to "css", only return accounts that are assigned label with given ID.
    *     label: 'placeholder-value',
    *     // The maximum number of accounts to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the managing account. This must be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // If set, only the accounts with the given name (case sensitive) will be returned.
    *     name: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *     // Controls which fields will be populated. Acceptable values are: "merchant" and "css". The default value is "merchant".
    *     view: 'placeholder-value',
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
  
  def listlinks(): GaxiosPromise[SchemaAccountsListLinksResponse] = js.native
  def listlinks(callback: BodyResponseCallback[SchemaAccountsListLinksResponse]): Unit = js.native
  def listlinks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsListLinksResponse] = js.native
  def listlinks(params: ParamsResourceAccountsListlinks): GaxiosPromise[SchemaAccountsListLinksResponse] = js.native
  def listlinks(
    params: ParamsResourceAccountsListlinks,
    callback: BodyResponseCallback[SchemaAccountsListLinksResponse]
  ): Unit = js.native
  def listlinks(
    params: ParamsResourceAccountsListlinks,
    options: BodyResponseCallback[Readable | SchemaAccountsListLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsListLinksResponse]
  ): Unit = js.native
  def listlinks(params: ParamsResourceAccountsListlinks, options: MethodOptions): GaxiosPromise[SchemaAccountsListLinksResponse] = js.native
  def listlinks(
    params: ParamsResourceAccountsListlinks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsListLinksResponse]
  ): Unit = js.native
  /**
    * Returns the list of accounts linked to your Merchant Center account.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounts.listlinks({
    *     // The ID of the account for which to list links.
    *     accountId: 'placeholder-value',
    *     // The maximum number of links to return in the response, used for pagination. The minimum allowed value is 5 results per page. If provided value is lower than 5, it will be automatically increased to 5.
    *     maxResults: 'placeholder-value',
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "links": [],
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
  def listlinks(params: ParamsResourceAccountsListlinks, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listlinks(
    params: ParamsResourceAccountsListlinks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestphoneverification(): GaxiosPromise[SchemaRequestPhoneVerificationResponse] = js.native
  def requestphoneverification(callback: BodyResponseCallback[SchemaRequestPhoneVerificationResponse]): Unit = js.native
  def requestphoneverification(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRequestPhoneVerificationResponse] = js.native
  def requestphoneverification(params: ParamsResourceAccountsRequestphoneverification): GaxiosPromise[SchemaRequestPhoneVerificationResponse] = js.native
  def requestphoneverification(
    params: ParamsResourceAccountsRequestphoneverification,
    callback: BodyResponseCallback[SchemaRequestPhoneVerificationResponse]
  ): Unit = js.native
  def requestphoneverification(
    params: ParamsResourceAccountsRequestphoneverification,
    options: BodyResponseCallback[Readable | SchemaRequestPhoneVerificationResponse],
    callback: BodyResponseCallback[Readable | SchemaRequestPhoneVerificationResponse]
  ): Unit = js.native
  def requestphoneverification(params: ParamsResourceAccountsRequestphoneverification, options: MethodOptions): GaxiosPromise[SchemaRequestPhoneVerificationResponse] = js.native
  def requestphoneverification(
    params: ParamsResourceAccountsRequestphoneverification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRequestPhoneVerificationResponse]
  ): Unit = js.native
  /**
    * Request verification code to start phone verification.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounts.requestphoneverification({
    *     // Required. The ID of the account.
    *     accountId: 'placeholder-value',
    *     // Required. The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode",
    *       //   "phoneNumber": "my_phoneNumber",
    *       //   "phoneRegionCode": "my_phoneRegionCode",
    *       //   "phoneVerificationMethod": "my_phoneVerificationMethod"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "verificationId": "my_verificationId"
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
  def requestphoneverification(params: ParamsResourceAccountsRequestphoneverification, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestphoneverification(
    params: ParamsResourceAccountsRequestphoneverification,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var returncarrier: ResourceAccountsReturncarrier = js.native
  
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
    * const content = google.content('v2.1');
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
    *     // The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and `accountId` must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountManagement": "my_accountManagement",
    *       //   "adsLinks": [],
    *       //   "adultContent": false,
    *       //   "automaticImprovements": {},
    *       //   "automaticLabelIds": [],
    *       //   "businessInformation": {},
    *       //   "cssId": "my_cssId",
    *       //   "googleMyBusinessLink": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "labelIds": [],
    *       //   "name": "my_name",
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
    *   //   "accountManagement": "my_accountManagement",
    *   //   "adsLinks": [],
    *   //   "adultContent": false,
    *   //   "automaticImprovements": {},
    *   //   "automaticLabelIds": [],
    *   //   "businessInformation": {},
    *   //   "cssId": "my_cssId",
    *   //   "googleMyBusinessLink": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "labelIds": [],
    *   //   "name": "my_name",
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
  
  def updatelabels(): GaxiosPromise[SchemaAccountsUpdateLabelsResponse] = js.native
  def updatelabels(callback: BodyResponseCallback[SchemaAccountsUpdateLabelsResponse]): Unit = js.native
  def updatelabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsUpdateLabelsResponse] = js.native
  def updatelabels(params: ParamsResourceAccountsUpdatelabels): GaxiosPromise[SchemaAccountsUpdateLabelsResponse] = js.native
  def updatelabels(
    params: ParamsResourceAccountsUpdatelabels,
    callback: BodyResponseCallback[SchemaAccountsUpdateLabelsResponse]
  ): Unit = js.native
  def updatelabels(
    params: ParamsResourceAccountsUpdatelabels,
    options: BodyResponseCallback[Readable | SchemaAccountsUpdateLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountsUpdateLabelsResponse]
  ): Unit = js.native
  def updatelabels(params: ParamsResourceAccountsUpdatelabels, options: MethodOptions): GaxiosPromise[SchemaAccountsUpdateLabelsResponse] = js.native
  def updatelabels(
    params: ParamsResourceAccountsUpdatelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountsUpdateLabelsResponse]
  ): Unit = js.native
  /**
    * Updates labels that are assigned to the Merchant Center account by CSS user.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounts.updatelabels({
    *     // The ID of the account whose labels are updated.
    *     accountId: 'placeholder-value',
    *     // The ID of the managing account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labelIds": []
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
  def updatelabels(params: ParamsResourceAccountsUpdatelabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatelabels(
    params: ParamsResourceAccountsUpdatelabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyphonenumber(): GaxiosPromise[SchemaVerifyPhoneNumberResponse] = js.native
  def verifyphonenumber(callback: BodyResponseCallback[SchemaVerifyPhoneNumberResponse]): Unit = js.native
  def verifyphonenumber(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVerifyPhoneNumberResponse] = js.native
  def verifyphonenumber(params: ParamsResourceAccountsVerifyphonenumber): GaxiosPromise[SchemaVerifyPhoneNumberResponse] = js.native
  def verifyphonenumber(
    params: ParamsResourceAccountsVerifyphonenumber,
    callback: BodyResponseCallback[SchemaVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyphonenumber(
    params: ParamsResourceAccountsVerifyphonenumber,
    options: BodyResponseCallback[Readable | SchemaVerifyPhoneNumberResponse],
    callback: BodyResponseCallback[Readable | SchemaVerifyPhoneNumberResponse]
  ): Unit = js.native
  def verifyphonenumber(params: ParamsResourceAccountsVerifyphonenumber, options: MethodOptions): GaxiosPromise[SchemaVerifyPhoneNumberResponse] = js.native
  def verifyphonenumber(
    params: ParamsResourceAccountsVerifyphonenumber,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVerifyPhoneNumberResponse]
  ): Unit = js.native
  /**
    * Validates verification code to verify phone number for the account. If successful this will overwrite the value of `accounts.businessinformation.phoneNumber`. Only verified phone number will replace an existing verified phone number.
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
    * const content = google.content('v2.1');
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
    *   const res = await content.accounts.verifyphonenumber({
    *     // Required. The ID of the account.
    *     accountId: 'placeholder-value',
    *     // Required. The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "phoneVerificationMethod": "my_phoneVerificationMethod",
    *       //   "verificationCode": "my_verificationCode",
    *       //   "verificationId": "my_verificationId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "verifiedPhoneNumber": "my_verifiedPhoneNumber"
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
  def verifyphonenumber(params: ParamsResourceAccountsVerifyphonenumber, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyphonenumber(
    params: ParamsResourceAccountsVerifyphonenumber,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

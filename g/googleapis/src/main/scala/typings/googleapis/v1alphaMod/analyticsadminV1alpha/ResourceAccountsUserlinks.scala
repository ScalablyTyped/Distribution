package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Accounts$Userlinks")
@js.native
open class ResourceAccountsUserlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def audit(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  def audit(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse]): Unit = js.native
  def audit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  def audit(params: ParamsResourceAccountsUserlinksAudit): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  def audit(
    params: ParamsResourceAccountsUserlinksAudit,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse]
  ): Unit = js.native
  def audit(
    params: ParamsResourceAccountsUserlinksAudit,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse]
  ): Unit = js.native
  def audit(params: ParamsResourceAccountsUserlinksAudit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse] = js.native
  def audit(
    params: ParamsResourceAccountsUserlinksAudit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse]
  ): Unit = js.native
  /**
    * Lists all user links on an account or property, including implicit ones that come from effective permissions granted by groups or organization admin roles. If a returned user link does not have direct permissions, they cannot be removed from the account or property directly with the DeleteUserLink command. They have to be removed from the group/etc that gives them permissions, which is currently only usable/discoverable in the GA or GMP UIs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.manage.users',
    *       'https://www.googleapis.com/auth/analytics.manage.users.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.audit({
    *     // Required. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userLinks": []
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
  def audit(params: ParamsResourceAccountsUserlinksAudit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def audit(
    params: ParamsResourceAccountsUserlinksAudit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchCreate(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  def batchCreate(params: ParamsResourceAccountsUserlinksBatchcreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  def batchCreate(
    params: ParamsResourceAccountsUserlinksBatchcreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceAccountsUserlinksBatchcreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceAccountsUserlinksBatchcreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse] = js.native
  def batchCreate(
    params: ParamsResourceAccountsUserlinksBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse]
  ): Unit = js.native
  /**
    * Creates information about multiple users' links to an account or property. This method is transactional. If any UserLink cannot be created, none of the UserLinks will be created.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.batchCreate({
    *     // Required. The account or property that all user links in the request are for. This field is required. The parent field in the CreateUserLinkRequest messages must either be empty or match this field. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "notifyNewUsers": false,
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "userLinks": []
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
  def batchCreate(params: ParamsResourceAccountsUserlinksBatchcreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceAccountsUserlinksBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchDelete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(params: ParamsResourceAccountsUserlinksBatchdelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceAccountsUserlinksBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceAccountsUserlinksBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceAccountsUserlinksBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def batchDelete(
    params: ParamsResourceAccountsUserlinksBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes information about multiple users' links to an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.batchDelete({
    *     // Required. The account or property that all user links in the request are for. The parent of all values for user link names to delete must match this field. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
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
  def batchDelete(params: ParamsResourceAccountsUserlinksBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceAccountsUserlinksBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchGet(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  def batchGet(params: ParamsResourceAccountsUserlinksBatchget): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  def batchGet(
    params: ParamsResourceAccountsUserlinksBatchget,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceAccountsUserlinksBatchget,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceAccountsUserlinksBatchget, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] = js.native
  def batchGet(
    params: ParamsResourceAccountsUserlinksBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]
  ): Unit = js.native
  /**
    * Gets information about multiple users' links to an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.manage.users',
    *       'https://www.googleapis.com/auth/analytics.manage.users.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.batchGet({
    *     // Required. The names of the user links to retrieve. A maximum of 1000 user links can be retrieved in a batch. Format: accounts/{accountId\}/userLinks/{userLinkId\}
    *     names: 'placeholder-value',
    *     // Required. The account or property that all user links in the request are for. The parent of all provided values for the 'names' field must match this field. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "userLinks": []
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
  def batchGet(params: ParamsResourceAccountsUserlinksBatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceAccountsUserlinksBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  def batchUpdate(params: ParamsResourceAccountsUserlinksBatchupdate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAccountsUserlinksBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceAccountsUserlinksBatchupdate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceAccountsUserlinksBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] = js.native
  def batchUpdate(
    params: ParamsResourceAccountsUserlinksBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]
  ): Unit = js.native
  /**
    * Updates information about multiple users' links to an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.batchUpdate({
    *     // Required. The account or property that all user links in the request are for. The parent field in the UpdateUserLinkRequest messages must either be empty or match this field. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "userLinks": []
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
  def batchUpdate(params: ParamsResourceAccountsUserlinksBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceAccountsUserlinksBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def create(params: ParamsResourceAccountsUserlinksCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def create(
    params: ParamsResourceAccountsUserlinksCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsUserlinksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsUserlinksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def create(
    params: ParamsResourceAccountsUserlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  /**
    * Creates a user link on an account or property. If the user with the specified email already has permissions on the account or property, then the user's existing permissions will be unioned with the permissions specified in the new UserLink.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.create({
    *     // Optional. If set, then email the new user notifying them that they've been granted permissions to the resource.
    *     notifyNewUser: 'placeholder-value',
    *     // Required. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "directRoles": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directRoles": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceAccountsUserlinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsUserlinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsUserlinksDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsUserlinksDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsUserlinksDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsUserlinksDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsUserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a user link on an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.delete({
    *     // Required. Example format: accounts/1234/userLinks/5678
    *     name: 'accounts/my-account/userLinks/my-userLink',
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
  def delete(params: ParamsResourceAccountsUserlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsUserlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def get(params: ParamsResourceAccountsUserlinksGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def get(
    params: ParamsResourceAccountsUserlinksGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsUserlinksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsUserlinksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def get(
    params: ParamsResourceAccountsUserlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  /**
    * Gets information about a user's link to an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.manage.users',
    *       'https://www.googleapis.com/auth/analytics.manage.users.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.get({
    *     // Required. Example format: accounts/1234/userLinks/5678
    *     name: 'accounts/my-account/userLinks/my-userLink',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directRoles": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceAccountsUserlinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsUserlinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  def list(params: ParamsResourceAccountsUserlinksList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserlinksList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsUserlinksList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsUserlinksList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListUserLinksResponse]
  ): Unit = js.native
  /**
    * Lists all user links on an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.manage.users',
    *       'https://www.googleapis.com/auth/analytics.manage.users.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.list({
    *     // The maximum number of user links to return. The service may return fewer than this value. If unspecified, at most 200 user links will be returned. The maximum value is 500; values above 500 will be coerced to 500.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListUserLinks` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListUserLinks` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: accounts/1234
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userLinks": []
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
  def list(params: ParamsResourceAccountsUserlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsUserlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def patch(params: ParamsResourceAccountsUserlinksPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def patch(
    params: ParamsResourceAccountsUserlinksPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsUserlinksPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsUserlinksPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.native
  def patch(
    params: ParamsResourceAccountsUserlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaUserLink]
  ): Unit = js.native
  /**
    * Updates a user link on an account or property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.accounts.userLinks.patch({
    *     // Output only. Example format: properties/1234/userLinks/5678
    *     name: 'accounts/my-account/userLinks/my-userLink',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "directRoles": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directRoles": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceAccountsUserlinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsUserlinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

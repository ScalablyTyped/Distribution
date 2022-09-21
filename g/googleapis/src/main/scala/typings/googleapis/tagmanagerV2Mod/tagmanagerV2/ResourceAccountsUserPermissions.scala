package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$User_permissions")
@js.native
open class ResourceAccountsUserPermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUserPermission] = js.native
  def create(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def create(params: ParamsResourceAccountsUserPermissionsCreate): GaxiosPromise[SchemaUserPermission] = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    options: BodyResponseCallback[Readable | SchemaUserPermission],
    callback: BodyResponseCallback[Readable | SchemaUserPermission]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsUserPermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  /**
    * Creates a user's Account & Container access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.user_permissions.create({
    *     // GTM Account's API relative path. Example: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountAccess": {},
    *       //   "accountId": "my_accountId",
    *       //   "containerAccess": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "path": "my_path"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountAccess": {},
    *   //   "accountId": "my_accountId",
    *   //   "containerAccess": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "path": "my_path"
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
  def create(params: ParamsResourceAccountsUserPermissionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsUserPermissionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsUserPermissionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsUserPermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsUserPermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a user from the account, revoking access to it and all of its containers.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.user_permissions.delete({
    *     // GTM UserPermission's API relative path. Example: accounts/{account_id\}/user_permissions/{user_permission_id\}
    *     path: 'accounts/my-account/user_permissions/my-user_permission',
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
  def delete(params: ParamsResourceAccountsUserPermissionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsUserPermissionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def get(params: ParamsResourceAccountsUserPermissionsGet): GaxiosPromise[SchemaUserPermission] = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    options: BodyResponseCallback[Readable | SchemaUserPermission],
    callback: BodyResponseCallback[Readable | SchemaUserPermission]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsUserPermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  /**
    * Gets a user's Account & Container access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.user_permissions.get({
    *     // GTM UserPermission's API relative path. Example: accounts/{account_id\}/user_permissions/{user_permission_id\}
    *     path: 'accounts/my-account/user_permissions/my-user_permission',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountAccess": {},
    *   //   "accountId": "my_accountId",
    *   //   "containerAccess": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "path": "my_path"
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
  def get(params: ParamsResourceAccountsUserPermissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsUserPermissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserPermissionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(params: ParamsResourceAccountsUserPermissionsList): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    callback: BodyResponseCallback[SchemaListUserPermissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    options: BodyResponseCallback[Readable | SchemaListUserPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUserPermissionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsUserPermissionsList, options: MethodOptions): GaxiosPromise[SchemaListUserPermissionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserPermissionsResponse]
  ): Unit = js.native
  /**
    * List all users that have access to the account along with Account and Container user access granted to each of them.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.user_permissions.list({
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // GTM Accounts's API relative path. Example: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userPermission": []
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
  def list(params: ParamsResourceAccountsUserPermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsUserPermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUserPermission] = js.native
  def update(callback: BodyResponseCallback[SchemaUserPermission]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def update(params: ParamsResourceAccountsUserPermissionsUpdate): GaxiosPromise[SchemaUserPermission] = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    options: BodyResponseCallback[Readable | SchemaUserPermission],
    callback: BodyResponseCallback[Readable | SchemaUserPermission]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsUserPermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaUserPermission] = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPermission]
  ): Unit = js.native
  /**
    * Updates a user's Account & Container access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.manage.users'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await tagmanager.accounts.user_permissions.update({
    *     // GTM UserPermission's API relative path. Example: accounts/{account_id\}/user_permissions/{user_permission_id\}
    *     path: 'accounts/my-account/user_permissions/my-user_permission',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountAccess": {},
    *       //   "accountId": "my_accountId",
    *       //   "containerAccess": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "path": "my_path"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountAccess": {},
    *   //   "accountId": "my_accountId",
    *   //   "containerAccess": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "path": "my_path"
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
  def update(params: ParamsResourceAccountsUserPermissionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsUserPermissionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

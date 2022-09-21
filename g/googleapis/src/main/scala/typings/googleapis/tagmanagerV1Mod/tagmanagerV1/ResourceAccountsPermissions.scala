package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Permissions")
@js.native
open class ResourceAccountsPermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUserAccess] = js.native
  def create(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate): GaxiosPromise[SchemaUserAccess] = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def create(
    params: ParamsResourceAccountsPermissionsCreate,
    options: BodyResponseCallback[Readable | SchemaUserAccess],
    callback: BodyResponseCallback[Readable | SchemaUserAccess]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsPermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def create(
    params: ParamsResourceAccountsPermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  /**
    * Creates a user's Account & Container Permissions.
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.permissions.create({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountAccess": {},
    *       //   "accountId": "my_accountId",
    *       //   "containerAccess": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "permissionId": "my_permissionId"
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
    *   //   "permissionId": "my_permissionId"
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
  def create(params: ParamsResourceAccountsPermissionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsPermissionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsPermissionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsPermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsPermissionsDelete,
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.permissions.delete({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM User ID.
    *     permissionId: 'placeholder-value',
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
  def delete(params: ParamsResourceAccountsPermissionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsPermissionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserAccess] = js.native
  def get(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def get(params: ParamsResourceAccountsPermissionsGet): GaxiosPromise[SchemaUserAccess] = js.native
  def get(params: ParamsResourceAccountsPermissionsGet, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def get(
    params: ParamsResourceAccountsPermissionsGet,
    options: BodyResponseCallback[Readable | SchemaUserAccess],
    callback: BodyResponseCallback[Readable | SchemaUserAccess]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsPermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def get(
    params: ParamsResourceAccountsPermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  /**
    * Gets a user's Account & Container Permissions.
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.permissions.get({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM User ID.
    *     permissionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountAccess": {},
    *   //   "accountId": "my_accountId",
    *   //   "containerAccess": [],
    *   //   "emailAddress": "my_emailAddress",
    *   //   "permissionId": "my_permissionId"
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
  def get(params: ParamsResourceAccountsPermissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsPermissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccountUsersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(params: ParamsResourceAccountsPermissionsList): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    callback: BodyResponseCallback[SchemaListAccountUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    options: BodyResponseCallback[Readable | SchemaListAccountUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaListAccountUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPermissionsList, options: MethodOptions): GaxiosPromise[SchemaListAccountUsersResponse] = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccountUsersResponse]
  ): Unit = js.native
  /**
    * List all users that have access to the account along with Account and Container Permissions granted to each of them.
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.permissions.list({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "userAccess": []
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
  def list(params: ParamsResourceAccountsPermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsPermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUserAccess] = js.native
  def update(callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate): GaxiosPromise[SchemaUserAccess] = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate, callback: BodyResponseCallback[SchemaUserAccess]): Unit = js.native
  def update(
    params: ParamsResourceAccountsPermissionsUpdate,
    options: BodyResponseCallback[Readable | SchemaUserAccess],
    callback: BodyResponseCallback[Readable | SchemaUserAccess]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsPermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaUserAccess] = js.native
  def update(
    params: ParamsResourceAccountsPermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserAccess]
  ): Unit = js.native
  /**
    * Updates a user's Account & Container Permissions.
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
    * const tagmanager = google.tagmanager('v1');
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
    *   const res = await tagmanager.accounts.permissions.update({
    *     // The GTM Account ID.
    *     accountId: 'placeholder-value',
    *     // The GTM User ID.
    *     permissionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountAccess": {},
    *       //   "accountId": "my_accountId",
    *       //   "containerAccess": [],
    *       //   "emailAddress": "my_emailAddress",
    *       //   "permissionId": "my_permissionId"
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
    *   //   "permissionId": "my_permissionId"
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
  def update(params: ParamsResourceAccountsPermissionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsPermissionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

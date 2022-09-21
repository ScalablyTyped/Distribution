package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roles")
@js.native
open class ResourceRoles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRolesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRolesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRolesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.rolemanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.delete({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role.
    *     roleId: 'placeholder-value',
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
  def delete(params: ParamsResourceRolesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRolesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRole] = js.native
  def get(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(
    params: ParamsResourceRolesGet,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  /**
    * Retrieves a role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement',
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.get({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role.
    *     roleId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "isSuperAdminRole": false,
    *   //   "isSystemRole": false,
    *   //   "kind": "my_kind",
    *   //   "roleDescription": "my_roleDescription",
    *   //   "roleId": "my_roleId",
    *   //   "roleName": "my_roleName",
    *   //   "rolePrivileges": []
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
  def get(params: ParamsResourceRolesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRolesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRole] = js.native
  def insert(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def insert(params: ParamsResourceRolesInsert): GaxiosPromise[SchemaRole] = js.native
  def insert(params: ParamsResourceRolesInsert, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def insert(
    params: ParamsResourceRolesInsert,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def insert(params: ParamsResourceRolesInsert, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def insert(
    params: ParamsResourceRolesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Creates a role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.rolemanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.insert({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "isSuperAdminRole": false,
    *       //   "isSystemRole": false,
    *       //   "kind": "my_kind",
    *       //   "roleDescription": "my_roleDescription",
    *       //   "roleId": "my_roleId",
    *       //   "roleName": "my_roleName",
    *       //   "rolePrivileges": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "isSuperAdminRole": false,
    *   //   "isSystemRole": false,
    *   //   "kind": "my_kind",
    *   //   "roleDescription": "my_roleDescription",
    *   //   "roleId": "my_roleId",
    *   //   "roleName": "my_roleName",
    *   //   "rolePrivileges": []
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
  def insert(params: ParamsResourceRolesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRolesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRoles] = js.native
  def list(callback: BodyResponseCallback[SchemaRoles]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoles] = js.native
  def list(params: ParamsResourceRolesList): GaxiosPromise[SchemaRoles] = js.native
  def list(params: ParamsResourceRolesList, callback: BodyResponseCallback[SchemaRoles]): Unit = js.native
  def list(
    params: ParamsResourceRolesList,
    options: BodyResponseCallback[Readable | SchemaRoles],
    callback: BodyResponseCallback[Readable | SchemaRoles]
  ): Unit = js.native
  def list(params: ParamsResourceRolesList, options: MethodOptions): GaxiosPromise[SchemaRoles] = js.native
  def list(
    params: ParamsResourceRolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoles]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of all the roles in a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement',
    *       'https://www.googleapis.com/auth/admin.directory.rolemanagement.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.list({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceRolesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRolesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceRolesPatch): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceRolesPatch, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(
    params: ParamsResourceRolesPatch,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def patch(params: ParamsResourceRolesPatch, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(
    params: ParamsResourceRolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Patches a role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.rolemanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.patch({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role.
    *     roleId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "isSuperAdminRole": false,
    *       //   "isSystemRole": false,
    *       //   "kind": "my_kind",
    *       //   "roleDescription": "my_roleDescription",
    *       //   "roleId": "my_roleId",
    *       //   "roleName": "my_roleName",
    *       //   "rolePrivileges": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "isSuperAdminRole": false,
    *   //   "isSystemRole": false,
    *   //   "kind": "my_kind",
    *   //   "roleDescription": "my_roleDescription",
    *   //   "roleId": "my_roleId",
    *   //   "roleName": "my_roleName",
    *   //   "rolePrivileges": []
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
  def patch(params: ParamsResourceRolesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRolesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRole] = js.native
  def update(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def update(params: ParamsResourceRolesUpdate): GaxiosPromise[SchemaRole] = js.native
  def update(params: ParamsResourceRolesUpdate, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def update(
    params: ParamsResourceRolesUpdate,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def update(params: ParamsResourceRolesUpdate, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def update(
    params: ParamsResourceRolesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Updates a role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.rolemanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.roles.update({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role.
    *     roleId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "isSuperAdminRole": false,
    *       //   "isSystemRole": false,
    *       //   "kind": "my_kind",
    *       //   "roleDescription": "my_roleDescription",
    *       //   "roleId": "my_roleId",
    *       //   "roleName": "my_roleName",
    *       //   "rolePrivileges": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "isSuperAdminRole": false,
    *   //   "isSystemRole": false,
    *   //   "kind": "my_kind",
    *   //   "roleDescription": "my_roleDescription",
    *   //   "roleId": "my_roleId",
    *   //   "roleName": "my_roleName",
    *   //   "rolePrivileges": []
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
  def update(params: ParamsResourceRolesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRolesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

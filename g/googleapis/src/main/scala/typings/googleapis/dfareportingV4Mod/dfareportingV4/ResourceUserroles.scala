package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Userroles")
@js.native
open class ResourceUserroles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUserrolesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUserrolesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUserrolesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUserrolesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUserrolesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing user role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.delete({
    *     // User role ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
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
  def delete(params: ParamsResourceUserrolesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUserrolesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserRole] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def get(params: ParamsResourceUserrolesGet): GaxiosPromise[SchemaUserRole] = js.native
  def get(params: ParamsResourceUserrolesGet, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def get(
    params: ParamsResourceUserrolesGet,
    options: BodyResponseCallback[Readable | SchemaUserRole],
    callback: BodyResponseCallback[Readable | SchemaUserRole]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolesGet, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def get(
    params: ParamsResourceUserrolesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  /**
    * Gets one user role by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.get({
    *     // User role ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "defaultUserRole": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentUserRoleId": "my_parentUserRoleId",
    *   //   "permissions": [],
    *   //   "subaccountId": "my_subaccountId"
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
  def get(params: ParamsResourceUserrolesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUserrolesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaUserRole] = js.native
  def insert(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def insert(params: ParamsResourceUserrolesInsert): GaxiosPromise[SchemaUserRole] = js.native
  def insert(params: ParamsResourceUserrolesInsert, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def insert(
    params: ParamsResourceUserrolesInsert,
    options: BodyResponseCallback[Readable | SchemaUserRole],
    callback: BodyResponseCallback[Readable | SchemaUserRole]
  ): Unit = js.native
  def insert(params: ParamsResourceUserrolesInsert, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def insert(
    params: ParamsResourceUserrolesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  /**
    * Inserts a new user role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "defaultUserRole": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentUserRoleId": "my_parentUserRoleId",
    *       //   "permissions": [],
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "defaultUserRole": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentUserRoleId": "my_parentUserRoleId",
    *   //   "permissions": [],
    *   //   "subaccountId": "my_subaccountId"
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
  def insert(params: ParamsResourceUserrolesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUserrolesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(params: ParamsResourceUserrolesList): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(params: ParamsResourceUserrolesList, callback: BodyResponseCallback[SchemaUserRolesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUserrolesList,
    options: BodyResponseCallback[Readable | SchemaUserRolesListResponse],
    callback: BodyResponseCallback[Readable | SchemaUserRolesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolesList, options: MethodOptions): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(
    params: ParamsResourceUserrolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of user roles, possibly filtered. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.list({
    *     // Select only account level user roles not associated with any specific subaccount.
    *     accountUserRoleOnly: 'placeholder-value',
    *     // Select only user roles with the specified IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "userrole*2015" will return objects with names like "userrole June 2015", "userrole April 2015", or simply "userrole 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "userrole" will match objects with name "my userrole", "userrole 2015", or simply "userrole".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only user roles that belong to this subaccount.
    *     subaccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userRoles": []
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
  def list(params: ParamsResourceUserrolesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUserrolesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaUserRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def patch(params: ParamsResourceUserrolesPatch): GaxiosPromise[SchemaUserRole] = js.native
  def patch(params: ParamsResourceUserrolesPatch, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def patch(
    params: ParamsResourceUserrolesPatch,
    options: BodyResponseCallback[Readable | SchemaUserRole],
    callback: BodyResponseCallback[Readable | SchemaUserRole]
  ): Unit = js.native
  def patch(params: ParamsResourceUserrolesPatch, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def patch(
    params: ParamsResourceUserrolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  /**
    * Updates an existing user role. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.patch({
    *     // UserRole ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "defaultUserRole": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentUserRoleId": "my_parentUserRoleId",
    *       //   "permissions": [],
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "defaultUserRole": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentUserRoleId": "my_parentUserRoleId",
    *   //   "permissions": [],
    *   //   "subaccountId": "my_subaccountId"
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
  def patch(params: ParamsResourceUserrolesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUserrolesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUserRole] = js.native
  def update(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def update(params: ParamsResourceUserrolesUpdate): GaxiosPromise[SchemaUserRole] = js.native
  def update(params: ParamsResourceUserrolesUpdate, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def update(
    params: ParamsResourceUserrolesUpdate,
    options: BodyResponseCallback[Readable | SchemaUserRole],
    callback: BodyResponseCallback[Readable | SchemaUserRole]
  ): Unit = js.native
  def update(params: ParamsResourceUserrolesUpdate, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def update(
    params: ParamsResourceUserrolesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  /**
    * Updates an existing user role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.userRoles.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "defaultUserRole": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentUserRoleId": "my_parentUserRoleId",
    *       //   "permissions": [],
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "defaultUserRole": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentUserRoleId": "my_parentUserRoleId",
    *   //   "permissions": [],
    *   //   "subaccountId": "my_subaccountId"
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
  def update(params: ParamsResourceUserrolesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUserrolesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

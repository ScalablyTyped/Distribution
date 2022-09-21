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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roleassignments")
@js.native
open class ResourceRoleassignments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRoleassignmentsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceRoleassignmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a role assignment.
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
    *   const res = await directory.roleAssignments.delete({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role assignment.
    *     roleAssignmentId: 'placeholder-value',
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
  def delete(params: ParamsResourceRoleassignmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRoleassignmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(params: ParamsResourceRoleassignmentsGet): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(params: ParamsResourceRoleassignmentsGet, callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def get(
    params: ParamsResourceRoleassignmentsGet,
    options: BodyResponseCallback[Readable | SchemaRoleAssignment],
    callback: BodyResponseCallback[Readable | SchemaRoleAssignment]
  ): Unit = js.native
  def get(params: ParamsResourceRoleassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(
    params: ParamsResourceRoleassignmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  /**
    * Retrieves a role assignment.
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
    *   const res = await directory.roleAssignments.get({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Immutable ID of the role assignment.
    *     roleAssignmentId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedTo": "my_assignedTo",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "roleAssignmentId": "my_roleAssignmentId",
    *   //   "roleId": "my_roleId",
    *   //   "scopeType": "my_scopeType"
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
  def get(params: ParamsResourceRoleassignmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRoleassignmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert, callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def insert(
    params: ParamsResourceRoleassignmentsInsert,
    options: BodyResponseCallback[Readable | SchemaRoleAssignment],
    callback: BodyResponseCallback[Readable | SchemaRoleAssignment]
  ): Unit = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(
    params: ParamsResourceRoleassignmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  /**
    * Creates a role assignment.
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
    *   const res = await directory.roleAssignments.insert({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assignedTo": "my_assignedTo",
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "roleAssignmentId": "my_roleAssignmentId",
    *       //   "roleId": "my_roleId",
    *       //   "scopeType": "my_scopeType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignedTo": "my_assignedTo",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "roleAssignmentId": "my_roleAssignmentId",
    *   //   "roleId": "my_roleId",
    *   //   "scopeType": "my_scopeType"
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
  def insert(params: ParamsResourceRoleassignmentsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRoleassignmentsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(callback: BodyResponseCallback[SchemaRoleAssignments]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(params: ParamsResourceRoleassignmentsList): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(params: ParamsResourceRoleassignmentsList, callback: BodyResponseCallback[SchemaRoleAssignments]): Unit = js.native
  def list(
    params: ParamsResourceRoleassignmentsList,
    options: BodyResponseCallback[Readable | SchemaRoleAssignments],
    callback: BodyResponseCallback[Readable | SchemaRoleAssignments]
  ): Unit = js.native
  def list(params: ParamsResourceRoleassignmentsList, options: MethodOptions): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(
    params: ParamsResourceRoleassignmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignments]
  ): Unit = js.native
  /**
    * Retrieves a paginated list of all roleAssignments.
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
    *   const res = await directory.roleAssignments.list({
    *     // Immutable ID of the Google Workspace account.
    *     customer: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Token to specify the next page in the list.
    *     pageToken: 'placeholder-value',
    *     // Immutable ID of a role. If included in the request, returns only role assignments containing this role ID.
    *     roleId: 'placeholder-value',
    *     // The user's primary email address, alias email address, or unique user ID. If included in the request, returns role assignments only for this user.
    *     userKey: 'placeholder-value',
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
  def list(params: ParamsResourceRoleassignmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRoleassignmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sql/v1beta4", "sql_v1beta4.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * sql.users.delete
    * @desc Deletes a user from a Cloud SQL instance.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sql.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sql = google.sql('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.users.delete({
    *     // Host of the user in the instance.
    *     host: 'placeholder-value',
    *     // Database instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Name of the user in the instance.
    *     name: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "exportContext": {},
    *   //   "importContext": {},
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationType": "my_operationType",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "targetProject": "my_targetProject",
    *   //   "user": "my_user"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias sql.users.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.host Host of the user in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string=} params.name Name of the user in the instance.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(params: ParamsResourceUsersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * sql.users.insert
    * @desc Creates a new user in a Cloud SQL instance.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sql.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sql = google.sql('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.users.insert({
    *     // Database instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "host": "my_host",
    *       //   "instance": "my_instance",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "password": "my_password",
    *       //   "project": "my_project",
    *       //   "sqlserverUserDetails": {},
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "exportContext": {},
    *   //   "importContext": {},
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationType": "my_operationType",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "targetProject": "my_targetProject",
    *   //   "user": "my_user"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias sql.users.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().User} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(params: ParamsResourceUsersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[Readable | SchemaUsersListResponse],
    callback: BodyResponseCallback[Readable | SchemaUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersListResponse]
  ): Unit = js.native
  /**
    * sql.users.list
    * @desc Lists users in the specified Cloud SQL instance.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sql.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sql = google.sql('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.users.list({
    *     // Database instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
    * @alias sql.users.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceUsersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * sql.users.update
    * @desc Updates an existing user in a Cloud SQL instance.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sql.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sql = google.sql('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/sqlservice.admin',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.users.update({
    *     // Optional. Host of the user in the instance.
    *     host: 'placeholder-value',
    *     // Database instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Name of the user in the instance.
    *     name: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "host": "my_host",
    *       //   "instance": "my_instance",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "password": "my_password",
    *       //   "project": "my_project",
    *       //   "sqlserverUserDetails": {},
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "exportContext": {},
    *   //   "importContext": {},
    *   //   "insertTime": "my_insertTime",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "operationType": "my_operationType",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "targetId": "my_targetId",
    *   //   "targetLink": "my_targetLink",
    *   //   "targetProject": "my_targetProject",
    *   //   "user": "my_user"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias sql.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.host Optional. Host of the user in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string=} params.name Name of the user in the instance.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().User} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(params: ParamsResourceUsersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

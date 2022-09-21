package typings.googleapis.sqladminV1Mod.sqladminV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1", "sqladmin_v1.Resource$Backupruns")
@js.native
open class ResourceBackupruns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackuprunsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackuprunsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackuprunsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackuprunsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackuprunsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the backup taken by a backup run.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
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
    *   const res = await sql.backupRuns.delete({
    *     // The ID of the backup run to delete. To find a backup run ID, use the [list](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1/backupRuns/list) method.
    *     id: 'placeholder-value',
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backupContext": {},
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceBackuprunsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBackuprunsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBackupRun] = js.native
  def get(callback: BodyResponseCallback[SchemaBackupRun]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackupRun] = js.native
  def get(params: ParamsResourceBackuprunsGet): GaxiosPromise[SchemaBackupRun] = js.native
  def get(params: ParamsResourceBackuprunsGet, callback: BodyResponseCallback[SchemaBackupRun]): Unit = js.native
  def get(
    params: ParamsResourceBackuprunsGet,
    options: BodyResponseCallback[Readable | SchemaBackupRun],
    callback: BodyResponseCallback[Readable | SchemaBackupRun]
  ): Unit = js.native
  def get(params: ParamsResourceBackuprunsGet, options: MethodOptions): GaxiosPromise[SchemaBackupRun] = js.native
  def get(
    params: ParamsResourceBackuprunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackupRun]
  ): Unit = js.native
  /**
    * Retrieves a resource containing information about a backup run.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
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
    *   const res = await sql.backupRuns.get({
    *     // The ID of this backup run.
    *     id: 'placeholder-value',
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backupKind": "my_backupKind",
    *   //   "description": "my_description",
    *   //   "diskEncryptionConfiguration": {},
    *   //   "diskEncryptionStatus": {},
    *   //   "endTime": "my_endTime",
    *   //   "enqueuedTime": "my_enqueuedTime",
    *   //   "error": {},
    *   //   "id": "my_id",
    *   //   "instance": "my_instance",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "selfLink": "my_selfLink",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "type": "my_type",
    *   //   "windowStartTime": "my_windowStartTime"
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
  def get(params: ParamsResourceBackuprunsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBackuprunsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackuprunsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackuprunsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackuprunsInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackuprunsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackuprunsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new backup run on demand.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
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
    *   const res = await sql.backupRuns.insert({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "backupKind": "my_backupKind",
    *       //   "description": "my_description",
    *       //   "diskEncryptionConfiguration": {},
    *       //   "diskEncryptionStatus": {},
    *       //   "endTime": "my_endTime",
    *       //   "enqueuedTime": "my_enqueuedTime",
    *       //   "error": {},
    *       //   "id": "my_id",
    *       //   "instance": "my_instance",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "selfLink": "my_selfLink",
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status",
    *       //   "type": "my_type",
    *       //   "windowStartTime": "my_windowStartTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backupContext": {},
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def insert(params: ParamsResourceBackuprunsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceBackuprunsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBackupRunsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(params: ParamsResourceBackuprunsList): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(params: ParamsResourceBackuprunsList, callback: BodyResponseCallback[SchemaBackupRunsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceBackuprunsList,
    options: BodyResponseCallback[Readable | SchemaBackupRunsListResponse],
    callback: BodyResponseCallback[Readable | SchemaBackupRunsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBackuprunsList, options: MethodOptions): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(
    params: ParamsResourceBackuprunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackupRunsListResponse]
  ): Unit = js.native
  /**
    * Lists all backup runs associated with the project or a given instance and configuration in the reverse chronological order of the backup initiation time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sqladmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sqladmin = google.sqladmin('v1');
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
    *   const res = await sql.backupRuns.list({
    *     // Cloud SQL instance ID, or "-" for all instances. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Maximum number of backup runs per response.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
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
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceBackuprunsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBackuprunsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Instances")
@js.native
open class ResourceInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addServerCa(): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addServerCa(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addServerCa(
    params: ParamsResourceInstancesAddserverca,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(
    params: ParamsResourceInstancesAddserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Add a new trusted Certificate Authority (CA) version for the specified instance. Required to prepare for a certificate rotation. If a CA version was previously added but never used in a certificate rotation, this operation replaces that version. There cannot be more than one CA version waiting to be rotated in.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.addServerCa({
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
  def addServerCa(params: ParamsResourceInstancesAddserverca, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addServerCa(
    params: ParamsResourceInstancesAddserverca,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def clone(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceInstancesClone): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceInstancesClone, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(
    params: ParamsResourceInstancesClone,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def clone(params: ParamsResourceInstancesClone, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(
    params: ParamsResourceInstancesClone,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a Cloud SQL instance as a clone of the source instance. Using this operation might cause your instance to restart.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.clone({
    *     // The ID of the Cloud SQL instance to be cloned (source). This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the source as well as the clone Cloud SQL instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloneContext": {}
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
  def clone(params: ParamsResourceInstancesClone, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clone(
    params: ParamsResourceInstancesClone,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a Cloud SQL instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.delete({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance to be deleted.
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
  def delete(params: ParamsResourceInstancesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def demoteMaster(): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def demoteMaster(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def demoteMaster(
    params: ParamsResourceInstancesDemotemaster,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(
    params: ParamsResourceInstancesDemotemaster,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Demotes the stand-alone instance to be a Cloud SQL read replica for an external database server.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.demoteMaster({
    *     // Cloud SQL instance name.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "demoteMasterContext": {}
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
  def demoteMaster(params: ParamsResourceInstancesDemotemaster, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def demoteMaster(
    params: ParamsResourceInstancesDemotemaster,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceInstancesExport): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceInstancesExport, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(
    params: ParamsResourceInstancesExport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceInstancesExport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceInstancesExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports data from a Cloud SQL instance to a Cloud Storage bucket as a SQL dump or CSV file.
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
    * const sqladmin = google.sqladmin('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.instances.export({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance to be exported.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "exportContext": {}
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
  def `export`(params: ParamsResourceInstancesExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceInstancesExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def failover(): GaxiosPromise[SchemaOperation] = js.native
  def failover(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def failover(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(params: ParamsResourceInstancesFailover): GaxiosPromise[SchemaOperation] = js.native
  def failover(params: ParamsResourceInstancesFailover, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def failover(
    params: ParamsResourceInstancesFailover,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def failover(params: ParamsResourceInstancesFailover, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(
    params: ParamsResourceInstancesFailover,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates a manual failover of a high availability (HA) primary instance to a standby instance, which becomes the primary instance. Users are then rerouted to the new primary. For more information, see the [Overview of high availability](https://cloud.google.com/sql/docs/mysql/high-availability) page in the Cloud SQL documentation. If using Legacy HA (MySQL only), this causes the instance to failover to its failover replica instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.failover({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the read replica.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "failoverContext": {}
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
  def failover(params: ParamsResourceInstancesFailover, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def failover(
    params: ParamsResourceInstancesFailover,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(params: ParamsResourceInstancesGet): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(params: ParamsResourceInstancesGet, callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: BodyResponseCallback[Readable | SchemaDatabaseInstance],
    callback: BodyResponseCallback[Readable | SchemaDatabaseInstance]
  ): Unit = js.native
  def get(params: ParamsResourceInstancesGet, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatabaseInstance]
  ): Unit = js.native
  /**
    * Retrieves a resource containing information about a Cloud SQL instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.get({
    *     // Database instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availableMaintenanceVersions": [],
    *   //   "backendType": "my_backendType",
    *   //   "connectionName": "my_connectionName",
    *   //   "createTime": "my_createTime",
    *   //   "currentDiskSize": "my_currentDiskSize",
    *   //   "databaseInstalledVersion": "my_databaseInstalledVersion",
    *   //   "databaseVersion": "my_databaseVersion",
    *   //   "diskEncryptionConfiguration": {},
    *   //   "diskEncryptionStatus": {},
    *   //   "etag": "my_etag",
    *   //   "failoverReplica": {},
    *   //   "gceZone": "my_gceZone",
    *   //   "instanceType": "my_instanceType",
    *   //   "ipAddresses": [],
    *   //   "ipv6Address": "my_ipv6Address",
    *   //   "kind": "my_kind",
    *   //   "maintenanceVersion": "my_maintenanceVersion",
    *   //   "masterInstanceName": "my_masterInstanceName",
    *   //   "maxDiskSize": "my_maxDiskSize",
    *   //   "name": "my_name",
    *   //   "onPremisesConfiguration": {},
    *   //   "outOfDiskReport": {},
    *   //   "project": "my_project",
    *   //   "region": "my_region",
    *   //   "replicaConfiguration": {},
    *   //   "replicaNames": [],
    *   //   "rootPassword": "my_rootPassword",
    *   //   "satisfiesPzs": false,
    *   //   "scheduledMaintenance": {},
    *   //   "secondaryGceZone": "my_secondaryGceZone",
    *   //   "selfLink": "my_selfLink",
    *   //   "serverCaCert": {},
    *   //   "serviceAccountEmailAddress": "my_serviceAccountEmailAddress",
    *   //   "settings": {},
    *   //   "state": "my_state",
    *   //   "suspensionReason": []
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
  def get(params: ParamsResourceInstancesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceInstancesImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceInstancesImport, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(
    params: ParamsResourceInstancesImport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceInstancesImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceInstancesImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Imports data into a Cloud SQL instance from a SQL dump or CSV file in Cloud Storage.
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
    * const sqladmin = google.sqladmin('v1beta4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sql.instances.import({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "importContext": {}
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
  def `import`(params: ParamsResourceInstancesImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceInstancesImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceInstancesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Cloud SQL instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.insert({
    *     // Project ID of the project to which the newly created Cloud SQL instances should belong.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMaintenanceVersions": [],
    *       //   "backendType": "my_backendType",
    *       //   "connectionName": "my_connectionName",
    *       //   "createTime": "my_createTime",
    *       //   "currentDiskSize": "my_currentDiskSize",
    *       //   "databaseInstalledVersion": "my_databaseInstalledVersion",
    *       //   "databaseVersion": "my_databaseVersion",
    *       //   "diskEncryptionConfiguration": {},
    *       //   "diskEncryptionStatus": {},
    *       //   "etag": "my_etag",
    *       //   "failoverReplica": {},
    *       //   "gceZone": "my_gceZone",
    *       //   "instanceType": "my_instanceType",
    *       //   "ipAddresses": [],
    *       //   "ipv6Address": "my_ipv6Address",
    *       //   "kind": "my_kind",
    *       //   "maintenanceVersion": "my_maintenanceVersion",
    *       //   "masterInstanceName": "my_masterInstanceName",
    *       //   "maxDiskSize": "my_maxDiskSize",
    *       //   "name": "my_name",
    *       //   "onPremisesConfiguration": {},
    *       //   "outOfDiskReport": {},
    *       //   "project": "my_project",
    *       //   "region": "my_region",
    *       //   "replicaConfiguration": {},
    *       //   "replicaNames": [],
    *       //   "rootPassword": "my_rootPassword",
    *       //   "satisfiesPzs": false,
    *       //   "scheduledMaintenance": {},
    *       //   "secondaryGceZone": "my_secondaryGceZone",
    *       //   "selfLink": "my_selfLink",
    *       //   "serverCaCert": {},
    *       //   "serviceAccountEmailAddress": "my_serviceAccountEmailAddress",
    *       //   "settings": {},
    *       //   "state": "my_state",
    *       //   "suspensionReason": []
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
  def insert(params: ParamsResourceInstancesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInstancesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(params: ParamsResourceInstancesList): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(params: ParamsResourceInstancesList, callback: BodyResponseCallback[SchemaInstancesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: BodyResponseCallback[Readable | SchemaInstancesListResponse],
    callback: BodyResponseCallback[Readable | SchemaInstancesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInstancesList, options: MethodOptions): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstancesListResponse]
  ): Unit = js.native
  /**
    * Lists instances under a given project.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.list({
    *     // A filter expression that filters resources listed in the response. The expression is in the form of field:value. For example, 'instanceType:CLOUD_SQL_INSTANCE'. Fields can be nested as needed as per their JSON representation, such as 'settings.userLabels.auto_start:true'. Multiple filter queries are space-separated. For example. 'state:RUNNABLE instanceType:CLOUD_SQL_INSTANCE'. By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly.
    *     filter: 'placeholder-value',
    *     // The maximum number of instances to return. The service may return fewer than this value. If unspecified, at most 500 instances are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
    *     maxResults: 'placeholder-value',
    *     // A previously-returned page token representing part of the larger set of results to view.
    *     pageToken: 'placeholder-value',
    *     // Project ID of the project for which to list Cloud SQL instances.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "warnings": []
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
  def list(params: ParamsResourceInstancesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listServerCas(): GaxiosPromise[SchemaInstancesListServerCasResponse] = js.native
  def listServerCas(callback: BodyResponseCallback[SchemaInstancesListServerCasResponse]): Unit = js.native
  def listServerCas(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstancesListServerCasResponse] = js.native
  def listServerCas(params: ParamsResourceInstancesListservercas): GaxiosPromise[SchemaInstancesListServerCasResponse] = js.native
  def listServerCas(
    params: ParamsResourceInstancesListservercas,
    callback: BodyResponseCallback[SchemaInstancesListServerCasResponse]
  ): Unit = js.native
  def listServerCas(
    params: ParamsResourceInstancesListservercas,
    options: BodyResponseCallback[Readable | SchemaInstancesListServerCasResponse],
    callback: BodyResponseCallback[Readable | SchemaInstancesListServerCasResponse]
  ): Unit = js.native
  def listServerCas(params: ParamsResourceInstancesListservercas, options: MethodOptions): GaxiosPromise[SchemaInstancesListServerCasResponse] = js.native
  def listServerCas(
    params: ParamsResourceInstancesListservercas,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstancesListServerCasResponse]
  ): Unit = js.native
  /**
    * Lists all of the trusted Certificate Authorities (CAs) for the specified instance. There can be up to three CAs listed: the CA that was used to sign the certificate that is currently in use, a CA that has been added but not yet used to sign a certificate, and a CA used to sign a certificate that has previously rotated out.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.listServerCas({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeVersion": "my_activeVersion",
    *   //   "certs": [],
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
  def listServerCas(params: ParamsResourceInstancesListservercas, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listServerCas(
    params: ParamsResourceInstancesListservercas,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceInstancesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates settings of a Cloud SQL instance. This method supports patch semantics.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.patch({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMaintenanceVersions": [],
    *       //   "backendType": "my_backendType",
    *       //   "connectionName": "my_connectionName",
    *       //   "createTime": "my_createTime",
    *       //   "currentDiskSize": "my_currentDiskSize",
    *       //   "databaseInstalledVersion": "my_databaseInstalledVersion",
    *       //   "databaseVersion": "my_databaseVersion",
    *       //   "diskEncryptionConfiguration": {},
    *       //   "diskEncryptionStatus": {},
    *       //   "etag": "my_etag",
    *       //   "failoverReplica": {},
    *       //   "gceZone": "my_gceZone",
    *       //   "instanceType": "my_instanceType",
    *       //   "ipAddresses": [],
    *       //   "ipv6Address": "my_ipv6Address",
    *       //   "kind": "my_kind",
    *       //   "maintenanceVersion": "my_maintenanceVersion",
    *       //   "masterInstanceName": "my_masterInstanceName",
    *       //   "maxDiskSize": "my_maxDiskSize",
    *       //   "name": "my_name",
    *       //   "onPremisesConfiguration": {},
    *       //   "outOfDiskReport": {},
    *       //   "project": "my_project",
    *       //   "region": "my_region",
    *       //   "replicaConfiguration": {},
    *       //   "replicaNames": [],
    *       //   "rootPassword": "my_rootPassword",
    *       //   "satisfiesPzs": false,
    *       //   "scheduledMaintenance": {},
    *       //   "secondaryGceZone": "my_secondaryGceZone",
    *       //   "selfLink": "my_selfLink",
    *       //   "serverCaCert": {},
    *       //   "serviceAccountEmailAddress": "my_serviceAccountEmailAddress",
    *       //   "settings": {},
    *       //   "state": "my_state",
    *       //   "suspensionReason": []
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
  def patch(params: ParamsResourceInstancesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceInstancesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def promoteReplica(): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def promoteReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def promoteReplica(
    params: ParamsResourceInstancesPromotereplica,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(
    params: ParamsResourceInstancesPromotereplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Promotes the read replica instance to be a stand-alone Cloud SQL instance. Using this operation might cause your instance to restart.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.promoteReplica({
    *     // Cloud SQL read replica instance name.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the read replica.
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
  def promoteReplica(params: ParamsResourceInstancesPromotereplica, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def promoteReplica(
    params: ParamsResourceInstancesPromotereplica,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetSslConfig(): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resetSslConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resetSslConfig(
    params: ParamsResourceInstancesResetsslconfig,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(
    params: ParamsResourceInstancesResetsslconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.resetSslConfig({
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
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resetSslConfig(
    params: ParamsResourceInstancesResetsslconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restart(): GaxiosPromise[SchemaOperation] = js.native
  def restart(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restart(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(params: ParamsResourceInstancesRestart): GaxiosPromise[SchemaOperation] = js.native
  def restart(params: ParamsResourceInstancesRestart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restart(
    params: ParamsResourceInstancesRestart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restart(params: ParamsResourceInstancesRestart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(
    params: ParamsResourceInstancesRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restarts a Cloud SQL instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.restart({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance to be restarted.
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
  def restart(params: ParamsResourceInstancesRestart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restart(
    params: ParamsResourceInstancesRestart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restoreBackup(): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restoreBackup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restoreBackup(
    params: ParamsResourceInstancesRestorebackup,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(
    params: ParamsResourceInstancesRestorebackup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Restores a backup of a Cloud SQL instance. Using this operation might cause your instance to restart.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.restoreBackup({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "restoreBackupContext": {}
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
  def restoreBackup(params: ParamsResourceInstancesRestorebackup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restoreBackup(
    params: ParamsResourceInstancesRestorebackup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rotateServerCa(): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rotateServerCa(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rotateServerCa(
    params: ParamsResourceInstancesRotateserverca,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(
    params: ParamsResourceInstancesRotateserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Rotates the server certificate to one signed by the Certificate Authority (CA) version previously added with the addServerCA method.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.rotateServerCa({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "rotateServerCaContext": {}
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
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rotateServerCa(
    params: ParamsResourceInstancesRotateserverca,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startReplica(): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startReplica(
    params: ParamsResourceInstancesStartreplica,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(
    params: ParamsResourceInstancesStartreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts the replication in the read replica instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.startReplica({
    *     // Cloud SQL read replica instance name.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the read replica.
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
  def startReplica(params: ParamsResourceInstancesStartreplica, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startReplica(
    params: ParamsResourceInstancesStartreplica,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stopReplica(): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stopReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stopReplica(
    params: ParamsResourceInstancesStopreplica,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(
    params: ParamsResourceInstancesStopreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Stops the replication in the read replica instance.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.stopReplica({
    *     // Cloud SQL read replica instance name.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the read replica.
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
  def stopReplica(params: ParamsResourceInstancesStopreplica, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stopReplica(
    params: ParamsResourceInstancesStopreplica,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def truncateLog(): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def truncateLog(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def truncateLog(
    params: ParamsResourceInstancesTruncatelog,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(
    params: ParamsResourceInstancesTruncatelog,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Truncate MySQL general and slow query log tables MySQL only.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.truncateLog({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the Cloud SQL project.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "truncateLogContext": {}
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
  def truncateLog(params: ParamsResourceInstancesTruncatelog, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def truncateLog(
    params: ParamsResourceInstancesTruncatelog,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceInstancesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceInstancesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceInstancesUpdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceInstancesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceInstancesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates settings of a Cloud SQL instance. Using this operation might cause your instance to restart.
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
    * const sqladmin = google.sqladmin('v1beta4');
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
    *   const res = await sql.instances.update({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "availableMaintenanceVersions": [],
    *       //   "backendType": "my_backendType",
    *       //   "connectionName": "my_connectionName",
    *       //   "createTime": "my_createTime",
    *       //   "currentDiskSize": "my_currentDiskSize",
    *       //   "databaseInstalledVersion": "my_databaseInstalledVersion",
    *       //   "databaseVersion": "my_databaseVersion",
    *       //   "diskEncryptionConfiguration": {},
    *       //   "diskEncryptionStatus": {},
    *       //   "etag": "my_etag",
    *       //   "failoverReplica": {},
    *       //   "gceZone": "my_gceZone",
    *       //   "instanceType": "my_instanceType",
    *       //   "ipAddresses": [],
    *       //   "ipv6Address": "my_ipv6Address",
    *       //   "kind": "my_kind",
    *       //   "maintenanceVersion": "my_maintenanceVersion",
    *       //   "masterInstanceName": "my_masterInstanceName",
    *       //   "maxDiskSize": "my_maxDiskSize",
    *       //   "name": "my_name",
    *       //   "onPremisesConfiguration": {},
    *       //   "outOfDiskReport": {},
    *       //   "project": "my_project",
    *       //   "region": "my_region",
    *       //   "replicaConfiguration": {},
    *       //   "replicaNames": [],
    *       //   "rootPassword": "my_rootPassword",
    *       //   "satisfiesPzs": false,
    *       //   "scheduledMaintenance": {},
    *       //   "secondaryGceZone": "my_secondaryGceZone",
    *       //   "selfLink": "my_selfLink",
    *       //   "serverCaCert": {},
    *       //   "serviceAccountEmailAddress": "my_serviceAccountEmailAddress",
    *       //   "settings": {},
    *       //   "state": "my_state",
    *       //   "suspensionReason": []
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
  def update(params: ParamsResourceInstancesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceInstancesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

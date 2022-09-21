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

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Projects$Instances")
@js.native
open class ResourceProjectsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def rescheduleMaintenance(): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rescheduleMaintenance(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(params: ParamsResourceProjectsInstancesReschedulemaintenance): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsInstancesReschedulemaintenance,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsInstancesReschedulemaintenance,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rescheduleMaintenance(params: ParamsResourceProjectsInstancesReschedulemaintenance, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsInstancesReschedulemaintenance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Reschedules the maintenance on the given instance.
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
    *   const res = await sql.projects.instances.rescheduleMaintenance({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "reschedule": {}
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
  def rescheduleMaintenance(params: ParamsResourceProjectsInstancesReschedulemaintenance, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsInstancesReschedulemaintenance,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startExternalSync(): GaxiosPromise[SchemaOperation] = js.native
  def startExternalSync(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startExternalSync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startExternalSync(params: ParamsResourceProjectsInstancesStartexternalsync): GaxiosPromise[SchemaOperation] = js.native
  def startExternalSync(
    params: ParamsResourceProjectsInstancesStartexternalsync,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startExternalSync(
    params: ParamsResourceProjectsInstancesStartexternalsync,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def startExternalSync(params: ParamsResourceProjectsInstancesStartexternalsync, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startExternalSync(
    params: ParamsResourceProjectsInstancesStartexternalsync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Start External primary instance migration.
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
    *   const res = await sql.projects.instances.startExternalSync({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mysqlSyncConfig": {},
    *       //   "skipVerification": false,
    *       //   "syncMode": "my_syncMode"
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
  def startExternalSync(params: ParamsResourceProjectsInstancesStartexternalsync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startExternalSync(
    params: ParamsResourceProjectsInstancesStartexternalsync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verifyExternalSyncSettings(): GaxiosPromise[SchemaSqlInstancesVerifyExternalSyncSettingsResponse] = js.native
  def verifyExternalSyncSettings(callback: BodyResponseCallback[SchemaSqlInstancesVerifyExternalSyncSettingsResponse]): Unit = js.native
  def verifyExternalSyncSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSqlInstancesVerifyExternalSyncSettingsResponse] = js.native
  def verifyExternalSyncSettings(params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings): GaxiosPromise[SchemaSqlInstancesVerifyExternalSyncSettingsResponse] = js.native
  def verifyExternalSyncSettings(
    params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings,
    callback: BodyResponseCallback[SchemaSqlInstancesVerifyExternalSyncSettingsResponse]
  ): Unit = js.native
  def verifyExternalSyncSettings(
    params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings,
    options: BodyResponseCallback[Readable | SchemaSqlInstancesVerifyExternalSyncSettingsResponse],
    callback: BodyResponseCallback[Readable | SchemaSqlInstancesVerifyExternalSyncSettingsResponse]
  ): Unit = js.native
  def verifyExternalSyncSettings(params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings, options: MethodOptions): GaxiosPromise[SchemaSqlInstancesVerifyExternalSyncSettingsResponse] = js.native
  def verifyExternalSyncSettings(
    params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSqlInstancesVerifyExternalSyncSettingsResponse]
  ): Unit = js.native
  /**
    * Verify External primary instance external sync settings.
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
    *   const res = await sql.projects.instances.verifyExternalSyncSettings({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mysqlSyncConfig": {},
    *       //   "syncMode": "my_syncMode",
    *       //   "verifyConnectionOnly": false,
    *       //   "verifyReplicationOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": [],
    *   //   "kind": "my_kind",
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
  def verifyExternalSyncSettings(params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyExternalSyncSettings(
    params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

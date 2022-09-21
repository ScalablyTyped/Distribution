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

@JSImport("googleapis/build/src/apis/sql/v1beta4", "sql_v1beta4.Resource$Projects$Instances")
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
    * sql.projects.instances.rescheduleMaintenance
    * @desc Reschedules the maintenance on the given instance.
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
    * @alias sql.projects.instances.rescheduleMaintenance
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project ID of the project that contains the instance.
    * @param {().SqlInstancesRescheduleMaintenanceRequestBody} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * sql.projects.instances.startExternalSync
    * @desc Start External master migration.
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
    *   const res = await sql.projects.instances.startExternalSync({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *     // External sync mode
    *     syncMode: 'placeholder-value',
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
    * @alias sql.projects.instances.startExternalSync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project ID of the project that contains the instance.
    * @param {string=} params.syncMode External sync mode
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * sql.projects.instances.verifyExternalSyncSettings
    * @desc Verify External master external sync settings.
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
    *   const res = await sql.projects.instances.verifyExternalSyncSettings({
    *     // Cloud SQL instance ID. This does not include the project ID.
    *     instance: 'placeholder-value',
    *     // Project ID of the project that contains the instance.
    *     project: 'placeholder-value',
    *     // External sync mode
    *     syncMode: 'placeholder-value',
    *     // Flag to enable verifying connection only
    *     verifyConnectionOnly: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": [],
    *   //   "kind": "my_kind"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias sql.projects.instances.verifyExternalSyncSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {string=} params.syncMode External sync mode
    * @param {boolean=} params.verifyConnectionOnly Flag to enable verifying connection only
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verifyExternalSyncSettings(params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verifyExternalSyncSettings(
    params: ParamsResourceProjectsInstancesVerifyexternalsyncsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

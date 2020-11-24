package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Backupruns")
@js.native
class ResourceBackupruns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sql.backupRuns.delete
    * @desc Deletes the backup taken by a backup run.
    * @alias sql.backupRuns.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the Backup Run to delete. To find a Backup Run ID, use the list method.
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackuprunsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackuprunsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackuprunsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackuprunsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackuprunsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.backupRuns.get
    * @desc Retrieves a resource containing information about a backup run.
    * @alias sql.backupRuns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of this Backup Run.
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBackupRun] = js.native
  def get(callback: BodyResponseCallback[SchemaBackupRun]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackupRun] = js.native
  def get(params: ParamsResourceBackuprunsGet): GaxiosPromise[SchemaBackupRun] = js.native
  def get(params: ParamsResourceBackuprunsGet, callback: BodyResponseCallback[SchemaBackupRun]): Unit = js.native
  def get(
    params: ParamsResourceBackuprunsGet,
    options: BodyResponseCallback[SchemaBackupRun],
    callback: BodyResponseCallback[SchemaBackupRun]
  ): Unit = js.native
  def get(params: ParamsResourceBackuprunsGet, options: MethodOptions): GaxiosPromise[SchemaBackupRun] = js.native
  def get(
    params: ParamsResourceBackuprunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackupRun]
  ): Unit = js.native
  
  /**
    * sql.backupRuns.insert
    * @desc Creates a new backup run on demand. This method is applicable only
    * to Second Generation instances.
    * @alias sql.backupRuns.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().BackupRun} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackuprunsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackuprunsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackuprunsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackuprunsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackuprunsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.backupRuns.list
    * @desc Lists all backup runs associated with a given instance and
    * configuration in the reverse chronological order of the backup initiation
    * time.
    * @alias sql.backupRuns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {integer=} params.maxResults Maximum number of backup runs per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBackupRunsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(params: ParamsResourceBackuprunsList): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(params: ParamsResourceBackuprunsList, callback: BodyResponseCallback[SchemaBackupRunsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceBackuprunsList,
    options: BodyResponseCallback[SchemaBackupRunsListResponse],
    callback: BodyResponseCallback[SchemaBackupRunsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBackuprunsList, options: MethodOptions): GaxiosPromise[SchemaBackupRunsListResponse] = js.native
  def list(
    params: ParamsResourceBackuprunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackupRunsListResponse]
  ): Unit = js.native
}

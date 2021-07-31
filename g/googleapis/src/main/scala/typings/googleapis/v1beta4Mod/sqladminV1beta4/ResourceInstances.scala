package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Instances")
@js.native
class ResourceInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * sql.instances.addServerCa
    * @desc Add a new trusted Certificate Authority (CA) version for the
    * specified instance. Required to prepare for a certificate rotation. If a
    * CA version was previously added but never used in a certificate rotation,
    * this operation replaces that version. There cannot be more than one CA
    * version waiting to be rotated in.
    * @alias sql.instances.addServerCa
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addServerCa(): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addServerCa(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addServerCa(
    params: ParamsResourceInstancesAddserverca,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addServerCa(params: ParamsResourceInstancesAddserverca, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addServerCa(
    params: ParamsResourceInstancesAddserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  def clone(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceInstancesClone): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceInstancesClone, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(
    params: ParamsResourceInstancesClone,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def clone(params: ParamsResourceInstancesClone, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(
    params: ParamsResourceInstancesClone,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * sql.instances.delete
    * @desc Deletes a Cloud SQL instance.
    * @alias sql.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.demoteMaster
    * @desc Demotes the stand-alone instance to be a Cloud SQL read replica for
    * an external database server.
    * @alias sql.instances.demoteMaster
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance name.
    * @param {string} params.project ID of the project that contains the instance.
    * @param {().InstancesDemoteMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def demoteMaster(): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def demoteMaster(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def demoteMaster(
    params: ParamsResourceInstancesDemotemaster,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def demoteMaster(params: ParamsResourceInstancesDemotemaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def demoteMaster(
    params: ParamsResourceInstancesDemotemaster,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.export
    * @desc Exports data from a Cloud SQL instance to a Cloud Storage bucket as
    * a SQL dump or CSV file.
    * @alias sql.instances.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be exported.
    * @param {().InstancesExportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `export`(): GaxiosPromise[SchemaOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceInstancesExport): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceInstancesExport, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(
    params: ParamsResourceInstancesExport,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceInstancesExport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceInstancesExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.failover
    * @desc Failover the instance to its failover replica instance.
    * @alias sql.instances.failover
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {().InstancesFailoverRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def failover(): GaxiosPromise[SchemaOperation] = js.native
  def failover(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def failover(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(params: ParamsResourceInstancesFailover): GaxiosPromise[SchemaOperation] = js.native
  def failover(params: ParamsResourceInstancesFailover, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def failover(
    params: ParamsResourceInstancesFailover,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def failover(params: ParamsResourceInstancesFailover, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def failover(
    params: ParamsResourceInstancesFailover,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.get
    * @desc Retrieves a resource containing information about a Cloud SQL
    * instance.
    * @alias sql.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(params: ParamsResourceInstancesGet): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(params: ParamsResourceInstancesGet, callback: BodyResponseCallback[SchemaDatabaseInstance]): Unit = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: BodyResponseCallback[SchemaDatabaseInstance],
    callback: BodyResponseCallback[SchemaDatabaseInstance]
  ): Unit = js.native
  def get(params: ParamsResourceInstancesGet, options: MethodOptions): GaxiosPromise[SchemaDatabaseInstance] = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatabaseInstance]
  ): Unit = js.native
  
  /**
    * sql.instances.import
    * @desc Imports data into a Cloud SQL instance from a SQL dump or CSV file in
    * Cloud Storage.
    * @alias sql.instances.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesImportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceInstancesImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceInstancesImport, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(
    params: ParamsResourceInstancesImport,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceInstancesImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceInstancesImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.insert
    * @desc Creates a new Cloud SQL instance.
    * @alias sql.instances.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID of the project to which the newly created Cloud SQL instances should belong.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceInstancesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.list
    * @desc Lists instances under a given project in the alphabetical order of
    * the instance name.
    * @alias sql.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An expression for filtering the results of the request, such as by name or label.
    * @param {integer=} params.maxResults The maximum number of results to return per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project for which to list Cloud SQL instances.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInstancesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(params: ParamsResourceInstancesList): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(params: ParamsResourceInstancesList, callback: BodyResponseCallback[SchemaInstancesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: BodyResponseCallback[SchemaInstancesListResponse],
    callback: BodyResponseCallback[SchemaInstancesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInstancesList, options: MethodOptions): GaxiosPromise[SchemaInstancesListResponse] = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstancesListResponse]
  ): Unit = js.native
  
  /**
    * sql.instances.listServerCas
    * @desc Lists all of the trusted Certificate Authorities (CAs) for the
    * specified instance. There can be up to three CAs listed: the CA that was
    * used to sign the certificate that is currently in use, a CA that has been
    * added but not yet used to sign a certificate, and a CA used to sign a
    * certificate that has previously rotated out.
    * @alias sql.instances.listServerCas
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaInstancesListServerCasResponse],
    callback: BodyResponseCallback[SchemaInstancesListServerCasResponse]
  ): Unit = js.native
  def listServerCas(params: ParamsResourceInstancesListservercas, options: MethodOptions): GaxiosPromise[SchemaInstancesListServerCasResponse] = js.native
  def listServerCas(
    params: ParamsResourceInstancesListservercas,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstancesListServerCasResponse]
  ): Unit = js.native
  
  /**
    * sql.instances.patch
    * @desc Updates settings of a Cloud SQL instance. Caution: This is not a
    * partial update, so you must include values for all the settings that you
    * want to retain. For partial updates, use patch.. This method supports
    * patch semantics.
    * @alias sql.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceInstancesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.promoteReplica
    * @desc Promotes the read replica instance to be a stand-alone Cloud SQL
    * instance.
    * @alias sql.instances.promoteReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def promoteReplica(): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def promoteReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def promoteReplica(
    params: ParamsResourceInstancesPromotereplica,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def promoteReplica(params: ParamsResourceInstancesPromotereplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def promoteReplica(
    params: ParamsResourceInstancesPromotereplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.resetSslConfig
    * @desc Deletes all client certificates and generates a new server SSL
    * certificate for the instance.
    * @alias sql.instances.resetSslConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetSslConfig(): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resetSslConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resetSslConfig(
    params: ParamsResourceInstancesResetsslconfig,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resetSslConfig(params: ParamsResourceInstancesResetsslconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resetSslConfig(
    params: ParamsResourceInstancesResetsslconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.restart
    * @desc Restarts a Cloud SQL instance.
    * @alias sql.instances.restart
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be restarted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restart(): GaxiosPromise[SchemaOperation] = js.native
  def restart(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restart(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(params: ParamsResourceInstancesRestart): GaxiosPromise[SchemaOperation] = js.native
  def restart(params: ParamsResourceInstancesRestart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restart(
    params: ParamsResourceInstancesRestart,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restart(params: ParamsResourceInstancesRestart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restart(
    params: ParamsResourceInstancesRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.restoreBackup
    * @desc Restores a backup of a Cloud SQL instance.
    * @alias sql.instances.restoreBackup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesRestoreBackupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restoreBackup(): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restoreBackup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restoreBackup(
    params: ParamsResourceInstancesRestorebackup,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restoreBackup(params: ParamsResourceInstancesRestorebackup, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restoreBackup(
    params: ParamsResourceInstancesRestorebackup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.rotateServerCa
    * @desc Rotates the server certificate to one signed by the Certificate
    * Authority (CA) version previously added with the addServerCA method.
    * @alias sql.instances.rotateServerCa
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesRotateServerCaRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rotateServerCa(): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rotateServerCa(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rotateServerCa(
    params: ParamsResourceInstancesRotateserverca,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rotateServerCa(params: ParamsResourceInstancesRotateserverca, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rotateServerCa(
    params: ParamsResourceInstancesRotateserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.startReplica
    * @desc Starts the replication in the read replica instance.
    * @alias sql.instances.startReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startReplica(): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startReplica(
    params: ParamsResourceInstancesStartreplica,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startReplica(params: ParamsResourceInstancesStartreplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startReplica(
    params: ParamsResourceInstancesStartreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.stopReplica
    * @desc Stops the replication in the read replica instance.
    * @alias sql.instances.stopReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stopReplica(): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stopReplica(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stopReplica(
    params: ParamsResourceInstancesStopreplica,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stopReplica(params: ParamsResourceInstancesStopreplica, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stopReplica(
    params: ParamsResourceInstancesStopreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.truncateLog
    * @desc Truncate MySQL general and slow query log tables
    * @alias sql.instances.truncateLog
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the Cloud SQL project.
    * @param {().InstancesTruncateLogRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def truncateLog(): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def truncateLog(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def truncateLog(
    params: ParamsResourceInstancesTruncatelog,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def truncateLog(params: ParamsResourceInstancesTruncatelog, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def truncateLog(
    params: ParamsResourceInstancesTruncatelog,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.instances.update
    * @desc Updates settings of a Cloud SQL instance. Caution: This is not a
    * partial update, so you must include values for all the settings that you
    * want to retain. For partial updates, use patch.
    * @alias sql.instances.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceInstancesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceInstancesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceInstancesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceInstancesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceInstancesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

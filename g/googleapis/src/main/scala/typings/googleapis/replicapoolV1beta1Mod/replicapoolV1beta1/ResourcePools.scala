package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Resource$Pools")
@js.native
class ResourcePools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * replicapool.pools.delete
    * @desc Deletes a replica pool.
    * @alias replicapool.pools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().PoolsDeleteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoolsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoolsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePoolsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePoolsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoolsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * replicapool.pools.get
    * @desc Gets information about a single replica pool.
    * @alias replicapool.pools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPool] = js.native
  def get(callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def get(params: ParamsResourcePoolsGet): GaxiosPromise[SchemaPool] = js.native
  def get(params: ParamsResourcePoolsGet, callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def get(
    params: ParamsResourcePoolsGet,
    options: BodyResponseCallback[SchemaPool],
    callback: BodyResponseCallback[SchemaPool]
  ): Unit = js.native
  def get(params: ParamsResourcePoolsGet, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def get(params: ParamsResourcePoolsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  
  /**
    * replicapool.pools.insert
    * @desc Inserts a new replica pool.
    * @alias replicapool.pools.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().Pool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPool] = js.native
  def insert(callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def insert(params: ParamsResourcePoolsInsert): GaxiosPromise[SchemaPool] = js.native
  def insert(params: ParamsResourcePoolsInsert, callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def insert(
    params: ParamsResourcePoolsInsert,
    options: BodyResponseCallback[SchemaPool],
    callback: BodyResponseCallback[SchemaPool]
  ): Unit = js.native
  def insert(params: ParamsResourcePoolsInsert, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def insert(
    params: ParamsResourcePoolsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPool]
  ): Unit = js.native
  
  /**
    * replicapool.pools.list
    * @desc List all replica pools.
    * @alias replicapool.pools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum count of results to be returned. Acceptable values are 0 to 100, inclusive. (Default: 50)
    * @param {string=} params.pageToken Set this to the nextPageToken value returned by a previous list request to obtain the next page of results from the previous list request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPoolsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPoolsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoolsListResponse] = js.native
  def list(params: ParamsResourcePoolsList): GaxiosPromise[SchemaPoolsListResponse] = js.native
  def list(params: ParamsResourcePoolsList, callback: BodyResponseCallback[SchemaPoolsListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePoolsList,
    options: BodyResponseCallback[SchemaPoolsListResponse],
    callback: BodyResponseCallback[SchemaPoolsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePoolsList, options: MethodOptions): GaxiosPromise[SchemaPoolsListResponse] = js.native
  def list(
    params: ParamsResourcePoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoolsListResponse]
  ): Unit = js.native
  
  /**
    * replicapool.pools.resize
    * @desc Resize a pool. This is an asynchronous operation, and multiple
    * overlapping resize requests can be made. Replica Pools will use the
    * information from the last resize request.
    * @alias replicapool.pools.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.numReplicas The desired number of replicas to resize to. If this number is larger than the existing number of replicas, new replicas will be added. If the number is smaller, then existing replicas will be deleted.
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[SchemaPool] = js.native
  def resize(callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def resize(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def resize(params: ParamsResourcePoolsResize): GaxiosPromise[SchemaPool] = js.native
  def resize(params: ParamsResourcePoolsResize, callback: BodyResponseCallback[SchemaPool]): Unit = js.native
  def resize(
    params: ParamsResourcePoolsResize,
    options: BodyResponseCallback[SchemaPool],
    callback: BodyResponseCallback[SchemaPool]
  ): Unit = js.native
  def resize(params: ParamsResourcePoolsResize, options: MethodOptions): GaxiosPromise[SchemaPool] = js.native
  def resize(
    params: ParamsResourcePoolsResize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPool]
  ): Unit = js.native
  
  /**
    * replicapool.pools.updatetemplate
    * @desc Update the template used by the pool.
    * @alias replicapool.pools.updatetemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatetemplate(): GaxiosPromise[Unit] = js.native
  def updatetemplate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def updatetemplate(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updatetemplate(params: ParamsResourcePoolsUpdatetemplate): GaxiosPromise[Unit] = js.native
  def updatetemplate(params: ParamsResourcePoolsUpdatetemplate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def updatetemplate(
    params: ParamsResourcePoolsUpdatetemplate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updatetemplate(params: ParamsResourcePoolsUpdatetemplate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updatetemplate(
    params: ParamsResourcePoolsUpdatetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

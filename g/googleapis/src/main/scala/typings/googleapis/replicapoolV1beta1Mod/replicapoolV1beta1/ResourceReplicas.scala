package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Resource$Replicas")
@js.native
class ResourceReplicas protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * replicapool.replicas.delete
    * @desc Deletes a replica from the pool.
    * @alias replicapool.replicas.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {().ReplicasDeleteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaReplica] = js.native
  def delete(callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def delete(params: ParamsResourceReplicasDelete): GaxiosPromise[SchemaReplica] = js.native
  def delete(params: ParamsResourceReplicasDelete, callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def delete(
    params: ParamsResourceReplicasDelete,
    options: BodyResponseCallback[SchemaReplica],
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
  def delete(params: ParamsResourceReplicasDelete, options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def delete(
    params: ParamsResourceReplicasDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
  /**
    * replicapool.replicas.get
    * @desc Gets information about a specific replica.
    * @alias replicapool.replicas.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReplica] = js.native
  def get(callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def get(params: ParamsResourceReplicasGet): GaxiosPromise[SchemaReplica] = js.native
  def get(params: ParamsResourceReplicasGet, callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def get(
    params: ParamsResourceReplicasGet,
    options: BodyResponseCallback[SchemaReplica],
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
  def get(params: ParamsResourceReplicasGet, options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def get(
    params: ParamsResourceReplicasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
  /**
    * replicapool.replicas.list
    * @desc Lists all replicas in a pool.
    * @alias replicapool.replicas.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum count of results to be returned. Acceptable values are 0 to 100, inclusive. (Default: 50)
    * @param {string=} params.pageToken Set this to the nextPageToken value returned by a previous list request to obtain the next page of results from the previous list request.
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.zone The zone where the replica pool lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaReplicasListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaReplicasListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReplicasListResponse] = js.native
  def list(params: ParamsResourceReplicasList): GaxiosPromise[SchemaReplicasListResponse] = js.native
  def list(params: ParamsResourceReplicasList, callback: BodyResponseCallback[SchemaReplicasListResponse]): Unit = js.native
  def list(
    params: ParamsResourceReplicasList,
    options: BodyResponseCallback[SchemaReplicasListResponse],
    callback: BodyResponseCallback[SchemaReplicasListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReplicasList, options: MethodOptions): GaxiosPromise[SchemaReplicasListResponse] = js.native
  def list(
    params: ParamsResourceReplicasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplicasListResponse]
  ): Unit = js.native
  /**
    * replicapool.replicas.restart
    * @desc Restarts a replica in a pool.
    * @alias replicapool.replicas.restart
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restart(): GaxiosPromise[SchemaReplica] = js.native
  def restart(callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def restart(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def restart(params: ParamsResourceReplicasRestart): GaxiosPromise[SchemaReplica] = js.native
  def restart(params: ParamsResourceReplicasRestart, callback: BodyResponseCallback[SchemaReplica]): Unit = js.native
  def restart(
    params: ParamsResourceReplicasRestart,
    options: BodyResponseCallback[SchemaReplica],
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
  def restart(params: ParamsResourceReplicasRestart, options: MethodOptions): GaxiosPromise[SchemaReplica] = js.native
  def restart(
    params: ParamsResourceReplicasRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplica]
  ): Unit = js.native
}


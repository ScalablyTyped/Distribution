package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Locations$Clusters$Nodepools")
@js.native
class ResourceProjectsLocationsClustersNodepools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.create
    * @desc Creates a node pool for a cluster.
    * @alias container.projects.locations.clusters.nodePools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project, location, cluster id) where the node pool will be created. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().CreateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsClustersNodepoolsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsClustersNodepoolsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersNodepoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.delete
    * @desc Deletes a node pool from a cluster.
    * @alias container.projects.locations.clusters.nodePools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string=} params.nodePoolId Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersNodepoolsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersNodepoolsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersNodepoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.get
    * @desc Retrieves the node pool requested.
    * @alias container.projects.locations.clusters.nodePools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string=} params.nodePoolId Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNodePool] = js.native
  def get(callback: BodyResponseCallback[SchemaNodePool]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersNodepoolsGet): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    options: BodyResponseCallback[SchemaNodePool],
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsClustersNodepoolsGet, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersNodepoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.list
    * @desc Lists the node pools for a cluster.
    * @alias container.projects.locations.clusters.nodePools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string} params.parent The parent (project, location, cluster id) where the node pools will be listed. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodePoolsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsClustersNodepoolsList): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    options: BodyResponseCallback[SchemaListNodePoolsResponse],
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsClustersNodepoolsList, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersNodepoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.rollback
    * @desc Roll back the previously Aborted or Failed NodePool upgrade. This
    * will be an no-op if the last upgrade successfully completed.
    * @alias container.projects.locations.clusters.nodePools.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node poll to rollback upgrade. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().RollbackNodePoolUpgradeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[SchemaOperation] = js.native
  def rollback(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rollback(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(params: ParamsResourceProjectsLocationsClustersNodepoolsRollback): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsLocationsClustersNodepoolsRollback, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsClustersNodepoolsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.setAutoscaling
    * @desc Sets the autoscaling settings of a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.setAutoscaling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool) of the node pool to set autoscaler settings. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolAutoscalingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAutoscaling(): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAutoscaling(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoscaling(params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscaling(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetautoscaling,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.setManagement
    * @desc Sets the NodeManagement options for a node pool.
    * @alias container.projects.locations.clusters.nodePools.setManagement
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to set management properties. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolManagementRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setManagement(): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setManagement(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetmanagement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.setSize
    * @desc Sets the size for a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.setSize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to set size. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolSizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSize(): GaxiosPromise[SchemaOperation] = js.native
  def setSize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsLocationsClustersNodepoolsSetsize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * container.projects.locations.clusters.nodePools.update
    * @desc Updates the version and/or image type of a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool) of the node pool to update. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().UpdateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersNodepoolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

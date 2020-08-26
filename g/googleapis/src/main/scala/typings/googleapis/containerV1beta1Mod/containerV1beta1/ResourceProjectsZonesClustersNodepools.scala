package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Zones$Clusters$Nodepools")
@js.native
class ResourceProjectsZonesClustersNodepools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.zones.clusters.nodePools.autoscaling
    * @desc Sets the autoscaling settings of a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.autoscaling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolAutoscalingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def autoscaling(): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def autoscaling(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def autoscaling(params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def autoscaling(
    params: ParamsResourceProjectsZonesClustersNodepoolsAutoscaling,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.create
    * @desc Creates a node pool for a cluster.
    * @alias container.projects.zones.clusters.nodePools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {().CreateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersNodepoolsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsZonesClustersNodepoolsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersNodepoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.delete
    * @desc Deletes a node pool from a cluster.
    * @alias container.projects.zones.clusters.nodePools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersNodepoolsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsZonesClustersNodepoolsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersNodepoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.get
    * @desc Retrieves the node pool requested.
    * @alias container.projects.zones.clusters.nodePools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNodePool] = js.native
  def get(callback: BodyResponseCallback[SchemaNodePool]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(params: ParamsResourceProjectsZonesClustersNodepoolsGet): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    options: BodyResponseCallback[SchemaNodePool],
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsZonesClustersNodepoolsGet, options: MethodOptions): GaxiosPromise[SchemaNodePool] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersNodepoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodePool]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.list
    * @desc Lists the node pools for a cluster.
    * @alias container.projects.zones.clusters.nodePools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string=} params.parent The parent (project, location, cluster id) where the node pools will be listed. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodePoolsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(params: ParamsResourceProjectsZonesClustersNodepoolsList): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    options: BodyResponseCallback[SchemaListNodePoolsResponse],
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsZonesClustersNodepoolsList, options: MethodOptions): GaxiosPromise[SchemaListNodePoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersNodepoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNodePoolsResponse]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.rollback
    * @desc Roll back the previously Aborted or Failed NodePool upgrade. This
    * will be an no-op if the last upgrade successfully completed.
    * @alias container.projects.zones.clusters.nodePools.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().RollbackNodePoolUpgradeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[SchemaOperation] = js.native
  def rollback(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rollback(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(params: ParamsResourceProjectsZonesClustersNodepoolsRollback): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsZonesClustersNodepoolsRollback, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsZonesClustersNodepoolsRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.setManagement
    * @desc Sets the NodeManagement options for a node pool.
    * @alias container.projects.zones.clusters.nodePools.setManagement
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolManagementRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setManagement(): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setManagement(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setManagement(params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setManagement(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetmanagement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.setSize
    * @desc Sets the size for a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.setSize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolSizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSize(): GaxiosPromise[SchemaOperation] = js.native
  def setSize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(params: ParamsResourceProjectsZonesClustersNodepoolsSetsize): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSize(params: ParamsResourceProjectsZonesClustersNodepoolsSetsize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSize(
    params: ParamsResourceProjectsZonesClustersNodepoolsSetsize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.update
    * @desc Updates the version and/or image type of a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersNodepoolsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsZonesClustersNodepoolsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersNodepoolsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}


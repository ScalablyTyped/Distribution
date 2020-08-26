package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Zones$Clusters")
@js.native
class ResourceProjectsZonesClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var nodePools: ResourceProjectsZonesClustersNodepools = js.native
  /**
    * container.projects.zones.clusters.addons
    * @desc Sets the addons for a specific cluster.
    * @alias container.projects.zones.clusters.addons
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetAddonsConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addons(): GaxiosPromise[SchemaOperation] = js.native
  def addons(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addons(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons): GaxiosPromise[SchemaOperation] = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addons(
    params: ParamsResourceProjectsZonesClustersAddons,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addons(params: ParamsResourceProjectsZonesClustersAddons, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addons(
    params: ParamsResourceProjectsZonesClustersAddons,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.completeIpRotation
    * @desc Completes master IP rotation.
    * @alias container.projects.zones.clusters.completeIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().CompleteIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def completeIpRotation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(params: ParamsResourceProjectsZonesClustersCompleteiprotation): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(params: ParamsResourceProjectsZonesClustersCompleteiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsZonesClustersCompleteiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.create
    * @desc Creates a cluster, consisting of the specified number and type of
    * Google Compute Engine instances.  By default, the cluster is created in
    * the project's [default
    * network](/compute/docs/networks-and-firewalls#networks).  One firewall is
    * added for the cluster. After cluster creation, the cluster creates routes
    * for each node to allow the containers on that node to communicate with
    * all other instances in the cluster.  Finally, an entry is added to the
    * project's global metadata indicating which CIDR range is being used by
    * the cluster.
    * @alias container.projects.zones.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {().CreateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsZonesClustersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsZonesClustersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.delete
    * @desc Deletes the cluster, including the Kubernetes endpoint and all
    * worker nodes.  Firewalls and routes that were configured during cluster
    * creation are also deleted.  Other Google Compute Engine resources that
    * might be in use by the cluster (e.g. load balancer resources) will not be
    * deleted if they weren't present at the initial create time.
    * @alias container.projects.zones.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster) of the cluster to delete. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsZonesClustersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsZonesClustersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.get
    * @desc Gets the details for a specific cluster.
    * @alias container.projects.zones.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster) of the cluster to retrieve. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet, callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersGet,
    options: BodyResponseCallback[SchemaCluster],
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsZonesClustersGet, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(
    params: ParamsResourceProjectsZonesClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.legacyAbac
    * @desc Enables or disables the ABAC authorization mechanism on a cluster.
    * @alias container.projects.zones.clusters.legacyAbac
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLegacyAbacRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def legacyAbac(): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def legacyAbac(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(params: ParamsResourceProjectsZonesClustersLegacyabac): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def legacyAbac(params: ParamsResourceProjectsZonesClustersLegacyabac, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def legacyAbac(
    params: ParamsResourceProjectsZonesClustersLegacyabac,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.list
    * @desc Lists all clusters owned by a project in either the specified zone
    * or all zones.
    * @alias container.projects.zones.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The parent (project and location) where the clusters will be listed. Specified in the format 'projects/x/locations/x'. Location "-" matches all zones and all regions.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides, or "-" for all zones. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClustersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(params: ParamsResourceProjectsZonesClustersList): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    options: BodyResponseCallback[SchemaListClustersResponse],
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsZonesClustersList, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.locations
    * @desc Sets the locations for a specific cluster.
    * @alias container.projects.zones.clusters.locations
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLocationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def locations(): GaxiosPromise[SchemaOperation] = js.native
  def locations(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def locations(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def locations(params: ParamsResourceProjectsZonesClustersLocations): GaxiosPromise[SchemaOperation] = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def locations(params: ParamsResourceProjectsZonesClustersLocations, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def locations(
    params: ParamsResourceProjectsZonesClustersLocations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.logging
    * @desc Sets the logging service for a specific cluster.
    * @alias container.projects.zones.clusters.logging
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLoggingServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def logging(): GaxiosPromise[SchemaOperation] = js.native
  def logging(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def logging(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def logging(params: ParamsResourceProjectsZonesClustersLogging): GaxiosPromise[SchemaOperation] = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def logging(params: ParamsResourceProjectsZonesClustersLogging, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def logging(
    params: ParamsResourceProjectsZonesClustersLogging,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.master
    * @desc Updates the master for a specific cluster.
    * @alias container.projects.zones.clusters.master
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def master(): GaxiosPromise[SchemaOperation] = js.native
  def master(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def master(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster): GaxiosPromise[SchemaOperation] = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def master(
    params: ParamsResourceProjectsZonesClustersMaster,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def master(params: ParamsResourceProjectsZonesClustersMaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def master(
    params: ParamsResourceProjectsZonesClustersMaster,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.monitoring
    * @desc Sets the monitoring service for a specific cluster.
    * @alias container.projects.zones.clusters.monitoring
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetMonitoringServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def monitoring(): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def monitoring(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(params: ParamsResourceProjectsZonesClustersMonitoring): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def monitoring(params: ParamsResourceProjectsZonesClustersMonitoring, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def monitoring(
    params: ParamsResourceProjectsZonesClustersMonitoring,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.resourceLabels
    * @desc Sets labels on a cluster.
    * @alias container.projects.zones.clusters.resourceLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resourceLabels(): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resourceLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(params: ParamsResourceProjectsZonesClustersResourcelabels): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resourceLabels(params: ParamsResourceProjectsZonesClustersResourcelabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resourceLabels(
    params: ParamsResourceProjectsZonesClustersResourcelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setMaintenancePolicy
    * @desc Sets the maintenance policy for a cluster.
    * @alias container.projects.zones.clusters.setMaintenancePolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The name of the cluster to update.
    * @param {string} params.projectId The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840).
    * @param {string} params.zone The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides.
    * @param {().SetMaintenancePolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMaintenancePolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMaintenancePolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsZonesClustersSetmaintenancepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setMasterAuth
    * @desc Used to set master auth materials. Currently supports :- Changing
    * the admin password for a specific cluster. This can be either via
    * password generation or explicitly set. Modify basic_auth.csv and reset
    * the K8S API server.
    * @alias container.projects.zones.clusters.setMasterAuth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetMasterAuthRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMasterAuth(): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMasterAuth(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(params: ParamsResourceProjectsZonesClustersSetmasterauth): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(params: ParamsResourceProjectsZonesClustersSetmasterauth, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsZonesClustersSetmasterauth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setNetworkPolicy
    * @desc Enables/Disables Network Policy for a cluster.
    * @alias container.projects.zones.clusters.setNetworkPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNetworkPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNetworkPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNetworkPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsZonesClustersSetnetworkpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsZonesClustersSetnetworkpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsZonesClustersSetnetworkpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.startIpRotation
    * @desc Start master IP rotation.
    * @alias container.projects.zones.clusters.startIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().StartIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startIpRotation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(params: ParamsResourceProjectsZonesClustersStartiprotation): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(params: ParamsResourceProjectsZonesClustersStartiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsZonesClustersStartiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.update
    * @desc Updates the settings for a specific cluster.
    * @alias container.projects.zones.clusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsZonesClustersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsZonesClustersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}


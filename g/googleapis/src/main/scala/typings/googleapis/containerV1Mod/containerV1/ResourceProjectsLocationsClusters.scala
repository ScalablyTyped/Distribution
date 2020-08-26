package typings.googleapis.containerV1Mod.containerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters")
@js.native
class ResourceProjectsLocationsClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var nodePools: ResourceProjectsLocationsClustersNodepools = js.native
  var wellKnown: ResourceProjectsLocationsClustersWellKnown = js.native
  /**
    * container.projects.locations.clusters.completeIpRotation
    * @desc Completes master IP rotation.
    * @alias container.projects.locations.clusters.completeIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to complete IP rotation. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().CompleteIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def completeIpRotation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(params: ParamsResourceProjectsLocationsClustersCompleteiprotation): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def completeIpRotation(params: ParamsResourceProjectsLocationsClustersCompleteiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def completeIpRotation(
    params: ParamsResourceProjectsLocationsClustersCompleteiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.create
    * @desc Creates a cluster, consisting of the specified number and type of
    * Google Compute Engine instances.  By default, the cluster is created in
    * the project's [default
    * network](/compute/docs/networks-and-firewalls#networks).  One firewall is
    * added for the cluster. After cluster creation, the cluster creates routes
    * for each node to allow the containers on that node to communicate with
    * all other instances in the cluster.  Finally, an entry is added to the
    * project's global metadata indicating which CIDR range is being used by
    * the cluster.
    * @alias container.projects.locations.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project and location) where the cluster will be created. Specified in the format 'projects/x/locations/x'.
    * @param {().CreateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsClustersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsClustersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsClustersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.delete
    * @desc Deletes the cluster, including the Kubernetes endpoint and all
    * worker nodes.  Firewalls and routes that were configured during cluster
    * creation are also deleted.  Other Google Compute Engine resources that
    * might be in use by the cluster (e.g. load balancer resources) will not be
    * deleted if they weren't present at the initial create time.
    * @alias container.projects.locations.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster) of the cluster to delete. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsClustersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsClustersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.get
    * @desc Gets the details of a specific cluster.
    * @alias container.projects.locations.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster) of the cluster to retrieve. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet): GaxiosPromise[SchemaCluster] = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet, callback: BodyResponseCallback[SchemaCluster]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersGet,
    options: BodyResponseCallback[SchemaCluster],
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsClustersGet, options: MethodOptions): GaxiosPromise[SchemaCluster] = js.native
  def get(
    params: ParamsResourceProjectsLocationsClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCluster]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.getJwks
    * @desc GetJSONWebKeys gets the public component of the cluster signing
    * keys in JSON Web Key format. This API is not yet intended for general
    * use, and is not available for all clusters.
    * @alias container.projects.locations.clusters.getJwks
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The cluster (project, location, cluster id) to get keys for. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getJwks(): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]): Unit = js.native
  def getJwks(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(params: ParamsResourceProjectsLocationsClustersGetjwks): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    options: BodyResponseCallback[SchemaGetJSONWebKeysResponse],
    callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(params: ParamsResourceProjectsLocationsClustersGetjwks, options: MethodOptions): GaxiosPromise[SchemaGetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsResourceProjectsLocationsClustersGetjwks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetJSONWebKeysResponse]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.list
    * @desc Lists all clusters owned by a project in either the specified zone
    * or all zones.
    * @alias container.projects.locations.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project and location) where the clusters will be listed. Specified in the format 'projects/x/locations/x'. Location "-" matches all zones and all regions.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides, or "-" for all zones. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClustersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsClustersList): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    options: BodyResponseCallback[SchemaListClustersResponse],
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsClustersList, options: MethodOptions): GaxiosPromise[SchemaListClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClustersResponse]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setAddons
    * @desc Sets the addons for a specific cluster.
    * @alias container.projects.locations.clusters.setAddons
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set addons. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetAddonsConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAddons(): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAddons(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(params: ParamsResourceProjectsLocationsClustersSetaddons): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAddons(params: ParamsResourceProjectsLocationsClustersSetaddons, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAddons(
    params: ParamsResourceProjectsLocationsClustersSetaddons,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLegacyAbac
    * @desc Enables or disables the ABAC authorization mechanism on a cluster.
    * @alias container.projects.locations.clusters.setLegacyAbac
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set legacy abac. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLegacyAbacRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLegacyAbac(): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLegacyAbac(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(params: ParamsResourceProjectsLocationsClustersSetlegacyabac): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLegacyAbac(params: ParamsResourceProjectsLocationsClustersSetlegacyabac, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLegacyAbac(
    params: ParamsResourceProjectsLocationsClustersSetlegacyabac,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLocations
    * @desc Sets the locations for a specific cluster.
    * @alias container.projects.locations.clusters.setLocations
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set locations. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLocationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLocations(): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLocations(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(params: ParamsResourceProjectsLocationsClustersSetlocations): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLocations(params: ParamsResourceProjectsLocationsClustersSetlocations, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLocations(
    params: ParamsResourceProjectsLocationsClustersSetlocations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLogging
    * @desc Sets the logging service for a specific cluster.
    * @alias container.projects.locations.clusters.setLogging
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set logging. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLoggingServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLogging(): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLogging(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(params: ParamsResourceProjectsLocationsClustersSetlogging): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLogging(params: ParamsResourceProjectsLocationsClustersSetlogging, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLogging(
    params: ParamsResourceProjectsLocationsClustersSetlogging,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMaintenancePolicy
    * @desc Sets the maintenance policy for a cluster.
    * @alias container.projects.locations.clusters.setMaintenancePolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set maintenance policy. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMaintenancePolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMaintenancePolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMaintenancePolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMaintenancePolicy(params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMaintenancePolicy(
    params: ParamsResourceProjectsLocationsClustersSetmaintenancepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMasterAuth
    * @desc Used to set master auth materials. Currently supports :- Changing
    * the admin password for a specific cluster. This can be either via
    * password generation or explicitly set the password.
    * @alias container.projects.locations.clusters.setMasterAuth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set auth. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMasterAuthRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMasterAuth(): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMasterAuth(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(params: ParamsResourceProjectsLocationsClustersSetmasterauth): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMasterAuth(params: ParamsResourceProjectsLocationsClustersSetmasterauth, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMasterAuth(
    params: ParamsResourceProjectsLocationsClustersSetmasterauth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMonitoring
    * @desc Sets the monitoring service for a specific cluster.
    * @alias container.projects.locations.clusters.setMonitoring
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set monitoring. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMonitoringServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMonitoring(): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMonitoring(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(params: ParamsResourceProjectsLocationsClustersSetmonitoring): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMonitoring(params: ParamsResourceProjectsLocationsClustersSetmonitoring, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMonitoring(
    params: ParamsResourceProjectsLocationsClustersSetmonitoring,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setNetworkPolicy
    * @desc Enables/Disables Network Policy for a cluster.
    * @alias container.projects.locations.clusters.setNetworkPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set networking policy. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetNetworkPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNetworkPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNetworkPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNetworkPolicy(params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNetworkPolicy(
    params: ParamsResourceProjectsLocationsClustersSetnetworkpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setResourceLabels
    * @desc Sets labels on a cluster.
    * @alias container.projects.locations.clusters.setResourceLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set labels. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setResourceLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setResourceLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(params: ParamsResourceProjectsLocationsClustersSetresourcelabels): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setResourceLabels(params: ParamsResourceProjectsLocationsClustersSetresourcelabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setResourceLabels(
    params: ParamsResourceProjectsLocationsClustersSetresourcelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.startIpRotation
    * @desc Start master IP rotation.
    * @alias container.projects.locations.clusters.startIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to start IP rotation. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().StartIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startIpRotation(): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startIpRotation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(params: ParamsResourceProjectsLocationsClustersStartiprotation): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startIpRotation(params: ParamsResourceProjectsLocationsClustersStartiprotation, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startIpRotation(
    params: ParamsResourceProjectsLocationsClustersStartiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.update
    * @desc Updates the settings of a specific cluster.
    * @alias container.projects.locations.clusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to update. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().UpdateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceProjectsLocationsClustersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsClustersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceProjectsLocationsClustersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.updateMaster
    * @desc Updates the master for a specific cluster.
    * @alias container.projects.locations.clusters.updateMaster
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to update. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().UpdateMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateMaster(): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateMaster(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(params: ParamsResourceProjectsLocationsClustersUpdatemaster): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateMaster(params: ParamsResourceProjectsLocationsClustersUpdatemaster, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateMaster(
    params: ParamsResourceProjectsLocationsClustersUpdatemaster,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}


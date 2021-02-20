package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Clusters")
@js.native
class ResourceProjectsHistoriesExecutionsClusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * toolresults.projects.histories.executions.clusters.get
    * @desc Retrieves a single screenshot cluster by its ID
    * @alias toolresults.projects.histories.executions.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId A Cluster id  Required.
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaScreenshotCluster]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsClustersGet): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    callback: BodyResponseCallback[SchemaScreenshotCluster]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    options: BodyResponseCallback[SchemaScreenshotCluster],
    callback: BodyResponseCallback[SchemaScreenshotCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsClustersGet, options: MethodOptions): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScreenshotCluster]
  ): Unit = js.native
  
  /**
    * toolresults.projects.histories.executions.clusters.list
    * @desc Lists Screenshot Clusters  Returns the list of screenshot clusters
    * corresponding to an execution. Screenshot clusters are created after the
    * execution is finished. Clusters are created from a set of screenshots.
    * Between any two screenshots, a matching score is calculated based off
    * their metadata that determines how similar they are. Screenshots are
    * placed in the cluster that has screens which have the highest matching
    * scores.
    * @alias toolresults.projects.histories.executions.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsClustersList): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    options: BodyResponseCallback[SchemaListScreenshotClustersResponse],
    callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsClustersList, options: MethodOptions): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]
  ): Unit = js.native
}

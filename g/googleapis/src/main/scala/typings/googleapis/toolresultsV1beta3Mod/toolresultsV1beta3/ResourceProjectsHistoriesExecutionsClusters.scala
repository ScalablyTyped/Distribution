package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Clusters")
@js.native
open class ResourceProjectsHistoriesExecutionsClusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaScreenshotCluster]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsClustersGet): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    callback: BodyResponseCallback[SchemaScreenshotCluster]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    options: BodyResponseCallback[Readable | SchemaScreenshotCluster],
    callback: BodyResponseCallback[Readable | SchemaScreenshotCluster]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsClustersGet, options: MethodOptions): GaxiosPromise[SchemaScreenshotCluster] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScreenshotCluster]
  ): Unit = js.native
  /**
    * Retrieves a single screenshot cluster by its ID
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await toolresults.projects.histories.executions.clusters.get({
    *     // A Cluster id Required.
    *     clusterId: 'placeholder-value',
    *     // An Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activity": "my_activity",
    *   //   "clusterId": "my_clusterId",
    *   //   "keyScreen": {},
    *   //   "screens": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsHistoriesExecutionsClustersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsClustersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsClustersList): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    options: BodyResponseCallback[Readable | SchemaListScreenshotClustersResponse],
    callback: BodyResponseCallback[Readable | SchemaListScreenshotClustersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsClustersList, options: MethodOptions): GaxiosPromise[SchemaListScreenshotClustersResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScreenshotClustersResponse]
  ): Unit = js.native
  /**
    * Lists Screenshot Clusters Returns the list of screenshot clusters corresponding to an execution. Screenshot clusters are created after the execution is finished. Clusters are created from a set of screenshots. Between any two screenshots, a matching score is calculated based off their metadata that determines how similar they are. Screenshots are placed in the cluster that has screens which have the highest matching scores.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await toolresults.projects.histories.executions.clusters.list({
    *     // An Execution id. Required.
    *     executionId: 'placeholder-value',
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clusters": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsHistoriesExecutionsClustersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsClustersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

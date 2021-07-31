package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent")
@js.native
class ResourceProjectsAgent protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var entityTypes: ResourceProjectsAgentEntitytypes = js.native
  
  /**
    * dialogflow.projects.agent.export
    * @desc Exports the specified agent to a ZIP file.  Operation <response:
    * ExportAgentResponse>
    * @alias dialogflow.projects.agent.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to export is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2ExportAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsAgentExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsAgentExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsAgentExport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsAgentExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsAgentExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.import
    * @desc Imports the specified agent from a ZIP file.  Uploads new intents and
    * entity types without deleting the existing ones. Intents and entity types
    * with the same name are replaced with the new versions from
    * ImportAgentRequest.  Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to import is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2ImportAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsAgentImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsAgentImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsAgentImport,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsAgentImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsAgentImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  var intents: ResourceProjectsAgentIntents = js.native
  
  /**
    * dialogflow.projects.agent.restore
    * @desc Restores the specified agent from a ZIP file.  Replaces the current agent version with a new one. All the intents and entity types in the older version are deleted.  Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.restore
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to restore is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2RestoreAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restore(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(params: ParamsResourceProjectsAgentRestore): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsResourceProjectsAgentRestore,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsAgentRestore,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsAgentRestore, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsResourceProjectsAgentRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.search
    * @desc Returns the list of agents.  Since there is at most one
    * conversational agent per project, this method is useful primarily for
    * listing all agents across projects the caller has access to. One can
    * achieve that with a wildcard project collection id "-". Refer to [List
    * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
    * @alias dialogflow.projects.agent.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The project to list agents from. Format: `projects/<Project ID or '-'>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(params: ParamsResourceProjectsAgentSearch): GaxiosPromise[SchemaGoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(
    params: ParamsResourceProjectsAgentSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsAgentSearch,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SearchAgentsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsAgentSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(
    params: ParamsResourceProjectsAgentSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  
  var sessions: ResourceProjectsAgentSessions = js.native
  
  /**
    * dialogflow.projects.agent.train
    * @desc Trains the specified agent.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.train
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to train is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2TrainAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def train(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def train(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(params: ParamsResourceProjectsAgentTrain): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(
    params: ParamsResourceProjectsAgentTrain,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def train(
    params: ParamsResourceProjectsAgentTrain,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def train(params: ParamsResourceProjectsAgentTrain, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def train(
    params: ParamsResourceProjectsAgentTrain,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

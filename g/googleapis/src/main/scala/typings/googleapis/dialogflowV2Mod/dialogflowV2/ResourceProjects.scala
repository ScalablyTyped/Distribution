package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var agent: ResourceProjectsAgent = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * dialogflow.projects.getAgent
    * @desc Retrieves the specified agent.
    * @alias dialogflow.projects.getAgent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to fetch is associated with. Format: `projects/<Project ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]): Unit = js.native
  def getAgent(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(params: ParamsResourceProjectsGetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(params: ParamsResourceProjectsGetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  
  var operations: ResourceProjectsOperations = js.native
}

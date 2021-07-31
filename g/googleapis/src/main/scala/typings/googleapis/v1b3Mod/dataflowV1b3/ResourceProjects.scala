package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects")
@js.native
class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceProjectsJobs = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var templates: ResourceProjectsTemplates = js.native
  
  /**
    * dataflow.projects.workerMessages
    * @desc Send a worker_message to the service.
    * @alias dataflow.projects.workerMessages
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The project to send the WorkerMessages to.
    * @param {().SendWorkerMessagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def workerMessages(): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]): Unit = js.native
  def workerMessages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(params: ParamsResourceProjectsWorkermessages): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    options: BodyResponseCallback[SchemaSendWorkerMessagesResponse],
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
  def workerMessages(params: ParamsResourceProjectsWorkermessages, options: MethodOptions): GaxiosPromise[SchemaSendWorkerMessagesResponse] = js.native
  def workerMessages(
    params: ParamsResourceProjectsWorkermessages,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendWorkerMessagesResponse]
  ): Unit = js.native
}

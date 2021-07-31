package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Debug")
@js.native
class ResourceProjectsLocationsJobsDebug protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dataflow.projects.locations.jobs.debug.getConfig
    * @desc Get encoded debug configuration for component. Not cacheable.
    * @alias dataflow.projects.locations.jobs.debug.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId The project id.
    * @param {().GetDebugConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGetDebugConfigResponse]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(params: ParamsResourceProjectsLocationsJobsDebugGetconfig): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    options: BodyResponseCallback[SchemaGetDebugConfigResponse],
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsLocationsJobsDebugGetconfig, options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsLocationsJobsDebugGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  
  /**
    * dataflow.projects.locations.jobs.debug.sendCapture
    * @desc Send encoded debug capture data for component.
    * @alias dataflow.projects.locations.jobs.debug.sendCapture
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId The project id.
    * @param {().SendDebugCaptureRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendCapture(): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]): Unit = js.native
  def sendCapture(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(params: ParamsResourceProjectsLocationsJobsDebugSendcapture): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    options: BodyResponseCallback[SchemaSendDebugCaptureResponse],
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(params: ParamsResourceProjectsLocationsJobsDebugSendcapture, options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsLocationsJobsDebugSendcapture,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
}

package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Jobs$Debug")
@js.native
class ResourceProjectsJobsDebug protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.jobs.debug.getConfig
    * @desc Get encoded debug configuration for component. Not cacheable.
    * @alias dataflow.projects.jobs.debug.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.projectId The project id.
    * @param {().GetDebugConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGetDebugConfigResponse]): Unit = js.native
  def getConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(params: ParamsResourceProjectsJobsDebugGetconfig): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsJobsDebugGetconfig,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsJobsDebugGetconfig,
    options: BodyResponseCallback[SchemaGetDebugConfigResponse],
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsJobsDebugGetconfig, options: MethodOptions): GaxiosPromise[SchemaGetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsJobsDebugGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetDebugConfigResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.jobs.debug.sendCapture
    * @desc Send encoded debug capture data for component.
    * @alias dataflow.projects.jobs.debug.sendCapture
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.projectId The project id.
    * @param {().SendDebugCaptureRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendCapture(): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]): Unit = js.native
  def sendCapture(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(params: ParamsResourceProjectsJobsDebugSendcapture): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsJobsDebugSendcapture,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(
    params: ParamsResourceProjectsJobsDebugSendcapture,
    options: BodyResponseCallback[SchemaSendDebugCaptureResponse],
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(params: ParamsResourceProjectsJobsDebugSendcapture, options: MethodOptions): GaxiosPromise[SchemaSendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsResourceProjectsJobsDebugSendcapture,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendDebugCaptureResponse]
  ): Unit = js.native
}


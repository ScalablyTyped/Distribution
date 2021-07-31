package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces")
@js.native
class ResourceProjectsTraces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudtrace.projects.traces.batchWrite
    * @desc Sends new spans to new or existing traces. You cannot update
    * existing spans.
    * @alias cloudtrace.projects.traces.batchWrite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
    * @param {().BatchWriteSpansRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchWrite(): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var spans: ResourceProjectsTracesSpans = js.native
}

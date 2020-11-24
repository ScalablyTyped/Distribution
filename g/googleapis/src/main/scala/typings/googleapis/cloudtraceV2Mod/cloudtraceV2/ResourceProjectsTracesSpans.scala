package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces$Spans")
@js.native
class ResourceProjectsTracesSpans protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudtrace.projects.traces.spans.createSpan
    * @desc Creates a new span.
    * @alias cloudtrace.projects.traces.spans.createSpan
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the span in the following format:      projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array.  [SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array.
    * @param {().Span} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createSpan(): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(callback: BodyResponseCallback[SchemaSpan]): Unit = js.native
  def createSpan(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan, callback: BodyResponseCallback[SchemaSpan]): Unit = js.native
  def createSpan(
    params: ParamsResourceProjectsTracesSpansCreatespan,
    options: BodyResponseCallback[SchemaSpan],
    callback: BodyResponseCallback[SchemaSpan]
  ): Unit = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan, options: MethodOptions): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(
    params: ParamsResourceProjectsTracesSpansCreatespan,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpan]
  ): Unit = js.native
}

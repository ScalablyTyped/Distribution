package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces$Spans")
@js.native
open class ResourceProjectsTracesSpans protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createSpan(): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(callback: BodyResponseCallback[SchemaSpan]): Unit = js.native
  def createSpan(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan, callback: BodyResponseCallback[SchemaSpan]): Unit = js.native
  def createSpan(
    params: ParamsResourceProjectsTracesSpansCreatespan,
    options: BodyResponseCallback[Readable | SchemaSpan],
    callback: BodyResponseCallback[Readable | SchemaSpan]
  ): Unit = js.native
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan, options: MethodOptions): GaxiosPromise[SchemaSpan] = js.native
  def createSpan(
    params: ParamsResourceProjectsTracesSpansCreatespan,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpan]
  ): Unit = js.native
  /**
    * Creates a new span.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudtrace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudtrace = google.cloudtrace('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/trace.append',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudtrace.projects.traces.spans.createSpan({
    *     // Required. The resource name of the span in the following format: * `projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]` `[TRACE_ID]` is a unique identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array. It should not be zero. `[SPAN_ID]` is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array. It should not be zero. .
    *     name: 'projects/my-project/traces/my-trace/spans/my-span',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributes": {},
    *       //   "childSpanCount": 0,
    *       //   "displayName": {},
    *       //   "endTime": "my_endTime",
    *       //   "links": {},
    *       //   "name": "my_name",
    *       //   "parentSpanId": "my_parentSpanId",
    *       //   "sameProcessAsParentSpan": false,
    *       //   "spanId": "my_spanId",
    *       //   "spanKind": "my_spanKind",
    *       //   "stackTrace": {},
    *       //   "startTime": "my_startTime",
    *       //   "status": {},
    *       //   "timeEvents": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "childSpanCount": 0,
    *   //   "displayName": {},
    *   //   "endTime": "my_endTime",
    *   //   "links": {},
    *   //   "name": "my_name",
    *   //   "parentSpanId": "my_parentSpanId",
    *   //   "sameProcessAsParentSpan": false,
    *   //   "spanId": "my_spanId",
    *   //   "spanKind": "my_spanKind",
    *   //   "stackTrace": {},
    *   //   "startTime": "my_startTime",
    *   //   "status": {},
    *   //   "timeEvents": {}
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
  def createSpan(params: ParamsResourceProjectsTracesSpansCreatespan, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createSpan(
    params: ParamsResourceProjectsTracesSpansCreatespan,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

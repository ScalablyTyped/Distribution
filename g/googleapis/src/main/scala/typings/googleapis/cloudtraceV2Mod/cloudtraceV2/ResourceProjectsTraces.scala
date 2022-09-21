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

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces")
@js.native
open class ResourceProjectsTraces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchWrite(): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Batch writes new spans to new or existing traces. You cannot update existing spans.
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
    *   const res = await cloudtrace.projects.traces.batchWrite({
    *     // Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "spans": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var spans: ResourceProjectsTracesSpans = js.native
}

package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Actionresults")
@js.native
open class ResourceActionresults protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(params: ParamsResourceActionresultsGet): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(
    params: ParamsResourceActionresultsGet,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def get(
    params: ParamsResourceActionresultsGet,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ActionResult],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def get(params: ParamsResourceActionresultsGet, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(
    params: ParamsResourceActionresultsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  /**
    * Retrieve a cached execution result. Implementations SHOULD ensure that any blobs referenced from the ContentAddressableStorage are available at the time of returning the ActionResult and will be for some period of time afterwards. The lifetimes of the referenced blobs SHOULD be increased if necessary and applicable. Errors: * `NOT_FOUND`: The requested `ActionResult` is not in the cache.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.actionResults.get({
    *     // The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    *     hash: 'placeholder-value',
    *     // A hint to the server to inline the contents of the listed output files. Each path needs to exactly match one file path in either `output_paths` or `output_files` (DEPRECATED since v2.1) in the Command message.
    *     inlineOutputFiles: 'placeholder-value',
    *     // A hint to the server to request inlining stderr in the ActionResult message.
    *     inlineStderr: 'placeholder-value',
    *     // A hint to the server to request inlining stdout in the ActionResult message.
    *     inlineStdout: 'placeholder-value',
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *     // The size of the blob, in bytes.
    *     sizeBytes: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executionMetadata": {},
    *   //   "exitCode": 0,
    *   //   "outputDirectories": [],
    *   //   "outputDirectorySymlinks": [],
    *   //   "outputFileSymlinks": [],
    *   //   "outputFiles": [],
    *   //   "outputSymlinks": [],
    *   //   "stderrDigest": {},
    *   //   "stderrRaw": "my_stderrRaw",
    *   //   "stdoutDigest": {},
    *   //   "stdoutRaw": "my_stdoutRaw"
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
  def get(params: ParamsResourceActionresultsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceActionresultsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(params: ParamsResourceActionresultsUpdate): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(
    params: ParamsResourceActionresultsUpdate,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def update(
    params: ParamsResourceActionresultsUpdate,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ActionResult],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def update(params: ParamsResourceActionresultsUpdate, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(
    params: ParamsResourceActionresultsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  /**
    * Upload a new execution result. In order to allow the server to perform access control based on the type of action, and to assist with client debugging, the client MUST first upload the Action that produced the result, along with its Command, into the `ContentAddressableStorage`. Server implementations MAY modify the `UpdateActionResultRequest.action_result` and return an equivalent value. Errors: * `INVALID_ARGUMENT`: One or more arguments are invalid. * `FAILED_PRECONDITION`: One or more errors occurred in updating the action result, such as a missing command or action. * `RESOURCE_EXHAUSTED`: There is insufficient storage space to add the entry to the cache.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/remotebuildexecution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
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
    *   const res = await remotebuildexecution.actionResults.update({
    *     // The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    *     hash: 'placeholder-value',
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *     // The priority (relative importance) of this content in the overall cache. Generally, a lower value means a longer retention time or other advantage, but the interpretation of a given value is server-dependent. A priority of 0 means a *default* value, decided by the server. The particular semantics of this field is up to the server. In particular, every server will have their own supported range of priorities, and will decide how these map into retention/eviction policy.
    *     'resultsCachePolicy.priority': 'placeholder-value',
    *     // The size of the blob, in bytes.
    *     sizeBytes: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "executionMetadata": {},
    *       //   "exitCode": 0,
    *       //   "outputDirectories": [],
    *       //   "outputDirectorySymlinks": [],
    *       //   "outputFileSymlinks": [],
    *       //   "outputFiles": [],
    *       //   "outputSymlinks": [],
    *       //   "stderrDigest": {},
    *       //   "stderrRaw": "my_stderrRaw",
    *       //   "stdoutDigest": {},
    *       //   "stdoutRaw": "my_stdoutRaw"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executionMetadata": {},
    *   //   "exitCode": 0,
    *   //   "outputDirectories": [],
    *   //   "outputDirectorySymlinks": [],
    *   //   "outputFileSymlinks": [],
    *   //   "outputFiles": [],
    *   //   "outputSymlinks": [],
    *   //   "stderrDigest": {},
    *   //   "stderrRaw": "my_stderrRaw",
    *   //   "stdoutDigest": {},
    *   //   "stdoutRaw": "my_stdoutRaw"
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
  def update(params: ParamsResourceActionresultsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceActionresultsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

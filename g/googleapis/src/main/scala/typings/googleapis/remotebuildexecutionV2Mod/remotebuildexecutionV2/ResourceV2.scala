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

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$V2")
@js.native
open class ResourceV2 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getCapabilities(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]): Unit = js.native
  def getCapabilities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(params: ParamsResourceV2Getcapabilities): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    options: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ServerCapabilities],
    callback: BodyResponseCallback[Readable | SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(params: ParamsResourceV2Getcapabilities, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  /**
    * GetCapabilities returns the server capabilities configuration of the remote endpoint. Only the capabilities of the services supported by the endpoint will be returned: * Execution + CAS + Action Cache endpoints should return both CacheCapabilities and ExecutionCapabilities. * Execution only endpoints should return ExecutionCapabilities. * CAS + Action Cache only endpoints should return CacheCapabilities.
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
    *   const res = await remotebuildexecution.getCapabilities({
    *     // The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    *     instanceName: '.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cacheCapabilities": {},
    *   //   "deprecatedApiVersion": {},
    *   //   "executionCapabilities": {},
    *   //   "highApiVersion": {},
    *   //   "lowApiVersion": {}
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
  def getCapabilities(params: ParamsResourceV2Getcapabilities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}

package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$V2")
@js.native
class ResourceV2 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * remotebuildexecution.getCapabilities
    * @desc GetCapabilities returns the server capabilities configuration.
    * @alias remotebuildexecution.getCapabilities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getCapabilities(): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]): Unit = js.native
  def getCapabilities(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(params: ParamsResourceV2Getcapabilities): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    options: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities],
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(params: ParamsResourceV2Getcapabilities, options: MethodOptions): GaxiosPromise[SchemaBuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceV2Getcapabilities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
}

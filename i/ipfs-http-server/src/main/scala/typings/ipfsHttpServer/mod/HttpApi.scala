package typings.ipfsHttpServer.mod

import typings.ipfsHttpServer.anon.DebuggererrorDebugger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpApi extends js.Object {
  
  var _apiServers: js.UndefOr[js.Array[_]] = js.native
  
  def _createApiServer(host: js.Any, port: js.Any, ipfs: js.Any, cors: js.Any): js.Promise[_] = js.native
  
  var _ipfs: js.Any = js.native
  
  def _log(formatter: js.Any, args: js.Any*): Unit = js.native
  @JSName("_log")
  var _log_Original: DebuggererrorDebugger = js.native
  
  def apiAddr: typings.multiaddr.mod.^ = js.native
  
  /**
    * Starts the IPFS HTTP server
    *
    * @returns {Promise<HttpApi>}
    */
  def start(): js.Promise[HttpApi] = js.native
  
  def stop(): js.Promise[HttpApi] = js.native
}

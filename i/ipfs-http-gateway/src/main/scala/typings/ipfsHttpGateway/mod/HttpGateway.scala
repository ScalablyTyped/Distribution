package typings.ipfsHttpGateway.mod

import typings.ipfsHttpGateway.anon.DebuggererrorDebugger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpGateway extends js.Object {
  
  def _createGatewayServer(host: js.Any, port: js.Any, ipfs: js.Any): js.Promise[_] = js.native
  
  var _gatewayServers: js.UndefOr[js.Array[_]] = js.native
  
  var _ipfs: js.Any = js.native
  
  def _log(formatter: js.Any, args: js.Any*): Unit = js.native
  @JSName("_log")
  var _log_Original: DebuggererrorDebugger = js.native
  
  def start(): js.Promise[HttpGateway] = js.native
  
  def stop(): js.Promise[HttpGateway] = js.native
}

package typings.libp2p

import typings.libp2p.distSrcCircuitCircuitStreamHandlerMod.StreamHandler
import typings.libp2p.distSrcCircuitPbMod.CircuitRelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitCircuitUtilsMod {
  
  @JSImport("libp2p/dist/src/circuit/circuit/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateAddrs(msg: CircuitRelay, streamHandler: StreamHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAddrs")(msg.asInstanceOf[js.Any], streamHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

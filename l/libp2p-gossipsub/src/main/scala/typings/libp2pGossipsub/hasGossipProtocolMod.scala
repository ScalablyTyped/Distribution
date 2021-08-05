package typings.libp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasGossipProtocolMod {
  
  @JSImport("libp2p-gossipsub/src/utils/has-gossip-protocol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasGossipProtocol(protocol: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGossipProtocol")(protocol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

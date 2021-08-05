package typings.libp2pGossipsub

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGossipPeersMod {
  
  @JSImport("libp2p-gossipsub/src/get-gossip-peers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGossipPeers(router: typings.libp2pGossipsub.mod.^, topic: String, count: Double): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGossipPeers")(router.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
  inline def getGossipPeers(
    router: typings.libp2pGossipsub.mod.^,
    topic: String,
    count: Double,
    filter: js.Function1[/* id */ String, Boolean]
  ): Set[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGossipPeers")(router.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], count.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Set[String]]
}

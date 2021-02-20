package typings.libp2pGossipsub

import typings.libp2pGossipsub.mod.^
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGossipPeersMod {
  
  @JSImport("libp2p-gossipsub/src/get-gossip-peers", "getGossipPeers")
  @js.native
  def getGossipPeers(router: ^, topic: String, count: Double): Set[String] = js.native
  @JSImport("libp2p-gossipsub/src/get-gossip-peers", "getGossipPeers")
  @js.native
  def getGossipPeers(router: ^, topic: String, count: Double, filter: js.Function1[/* id */ String, Boolean]): Set[String] = js.native
}

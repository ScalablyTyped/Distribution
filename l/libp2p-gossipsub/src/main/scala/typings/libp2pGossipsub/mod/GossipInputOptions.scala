package typings.libp2pGossipsub.mod

import typings.libp2pGossipsub.anon.PartialPeerScoreParams
import typings.libp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.libp2pGossipsub.interfacesMod.AddrInfo
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.messageCacheMod.MessageCache
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GossipInputOptions extends js.Object {
  
  /**
    * D sets the optimal degree for a Gossipsub topic mesh.
    */
  var D: Double = js.native
  
  /**
    * Dhi sets the upper bound on the number of peers we keep in a Gossipsub topic mesh.
    */
  var Dhi: Double = js.native
  
  /**
    * Dlazy affects how many peers we will emit gossip to at each heartbeat.
    */
  var Dlazy: Double = js.native
  
  /**
    * Dlo sets the lower bound on the number of peers we keep in a Gossipsub topic mesh.
    */
  var Dlo: Double = js.native
  
  /**
    * Dout sets the quota for the number of outbound connections to maintain in a topic mesh.
    */
  var Dout: Double = js.native
  
  /**
    * Dscore affects how peers are selected when pruning a mesh due to over subscription.
    */
  var Dscore: Double = js.native
  
  var directPeers: js.Array[AddrInfo] = js.native
  
  var doPX: Boolean = js.native
  
  var emitSelf: Boolean = js.native
  
  var fallbackToFloodsub: Boolean = js.native
  
  var floodPublish: Boolean = js.native
  
  var globalSignaturePolicy: String = js.native
  
  var gossipIncoming: Boolean = js.native
  
  var messageCache: MessageCache = js.native
  
  def msgIdFn(msg: InMessage): Uint8Array = js.native
  @JSName("msgIdFn")
  var msgIdFn_Original: MessageIdFunction = js.native
  
  var scoreParams: PartialPeerScoreParams = js.native
  
  var scoreThresholds: PartialPeerScoreThreshold = js.native
}

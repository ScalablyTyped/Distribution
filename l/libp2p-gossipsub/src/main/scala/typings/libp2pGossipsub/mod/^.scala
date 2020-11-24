package typings.libp2pGossipsub.mod

import typings.libp2pGossipsub.anon.PartialGossipInputOptions
import typings.libp2pGossipsub.interfacesMod.Libp2p
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub", JSImport.Namespace)
@js.native
class ^ protected () extends Gossipsub {
  /**
    * @param {Libp2p} libp2p
    * @param {Object} [options]
    * @param {bool} [options.emitSelf] if publish should emit to self, if subscribed, defaults to false
    * @param {bool} [options.gossipIncoming] if incoming messages on a subscribed topic should be automatically gossiped, defaults to true
    * @param {bool} [options.fallbackToFloodsub] if dial should fallback to floodsub, defaults to true
    * @param {bool} [options.floodPublish] if self-published messages should be sent to all peers, defaults to true
    * @param {bool} [options.doPX] whether PX is enabled; this should be enabled in bootstrappers and other well connected/trusted nodes. defaults to false
    * @param {Object} [options.messageCache] override the default MessageCache
    * @param {string} [options.globalSignaturePolicy] signing policy to apply across all messages (default: "StrictSign")
    * @param {Object} [options.scoreParams] peer score parameters
    * @param {Object} [options.scoreThresholds] peer score thresholds
    * @param {AddrInfo[]} [options.directPeers] peers with which we will maintain direct connections
    * @constructor
    */
  def this(libp2p: Libp2p) = this()
  def this(libp2p: Libp2p, options: PartialGossipInputOptions) = this()
}
@JSImport("libp2p-gossipsub", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var multicodec: String = js.native
}

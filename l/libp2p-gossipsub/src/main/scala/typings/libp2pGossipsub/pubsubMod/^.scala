package typings.libp2pGossipsub.pubsubMod

import typings.libp2pGossipsub.anon.DebugName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/pubsub", JSImport.Namespace)
@js.native
class ^ protected () extends BasicPubSub {
  /**
    * @param {Object} props
    * @param {String} props.debugName log namespace
    * @param {string[]} props.multicodecs protocol identifiers to connect
    * @param {PeerId} props.peerId peer's peerId
    * @param {Object} props.registrar registrar for libp2p protocols
    * @param {function} props.registrar.handle
    * @param {function} props.registrar.register
    * @param {function} props.registrar.unregister
    * @param {Object} [props.options]
    * @param {boolean} [props.options.emitSelf] if publish should emit to self, if subscribed, defaults to false
    * @constructor
    */
  def this(hasDebugNameMulticodecsPeerIdRegistrarOptions: DebugName) = this()
}

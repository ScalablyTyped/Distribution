package typings.libp2pInterfaces.pubsubMod

import typings.libp2pInterfaces.anon.CanRelayMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef {Object} InMessage
  * @property {string} [from]
  * @property {string} receivedFrom
  * @property {string[]} topicIDs
  * @property {Uint8Array} [seqno]
  * @property {Uint8Array} data
  * @property {Uint8Array} [signature]
  * @property {Uint8Array} [key]
  *
  * @typedef PeerId
  * @type import('peer-id')
  */
/**
* PubsubBaseProtocol handles the peers and connections logic for pubsub routers
* and specifies the API that pubsub routers should have.
*/
@JSImport("libp2p-interfaces/src/pubsub", JSImport.Namespace)
@js.native
class ^ protected () extends PubsubBaseProtocol {
  /**
    * @param {Object} props
    * @param {String} props.debugName log namespace
    * @param {Array<string>|string} props.multicodecs protocol identificers to connect
    * @param {Libp2p} props.libp2p
    * @param {SignaturePolicy} [props.globalSignaturePolicy = SignaturePolicy.StrictSign] defines how signatures should be handled
    * @param {boolean} [props.canRelayMessage = false] if can relay messages not subscribed
    * @param {boolean} [props.emitSelf = false] if publish should emit to self, if subscribed
    * @abstract
    */
  def this(hasDebugNameMulticodecsLibp2pGlobalSignaturePolicyCanRelayMessageEmitSelf: CanRelayMessage) = this()
}

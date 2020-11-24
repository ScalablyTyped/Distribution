package typings.libp2pInterfaces.peerStreamsMod

import typings.libp2pInterfaces.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @callback Sink
  * @param {Uint8Array} source
  * @returns {Promise<Uint8Array>}
  *
  * @typedef {object} DuplexIterableStream
  * @property {Sink} sink
  * @property {() AsyncIterator<Uint8Array>} source
  *
  * @typedef PeerId
  * @type import('peer-id')
  */
/**
  * Thin wrapper around a peer's inbound / outbound pubsub streams
  */
@JSImport("libp2p-interfaces/src/pubsub/peer-streams", JSImport.Namespace)
@js.native
class ^ protected () extends PeerStreams {
  /**
    * @param {object} properties properties of the PeerStreams.
    * @param {PeerId} properties.id
    * @param {string} properties.protocol
    */
  def this(hasIdProtocol: Id) = this()
}

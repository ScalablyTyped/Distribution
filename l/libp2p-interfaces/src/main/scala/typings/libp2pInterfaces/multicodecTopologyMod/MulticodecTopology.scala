package typings.libp2pInterfaces.multicodecTopologyMod

import typings.libp2pInterfaces.anon.Multiaddrs
import typings.libp2pInterfaces.anon.PeerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulticodecTopology extends js.Object {
  
  /**
    * Verify if a new connected peer has a topology multicodec and call _onConnect.
    * @param {Connection} connection
    * @returns {void}
    */
  def _onPeerConnect(connection: js.Any): Unit = js.native
  
  /**
    * Check if a new peer support the multicodecs for this topology.
    * @param {Object} props
    * @param {PeerId} props.peerId
    * @param {Array<string>} props.protocols
    */
  def _onProtocolChange(hasPeerIdProtocols: PeerId): Unit = js.native
  
  var _registrar: js.Any = js.native
  
  /**
    * Update topology.
    * @param {Array<{id: PeerId, multiaddrs: Array<Multiaddr>, protocols: Array<string>}>} peerDataIterable
    * @returns {void}
    */
  def _updatePeers(peerDataIterable: js.Array[Multiaddrs]): Unit = js.native
  
  var multicodecs: js.Array[String] = js.native
  
  def registrar_=(arg: js.Any): Unit = js.native
}

package typings.libp2pInterfaces

import org.scalablytyped.runtime.Shortcut
import typings.libp2pInterfaces.anon.Multiaddrs
import typings.libp2pInterfaces.anon.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multicodecTopologyMod extends Shortcut {
  
  @JSImport("libp2p-interfaces/src/topology/multicodec-topology", JSImport.Namespace)
  @js.native
  val ^ : MulticodecTopology = js.native
  
  @js.native
  trait MulticodecTopology extends StObject {
    
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
  
  type _To = MulticodecTopology
  
  /* This means you don't have to write `^`, but can instead just say `multicodecTopologyMod.foo` */
  override def _to: MulticodecTopology = ^
}

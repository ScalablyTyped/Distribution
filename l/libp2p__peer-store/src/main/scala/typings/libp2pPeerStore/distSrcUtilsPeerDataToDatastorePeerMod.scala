package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerData
import typings.libp2pPeerStore.distSrcPbPeerMod.Peer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPeerDataToDatastorePeerMod {
  
  @JSImport("@libp2p/peer-store/dist/src/utils/peer-data-to-datastore-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDatastorePeer(peerId: PeerId, data: PeerData): Peer = (^.asInstanceOf[js.Dynamic].applyDynamic("toDatastorePeer")(peerId.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Peer]
}

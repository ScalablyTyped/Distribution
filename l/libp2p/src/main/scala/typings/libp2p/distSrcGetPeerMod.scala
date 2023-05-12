package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGetPeerMod {
  
  @JSImport("libp2p/dist/src/get-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPeerAddress(peer: js.Array[Multiaddr_]): PeerAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeerAddress")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerAddress]
  inline def getPeerAddress(peer: PeerId): PeerAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeerAddress")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerAddress]
  inline def getPeerAddress(peer: Multiaddr_): PeerAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeerAddress")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerAddress]
  
  trait PeerAddress extends StObject {
    
    var multiaddrs: js.Array[Multiaddr_]
    
    var peerId: js.UndefOr[PeerId] = js.undefined
  }
  object PeerAddress {
    
    inline def apply(multiaddrs: js.Array[Multiaddr_]): PeerAddress = {
      val __obj = js.Dynamic.literal(multiaddrs = multiaddrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerAddress] (val x: Self) extends AnyVal {
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
    }
  }
}

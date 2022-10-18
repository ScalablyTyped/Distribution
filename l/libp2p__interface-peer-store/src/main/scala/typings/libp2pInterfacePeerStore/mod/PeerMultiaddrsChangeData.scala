package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerMultiaddrsChangeData extends StObject {
  
  var multiaddrs: js.Array[Multiaddr_]
  
  var oldMultiaddrs: js.Array[Multiaddr_]
  
  var peerId: PeerId
}
object PeerMultiaddrsChangeData {
  
  inline def apply(multiaddrs: js.Array[Multiaddr_], oldMultiaddrs: js.Array[Multiaddr_], peerId: PeerId): PeerMultiaddrsChangeData = {
    val __obj = js.Dynamic.literal(multiaddrs = multiaddrs.asInstanceOf[js.Any], oldMultiaddrs = oldMultiaddrs.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerMultiaddrsChangeData]
  }
  
  extension [Self <: PeerMultiaddrsChangeData](x: Self) {
    
    inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
    
    inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
    
    inline def setOldMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "oldMultiaddrs", value.asInstanceOf[js.Any])
    
    inline def setOldMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "oldMultiaddrs", js.Array(value*))
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
  }
}

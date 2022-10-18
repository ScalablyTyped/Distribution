package typings.libp2pInterfacePeerInfo

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait PeerInfo extends StObject {
    
    var id: PeerId
    
    var multiaddrs: js.Array[Multiaddr_]
    
    var protocols: js.Array[String]
  }
  object PeerInfo {
    
    inline def apply(id: PeerId, multiaddrs: js.Array[Multiaddr_], protocols: js.Array[String]): PeerInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerInfo]
    }
    
    extension [Self <: PeerInfo](x: Self) {
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
    }
  }
}

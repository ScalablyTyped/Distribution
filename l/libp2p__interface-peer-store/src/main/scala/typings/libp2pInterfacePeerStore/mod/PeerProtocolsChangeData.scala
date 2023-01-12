package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerProtocolsChangeData extends StObject {
  
  var oldProtocols: js.Array[String]
  
  var peerId: PeerId
  
  var protocols: js.Array[String]
}
object PeerProtocolsChangeData {
  
  inline def apply(oldProtocols: js.Array[String], peerId: PeerId, protocols: js.Array[String]): PeerProtocolsChangeData = {
    val __obj = js.Dynamic.literal(oldProtocols = oldProtocols.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerProtocolsChangeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerProtocolsChangeData] (val x: Self) extends AnyVal {
    
    inline def setOldProtocols(value: js.Array[String]): Self = StObject.set(x, "oldProtocols", value.asInstanceOf[js.Any])
    
    inline def setOldProtocolsVarargs(value: String*): Self = StObject.set(x, "oldProtocols", js.Array(value*))
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}

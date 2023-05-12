package typings.libp2pKadDht.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.libp2pKadDhtStrings.ADD_PEER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: ADD_PEER
  
  var peer: PeerId
  
  var `type`: typings.libp2pKadDht.mod.EventTypes.ADD_PEER
}
object AddPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typings.libp2pKadDht.mod.EventTypes.ADD_PEER): AddPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADD_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPeerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddPeerEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: ADD_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pKadDht.mod.EventTypes.ADD_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

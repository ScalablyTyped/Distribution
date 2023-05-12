package typings.libp2pKadDht.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.libp2pKadDhtStrings.DIAL_PEER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: DIAL_PEER
  
  var peer: PeerId
  
  var `type`: typings.libp2pKadDht.mod.EventTypes.DIAL_PEER
}
object DialPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typings.libp2pKadDht.mod.EventTypes.DIAL_PEER): DialPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialPeerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialPeerEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: DIAL_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pKadDht.mod.EventTypes.DIAL_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

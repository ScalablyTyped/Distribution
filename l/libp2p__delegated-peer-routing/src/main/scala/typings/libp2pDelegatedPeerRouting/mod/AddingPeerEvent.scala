package typings.libp2pDelegatedPeerRouting.mod

import typings.libp2pDelegatedPeerRouting.libp2pDelegatedPeerRoutingStrings.ADDING_PEER
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddingPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: ADDING_PEER
  
  var peer: PeerId
  
  var `type`: typings.libp2pDelegatedPeerRouting.mod.EventTypes.ADDING_PEER
}
object AddingPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typings.libp2pDelegatedPeerRouting.mod.EventTypes.ADDING_PEER): AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddingPeerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddingPeerEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: ADDING_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pDelegatedPeerRouting.mod.EventTypes.ADDING_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

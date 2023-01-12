package typings.libp2pDelegatedContentRouting.mod

import typings.libp2pDelegatedContentRouting.libp2pDelegatedContentRoutingStrings.FINAL_PEER
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: FINAL_PEER
  
  var peer: PeerInfo
  
  var `type`: typings.libp2pDelegatedContentRouting.mod.EventTypes.FINAL_PEER
}
object FinalPeerEvent {
  
  inline def apply(peer: PeerInfo, `type`: typings.libp2pDelegatedContentRouting.mod.EventTypes.FINAL_PEER): FinalPeerEvent = {
    val __obj = js.Dynamic.literal(name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalPeerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalPeerEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: FINAL_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerInfo): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pDelegatedContentRouting.mod.EventTypes.FINAL_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

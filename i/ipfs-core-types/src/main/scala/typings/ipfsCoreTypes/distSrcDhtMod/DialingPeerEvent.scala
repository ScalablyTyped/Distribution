package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.ipfsCoreTypesStrings.DIALING_PEER
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialingPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: DIALING_PEER
  
  var peer: PeerId
  
  var `type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.DIALING_PEER
}
object DialingPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.DIALING_PEER): DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialingPeerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialingPeerEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: DIALING_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.DIALING_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

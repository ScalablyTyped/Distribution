package typings.libp2pKadDht.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.libp2pKadDhtStrings.SEND_QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendQueryEvent
  extends StObject
     with QueryEvent {
  
  var messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
  
  var messageType: MessageType
  
  var name: SEND_QUERY
  
  var to: PeerId
  
  var `type`: typings.libp2pKadDht.mod.EventTypes.SEND_QUERY
}
object SendQueryEvent {
  
  inline def apply(
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    to: PeerId,
    `type`: typings.libp2pKadDht.mod.EventTypes.SEND_QUERY
  ): SendQueryEvent = {
    val __obj = js.Dynamic.literal(messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "SEND_QUERY", to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendQueryEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendQueryEvent] (val x: Self) extends AnyVal {
    
    inline def setMessageName(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): Self = StObject.set(x, "messageName", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setName(value: SEND_QUERY): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTo(value: PeerId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pKadDht.mod.EventTypes.SEND_QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

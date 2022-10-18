package typings.libp2pInterfaceDht.mod

import typings.libp2pInterfaceDht.libp2pInterfaceDhtStrings.SENDING_QUERY
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendingQueryEvent
  extends StObject
     with QueryEvent {
  
  var messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
  
  var messageType: MessageType
  
  var name: SENDING_QUERY
  
  var to: PeerId
  
  var `type`: typings.libp2pInterfaceDht.mod.EventTypes.SENDING_QUERY
}
object SendingQueryEvent {
  
  inline def apply(
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    to: PeerId,
    `type`: typings.libp2pInterfaceDht.mod.EventTypes.SENDING_QUERY
  ): SendingQueryEvent = {
    val __obj = js.Dynamic.literal(messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "SENDING_QUERY", to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingQueryEvent]
  }
  
  extension [Self <: SendingQueryEvent](x: Self) {
    
    inline def setMessageName(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): Self = StObject.set(x, "messageName", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setName(value: SENDING_QUERY): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTo(value: PeerId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pInterfaceDht.mod.EventTypes.SENDING_QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

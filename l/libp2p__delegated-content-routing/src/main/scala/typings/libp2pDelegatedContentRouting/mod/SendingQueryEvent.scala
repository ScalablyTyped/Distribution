package typings.libp2pDelegatedContentRouting.mod

import typings.libp2pDelegatedContentRouting.libp2pDelegatedContentRoutingStrings.SENDING_QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendingQueryEvent
  extends StObject
     with QueryEvent {
  
  var name: SENDING_QUERY
  
  var `type`: typings.libp2pDelegatedContentRouting.mod.EventTypes.SENDING_QUERY
}
object SendingQueryEvent {
  
  inline def apply(`type`: typings.libp2pDelegatedContentRouting.mod.EventTypes.SENDING_QUERY): SendingQueryEvent = {
    val __obj = js.Dynamic.literal(name = "SENDING_QUERY")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingQueryEvent]
  }
  
  extension [Self <: SendingQueryEvent](x: Self) {
    
    inline def setName(value: SENDING_QUERY): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pDelegatedContentRouting.mod.EventTypes.SENDING_QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

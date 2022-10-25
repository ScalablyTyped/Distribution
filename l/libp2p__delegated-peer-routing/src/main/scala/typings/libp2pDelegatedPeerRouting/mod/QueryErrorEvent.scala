package typings.libp2pDelegatedPeerRouting.mod

import typings.libp2pDelegatedPeerRouting.libp2pDelegatedPeerRoutingStrings.QUERY_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryErrorEvent
  extends StObject
     with QueryEvent {
  
  var error: js.Error
  
  var name: QUERY_ERROR
  
  var `type`: typings.libp2pDelegatedPeerRouting.mod.EventTypes.QUERY_ERROR
}
object QueryErrorEvent {
  
  inline def apply(error: js.Error, `type`: typings.libp2pDelegatedPeerRouting.mod.EventTypes.QUERY_ERROR): QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorEvent]
  }
  
  extension [Self <: QueryErrorEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: QUERY_ERROR): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.libp2pDelegatedPeerRouting.mod.EventTypes.QUERY_ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

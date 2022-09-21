package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventsResetMultipleForAllRequest extends StObject {
  
  /**
    * The IDs of events to reset.
    */
  var event_ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#eventsResetMultipleForAllRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventsResetMultipleForAllRequest {
  
  inline def apply(): SchemaEventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventsResetMultipleForAllRequest]
  }
  
  extension [Self <: SchemaEventsResetMultipleForAllRequest](x: Self) {
    
    inline def setEvent_ids(value: js.Array[String]): Self = StObject.set(x, "event_ids", value.asInstanceOf[js.Any])
    
    inline def setEvent_idsNull: Self = StObject.set(x, "event_ids", null)
    
    inline def setEvent_idsUndefined: Self = StObject.set(x, "event_ids", js.undefined)
    
    inline def setEvent_idsVarargs(value: String*): Self = StObject.set(x, "event_ids", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

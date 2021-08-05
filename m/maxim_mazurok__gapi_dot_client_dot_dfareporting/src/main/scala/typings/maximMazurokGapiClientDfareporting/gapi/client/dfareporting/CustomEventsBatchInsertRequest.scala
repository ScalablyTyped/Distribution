package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventsBatchInsertRequest extends StObject {
  
  /** The set of custom events to insert. */
  var customEvents: js.UndefOr[js.Array[CustomEvent]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertRequest". */
  var kind: js.UndefOr[String] = js.undefined
}
object CustomEventsBatchInsertRequest {
  
  inline def apply(): CustomEventsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventsBatchInsertRequest]
  }
  
  extension [Self <: CustomEventsBatchInsertRequest](x: Self) {
    
    inline def setCustomEvents(value: js.Array[CustomEvent]): Self = StObject.set(x, "customEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomEventsUndefined: Self = StObject.set(x, "customEvents", js.undefined)
    
    inline def setCustomEventsVarargs(value: CustomEvent*): Self = StObject.set(x, "customEvents", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

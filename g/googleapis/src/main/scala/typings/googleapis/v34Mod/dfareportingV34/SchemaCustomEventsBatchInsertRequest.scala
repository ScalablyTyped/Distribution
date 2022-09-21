package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventsBatchInsertRequest extends StObject {
  
  /**
    * The set of custom events to insert.
    */
  var customEvents: js.UndefOr[js.Array[SchemaCustomEvent]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertRequest".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEventsBatchInsertRequest {
  
  inline def apply(): SchemaCustomEventsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventsBatchInsertRequest]
  }
  
  extension [Self <: SchemaCustomEventsBatchInsertRequest](x: Self) {
    
    inline def setCustomEvents(value: js.Array[SchemaCustomEvent]): Self = StObject.set(x, "customEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomEventsUndefined: Self = StObject.set(x, "customEvents", js.undefined)
    
    inline def setCustomEventsVarargs(value: SchemaCustomEvent*): Self = StObject.set(x, "customEvents", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

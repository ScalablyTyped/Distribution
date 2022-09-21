package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventStatus extends StObject {
  
  /**
    * The original custom event that was inserted.
    */
  var customEvent: js.UndefOr[SchemaCustomEvent] = js.undefined
  
  /**
    * A list of errors related to this custom event.
    */
  var errors: js.UndefOr[js.Array[SchemaCustomEventError]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventStatus".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEventStatus {
  
  inline def apply(): SchemaCustomEventStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventStatus]
  }
  
  extension [Self <: SchemaCustomEventStatus](x: Self) {
    
    inline def setCustomEvent(value: SchemaCustomEvent): Self = StObject.set(x, "customEvent", value.asInstanceOf[js.Any])
    
    inline def setCustomEventUndefined: Self = StObject.set(x, "customEvent", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaCustomEventError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaCustomEventError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

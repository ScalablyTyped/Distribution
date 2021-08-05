package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterMetadata extends StObject {
  
  /** Human-readable description of the counter semantics. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Counter aggregation kind. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A string referring to the unit type. */
  var otherUnits: js.UndefOr[String] = js.undefined
  
  /** System defined Units, see above enum. */
  var standardUnits: js.UndefOr[String] = js.undefined
}
object CounterMetadata {
  
  inline def apply(): CounterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterMetadata]
  }
  
  extension [Self <: CounterMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOtherUnits(value: String): Self = StObject.set(x, "otherUnits", value.asInstanceOf[js.Any])
    
    inline def setOtherUnitsUndefined: Self = StObject.set(x, "otherUnits", js.undefined)
    
    inline def setStandardUnits(value: String): Self = StObject.set(x, "standardUnits", value.asInstanceOf[js.Any])
    
    inline def setStandardUnitsUndefined: Self = StObject.set(x, "standardUnits", js.undefined)
  }
}

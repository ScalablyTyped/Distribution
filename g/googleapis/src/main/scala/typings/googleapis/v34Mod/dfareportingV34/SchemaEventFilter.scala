package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventFilter extends StObject {
  
  /**
    * The dimension filter contained within this EventFilter.
    */
  var dimensionFilter: js.UndefOr[SchemaPathReportDimensionValue] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#eventFilter.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventFilter {
  
  inline def apply(): SchemaEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventFilter]
  }
  
  extension [Self <: SchemaEventFilter](x: Self) {
    
    inline def setDimensionFilter(value: SchemaPathReportDimensionValue): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

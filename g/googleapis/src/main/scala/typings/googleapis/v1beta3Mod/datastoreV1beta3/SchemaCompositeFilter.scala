package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompositeFilter extends StObject {
  
  /**
    * The list of filters to combine. Requires: * At least one filter is present.
    */
  var filters: js.UndefOr[js.Array[SchemaFilter]] = js.undefined
  
  /**
    * The operator for combining multiple filters.
    */
  var op: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompositeFilter {
  
  inline def apply(): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
  
  extension [Self <: SchemaCompositeFilter](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpNull: Self = StObject.set(x, "op", null)
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}

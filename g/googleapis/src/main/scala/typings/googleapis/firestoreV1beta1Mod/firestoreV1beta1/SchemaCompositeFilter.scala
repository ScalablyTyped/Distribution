package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter that merges multiple other filters using the given operator.
  */
trait SchemaCompositeFilter extends StObject {
  
  /**
    * The list of filters to combine. Must contain at least one filter.
    */
  var filters: js.UndefOr[js.Array[SchemaFilter]] = js.undefined
  
  /**
    * The operator for combining multiple filters.
    */
  var op: js.UndefOr[String] = js.undefined
}
object SchemaCompositeFilter {
  
  inline def apply(): SchemaCompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeFilter]
  }
  
  extension [Self <: SchemaCompositeFilter](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}

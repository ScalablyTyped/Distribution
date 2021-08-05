package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A value range that was matched by one or more data filers.
  */
trait SchemaMatchedValueRange extends StObject {
  
  /**
    * The DataFilters from the request that matched the range of values.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
  
  /**
    * The values matched by the DataFilter.
    */
  var valueRange: js.UndefOr[SchemaValueRange] = js.undefined
}
object SchemaMatchedValueRange {
  
  inline def apply(): SchemaMatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedValueRange]
  }
  
  extension [Self <: SchemaMatchedValueRange](x: Self) {
    
    inline def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    inline def setValueRange(value: SchemaValueRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}

package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range of values whose location is specified by a DataFilter.
  */
trait SchemaDataFilterValueRange extends StObject {
  
  /**
    * The data filter describing the location of the values in the spreadsheet.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.undefined
  
  /**
    * The major dimension of the values.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  
  /**
    * The data to be written.  If the provided values exceed any of the ranges
    * matched by the data filter then the request will fail.  If the provided
    * values are less than the matched ranges only the specified values will be
    * written, existing values in the matched ranges will remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}
object SchemaDataFilterValueRange {
  
  inline def apply(): SchemaDataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilterValueRange]
  }
  
  extension [Self <: SchemaDataFilterValueRange](x: Self) {
    
    inline def setDataFilter(value: SchemaDataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    inline def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    inline def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    inline def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

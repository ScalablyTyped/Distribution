package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataFilterValueRange extends StObject {
  
  /**
    * The data filter describing the location of the values in the spreadsheet.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.undefined
  
  /**
    * The major dimension of the values.
    */
  var majorDimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data to be written. If the provided values exceed any of the ranges matched by the data filter then the request fails. If the provided values are less than the matched ranges only the specified values are written, existing values in the matched ranges remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[Any]] | Null] = js.undefined
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
    
    inline def setMajorDimensionNull: Self = StObject.set(x, "majorDimension", null)
    
    inline def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

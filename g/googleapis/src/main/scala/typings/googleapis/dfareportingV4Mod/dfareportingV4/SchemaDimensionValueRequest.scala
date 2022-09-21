package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionValueRequest extends StObject {
  
  /**
    * The name of the dimension for which values should be requested.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of filters by which to filter values. The filters are ANDed.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.undefined
  
  /**
    * The kind of request this is, in this case dfareporting#dimensionValueRequest .
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaDimensionValueRequest {
  
  inline def apply(): SchemaDimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValueRequest]
  }
  
  extension [Self <: SchemaDimensionValueRequest](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFilters(value: js.Array[SchemaDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}

package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionFilterClause extends StObject {
  
  /** The repeated set of filters. They are logically combined based on the operator specified. */
  var filters: js.UndefOr[js.Array[DimensionFilter]] = js.undefined
  
  /** The operator for combining multiple dimension filters. If unspecified, it is treated as an `OR`. */
  var operator: js.UndefOr[String] = js.undefined
}
object DimensionFilterClause {
  
  inline def apply(): DimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionFilterClause]
  }
  
  extension [Self <: DimensionFilterClause](x: Self) {
    
    inline def setFilters(value: js.Array[DimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: DimensionFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

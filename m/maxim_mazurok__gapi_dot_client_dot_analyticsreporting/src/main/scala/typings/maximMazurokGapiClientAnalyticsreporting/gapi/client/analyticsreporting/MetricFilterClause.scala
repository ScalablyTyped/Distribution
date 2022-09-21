package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricFilterClause extends StObject {
  
  /** The repeated set of filters. They are logically combined based on the operator specified. */
  var filters: js.UndefOr[js.Array[MetricFilter]] = js.undefined
  
  /** The operator for combining multiple metric filters. If unspecified, it is treated as an `OR`. */
  var operator: js.UndefOr[String] = js.undefined
}
object MetricFilterClause {
  
  inline def apply(): MetricFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterClause]
  }
  
  extension [Self <: MetricFilterClause](x: Self) {
    
    inline def setFilters(value: js.Array[MetricFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

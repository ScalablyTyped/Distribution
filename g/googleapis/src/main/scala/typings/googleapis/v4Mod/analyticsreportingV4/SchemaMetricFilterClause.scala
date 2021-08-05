package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a group of metric filters. Set the operator value to specify how
  * the filters are logically combined.
  */
trait SchemaMetricFilterClause extends StObject {
  
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaMetricFilter]] = js.undefined
  
  /**
    * The operator for combining multiple metric filters. If unspecified, it is
    * treated as an `OR`.
    */
  var operator: js.UndefOr[String] = js.undefined
}
object SchemaMetricFilterClause {
  
  inline def apply(): SchemaMetricFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricFilterClause]
  }
  
  extension [Self <: SchemaMetricFilterClause](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaMetricFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaMetricFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

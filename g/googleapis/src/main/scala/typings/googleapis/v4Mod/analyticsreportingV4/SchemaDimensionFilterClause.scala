package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensionFilterClause extends StObject {
  
  /**
    * The repeated set of filters. They are logically combined based on the operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.undefined
  
  /**
    * The operator for combining multiple dimension filters. If unspecified, it is treated as an `OR`.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
}
object SchemaDimensionFilterClause {
  
  inline def apply(): SchemaDimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilterClause]
  }
  
  extension [Self <: SchemaDimensionFilterClause](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group of dimension filters. Set the operator value to specify how the
  * filters are logically combined.
  */
trait SchemaDimensionFilterClause extends StObject {
  
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.undefined
  
  /**
    * The operator for combining multiple dimension filters. If unspecified, it
    * is treated as an `OR`.
    */
  var operator: js.UndefOr[String] = js.undefined
}
object SchemaDimensionFilterClause {
  
  @scala.inline
  def apply(): SchemaDimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilterClause]
  }
  
  @scala.inline
  implicit class SchemaDimensionFilterClauseMutableBuilder[Self <: SchemaDimensionFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[SchemaDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SchemaDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

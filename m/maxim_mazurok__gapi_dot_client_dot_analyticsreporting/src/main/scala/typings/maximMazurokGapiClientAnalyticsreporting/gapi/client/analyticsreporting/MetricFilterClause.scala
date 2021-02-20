package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilterClause extends StObject {
  
  /** The repeated set of filters. They are logically combined based on the operator specified. */
  var filters: js.UndefOr[js.Array[MetricFilter]] = js.native
  
  /** The operator for combining multiple metric filters. If unspecified, it is treated as an `OR`. */
  var operator: js.UndefOr[String] = js.native
}
object MetricFilterClause {
  
  @scala.inline
  def apply(): MetricFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterClause]
  }
  
  @scala.inline
  implicit class MetricFilterClauseMutableBuilder[Self <: MetricFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[MetricFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: MetricFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}

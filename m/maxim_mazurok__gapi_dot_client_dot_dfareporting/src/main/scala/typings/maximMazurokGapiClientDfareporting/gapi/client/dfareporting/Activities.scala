package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activities extends StObject {
  
  /** List of activity filters. The dimension values need to be all either of type "dfa:activity" or "dfa:activityGroup". */
  var filters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#activities. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of names of floodlight activity metrics. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object Activities {
  
  @scala.inline
  def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  
  @scala.inline
  implicit class ActivitiesMutableBuilder[Self <: Activities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
  }
}

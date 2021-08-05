package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an activity group.
  */
trait SchemaActivities extends StObject {
  
  /**
    * List of activity filters. The dimension values need to be all either of
    * type &quot;dfa:activity&quot; or &quot;dfa:activityGroup&quot;.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#activities.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * List of names of floodlight activity metrics.
    */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaActivities {
  
  inline def apply(): SchemaActivities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivities]
  }
  
  extension [Self <: SchemaActivities](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
  }
}

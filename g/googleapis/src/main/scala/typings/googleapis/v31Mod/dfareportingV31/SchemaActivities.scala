package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an activity group.
  */
@js.native
trait SchemaActivities extends StObject {
  
  /**
    * List of activity filters. The dimension values need to be all either of
    * type &quot;dfa:activity&quot; or &quot;dfa:activityGroup&quot;.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#activities.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of names of floodlight activity metrics.
    */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaActivities {
  
  @scala.inline
  def apply(): SchemaActivities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivities]
  }
  
  @scala.inline
  implicit class SchemaActivitiesMutableBuilder[Self <: SchemaActivities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
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

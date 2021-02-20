package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a specific billing destination (Currently only support
  * bill against consumer project).
  */
@js.native
trait SchemaBillingDestination extends StObject {
  
  /**
    * Names of the metrics to report to this billing destination. Each name
    * must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}
object SchemaBillingDestination {
  
  @scala.inline
  def apply(): SchemaBillingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingDestination]
  }
  
  @scala.inline
  implicit class SchemaBillingDestinationMutableBuilder[Self <: SchemaBillingDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}

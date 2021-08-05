package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a specific billing destination (Currently only support
  * bill against consumer project).
  */
trait SchemaBillingDestination extends StObject {
  
  /**
    * Names of the metrics to report to this billing destination. Each name
    * must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.undefined
}
object SchemaBillingDestination {
  
  inline def apply(): SchemaBillingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingDestination]
  }
  
  extension [Self <: SchemaBillingDestination](x: Self) {
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}

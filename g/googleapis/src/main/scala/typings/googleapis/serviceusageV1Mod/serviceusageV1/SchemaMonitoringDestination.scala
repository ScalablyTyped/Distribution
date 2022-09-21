package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoringDestination extends StObject {
  
  /**
    * Types of the metrics to report to this monitoring destination. Each type must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The monitored resource type. The type must be defined in Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String | Null] = js.undefined
}
object SchemaMonitoringDestination {
  
  inline def apply(): SchemaMonitoringDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoringDestination]
  }
  
  extension [Self <: SchemaMonitoringDestination](x: Self) {
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceNull: Self = StObject.set(x, "monitoredResource", null)
    
    inline def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}

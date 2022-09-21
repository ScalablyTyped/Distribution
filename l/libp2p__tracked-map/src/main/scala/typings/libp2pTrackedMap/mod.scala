package typings.libp2pTrackedMap

import typings.libp2pInterfaceMetrics.mod.ComponentMetricsTracker
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/tracked-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trackedMap[K, V](config: CreateTrackedMapOptions): Map[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackedMap")(config.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
  
  trait CreateTrackedMapOptions extends StObject {
    
    var component: String
    
    var metric: String
    
    var metrics: js.UndefOr[ComponentMetricsTracker] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
  }
  object CreateTrackedMapOptions {
    
    inline def apply(component: String, metric: String): CreateTrackedMapOptions = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTrackedMapOptions]
    }
    
    extension [Self <: CreateTrackedMapOptions](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: ComponentMetricsTracker): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  trait TrackedMapInit extends StObject {
    
    var component: String
    
    var metric: String
    
    var metrics: ComponentMetricsTracker
    
    var system: js.UndefOr[String] = js.undefined
  }
  object TrackedMapInit {
    
    inline def apply(component: String, metric: String, metrics: ComponentMetricsTracker): TrackedMapInit = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackedMapInit]
    }
    
    extension [Self <: TrackedMapInit](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: ComponentMetricsTracker): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
}

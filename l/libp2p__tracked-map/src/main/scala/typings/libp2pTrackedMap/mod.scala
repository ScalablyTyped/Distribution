package typings.libp2pTrackedMap

import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/tracked-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trackedMap[K, V](config: CreateTrackedMapInit): Map[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackedMap")(config.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
  
  trait CreateTrackedMapInit extends StObject {
    
    /**
      * A metrics implementation
      */
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    /**
      * The metric name to use
      */
    var name: String
  }
  object CreateTrackedMapInit {
    
    inline def apply(name: String): CreateTrackedMapInit = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTrackedMapInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTrackedMapInit] (val x: Self) extends AnyVal {
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackedMapInit extends StObject {
    
    var metrics: Metrics
    
    var name: String
  }
  object TrackedMapInit {
    
    inline def apply(metrics: Metrics, name: String): TrackedMapInit = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackedMapInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackedMapInit] (val x: Self) extends AnyVal {
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

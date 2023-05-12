package typings.libp2pPrometheusMetrics

import typings.promClient.mod.DefaultMetricsCollectorConfiguration
import typings.promClient.mod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/prometheus-metrics.@libp2p/prometheus-metrics.PrometheusMetricsInit> */
  trait PartialPrometheusMetricsI extends StObject {
    
    var collectDefaultMetrics: js.UndefOr[Boolean] = js.undefined
    
    var defaultMetrics: js.UndefOr[DefaultMetricsCollectorConfiguration] = js.undefined
    
    var preserveExistingMetrics: js.UndefOr[Boolean] = js.undefined
    
    var registry: js.UndefOr[Registry] = js.undefined
  }
  object PartialPrometheusMetricsI {
    
    inline def apply(): PartialPrometheusMetricsI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPrometheusMetricsI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPrometheusMetricsI] (val x: Self) extends AnyVal {
      
      inline def setCollectDefaultMetrics(value: Boolean): Self = StObject.set(x, "collectDefaultMetrics", value.asInstanceOf[js.Any])
      
      inline def setCollectDefaultMetricsUndefined: Self = StObject.set(x, "collectDefaultMetrics", js.undefined)
      
      inline def setDefaultMetrics(value: DefaultMetricsCollectorConfiguration): Self = StObject.set(x, "defaultMetrics", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetricsUndefined: Self = StObject.set(x, "defaultMetrics", js.undefined)
      
      inline def setPreserveExistingMetrics(value: Boolean): Self = StObject.set(x, "preserveExistingMetrics", value.asInstanceOf[js.Any])
      
      inline def setPreserveExistingMetricsUndefined: Self = StObject.set(x, "preserveExistingMetrics", js.undefined)
      
      inline def setRegistry(value: Registry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}

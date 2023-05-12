package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculatedMetricOptions
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pPrometheusMetrics.anon.PartialPrometheusMetricsI
import typings.promClient.mod.DefaultMetricsCollectorConfiguration
import typings.promClient.mod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/prometheus-metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prometheusMetrics(): js.Function0[Metrics] = ^.asInstanceOf[js.Dynamic].applyDynamic("prometheusMetrics")().asInstanceOf[js.Function0[Metrics]]
  inline def prometheusMetrics(init: PartialPrometheusMetricsI): js.Function0[Metrics] = ^.asInstanceOf[js.Dynamic].applyDynamic("prometheusMetrics")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Metrics]]
  
  trait PrometheusCalculatedMetricOptions[T]
    extends StObject
       with CalculatedMetricOptions[T] {
    
    var registry: js.UndefOr[Registry] = js.undefined
  }
  object PrometheusCalculatedMetricOptions {
    
    inline def apply[T](calculate: () => js.Promise[T] | T): PrometheusCalculatedMetricOptions[T] = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate))
      __obj.asInstanceOf[PrometheusCalculatedMetricOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrometheusCalculatedMetricOptions[?], T] (val x: Self & PrometheusCalculatedMetricOptions[T]) extends AnyVal {
      
      inline def setRegistry(value: Registry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  trait PrometheusMetricsInit extends StObject {
    
    /**
      * By default we collect default metrics - CPU, memory etc, to not do
      * this, pass true here
      */
    var collectDefaultMetrics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * prom-client options to pass to the `collectDefaultMetrics` function
      */
    var defaultMetrics: js.UndefOr[DefaultMetricsCollectorConfiguration] = js.undefined
    
    /**
      * All metrics in prometheus are global so to prevent clashes in naming
      * we reset the global metrics registry on creation - to not do this,
      * pass true here
      */
    var preserveExistingMetrics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use a custom registry to register metrics.
      * By default, the global registry is used to register metrics.
      */
    var registry: js.UndefOr[Registry] = js.undefined
  }
  object PrometheusMetricsInit {
    
    inline def apply(): PrometheusMetricsInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrometheusMetricsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrometheusMetricsInit] (val x: Self) extends AnyVal {
      
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

package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculateMetric
import typings.libp2pInterfaceMetrics.mod.Metric
import typings.libp2pPrometheusMetrics.mod.PrometheusCalculatedMetricOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricMod {
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/metric", "PrometheusMetric")
  @js.native
  open class PrometheusMetric protected ()
    extends StObject
       with Metric {
    def this(name: String, opts: PrometheusCalculatedMetricOptions[Double]) = this()
    
    def addCalculator(calculator: CalculateMetric[Double]): Unit = js.native
    
    /* private */ val calculators: Any = js.native
    
    /* private */ val gauge: Any = js.native
  }
}

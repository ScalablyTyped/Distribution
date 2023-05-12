package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculateMetric
import typings.libp2pInterfaceMetrics.mod.Counter
import typings.libp2pPrometheusMetrics.distSrcUtilsMod.CalculatedMetric
import typings.libp2pPrometheusMetrics.mod.PrometheusCalculatedMetricOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCounterMod {
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/counter", "PrometheusCounter")
  @js.native
  open class PrometheusCounter protected ()
    extends StObject
       with Counter
       with CalculatedMetric[Double] {
    def this(name: String, opts: PrometheusCalculatedMetricOptions[Double]) = this()
    
    /* CompleteClass */
    override def addCalculator(calculator: CalculateMetric[Double]): Unit = js.native
    
    /* private */ val calculators: Any = js.native
    
    /* private */ val counter: Any = js.native
  }
}

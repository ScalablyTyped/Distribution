package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculateMetric
import typings.libp2pInterfaceMetrics.mod.CounterGroup
import typings.libp2pPrometheusMetrics.distSrcUtilsMod.CalculatedMetric
import typings.libp2pPrometheusMetrics.mod.PrometheusCalculatedMetricOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCounterGroupMod {
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/counter-group", "PrometheusCounterGroup")
  @js.native
  open class PrometheusCounterGroup protected ()
    extends StObject
       with CounterGroup
       with CalculatedMetric[Record[String, Double]] {
    def this(name: String, opts: PrometheusCalculatedMetricOptions[Record[String, Double]]) = this()
    
    /* CompleteClass */
    override def addCalculator(calculator: CalculateMetric[Record[String, Double]]): Unit = js.native
    
    /* private */ val calculators: Any = js.native
    
    /* private */ val counter: Any = js.native
    
    /**
      * Increment the metric group keys by the passed number or
      * any non-numeric value to increment by 1
      */
    /* CompleteClass */
    override def increment(values: Record[String, Double | Any]): Unit = js.native
    
    /* private */ val label: Any = js.native
    
    /**
      * Reset the passed key in this metric group to its default value
      * or all keys if no key is passed
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
}

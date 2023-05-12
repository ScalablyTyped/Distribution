package typings.libp2pPrometheusMetrics

import typings.libp2pInterfaceMetrics.mod.CalculateMetric
import typings.libp2pInterfaceMetrics.mod.MetricGroup
import typings.libp2pInterfaceMetrics.mod.StopTimer
import typings.libp2pPrometheusMetrics.distSrcUtilsMod.CalculatedMetric
import typings.libp2pPrometheusMetrics.mod.PrometheusCalculatedMetricOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricGroupMod {
  
  @JSImport("@libp2p/prometheus-metrics/dist/src/metric-group", "PrometheusMetricGroup")
  @js.native
  open class PrometheusMetricGroup protected ()
    extends StObject
       with MetricGroup
       with CalculatedMetric[Record[String, Double]] {
    def this(name: String, opts: PrometheusCalculatedMetricOptions[Record[String, Double]]) = this()
    
    /* CompleteClass */
    override def addCalculator(calculator: CalculateMetric[Record[String, Double]]): Unit = js.native
    
    /* private */ val calculators: Any = js.native
    
    /**
      * Decrement the metric group keys by the passed number or
      * any non-numeric value to decrement by 1
      */
    /* CompleteClass */
    override def decrement(values: Record[String, Double | Any]): Unit = js.native
    
    /* private */ val gauge: Any = js.native
    
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
    
    /**
      * Start a timed metric for the named key in the group, call
      * the returned function to stop the timer
      */
    /* CompleteClass */
    override def timer(key: String): StopTimer = js.native
    
    /**
      * Update the stored metric group to the passed value
      */
    /* CompleteClass */
    override def update(values: Record[String, Double]): Unit = js.native
  }
}

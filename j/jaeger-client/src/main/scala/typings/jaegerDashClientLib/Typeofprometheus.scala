package typings
package jaegerDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprometheus extends js.Object {
  var AggregatorRegistry: TypeofClassAggregatorRegistry = js.native
  var Counter: org.scalablytyped.runtime.Instantiable1[
    /* configuration */ promDashClientLib.promDashClientMod.CounterConfiguration, 
    promDashClientLib.promDashClientMod.Counter
  ] = js.native
  val CounterNs: js.Any = js.native
  var Gauge: org.scalablytyped.runtime.Instantiable1[
    /* configuration */ promDashClientLib.promDashClientMod.GaugeConfiguration, 
    promDashClientLib.promDashClientMod.Gauge
  ] = js.native
  val GaugeNs: js.Any = js.native
  var Histogram: org.scalablytyped.runtime.Instantiable1[
    /* configuration */ promDashClientLib.promDashClientMod.HistogramConfiguration, 
    promDashClientLib.promDashClientMod.Histogram
  ] = js.native
  val HistogramNs: js.Any = js.native
  var Pushgateway: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, promDashClientLib.promDashClientMod.Pushgateway] = js.native
  val PushgatewayNs: js.Any = js.native
  var Registry: TypeofClassRegistry = js.native
  var Summary: org.scalablytyped.runtime.Instantiable1[
    /* configuration */ promDashClientLib.promDashClientMod.SummaryConfiguration, 
    promDashClientLib.promDashClientMod.Summary
  ] = js.native
  val SummaryNs: js.Any = js.native
  val register: promDashClientLib.promDashClientMod.Registry = js.native
  def collectDefaultMetrics(): scala.Double = js.native
  def collectDefaultMetrics(config: promDashClientLib.promDashClientMod.DefaultMetricsCollectorConfiguration): scala.Double = js.native
  def collectDefaultMetrics(timeout: scala.Double): scala.Double = js.native
  def exponentialBuckets(start: scala.Double, factor: scala.Double, count: scala.Double): js.Array[scala.Double] = js.native
  def linearBuckets(start: scala.Double, width: scala.Double, count: scala.Double): js.Array[scala.Double] = js.native
}


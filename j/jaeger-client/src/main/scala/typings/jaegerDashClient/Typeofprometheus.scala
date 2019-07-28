package typings.jaegerDashClient

import org.scalablytyped.runtime.Instantiable1
import typings.promDashClient.Fn_Arguments
import typings.promDashClient.promDashClientMod.CounterConfiguration
import typings.promDashClient.promDashClientMod.DefaultMetricsCollectorConfiguration
import typings.promDashClient.promDashClientMod.GaugeConfiguration
import typings.promDashClient.promDashClientMod.HistogramConfiguration
import typings.promDashClient.promDashClientMod.Registry
import typings.promDashClient.promDashClientMod.SummaryConfiguration
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprometheus extends js.Object {
  var AggregatorRegistry: TypeofClassAggregatorRegistry = js.native
  var Counter: Instantiable1[
    /* configuration */ CounterConfiguration, 
    typings.promDashClient.promDashClientMod.Counter
  ] = js.native
  val CounterNs: js.Any = js.native
  var Gauge: Instantiable1[
    /* configuration */ GaugeConfiguration, 
    typings.promDashClient.promDashClientMod.Gauge
  ] = js.native
  val GaugeNs: js.Any = js.native
  var Histogram: Instantiable1[
    /* configuration */ HistogramConfiguration, 
    typings.promDashClient.promDashClientMod.Histogram
  ] = js.native
  val HistogramNs: js.Any = js.native
  var Pushgateway: Instantiable1[/* url */ String, typings.promDashClient.promDashClientMod.Pushgateway] = js.native
  val PushgatewayNs: js.Any = js.native
  var Registry: TypeofClassRegistry = js.native
  var Summary: Instantiable1[
    /* configuration */ SummaryConfiguration, 
    typings.promDashClient.promDashClientMod.Summary
  ] = js.native
  val SummaryNs: js.Any = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}


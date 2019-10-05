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
  var Counter: js.Any | (Instantiable1[
    /* configuration */ CounterConfiguration, 
    typings.promDashClient.promDashClientMod.Counter
  ]) = js.native
  var Gauge: js.Any | (Instantiable1[
    /* configuration */ GaugeConfiguration, 
    typings.promDashClient.promDashClientMod.Gauge
  ]) = js.native
  var Histogram: js.Any | (Instantiable1[
    /* configuration */ HistogramConfiguration, 
    typings.promDashClient.promDashClientMod.Histogram
  ]) = js.native
  var Pushgateway: js.Any | (Instantiable1[/* url */ String, typings.promDashClient.promDashClientMod.Pushgateway]) = js.native
  var Registry: TypeofClassRegistry = js.native
  var Summary: js.Any | (Instantiable1[
    /* configuration */ SummaryConfiguration, 
    typings.promDashClient.promDashClientMod.Summary
  ]) = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[Fn_Arguments] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}


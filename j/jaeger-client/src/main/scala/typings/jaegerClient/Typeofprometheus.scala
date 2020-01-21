package typings.jaegerClient

import org.scalablytyped.runtime.Instantiable1
import typings.promClient.FnArguments
import typings.promClient.mod.CounterConfiguration
import typings.promClient.mod.DefaultMetricsCollectorConfiguration
import typings.promClient.mod.GaugeConfiguration
import typings.promClient.mod.HistogramConfiguration
import typings.promClient.mod.Registry
import typings.promClient.mod.SummaryConfiguration
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprometheus extends js.Object {
  var AggregatorRegistry: TypeofClassAggregatorRegistry = js.native
  var Counter: Instantiable1[/* configuration */ CounterConfiguration, typings.promClient.mod.Counter] = js.native
  var Gauge: Instantiable1[/* configuration */ GaugeConfiguration, typings.promClient.mod.Gauge] = js.native
  var Histogram: Instantiable1[/* configuration */ HistogramConfiguration, typings.promClient.mod.Histogram] = js.native
  var Pushgateway: Instantiable1[/* url */ String, typings.promClient.mod.Pushgateway] = js.native
  var Registry: TypeofClassRegistry = js.native
  var Summary: Instantiable1[/* configuration */ SummaryConfiguration, typings.promClient.mod.Summary] = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[FnArguments] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[FnArguments] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}


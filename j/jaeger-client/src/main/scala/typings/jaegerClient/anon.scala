package typings.jaegerClient

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.promClient.anon.FnCall
import typings.promClient.mod.AggregatorRegistry
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

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait TypeofAggregatorRegistry extends Instantiable0[AggregatorRegistry] {
    /**
    	 * Creates a new Registry instance from an array of metrics that were
    	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
    	 * the method specified by their `aggregator` property, or by summation if
    	 * `aggregator` is undefined.
    	 * @param {Array} metricsArr Array of metrics, each of which created by
    	 *   `registry.getMetricsAsJSON()`.
    	 * @return {Registry} aggregated registry.
    	 */
    def aggregate(metricsArr: js.Array[js.Object]): Registry = js.native
    /**
    	 * Sets the registry or registries to be aggregated. Call from workers to
    	 * use a registry/registries other than the default global registry.
    	 * @param {Array<Registry>|Registry} regs Registry or registries to be
    	 *   aggregated.
    	 * @return {void}
    	 */
    def setRegistries(regs: js.Array[Registry]): Unit = js.native
    def setRegistries(regs: Registry): Unit = js.native
  }
  
  @js.native
  trait TypeofRegistry extends Instantiable0[Registry] {
    /**
    	 * Merge registers
    	 * @param registers The registers you want to merge together
    	 */
    def merge(registers: js.Array[Registry]): Registry = js.native
  }
  
  @js.native
  trait Typeofprometheus extends js.Object {
    var AggregatorRegistry: TypeofAggregatorRegistry = js.native
    var Counter: Instantiable1[/* configuration */ CounterConfiguration, typings.promClient.mod.Counter] = js.native
    var Gauge: Instantiable1[/* configuration */ GaugeConfiguration, typings.promClient.mod.Gauge] = js.native
    var Histogram: Instantiable1[/* configuration */ HistogramConfiguration, typings.promClient.mod.Histogram] = js.native
    var Pushgateway: Instantiable1[/* url */ String, typings.promClient.mod.Pushgateway] = js.native
    var Registry: TypeofRegistry = js.native
    var Summary: Instantiable1[/* configuration */ SummaryConfiguration, typings.promClient.mod.Summary] = js.native
    val register: Registry = js.native
    def collectDefaultMetrics(): ReturnType[FnCall] = js.native
    def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[FnCall] = js.native
    def collectDefaultMetrics(timeout: Double): Double = js.native
    def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
    def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
    def validateMetricName(name: String): Boolean = js.native
  }
  
}


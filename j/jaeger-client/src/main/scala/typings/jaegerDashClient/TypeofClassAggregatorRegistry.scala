package typings.jaegerDashClient

import org.scalablytyped.runtime.Instantiable0
import typings.promDashClient.promDashClientMod.AggregatorRegistry
import typings.promDashClient.promDashClientMod.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAggregatorRegistry extends Instantiable0[AggregatorRegistry] {
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


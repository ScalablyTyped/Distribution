package typings
package jaegerDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAggregatorRegistry
  extends org.scalablytyped.runtime.Instantiable0[promDashClientLib.promDashClientMod.AggregatorRegistry] {
  /**
  	 * Creates a new Registry instance from an array of metrics that were
  	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
  	 * the method specified by their `aggregator` property, or by summation if
  	 * `aggregator` is undefined.
  	 * @param {Array} metricsArr Array of metrics, each of which created by
  	 *   `registry.getMetricsAsJSON()`.
  	 * @return {Registry} aggregated registry.
  	 */
  def aggregate(metricsArr: js.Array[js.Object]): promDashClientLib.promDashClientMod.Registry = js.native
  /**
  	 * Sets the registry or registries to be aggregated. Call from workers to
  	 * use a registry/registries other than the default global registry.
  	 * @param {Array<Registry>|Registry} regs Registry or registries to be
  	 *   aggregated.
  	 * @return {void}
  	 */
  def setRegistries(regs: js.Array[promDashClientLib.promDashClientMod.Registry]): scala.Unit = js.native
  def setRegistries(regs: promDashClientLib.promDashClientMod.Registry): scala.Unit = js.native
}


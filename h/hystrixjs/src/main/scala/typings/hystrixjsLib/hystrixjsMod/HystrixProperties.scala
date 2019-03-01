package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixProperties extends js.Object {
  var `hystrix.circuit.errorThresholdPercentage`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.sleepWindowInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.volumeThreshold`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.circuit.volumeThreshold.forceOverride`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.circuit.volumeThreshold.override`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.execution.timeoutInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.force.circuit.closed`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.force.circuit.open`: js.UndefOr[scala.Boolean] = js.undefined
  var `hystrix.metrics.percentile.window.bucketsNumber`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.percentile.window.timeInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.statistical.window.bucketsNumber`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.metrics.statistical.window.timeInMilliseconds`: js.UndefOr[scala.Double] = js.undefined
  var `hystrix.promise.implementation`: js.UndefOr[stdLib.PromiseConstructorLike] = js.undefined
  var `hystrix.request.volume.rejectionThreshold`: js.UndefOr[scala.Double] = js.undefined
}

object HystrixProperties {
  @scala.inline
  def apply(
    `hystrix.circuit.errorThresholdPercentage`: scala.Int | scala.Double = null,
    `hystrix.circuit.sleepWindowInMilliseconds`: scala.Int | scala.Double = null,
    `hystrix.circuit.volumeThreshold`: scala.Int | scala.Double = null,
    `hystrix.circuit.volumeThreshold.forceOverride`: js.UndefOr[scala.Boolean] = js.undefined,
    `hystrix.circuit.volumeThreshold.override`: scala.Int | scala.Double = null,
    `hystrix.execution.timeoutInMilliseconds`: scala.Int | scala.Double = null,
    `hystrix.force.circuit.closed`: js.UndefOr[scala.Boolean] = js.undefined,
    `hystrix.force.circuit.open`: js.UndefOr[scala.Boolean] = js.undefined,
    `hystrix.metrics.percentile.window.bucketsNumber`: scala.Int | scala.Double = null,
    `hystrix.metrics.percentile.window.timeInMilliseconds`: scala.Int | scala.Double = null,
    `hystrix.metrics.statistical.window.bucketsNumber`: scala.Int | scala.Double = null,
    `hystrix.metrics.statistical.window.timeInMilliseconds`: scala.Int | scala.Double = null,
    `hystrix.promise.implementation`: stdLib.PromiseConstructorLike = null,
    `hystrix.request.volume.rejectionThreshold`: scala.Int | scala.Double = null
  ): HystrixProperties = {
    val __obj = js.Dynamic.literal()
    if (`hystrix.circuit.errorThresholdPercentage` != null) __obj.updateDynamic("hystrix.circuit.errorThresholdPercentage")(`hystrix.circuit.errorThresholdPercentage`.asInstanceOf[js.Any])
    if (`hystrix.circuit.sleepWindowInMilliseconds` != null) __obj.updateDynamic("hystrix.circuit.sleepWindowInMilliseconds")(`hystrix.circuit.sleepWindowInMilliseconds`.asInstanceOf[js.Any])
    if (`hystrix.circuit.volumeThreshold` != null) __obj.updateDynamic("hystrix.circuit.volumeThreshold")(`hystrix.circuit.volumeThreshold`.asInstanceOf[js.Any])
    if (!js.isUndefined(`hystrix.circuit.volumeThreshold.forceOverride`)) __obj.updateDynamic("hystrix.circuit.volumeThreshold.forceOverride")(`hystrix.circuit.volumeThreshold.forceOverride`)
    if (`hystrix.circuit.volumeThreshold.override` != null) __obj.updateDynamic("hystrix.circuit.volumeThreshold.override")(`hystrix.circuit.volumeThreshold.override`.asInstanceOf[js.Any])
    if (`hystrix.execution.timeoutInMilliseconds` != null) __obj.updateDynamic("hystrix.execution.timeoutInMilliseconds")(`hystrix.execution.timeoutInMilliseconds`.asInstanceOf[js.Any])
    if (!js.isUndefined(`hystrix.force.circuit.closed`)) __obj.updateDynamic("hystrix.force.circuit.closed")(`hystrix.force.circuit.closed`)
    if (!js.isUndefined(`hystrix.force.circuit.open`)) __obj.updateDynamic("hystrix.force.circuit.open")(`hystrix.force.circuit.open`)
    if (`hystrix.metrics.percentile.window.bucketsNumber` != null) __obj.updateDynamic("hystrix.metrics.percentile.window.bucketsNumber")(`hystrix.metrics.percentile.window.bucketsNumber`.asInstanceOf[js.Any])
    if (`hystrix.metrics.percentile.window.timeInMilliseconds` != null) __obj.updateDynamic("hystrix.metrics.percentile.window.timeInMilliseconds")(`hystrix.metrics.percentile.window.timeInMilliseconds`.asInstanceOf[js.Any])
    if (`hystrix.metrics.statistical.window.bucketsNumber` != null) __obj.updateDynamic("hystrix.metrics.statistical.window.bucketsNumber")(`hystrix.metrics.statistical.window.bucketsNumber`.asInstanceOf[js.Any])
    if (`hystrix.metrics.statistical.window.timeInMilliseconds` != null) __obj.updateDynamic("hystrix.metrics.statistical.window.timeInMilliseconds")(`hystrix.metrics.statistical.window.timeInMilliseconds`.asInstanceOf[js.Any])
    if (`hystrix.promise.implementation` != null) __obj.updateDynamic("hystrix.promise.implementation")(`hystrix.promise.implementation`)
    if (`hystrix.request.volume.rejectionThreshold` != null) __obj.updateDynamic("hystrix.request.volume.rejectionThreshold")(`hystrix.request.volume.rejectionThreshold`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HystrixProperties]
  }
}


package typings.hystrixjs.hystrixjsMod

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixProperties extends js.Object {
  @JSName("hystrix.circuit.errorThresholdPercentage")
  var hystrixDotcircuitDoterrorThresholdPercentage: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.circuit.sleepWindowInMilliseconds")
  var hystrixDotcircuitDotsleepWindowInMilliseconds: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.circuit.volumeThreshold")
  var hystrixDotcircuitDotvolumeThreshold: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.circuit.volumeThreshold.forceOverride")
  var hystrixDotcircuitDotvolumeThresholdDotforceOverride: js.UndefOr[Boolean] = js.undefined
  @JSName("hystrix.circuit.volumeThreshold.override")
  var hystrixDotcircuitDotvolumeThresholdDotoverride: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.execution.timeoutInMilliseconds")
  var hystrixDotexecutionDottimeoutInMilliseconds: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.force.circuit.closed")
  var hystrixDotforceDotcircuitDotclosed: js.UndefOr[Boolean] = js.undefined
  @JSName("hystrix.force.circuit.open")
  var hystrixDotforceDotcircuitDotopen: js.UndefOr[Boolean] = js.undefined
  @JSName("hystrix.metrics.percentile.window.bucketsNumber")
  var hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.metrics.percentile.window.timeInMilliseconds")
  var hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.metrics.statistical.window.bucketsNumber")
  var hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.metrics.statistical.window.timeInMilliseconds")
  var hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.undefined
  @JSName("hystrix.promise.implementation")
  var hystrixDotpromiseDotimplementation: js.UndefOr[PromiseConstructorLike] = js.undefined
  @JSName("hystrix.request.volume.rejectionThreshold")
  var hystrixDotrequestDotvolumeDotrejectionThreshold: js.UndefOr[Double] = js.undefined
}

object HystrixProperties {
  @scala.inline
  def apply(
    hystrixDotcircuitDoterrorThresholdPercentage: Int | Double = null,
    hystrixDotcircuitDotsleepWindowInMilliseconds: Int | Double = null,
    hystrixDotcircuitDotvolumeThreshold: Int | Double = null,
    hystrixDotcircuitDotvolumeThresholdDotforceOverride: js.UndefOr[Boolean] = js.undefined,
    hystrixDotcircuitDotvolumeThresholdDotoverride: Int | Double = null,
    hystrixDotexecutionDottimeoutInMilliseconds: Int | Double = null,
    hystrixDotforceDotcircuitDotclosed: js.UndefOr[Boolean] = js.undefined,
    hystrixDotforceDotcircuitDotopen: js.UndefOr[Boolean] = js.undefined,
    hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: Int | Double = null,
    hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: Int | Double = null,
    hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: Int | Double = null,
    hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: Int | Double = null,
    hystrixDotpromiseDotimplementation: PromiseConstructorLike = null,
    hystrixDotrequestDotvolumeDotrejectionThreshold: Int | Double = null
  ): HystrixProperties = {
    val __obj = js.Dynamic.literal()
    if (hystrixDotcircuitDoterrorThresholdPercentage != null) __obj.updateDynamic("hystrix.circuit.errorThresholdPercentage")(hystrixDotcircuitDoterrorThresholdPercentage.asInstanceOf[js.Any])
    if (hystrixDotcircuitDotsleepWindowInMilliseconds != null) __obj.updateDynamic("hystrix.circuit.sleepWindowInMilliseconds")(hystrixDotcircuitDotsleepWindowInMilliseconds.asInstanceOf[js.Any])
    if (hystrixDotcircuitDotvolumeThreshold != null) __obj.updateDynamic("hystrix.circuit.volumeThreshold")(hystrixDotcircuitDotvolumeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotcircuitDotvolumeThresholdDotforceOverride)) __obj.updateDynamic("hystrix.circuit.volumeThreshold.forceOverride")(hystrixDotcircuitDotvolumeThresholdDotforceOverride.asInstanceOf[js.Any])
    if (hystrixDotcircuitDotvolumeThresholdDotoverride != null) __obj.updateDynamic("hystrix.circuit.volumeThreshold.override")(hystrixDotcircuitDotvolumeThresholdDotoverride.asInstanceOf[js.Any])
    if (hystrixDotexecutionDottimeoutInMilliseconds != null) __obj.updateDynamic("hystrix.execution.timeoutInMilliseconds")(hystrixDotexecutionDottimeoutInMilliseconds.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotforceDotcircuitDotclosed)) __obj.updateDynamic("hystrix.force.circuit.closed")(hystrixDotforceDotcircuitDotclosed.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotforceDotcircuitDotopen)) __obj.updateDynamic("hystrix.force.circuit.open")(hystrixDotforceDotcircuitDotopen.asInstanceOf[js.Any])
    if (hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber != null) __obj.updateDynamic("hystrix.metrics.percentile.window.bucketsNumber")(hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber.asInstanceOf[js.Any])
    if (hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds != null) __obj.updateDynamic("hystrix.metrics.percentile.window.timeInMilliseconds")(hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds.asInstanceOf[js.Any])
    if (hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber != null) __obj.updateDynamic("hystrix.metrics.statistical.window.bucketsNumber")(hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber.asInstanceOf[js.Any])
    if (hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds != null) __obj.updateDynamic("hystrix.metrics.statistical.window.timeInMilliseconds")(hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds.asInstanceOf[js.Any])
    if (hystrixDotpromiseDotimplementation != null) __obj.updateDynamic("hystrix.promise.implementation")(hystrixDotpromiseDotimplementation.asInstanceOf[js.Any])
    if (hystrixDotrequestDotvolumeDotrejectionThreshold != null) __obj.updateDynamic("hystrix.request.volume.rejectionThreshold")(hystrixDotrequestDotvolumeDotrejectionThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[HystrixProperties]
  }
}


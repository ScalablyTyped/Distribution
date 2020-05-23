package typings.hystrixjs.mod

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
    hystrixDotcircuitDoterrorThresholdPercentage: js.UndefOr[Double] = js.undefined,
    hystrixDotcircuitDotsleepWindowInMilliseconds: js.UndefOr[Double] = js.undefined,
    hystrixDotcircuitDotvolumeThreshold: js.UndefOr[Double] = js.undefined,
    hystrixDotcircuitDotvolumeThresholdDotforceOverride: js.UndefOr[Boolean] = js.undefined,
    hystrixDotcircuitDotvolumeThresholdDotoverride: js.UndefOr[Double] = js.undefined,
    hystrixDotexecutionDottimeoutInMilliseconds: js.UndefOr[Double] = js.undefined,
    hystrixDotforceDotcircuitDotclosed: js.UndefOr[Boolean] = js.undefined,
    hystrixDotforceDotcircuitDotopen: js.UndefOr[Boolean] = js.undefined,
    hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: js.UndefOr[Double] = js.undefined,
    hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.undefined,
    hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: js.UndefOr[Double] = js.undefined,
    hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.undefined,
    hystrixDotpromiseDotimplementation: PromiseConstructorLike = null,
    hystrixDotrequestDotvolumeDotrejectionThreshold: js.UndefOr[Double] = js.undefined
  ): HystrixProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hystrixDotcircuitDoterrorThresholdPercentage)) __obj.updateDynamic("hystrix.circuit.errorThresholdPercentage")(hystrixDotcircuitDoterrorThresholdPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotcircuitDotsleepWindowInMilliseconds)) __obj.updateDynamic("hystrix.circuit.sleepWindowInMilliseconds")(hystrixDotcircuitDotsleepWindowInMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotcircuitDotvolumeThreshold)) __obj.updateDynamic("hystrix.circuit.volumeThreshold")(hystrixDotcircuitDotvolumeThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotcircuitDotvolumeThresholdDotforceOverride)) __obj.updateDynamic("hystrix.circuit.volumeThreshold.forceOverride")(hystrixDotcircuitDotvolumeThresholdDotforceOverride.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotcircuitDotvolumeThresholdDotoverride)) __obj.updateDynamic("hystrix.circuit.volumeThreshold.override")(hystrixDotcircuitDotvolumeThresholdDotoverride.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotexecutionDottimeoutInMilliseconds)) __obj.updateDynamic("hystrix.execution.timeoutInMilliseconds")(hystrixDotexecutionDottimeoutInMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotforceDotcircuitDotclosed)) __obj.updateDynamic("hystrix.force.circuit.closed")(hystrixDotforceDotcircuitDotclosed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotforceDotcircuitDotopen)) __obj.updateDynamic("hystrix.force.circuit.open")(hystrixDotforceDotcircuitDotopen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber)) __obj.updateDynamic("hystrix.metrics.percentile.window.bucketsNumber")(hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds)) __obj.updateDynamic("hystrix.metrics.percentile.window.timeInMilliseconds")(hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber)) __obj.updateDynamic("hystrix.metrics.statistical.window.bucketsNumber")(hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds)) __obj.updateDynamic("hystrix.metrics.statistical.window.timeInMilliseconds")(hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds.get.asInstanceOf[js.Any])
    if (hystrixDotpromiseDotimplementation != null) __obj.updateDynamic("hystrix.promise.implementation")(hystrixDotpromiseDotimplementation.asInstanceOf[js.Any])
    if (!js.isUndefined(hystrixDotrequestDotvolumeDotrejectionThreshold)) __obj.updateDynamic("hystrix.request.volume.rejectionThreshold")(hystrixDotrequestDotvolumeDotrejectionThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HystrixProperties]
  }
}


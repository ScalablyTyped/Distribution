package typings.hystrixjs.mod

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HystrixProperties extends js.Object {
  @JSName("hystrix.circuit.errorThresholdPercentage")
  var hystrixDotcircuitDoterrorThresholdPercentage: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.sleepWindowInMilliseconds")
  var hystrixDotcircuitDotsleepWindowInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.volumeThreshold")
  var hystrixDotcircuitDotvolumeThreshold: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.volumeThreshold.forceOverride")
  var hystrixDotcircuitDotvolumeThresholdDotforceOverride: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.circuit.volumeThreshold.override")
  var hystrixDotcircuitDotvolumeThresholdDotoverride: js.UndefOr[Double] = js.native
  @JSName("hystrix.execution.timeoutInMilliseconds")
  var hystrixDotexecutionDottimeoutInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.force.circuit.closed")
  var hystrixDotforceDotcircuitDotclosed: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.force.circuit.open")
  var hystrixDotforceDotcircuitDotopen: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.metrics.percentile.window.bucketsNumber")
  var hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.percentile.window.timeInMilliseconds")
  var hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.statistical.window.bucketsNumber")
  var hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.statistical.window.timeInMilliseconds")
  var hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.promise.implementation")
  var hystrixDotpromiseDotimplementation: js.UndefOr[PromiseConstructorLike] = js.native
  @JSName("hystrix.request.volume.rejectionThreshold")
  var hystrixDotrequestDotvolumeDotrejectionThreshold: js.UndefOr[Double] = js.native
}

object HystrixProperties {
  @scala.inline
  def apply(): HystrixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HystrixProperties]
  }
  @scala.inline
  implicit class HystrixPropertiesOps[Self <: HystrixProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHystrixDotcircuitDoterrorThresholdPercentage(value: Double): Self = this.set("hystrix.circuit.errorThresholdPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotcircuitDoterrorThresholdPercentage: Self = this.set("hystrix.circuit.errorThresholdPercentage", js.undefined)
    @scala.inline
    def setHystrixDotcircuitDotsleepWindowInMilliseconds(value: Double): Self = this.set("hystrix.circuit.sleepWindowInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotcircuitDotsleepWindowInMilliseconds: Self = this.set("hystrix.circuit.sleepWindowInMilliseconds", js.undefined)
    @scala.inline
    def setHystrixDotcircuitDotvolumeThreshold(value: Double): Self = this.set("hystrix.circuit.volumeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotcircuitDotvolumeThreshold: Self = this.set("hystrix.circuit.volumeThreshold", js.undefined)
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotforceOverride(value: Boolean): Self = this.set("hystrix.circuit.volumeThreshold.forceOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotcircuitDotvolumeThresholdDotforceOverride: Self = this.set("hystrix.circuit.volumeThreshold.forceOverride", js.undefined)
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotoverride(value: Double): Self = this.set("hystrix.circuit.volumeThreshold.override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotcircuitDotvolumeThresholdDotoverride: Self = this.set("hystrix.circuit.volumeThreshold.override", js.undefined)
    @scala.inline
    def setHystrixDotexecutionDottimeoutInMilliseconds(value: Double): Self = this.set("hystrix.execution.timeoutInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotexecutionDottimeoutInMilliseconds: Self = this.set("hystrix.execution.timeoutInMilliseconds", js.undefined)
    @scala.inline
    def setHystrixDotforceDotcircuitDotclosed(value: Boolean): Self = this.set("hystrix.force.circuit.closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotforceDotcircuitDotclosed: Self = this.set("hystrix.force.circuit.closed", js.undefined)
    @scala.inline
    def setHystrixDotforceDotcircuitDotopen(value: Boolean): Self = this.set("hystrix.force.circuit.open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotforceDotcircuitDotopen: Self = this.set("hystrix.force.circuit.open", js.undefined)
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDotbucketsNumber(value: Double): Self = this.set("hystrix.metrics.percentile.window.bucketsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: Self = this.set("hystrix.metrics.percentile.window.bucketsNumber", js.undefined)
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds(value: Double): Self = this.set("hystrix.metrics.percentile.window.timeInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: Self = this.set("hystrix.metrics.percentile.window.timeInMilliseconds", js.undefined)
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber(value: Double): Self = this.set("hystrix.metrics.statistical.window.bucketsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: Self = this.set("hystrix.metrics.statistical.window.bucketsNumber", js.undefined)
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds(value: Double): Self = this.set("hystrix.metrics.statistical.window.timeInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: Self = this.set("hystrix.metrics.statistical.window.timeInMilliseconds", js.undefined)
    @scala.inline
    def setHystrixDotpromiseDotimplementation(value: PromiseConstructorLike): Self = this.set("hystrix.promise.implementation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotpromiseDotimplementation: Self = this.set("hystrix.promise.implementation", js.undefined)
    @scala.inline
    def setHystrixDotrequestDotvolumeDotrejectionThreshold(value: Double): Self = this.set("hystrix.request.volume.rejectionThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHystrixDotrequestDotvolumeDotrejectionThreshold: Self = this.set("hystrix.request.volume.rejectionThreshold", js.undefined)
  }
  
}


package typings.hystrixjs.mod

import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HystrixProperties extends StObject {
  
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
  implicit class HystrixPropertiesMutableBuilder[Self <: HystrixProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHystrixDotcircuitDoterrorThresholdPercentage(value: Double): Self = StObject.set(x, "hystrix.circuit.errorThresholdPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotcircuitDoterrorThresholdPercentageUndefined: Self = StObject.set(x, "hystrix.circuit.errorThresholdPercentage", js.undefined)
    
    @scala.inline
    def setHystrixDotcircuitDotsleepWindowInMilliseconds(value: Double): Self = StObject.set(x, "hystrix.circuit.sleepWindowInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotcircuitDotsleepWindowInMillisecondsUndefined: Self = StObject.set(x, "hystrix.circuit.sleepWindowInMilliseconds", js.undefined)
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThreshold(value: Double): Self = StObject.set(x, "hystrix.circuit.volumeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotforceOverride(value: Boolean): Self = StObject.set(x, "hystrix.circuit.volumeThreshold.forceOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotforceOverrideUndefined: Self = StObject.set(x, "hystrix.circuit.volumeThreshold.forceOverride", js.undefined)
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotoverride(value: Double): Self = StObject.set(x, "hystrix.circuit.volumeThreshold.override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdDotoverrideUndefined: Self = StObject.set(x, "hystrix.circuit.volumeThreshold.override", js.undefined)
    
    @scala.inline
    def setHystrixDotcircuitDotvolumeThresholdUndefined: Self = StObject.set(x, "hystrix.circuit.volumeThreshold", js.undefined)
    
    @scala.inline
    def setHystrixDotexecutionDottimeoutInMilliseconds(value: Double): Self = StObject.set(x, "hystrix.execution.timeoutInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotexecutionDottimeoutInMillisecondsUndefined: Self = StObject.set(x, "hystrix.execution.timeoutInMilliseconds", js.undefined)
    
    @scala.inline
    def setHystrixDotforceDotcircuitDotclosed(value: Boolean): Self = StObject.set(x, "hystrix.force.circuit.closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotforceDotcircuitDotclosedUndefined: Self = StObject.set(x, "hystrix.force.circuit.closed", js.undefined)
    
    @scala.inline
    def setHystrixDotforceDotcircuitDotopen(value: Boolean): Self = StObject.set(x, "hystrix.force.circuit.open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotforceDotcircuitDotopenUndefined: Self = StObject.set(x, "hystrix.force.circuit.open", js.undefined)
    
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDotbucketsNumber(value: Double): Self = StObject.set(x, "hystrix.metrics.percentile.window.bucketsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDotbucketsNumberUndefined: Self = StObject.set(x, "hystrix.metrics.percentile.window.bucketsNumber", js.undefined)
    
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds(value: Double): Self = StObject.set(x, "hystrix.metrics.percentile.window.timeInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotmetricsDotpercentileDotwindowDottimeInMillisecondsUndefined: Self = StObject.set(x, "hystrix.metrics.percentile.window.timeInMilliseconds", js.undefined)
    
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber(value: Double): Self = StObject.set(x, "hystrix.metrics.statistical.window.bucketsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumberUndefined: Self = StObject.set(x, "hystrix.metrics.statistical.window.bucketsNumber", js.undefined)
    
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds(value: Double): Self = StObject.set(x, "hystrix.metrics.statistical.window.timeInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotmetricsDotstatisticalDotwindowDottimeInMillisecondsUndefined: Self = StObject.set(x, "hystrix.metrics.statistical.window.timeInMilliseconds", js.undefined)
    
    @scala.inline
    def setHystrixDotpromiseDotimplementation(value: PromiseConstructorLike): Self = StObject.set(x, "hystrix.promise.implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotpromiseDotimplementationUndefined: Self = StObject.set(x, "hystrix.promise.implementation", js.undefined)
    
    @scala.inline
    def setHystrixDotrequestDotvolumeDotrejectionThreshold(value: Double): Self = StObject.set(x, "hystrix.request.volume.rejectionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHystrixDotrequestDotvolumeDotrejectionThresholdUndefined: Self = StObject.set(x, "hystrix.request.volume.rejectionThreshold", js.undefined)
  }
}

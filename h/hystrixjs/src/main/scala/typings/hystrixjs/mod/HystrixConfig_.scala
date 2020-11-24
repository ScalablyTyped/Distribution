package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HystrixConfig_ extends js.Object {
  
  def circuitBreakerErrorThresholdPercentage(): Double = js.native
  
  def circuitBreakerForceClosed(): Boolean = js.native
  
  def circuitBreakerForceOpened(): Boolean = js.native
  
  def circuitBreakerRequestVolumeThreshold(): Double = js.native
  
  def circuitBreakerRequestVolumeThresholdForceOverride(): Boolean = js.native
  
  def circuitBreakerRequestVolumeThresholdOverride(): Double = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(): Double = js.native
  
  def executionTimeoutInMilliseconds(): Double = js.native
  
  def init(properties: HystrixProperties): Unit = js.native
  
  def metricsPercentileWindowBuckets(): Double = js.native
  
  def metricsPercentileWindowInMilliseconds(): Double = js.native
  
  def metricsStatisticalWindowBuckets(): Double = js.native
  
  def metricsStatisticalWindowInMilliseconds(): Double = js.native
  
  def requestVolumeRejectionThreshold(): Double = js.native
  
  def resetProperties(): Unit = js.native
}
object HystrixConfig_ {
  
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: () => Double,
    circuitBreakerForceClosed: () => Boolean,
    circuitBreakerForceOpened: () => Boolean,
    circuitBreakerRequestVolumeThreshold: () => Double,
    circuitBreakerRequestVolumeThresholdForceOverride: () => Boolean,
    circuitBreakerRequestVolumeThresholdOverride: () => Double,
    circuitBreakerSleepWindowInMilliseconds: () => Double,
    executionTimeoutInMilliseconds: () => Double,
    init: HystrixProperties => Unit,
    metricsPercentileWindowBuckets: () => Double,
    metricsPercentileWindowInMilliseconds: () => Double,
    metricsStatisticalWindowBuckets: () => Double,
    metricsStatisticalWindowInMilliseconds: () => Double,
    requestVolumeRejectionThreshold: () => Double,
    resetProperties: () => Unit
  ): HystrixConfig_ = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = js.Any.fromFunction0(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction0(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction0(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction0(circuitBreakerRequestVolumeThreshold), circuitBreakerRequestVolumeThresholdForceOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdForceOverride), circuitBreakerRequestVolumeThresholdOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdOverride), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction0(circuitBreakerSleepWindowInMilliseconds), executionTimeoutInMilliseconds = js.Any.fromFunction0(executionTimeoutInMilliseconds), init = js.Any.fromFunction1(init), metricsPercentileWindowBuckets = js.Any.fromFunction0(metricsPercentileWindowBuckets), metricsPercentileWindowInMilliseconds = js.Any.fromFunction0(metricsPercentileWindowInMilliseconds), metricsStatisticalWindowBuckets = js.Any.fromFunction0(metricsStatisticalWindowBuckets), metricsStatisticalWindowInMilliseconds = js.Any.fromFunction0(metricsStatisticalWindowInMilliseconds), requestVolumeRejectionThreshold = js.Any.fromFunction0(requestVolumeRejectionThreshold), resetProperties = js.Any.fromFunction0(resetProperties))
    __obj.asInstanceOf[HystrixConfig_]
  }
  
  @scala.inline
  implicit class HystrixConfig_Ops[Self <: HystrixConfig_] (val x: Self) extends AnyVal {
    
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
    def setCircuitBreakerErrorThresholdPercentage(value: () => Double): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: () => Boolean): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: () => Boolean): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: () => Double): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThresholdForceOverride(value: () => Boolean): Self = this.set("circuitBreakerRequestVolumeThresholdForceOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThresholdOverride(value: () => Double): Self = this.set("circuitBreakerRequestVolumeThresholdOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: () => Double): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecutionTimeoutInMilliseconds(value: () => Double): Self = this.set("executionTimeoutInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: HystrixProperties => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetricsPercentileWindowBuckets(value: () => Double): Self = this.set("metricsPercentileWindowBuckets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsPercentileWindowInMilliseconds(value: () => Double): Self = this.set("metricsPercentileWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsStatisticalWindowBuckets(value: () => Double): Self = this.set("metricsStatisticalWindowBuckets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsStatisticalWindowInMilliseconds(value: () => Double): Self = this.set("metricsStatisticalWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: () => Double): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetProperties(value: () => Unit): Self = this.set("resetProperties", js.Any.fromFunction0(value))
  }
}

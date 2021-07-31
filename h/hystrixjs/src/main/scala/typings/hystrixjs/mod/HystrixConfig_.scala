package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HystrixConfig_ extends StObject {
  
  def circuitBreakerErrorThresholdPercentage(): Double
  
  def circuitBreakerForceClosed(): Boolean
  
  def circuitBreakerForceOpened(): Boolean
  
  def circuitBreakerRequestVolumeThreshold(): Double
  
  def circuitBreakerRequestVolumeThresholdForceOverride(): Boolean
  
  def circuitBreakerRequestVolumeThresholdOverride(): Double
  
  def circuitBreakerSleepWindowInMilliseconds(): Double
  
  def executionTimeoutInMilliseconds(): Double
  
  def init(properties: HystrixProperties): Unit
  
  def metricsPercentileWindowBuckets(): Double
  
  def metricsPercentileWindowInMilliseconds(): Double
  
  def metricsStatisticalWindowBuckets(): Double
  
  def metricsStatisticalWindowInMilliseconds(): Double
  
  def requestVolumeRejectionThreshold(): Double
  
  def resetProperties(): Unit
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
  implicit class HystrixConfig_MutableBuilder[Self <: HystrixConfig_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: () => Double): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: () => Boolean): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: () => Boolean): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: () => Double): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThresholdForceOverride(value: () => Boolean): Self = StObject.set(x, "circuitBreakerRequestVolumeThresholdForceOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThresholdOverride(value: () => Double): Self = StObject.set(x, "circuitBreakerRequestVolumeThresholdOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: () => Double): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecutionTimeoutInMilliseconds(value: () => Double): Self = StObject.set(x, "executionTimeoutInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: HystrixProperties => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMetricsPercentileWindowBuckets(value: () => Double): Self = StObject.set(x, "metricsPercentileWindowBuckets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsPercentileWindowInMilliseconds(value: () => Double): Self = StObject.set(x, "metricsPercentileWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsStatisticalWindowBuckets(value: () => Double): Self = StObject.set(x, "metricsStatisticalWindowBuckets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricsStatisticalWindowInMilliseconds(value: () => Double): Self = StObject.set(x, "metricsStatisticalWindowInMilliseconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: () => Double): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetProperties(value: () => Unit): Self = StObject.set(x, "resetProperties", js.Any.fromFunction0(value))
  }
}

package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixConfig_ extends js.Object {
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
}


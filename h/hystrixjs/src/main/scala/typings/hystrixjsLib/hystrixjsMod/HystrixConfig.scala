package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixConfig extends js.Object {
  def circuitBreakerErrorThresholdPercentage(): scala.Double
  def circuitBreakerForceClosed(): scala.Boolean
  def circuitBreakerForceOpened(): scala.Boolean
  def circuitBreakerRequestVolumeThreshold(): scala.Double
  def circuitBreakerRequestVolumeThresholdForceOverride(): scala.Boolean
  def circuitBreakerRequestVolumeThresholdOverride(): scala.Double
  def circuitBreakerSleepWindowInMilliseconds(): scala.Double
  def executionTimeoutInMilliseconds(): scala.Double
  def init(properties: HystrixProperties): scala.Unit
  def metricsPercentileWindowBuckets(): scala.Double
  def metricsPercentileWindowInMilliseconds(): scala.Double
  def metricsStatisticalWindowBuckets(): scala.Double
  def metricsStatisticalWindowInMilliseconds(): scala.Double
  def requestVolumeRejectionThreshold(): scala.Double
  def resetProperties(): scala.Unit
}

object HystrixConfig {
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: () => scala.Double,
    circuitBreakerForceClosed: () => scala.Boolean,
    circuitBreakerForceOpened: () => scala.Boolean,
    circuitBreakerRequestVolumeThreshold: () => scala.Double,
    circuitBreakerRequestVolumeThresholdForceOverride: () => scala.Boolean,
    circuitBreakerRequestVolumeThresholdOverride: () => scala.Double,
    circuitBreakerSleepWindowInMilliseconds: () => scala.Double,
    executionTimeoutInMilliseconds: () => scala.Double,
    init: HystrixProperties => scala.Unit,
    metricsPercentileWindowBuckets: () => scala.Double,
    metricsPercentileWindowInMilliseconds: () => scala.Double,
    metricsStatisticalWindowBuckets: () => scala.Double,
    metricsStatisticalWindowInMilliseconds: () => scala.Double,
    requestVolumeRejectionThreshold: () => scala.Double,
    resetProperties: () => scala.Unit
  ): HystrixConfig = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = js.Any.fromFunction0(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction0(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction0(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction0(circuitBreakerRequestVolumeThreshold), circuitBreakerRequestVolumeThresholdForceOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdForceOverride), circuitBreakerRequestVolumeThresholdOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdOverride), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction0(circuitBreakerSleepWindowInMilliseconds), executionTimeoutInMilliseconds = js.Any.fromFunction0(executionTimeoutInMilliseconds), init = js.Any.fromFunction1(init), metricsPercentileWindowBuckets = js.Any.fromFunction0(metricsPercentileWindowBuckets), metricsPercentileWindowInMilliseconds = js.Any.fromFunction0(metricsPercentileWindowInMilliseconds), metricsStatisticalWindowBuckets = js.Any.fromFunction0(metricsStatisticalWindowBuckets), metricsStatisticalWindowInMilliseconds = js.Any.fromFunction0(metricsStatisticalWindowInMilliseconds), requestVolumeRejectionThreshold = js.Any.fromFunction0(requestVolumeRejectionThreshold), resetProperties = js.Any.fromFunction0(resetProperties))
  
    __obj.asInstanceOf[HystrixConfig]
  }
}


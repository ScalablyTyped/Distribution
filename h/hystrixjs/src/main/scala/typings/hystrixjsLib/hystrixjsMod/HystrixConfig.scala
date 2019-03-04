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
    circuitBreakerErrorThresholdPercentage: js.Function0[scala.Double],
    circuitBreakerForceClosed: js.Function0[scala.Boolean],
    circuitBreakerForceOpened: js.Function0[scala.Boolean],
    circuitBreakerRequestVolumeThreshold: js.Function0[scala.Double],
    circuitBreakerRequestVolumeThresholdForceOverride: js.Function0[scala.Boolean],
    circuitBreakerRequestVolumeThresholdOverride: js.Function0[scala.Double],
    circuitBreakerSleepWindowInMilliseconds: js.Function0[scala.Double],
    executionTimeoutInMilliseconds: js.Function0[scala.Double],
    init: js.Function1[HystrixProperties, scala.Unit],
    metricsPercentileWindowBuckets: js.Function0[scala.Double],
    metricsPercentileWindowInMilliseconds: js.Function0[scala.Double],
    metricsStatisticalWindowBuckets: js.Function0[scala.Double],
    metricsStatisticalWindowInMilliseconds: js.Function0[scala.Double],
    requestVolumeRejectionThreshold: js.Function0[scala.Double],
    resetProperties: js.Function0[scala.Unit]
  ): HystrixConfig = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerRequestVolumeThresholdForceOverride = circuitBreakerRequestVolumeThresholdForceOverride, circuitBreakerRequestVolumeThresholdOverride = circuitBreakerRequestVolumeThresholdOverride, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, executionTimeoutInMilliseconds = executionTimeoutInMilliseconds, init = init, metricsPercentileWindowBuckets = metricsPercentileWindowBuckets, metricsPercentileWindowInMilliseconds = metricsPercentileWindowInMilliseconds, metricsStatisticalWindowBuckets = metricsStatisticalWindowBuckets, metricsStatisticalWindowInMilliseconds = metricsStatisticalWindowInMilliseconds, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, resetProperties = resetProperties)
  
    __obj.asInstanceOf[HystrixConfig]
  }
}


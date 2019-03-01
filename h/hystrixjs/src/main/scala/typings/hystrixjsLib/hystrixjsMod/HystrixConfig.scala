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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(circuitBreakerErrorThresholdPercentage)
    __obj.updateDynamic("circuitBreakerForceClosed")(circuitBreakerForceClosed)
    __obj.updateDynamic("circuitBreakerForceOpened")(circuitBreakerForceOpened)
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(circuitBreakerRequestVolumeThreshold)
    __obj.updateDynamic("circuitBreakerRequestVolumeThresholdForceOverride")(circuitBreakerRequestVolumeThresholdForceOverride)
    __obj.updateDynamic("circuitBreakerRequestVolumeThresholdOverride")(circuitBreakerRequestVolumeThresholdOverride)
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(circuitBreakerSleepWindowInMilliseconds)
    __obj.updateDynamic("executionTimeoutInMilliseconds")(executionTimeoutInMilliseconds)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("metricsPercentileWindowBuckets")(metricsPercentileWindowBuckets)
    __obj.updateDynamic("metricsPercentileWindowInMilliseconds")(metricsPercentileWindowInMilliseconds)
    __obj.updateDynamic("metricsStatisticalWindowBuckets")(metricsStatisticalWindowBuckets)
    __obj.updateDynamic("metricsStatisticalWindowInMilliseconds")(metricsStatisticalWindowInMilliseconds)
    __obj.updateDynamic("requestVolumeRejectionThreshold")(requestVolumeRejectionThreshold)
    __obj.updateDynamic("resetProperties")(resetProperties)
    __obj.asInstanceOf[HystrixConfig]
  }
}


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


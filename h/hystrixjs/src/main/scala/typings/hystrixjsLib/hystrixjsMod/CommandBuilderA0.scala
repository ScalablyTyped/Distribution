package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA0[R] extends js.Object {
  def build(): CommandA0[R]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA0[R]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA0[R]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA0[R]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA0[R]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA0[R]
  def context(value: js.Any): CommandBuilderA0[R]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA0[R]
  def fallbackTo(value: js.Function1[/* error */ stdLib.Error, js.Thenable[R]]): CommandBuilderA0[R]
  def percentileWindowLength(value: scala.Double): CommandBuilderA0[R]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA0[R]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA0[R]
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA0[R]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA0[R]
  def timeout(value: scala.Double): CommandBuilderA0[R]
}


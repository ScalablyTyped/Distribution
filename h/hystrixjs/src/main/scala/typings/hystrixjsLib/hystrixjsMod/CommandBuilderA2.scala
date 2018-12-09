package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA2[R, T, U] extends js.Object {
  def build(): CommandA2[R, T, U]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA2[R, T, U]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA2[R, T, U]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA2[R, T, U]
  def context(value: js.Any): CommandBuilderA2[R, T, U]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA2[R, T, U]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def percentileWindowLength(value: scala.Double): CommandBuilderA2[R, T, U]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA2[R, T, U]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA2[R, T, U]
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA2[R, T, U]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA2[R, T, U]
  def timeout(value: scala.Double): CommandBuilderA2[R, T, U]
}


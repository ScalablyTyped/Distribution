package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA1[R, T] extends js.Object {
  def build(): CommandA1[R, T]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA1[R, T]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA1[R, T]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA1[R, T]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA1[R, T]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA1[R, T]
  def context(value: js.Any): CommandBuilderA1[R, T]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA1[R, T]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T]
  def percentileWindowLength(value: scala.Double): CommandBuilderA1[R, T]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA1[R, T]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA1[R, T]
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA1[R, T]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA1[R, T]
  def timeout(value: scala.Double): CommandBuilderA1[R, T]
}


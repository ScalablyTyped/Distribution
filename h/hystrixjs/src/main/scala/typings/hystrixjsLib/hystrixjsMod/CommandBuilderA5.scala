package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  def build(): CommandA5[R, T, U, V, W, X]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA5[R, T, U, V, W, X]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowLength(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def timeout(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
}


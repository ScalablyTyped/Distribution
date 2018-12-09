package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  def build(): CommandA6[R, T, U, V, W, X, Y]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def fallbackTo(
    value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowLength(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def timeout(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
}


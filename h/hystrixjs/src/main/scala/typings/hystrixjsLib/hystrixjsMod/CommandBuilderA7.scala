package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def build(): CommandA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def fallbackTo(
    value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowLength(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def timeout(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
}


package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  def build(): CommandA4[R, T, U, V, W]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA4[R, T, U, V, W]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowLength(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def timeout(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
}


package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA3[R, T, U, V] extends js.Object {
  def build(): CommandA3[R, T, U, V]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def context(value: js.Any): CommandBuilderA3[R, T, U, V]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA3[R, T, U, V]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def percentileWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def timeout(value: scala.Double): CommandBuilderA3[R, T, U, V]
}


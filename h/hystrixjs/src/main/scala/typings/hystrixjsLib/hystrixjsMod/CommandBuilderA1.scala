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

object CommandBuilderA1 {
  @scala.inline
  def apply[R, T](
    build: () => CommandA1[R, T],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA1[R, T],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA1[R, T],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA1[R, T],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA1[R, T],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA1[R, T],
    context: js.Any => CommandBuilderA1[R, T],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA1[R, T],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T],
    percentileWindowLength: scala.Double => CommandBuilderA1[R, T],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA1[R, T],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA1[R, T],
    run: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T],
    statisticalWindowLength: scala.Double => CommandBuilderA1[R, T],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA1[R, T],
    timeout: scala.Double => CommandBuilderA1[R, T]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
}


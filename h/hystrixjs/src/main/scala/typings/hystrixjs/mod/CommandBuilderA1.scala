package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA1[R, T] extends js.Object {
  def build(): CommandA1[R, T]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA1[R, T]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA1[R, T]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA1[R, T]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA1[R, T]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA1[R, T]
  def context(value: js.Any): CommandBuilderA1[R, T]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA1[R, T]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T]
  def percentileWindowLength(value: Double): CommandBuilderA1[R, T]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA1[R, T]
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T]
  def statisticalWindowLength(value: Double): CommandBuilderA1[R, T]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  def timeout(value: Double): CommandBuilderA1[R, T]
}

object CommandBuilderA1 {
  @scala.inline
  def apply[R, T](
    build: () => CommandA1[R, T],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA1[R, T],
    circuitBreakerForceClosed: Boolean => CommandBuilderA1[R, T],
    circuitBreakerForceOpened: Boolean => CommandBuilderA1[R, T],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA1[R, T],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA1[R, T],
    context: js.Any => CommandBuilderA1[R, T],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA1[R, T],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T],
    percentileWindowLength: Double => CommandBuilderA1[R, T],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    requestVolumeRejectionThreshold: Double => CommandBuilderA1[R, T],
    run: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T],
    statisticalWindowLength: Double => CommandBuilderA1[R, T],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    timeout: Double => CommandBuilderA1[R, T]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
}


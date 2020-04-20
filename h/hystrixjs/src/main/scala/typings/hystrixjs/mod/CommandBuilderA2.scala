package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA2[R, T, U] extends js.Object {
  def build(): CommandA2[R, T, U]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA2[R, T, U]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA2[R, T, U]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA2[R, T, U]
  def context(value: js.Any): CommandBuilderA2[R, T, U]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA2[R, T, U]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def percentileWindowLength(value: Double): CommandBuilderA2[R, T, U]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA2[R, T, U]
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def statisticalWindowLength(value: Double): CommandBuilderA2[R, T, U]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  def timeout(value: Double): CommandBuilderA2[R, T, U]
}

object CommandBuilderA2 {
  @scala.inline
  def apply[R, T, U](
    build: () => CommandA2[R, T, U],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA2[R, T, U],
    circuitBreakerForceClosed: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerForceOpened: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA2[R, T, U],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA2[R, T, U],
    context: js.Any => CommandBuilderA2[R, T, U],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA2[R, T, U],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U],
    percentileWindowLength: Double => CommandBuilderA2[R, T, U],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    requestVolumeRejectionThreshold: Double => CommandBuilderA2[R, T, U],
    run: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U],
    statisticalWindowLength: Double => CommandBuilderA2[R, T, U],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    timeout: Double => CommandBuilderA2[R, T, U]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
}


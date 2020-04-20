package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA0[R] extends js.Object {
  def build(): CommandA0[R]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA0[R]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA0[R]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA0[R]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA0[R]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA0[R]
  def context(value: js.Any): CommandBuilderA0[R]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA0[R]
  def fallbackTo(value: js.Function1[/* error */ Error, js.Thenable[R]]): CommandBuilderA0[R]
  def percentileWindowLength(value: Double): CommandBuilderA0[R]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA0[R]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA0[R]
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R]
  def statisticalWindowLength(value: Double): CommandBuilderA0[R]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA0[R]
  def timeout(value: Double): CommandBuilderA0[R]
}

object CommandBuilderA0 {
  @scala.inline
  def apply[R](
    build: () => CommandA0[R],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA0[R],
    circuitBreakerForceClosed: Boolean => CommandBuilderA0[R],
    circuitBreakerForceOpened: Boolean => CommandBuilderA0[R],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA0[R],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA0[R],
    context: js.Any => CommandBuilderA0[R],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA0[R],
    fallbackTo: js.Function1[/* error */ Error, js.Thenable[R]] => CommandBuilderA0[R],
    percentileWindowLength: Double => CommandBuilderA0[R],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    requestVolumeRejectionThreshold: Double => CommandBuilderA0[R],
    run: js.Function0[js.Thenable[R]] => CommandBuilderA0[R],
    statisticalWindowLength: Double => CommandBuilderA0[R],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    timeout: Double => CommandBuilderA0[R]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
}


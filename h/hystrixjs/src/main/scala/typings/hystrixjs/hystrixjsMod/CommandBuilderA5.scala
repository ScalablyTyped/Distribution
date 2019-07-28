package typings.hystrixjs.hystrixjsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  def build(): CommandA5[R, T, U, V, W, X]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA5[R, T, U, V, W, X]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  def timeout(value: Double): CommandBuilderA5[R, T, U, V, W, X]
}

object CommandBuilderA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](
    build: () => CommandA5[R, T, U, V, W, X],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceClosed: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceOpened: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA5[R, T, U, V, W, X],
    context: js.Any => CommandBuilderA5[R, T, U, V, W, X],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    requestVolumeRejectionThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    run: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    timeout: Double => CommandBuilderA5[R, T, U, V, W, X]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
}


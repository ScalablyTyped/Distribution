package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def build(): CommandA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def timeout(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
}

object CommandBuilderA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](
    build: () => CommandA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceClosed: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceOpened: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    context: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    requestVolumeRejectionThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    run: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    timeout: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  }
}


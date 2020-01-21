package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  def build(): CommandA4[R, T, U, V, W]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA4[R, T, U, V, W]
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA4[R, T, U, V, W]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA4[R, T, U, V, W]
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W]
  def timeout(value: Double): CommandBuilderA4[R, T, U, V, W]
}

object CommandBuilderA4 {
  @scala.inline
  def apply[R, T, U, V, W](
    build: () => CommandA4[R, T, U, V, W],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceClosed: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceOpened: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA4[R, T, U, V, W],
    context: js.Any => CommandBuilderA4[R, T, U, V, W],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA4[R, T, U, V, W],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    percentileWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    requestVolumeRejectionThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    run: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    timeout: Double => CommandBuilderA4[R, T, U, V, W]
  ): CommandBuilderA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
}


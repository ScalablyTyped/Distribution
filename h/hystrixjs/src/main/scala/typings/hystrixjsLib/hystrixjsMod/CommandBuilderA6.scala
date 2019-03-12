package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  def build(): CommandA6[R, T, U, V, W, X, Y]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def fallbackTo(
    value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowLength(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def timeout(value: scala.Double): CommandBuilderA6[R, T, U, V, W, X, Y]
}

object CommandBuilderA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](
    build: () => CommandA6[R, T, U, V, W, X, Y],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    context: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowLength: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowLength: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    timeout: scala.Double => CommandBuilderA6[R, T, U, V, W, X, Y]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
}


package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def build(): CommandA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def fallbackTo(
    value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowLength(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  def timeout(value: scala.Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z]
}

object CommandBuilderA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](
    build: () => CommandA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    context: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowLength: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    run: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowLength: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    timeout: scala.Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  }
}


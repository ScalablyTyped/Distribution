package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  def build(): CommandA4[R, T, U, V, W]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA4[R, T, U, V, W]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowLength(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
  def timeout(value: scala.Double): CommandBuilderA4[R, T, U, V, W]
}

object CommandBuilderA4 {
  @scala.inline
  def apply[R, T, U, V, W](
    build: () => CommandA4[R, T, U, V, W],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA4[R, T, U, V, W],
    context: js.Any => CommandBuilderA4[R, T, U, V, W],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA4[R, T, U, V, W],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    percentileWindowLength: scala.Double => CommandBuilderA4[R, T, U, V, W],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA4[R, T, U, V, W],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA4[R, T, U, V, W],
    run: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowLength: scala.Double => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA4[R, T, U, V, W],
    timeout: scala.Double => CommandBuilderA4[R, T, U, V, W]
  ): CommandBuilderA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
}


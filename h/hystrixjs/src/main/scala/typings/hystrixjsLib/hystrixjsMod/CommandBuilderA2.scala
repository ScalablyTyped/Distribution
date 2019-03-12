package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA2[R, T, U] extends js.Object {
  def build(): CommandA2[R, T, U]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA2[R, T, U]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA2[R, T, U]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA2[R, T, U]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA2[R, T, U]
  def context(value: js.Any): CommandBuilderA2[R, T, U]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA2[R, T, U]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def percentileWindowLength(value: scala.Double): CommandBuilderA2[R, T, U]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA2[R, T, U]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA2[R, T, U]
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA2[R, T, U]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA2[R, T, U]
  def timeout(value: scala.Double): CommandBuilderA2[R, T, U]
}

object CommandBuilderA2 {
  @scala.inline
  def apply[R, T, U](
    build: () => CommandA2[R, T, U],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA2[R, T, U],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA2[R, T, U],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA2[R, T, U],
    context: js.Any => CommandBuilderA2[R, T, U],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA2[R, T, U],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U],
    percentileWindowLength: scala.Double => CommandBuilderA2[R, T, U],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA2[R, T, U],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA2[R, T, U],
    run: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U],
    statisticalWindowLength: scala.Double => CommandBuilderA2[R, T, U],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA2[R, T, U],
    timeout: scala.Double => CommandBuilderA2[R, T, U]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
}


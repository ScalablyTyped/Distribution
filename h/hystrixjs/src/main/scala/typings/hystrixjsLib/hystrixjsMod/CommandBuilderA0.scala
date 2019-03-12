package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA0[R] extends js.Object {
  def build(): CommandA0[R]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA0[R]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA0[R]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA0[R]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA0[R]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA0[R]
  def context(value: js.Any): CommandBuilderA0[R]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA0[R]
  def fallbackTo(value: js.Function1[/* error */ stdLib.Error, js.Thenable[R]]): CommandBuilderA0[R]
  def percentileWindowLength(value: scala.Double): CommandBuilderA0[R]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA0[R]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA0[R]
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA0[R]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA0[R]
  def timeout(value: scala.Double): CommandBuilderA0[R]
}

object CommandBuilderA0 {
  @scala.inline
  def apply[R](
    build: () => CommandA0[R],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA0[R],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA0[R],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA0[R],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA0[R],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA0[R],
    context: js.Any => CommandBuilderA0[R],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA0[R],
    fallbackTo: js.Function1[/* error */ stdLib.Error, js.Thenable[R]] => CommandBuilderA0[R],
    percentileWindowLength: scala.Double => CommandBuilderA0[R],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA0[R],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA0[R],
    run: js.Function0[js.Thenable[R]] => CommandBuilderA0[R],
    statisticalWindowLength: scala.Double => CommandBuilderA0[R],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA0[R],
    timeout: scala.Double => CommandBuilderA0[R]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
}


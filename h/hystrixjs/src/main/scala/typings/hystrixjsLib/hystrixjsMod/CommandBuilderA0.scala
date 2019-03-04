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
    build: js.Function0[CommandA0[R]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA0[R]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA0[R]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA0[R]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA0[R]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA0[R]],
    context: js.Function1[js.Any, CommandBuilderA0[R]],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilderA0[R]],
    fallbackTo: js.Function1[js.Function1[/* error */ stdLib.Error, js.Thenable[R]], CommandBuilderA0[R]],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA0[R]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA0[R]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA0[R]],
    run: js.Function1[js.Function0[js.Thenable[R]], CommandBuilderA0[R]],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA0[R]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA0[R]],
    timeout: js.Function1[scala.Double, CommandBuilderA0[R]]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal(build = build, circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, context = context, errorHandler = errorHandler, fallbackTo = fallbackTo, percentileWindowLength = percentileWindowLength, percentileWindowNumberOfBuckets = percentileWindowNumberOfBuckets, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, run = run, statisticalWindowLength = statisticalWindowLength, statisticalWindowNumberOfBuckets = statisticalWindowNumberOfBuckets, timeout = timeout)
  
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
}


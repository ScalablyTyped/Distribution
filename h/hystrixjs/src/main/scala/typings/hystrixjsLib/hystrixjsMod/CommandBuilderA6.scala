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
    build: js.Function0[CommandA6[R, T, U, V, W, X, Y]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    context: js.Function1[js.Any, CommandBuilderA6[R, T, U, V, W, X, Y]],
    errorHandler: js.Function1[
      js.Function1[/* error */ js.Any, scala.Boolean], 
      CommandBuilderA6[R, T, U, V, W, X, Y]
    ],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]], 
      CommandBuilderA6[R, T, U, V, W, X, Y]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    run: js.Function1[
      js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]], 
      CommandBuilderA6[R, T, U, V, W, X, Y]
    ],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]],
    timeout: js.Function1[scala.Double, CommandBuilderA6[R, T, U, V, W, X, Y]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = build, circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, context = context, errorHandler = errorHandler, fallbackTo = fallbackTo, percentileWindowLength = percentileWindowLength, percentileWindowNumberOfBuckets = percentileWindowNumberOfBuckets, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, run = run, statisticalWindowLength = statisticalWindowLength, statisticalWindowNumberOfBuckets = statisticalWindowNumberOfBuckets, timeout = timeout)
  
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
}


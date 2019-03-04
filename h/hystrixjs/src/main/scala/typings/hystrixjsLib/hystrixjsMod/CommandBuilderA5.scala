package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  def build(): CommandA5[R, T, U, V, W, X]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA5[R, T, U, V, W, X]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowLength(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
  def timeout(value: scala.Double): CommandBuilderA5[R, T, U, V, W, X]
}

object CommandBuilderA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](
    build: js.Function0[CommandA5[R, T, U, V, W, X]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    context: js.Function1[js.Any, CommandBuilderA5[R, T, U, V, W, X]],
    errorHandler: js.Function1[
      js.Function1[/* error */ js.Any, scala.Boolean], 
      CommandBuilderA5[R, T, U, V, W, X]
    ],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]], 
      CommandBuilderA5[R, T, U, V, W, X]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    run: js.Function1[
      js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]], 
      CommandBuilderA5[R, T, U, V, W, X]
    ],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]],
    timeout: js.Function1[scala.Double, CommandBuilderA5[R, T, U, V, W, X]]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(build = build, circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, context = context, errorHandler = errorHandler, fallbackTo = fallbackTo, percentileWindowLength = percentileWindowLength, percentileWindowNumberOfBuckets = percentileWindowNumberOfBuckets, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, run = run, statisticalWindowLength = statisticalWindowLength, statisticalWindowNumberOfBuckets = statisticalWindowNumberOfBuckets, timeout = timeout)
  
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
}


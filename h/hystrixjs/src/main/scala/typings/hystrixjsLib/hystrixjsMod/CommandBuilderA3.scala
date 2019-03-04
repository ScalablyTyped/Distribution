package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA3[R, T, U, V] extends js.Object {
  def build(): CommandA3[R, T, U, V]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def context(value: js.Any): CommandBuilderA3[R, T, U, V]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA3[R, T, U, V]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def percentileWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def timeout(value: scala.Double): CommandBuilderA3[R, T, U, V]
}

object CommandBuilderA3 {
  @scala.inline
  def apply[R, T, U, V](
    build: js.Function0[CommandA3[R, T, U, V]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA3[R, T, U, V]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA3[R, T, U, V]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    context: js.Function1[js.Any, CommandBuilderA3[R, T, U, V]],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilderA3[R, T, U, V]],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]], 
      CommandBuilderA3[R, T, U, V]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    run: js.Function1[
      js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]], 
      CommandBuilderA3[R, T, U, V]
    ],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]],
    timeout: js.Function1[scala.Double, CommandBuilderA3[R, T, U, V]]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(build = build, circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, context = context, errorHandler = errorHandler, fallbackTo = fallbackTo, percentileWindowLength = percentileWindowLength, percentileWindowNumberOfBuckets = percentileWindowNumberOfBuckets, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, run = run, statisticalWindowLength = statisticalWindowLength, statisticalWindowNumberOfBuckets = statisticalWindowNumberOfBuckets, timeout = timeout)
  
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
}


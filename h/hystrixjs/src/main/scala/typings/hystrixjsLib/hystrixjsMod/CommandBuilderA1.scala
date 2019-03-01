package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA1[R, T] extends js.Object {
  def build(): CommandA1[R, T]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA1[R, T]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA1[R, T]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA1[R, T]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA1[R, T]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA1[R, T]
  def context(value: js.Any): CommandBuilderA1[R, T]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA1[R, T]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T]
  def percentileWindowLength(value: scala.Double): CommandBuilderA1[R, T]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA1[R, T]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA1[R, T]
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA1[R, T]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA1[R, T]
  def timeout(value: scala.Double): CommandBuilderA1[R, T]
}

object CommandBuilderA1 {
  @scala.inline
  def apply[R, T](
    build: js.Function0[CommandA1[R, T]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA1[R, T]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA1[R, T]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    context: js.Function1[js.Any, CommandBuilderA1[R, T]],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilderA1[R, T]],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Array[T], js.Thenable[R]], 
      CommandBuilderA1[R, T]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    run: js.Function1[js.Function1[/* t */ T, js.Thenable[R]], CommandBuilderA1[R, T]],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA1[R, T]],
    timeout: js.Function1[scala.Double, CommandBuilderA1[R, T]]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("circuitBreakerErrorThresholdPercentage")(circuitBreakerErrorThresholdPercentage)
    __obj.updateDynamic("circuitBreakerForceClosed")(circuitBreakerForceClosed)
    __obj.updateDynamic("circuitBreakerForceOpened")(circuitBreakerForceOpened)
    __obj.updateDynamic("circuitBreakerRequestVolumeThreshold")(circuitBreakerRequestVolumeThreshold)
    __obj.updateDynamic("circuitBreakerSleepWindowInMilliseconds")(circuitBreakerSleepWindowInMilliseconds)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("errorHandler")(errorHandler)
    __obj.updateDynamic("fallbackTo")(fallbackTo)
    __obj.updateDynamic("percentileWindowLength")(percentileWindowLength)
    __obj.updateDynamic("percentileWindowNumberOfBuckets")(percentileWindowNumberOfBuckets)
    __obj.updateDynamic("requestVolumeRejectionThreshold")(requestVolumeRejectionThreshold)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("statisticalWindowLength")(statisticalWindowLength)
    __obj.updateDynamic("statisticalWindowNumberOfBuckets")(statisticalWindowNumberOfBuckets)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
}


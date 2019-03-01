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
    build: js.Function0[CommandA2[R, T, U]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA2[R, T, U]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA2[R, T, U]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    context: js.Function1[js.Any, CommandBuilderA2[R, T, U]],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilderA2[R, T, U]],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]], 
      CommandBuilderA2[R, T, U]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    run: js.Function1[js.Function2[/* t */ T, /* u */ U, js.Thenable[R]], CommandBuilderA2[R, T, U]],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA2[R, T, U]],
    timeout: js.Function1[scala.Double, CommandBuilderA2[R, T, U]]
  ): CommandBuilderA2[R, T, U] = {
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
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
}


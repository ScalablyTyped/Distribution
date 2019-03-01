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
    build: js.Function0[CommandA4[R, T, U, V, W]],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    context: js.Function1[js.Any, CommandBuilderA4[R, T, U, V, W]],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilderA4[R, T, U, V, W]],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]], 
      CommandBuilderA4[R, T, U, V, W]
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    run: js.Function1[
      js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]], 
      CommandBuilderA4[R, T, U, V, W]
    ],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]],
    timeout: js.Function1[scala.Double, CommandBuilderA4[R, T, U, V, W]]
  ): CommandBuilderA4[R, T, U, V, W] = {
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
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
}


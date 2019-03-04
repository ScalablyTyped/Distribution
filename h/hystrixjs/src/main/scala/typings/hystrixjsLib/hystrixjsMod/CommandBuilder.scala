package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilder extends js.Object {
  def build(): Command
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilder
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilder
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilder
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilder
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilder
  def context(value: js.Any): CommandBuilder
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilder
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]]): CommandBuilder
  def percentileWindowLength(value: scala.Double): CommandBuilder
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilder
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilder
  def run(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): CommandBuilder
  def statisticalWindowLength(value: scala.Double): CommandBuilder
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilder
  def timeout(value: scala.Double): CommandBuilder
}

object CommandBuilder {
  @scala.inline
  def apply(
    build: js.Function0[Command],
    circuitBreakerErrorThresholdPercentage: js.Function1[scala.Double, CommandBuilder],
    circuitBreakerForceClosed: js.Function1[scala.Boolean, CommandBuilder],
    circuitBreakerForceOpened: js.Function1[scala.Boolean, CommandBuilder],
    circuitBreakerRequestVolumeThreshold: js.Function1[scala.Double, CommandBuilder],
    circuitBreakerSleepWindowInMilliseconds: js.Function1[scala.Double, CommandBuilder],
    context: js.Function1[js.Any, CommandBuilder],
    errorHandler: js.Function1[js.Function1[/* error */ js.Any, scala.Boolean], CommandBuilder],
    fallbackTo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]], 
      CommandBuilder
    ],
    percentileWindowLength: js.Function1[scala.Double, CommandBuilder],
    percentileWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilder],
    requestVolumeRejectionThreshold: js.Function1[scala.Double, CommandBuilder],
    run: js.Function1[js.Function1[/* repeated */ js.Any, js.Thenable[_]], CommandBuilder],
    statisticalWindowLength: js.Function1[scala.Double, CommandBuilder],
    statisticalWindowNumberOfBuckets: js.Function1[scala.Double, CommandBuilder],
    timeout: js.Function1[scala.Double, CommandBuilder]
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = build, circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage, circuitBreakerForceClosed = circuitBreakerForceClosed, circuitBreakerForceOpened = circuitBreakerForceOpened, circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold, circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds, context = context, errorHandler = errorHandler, fallbackTo = fallbackTo, percentileWindowLength = percentileWindowLength, percentileWindowNumberOfBuckets = percentileWindowNumberOfBuckets, requestVolumeRejectionThreshold = requestVolumeRejectionThreshold, run = run, statisticalWindowLength = statisticalWindowLength, statisticalWindowNumberOfBuckets = statisticalWindowNumberOfBuckets, timeout = timeout)
  
    __obj.asInstanceOf[CommandBuilder]
  }
}


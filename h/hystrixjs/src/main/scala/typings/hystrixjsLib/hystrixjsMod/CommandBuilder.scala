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
    build: () => Command,
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilder,
    circuitBreakerForceClosed: scala.Boolean => CommandBuilder,
    circuitBreakerForceOpened: scala.Boolean => CommandBuilder,
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilder,
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilder,
    context: js.Any => CommandBuilder,
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilder,
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder,
    percentileWindowLength: scala.Double => CommandBuilder,
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilder,
    requestVolumeRejectionThreshold: scala.Double => CommandBuilder,
    run: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder,
    statisticalWindowLength: scala.Double => CommandBuilder,
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilder,
    timeout: scala.Double => CommandBuilder
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilder]
  }
}


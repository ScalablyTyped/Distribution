package typings.hystrixjs.hystrixjsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilder extends js.Object {
  def build(): Command
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilder
  def circuitBreakerForceClosed(value: Boolean): CommandBuilder
  def circuitBreakerForceOpened(value: Boolean): CommandBuilder
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilder
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilder
  def context(value: js.Any): CommandBuilder
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilder
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]]): CommandBuilder
  def percentileWindowLength(value: Double): CommandBuilder
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilder
  def requestVolumeRejectionThreshold(value: Double): CommandBuilder
  def run(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): CommandBuilder
  def statisticalWindowLength(value: Double): CommandBuilder
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilder
  def timeout(value: Double): CommandBuilder
}

object CommandBuilder {
  @scala.inline
  def apply(
    build: () => Command,
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilder,
    circuitBreakerForceClosed: Boolean => CommandBuilder,
    circuitBreakerForceOpened: Boolean => CommandBuilder,
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilder,
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilder,
    context: js.Any => CommandBuilder,
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder,
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder,
    percentileWindowLength: Double => CommandBuilder,
    percentileWindowNumberOfBuckets: Double => CommandBuilder,
    requestVolumeRejectionThreshold: Double => CommandBuilder,
    run: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder,
    statisticalWindowLength: Double => CommandBuilder,
    statisticalWindowNumberOfBuckets: Double => CommandBuilder,
    timeout: Double => CommandBuilder
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilder]
  }
}


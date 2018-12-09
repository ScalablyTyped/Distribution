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
  def run(value: js.Function1[/* repeated */js.Any, js.Thenable[_]]): CommandBuilder
  def statisticalWindowLength(value: scala.Double): CommandBuilder
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilder
  def timeout(value: scala.Double): CommandBuilder
}


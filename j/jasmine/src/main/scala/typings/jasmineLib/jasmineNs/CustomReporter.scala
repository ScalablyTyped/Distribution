package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReporter extends js.Object {
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, scala.Unit]] = js.undefined
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, scala.Unit]] = js.undefined
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, scala.Unit]] = js.undefined
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, scala.Unit]] = js.undefined
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, scala.Unit]] = js.undefined
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, scala.Unit]] = js.undefined
}

object CustomReporter {
  @scala.inline
  def apply(
    jasmineDone: js.Function1[/* runDetails */ RunDetails, scala.Unit] = null,
    jasmineStarted: js.Function1[/* suiteInfo */ SuiteInfo, scala.Unit] = null,
    specDone: js.Function1[/* result */ CustomReporterResult, scala.Unit] = null,
    specStarted: js.Function1[/* result */ CustomReporterResult, scala.Unit] = null,
    suiteDone: js.Function1[/* result */ CustomReporterResult, scala.Unit] = null,
    suiteStarted: js.Function1[/* result */ CustomReporterResult, scala.Unit] = null
  ): CustomReporter = {
    val __obj = js.Dynamic.literal()
    if (jasmineDone != null) __obj.updateDynamic("jasmineDone")(jasmineDone)
    if (jasmineStarted != null) __obj.updateDynamic("jasmineStarted")(jasmineStarted)
    if (specDone != null) __obj.updateDynamic("specDone")(specDone)
    if (specStarted != null) __obj.updateDynamic("specStarted")(specStarted)
    if (suiteDone != null) __obj.updateDynamic("suiteDone")(suiteDone)
    if (suiteStarted != null) __obj.updateDynamic("suiteStarted")(suiteStarted)
    __obj.asInstanceOf[CustomReporter]
  }
}


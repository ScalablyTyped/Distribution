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


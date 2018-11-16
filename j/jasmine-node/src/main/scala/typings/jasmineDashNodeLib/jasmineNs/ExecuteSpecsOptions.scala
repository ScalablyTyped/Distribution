package typings
package jasmineDashNodeLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecuteSpecsOptions extends js.Object {
  var growl: js.UndefOr[scala.Boolean] = js.undefined
  var includeStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  var isVerbose: js.UndefOr[scala.Boolean] = js.undefined
  var junitreport: js.UndefOr[jasmineDashNodeLib.Anon_Consolidate] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* runner */ jasmineLib.jasmineNs.Runner, scala.Unit]] = js.undefined
  var regExpSpec: stdLib.RegExp
  var showColors: js.UndefOr[scala.Boolean] = js.undefined
  var specFolders: js.Array[java.lang.String]
  var teamcity: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var useRequireJs: js.UndefOr[scala.Boolean] = js.undefined
}


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

object ExecuteSpecsOptions {
  @scala.inline
  def apply(
    regExpSpec: stdLib.RegExp,
    specFolders: js.Array[java.lang.String],
    growl: js.UndefOr[scala.Boolean] = js.undefined,
    includeStackTrace: js.UndefOr[scala.Boolean] = js.undefined,
    isVerbose: js.UndefOr[scala.Boolean] = js.undefined,
    junitreport: jasmineDashNodeLib.Anon_Consolidate = null,
    onComplete: js.Function1[/* runner */ jasmineLib.jasmineNs.Runner, scala.Unit] = null,
    showColors: js.UndefOr[scala.Boolean] = js.undefined,
    teamcity: java.lang.String | scala.Boolean = null,
    useRequireJs: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecuteSpecsOptions = {
    val __obj = js.Dynamic.literal(regExpSpec = regExpSpec, specFolders = specFolders)
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl)
    if (!js.isUndefined(includeStackTrace)) __obj.updateDynamic("includeStackTrace")(includeStackTrace)
    if (!js.isUndefined(isVerbose)) __obj.updateDynamic("isVerbose")(isVerbose)
    if (junitreport != null) __obj.updateDynamic("junitreport")(junitreport)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors)
    if (teamcity != null) __obj.updateDynamic("teamcity")(teamcity.asInstanceOf[js.Any])
    if (!js.isUndefined(useRequireJs)) __obj.updateDynamic("useRequireJs")(useRequireJs)
    __obj.asInstanceOf[ExecuteSpecsOptions]
  }
}


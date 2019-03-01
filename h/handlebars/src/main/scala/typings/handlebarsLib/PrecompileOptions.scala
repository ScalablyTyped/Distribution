package typings
package handlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecompileOptions extends CompileOptions {
  var destName: js.UndefOr[java.lang.String] = js.undefined
  var srcName: js.UndefOr[java.lang.String] = js.undefined
}

object PrecompileOptions {
  @scala.inline
  def apply(
    assumeObjects: js.UndefOr[scala.Boolean] = js.undefined,
    compat: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.UndefOr[scala.Boolean] = js.undefined,
    destName: java.lang.String = null,
    explicitPartialContext: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreStandalone: js.UndefOr[scala.Boolean] = js.undefined,
    knownHelpers: Anon_BlockHelperMissing = null,
    knownHelpersOnly: js.UndefOr[scala.Boolean] = js.undefined,
    noEscape: js.UndefOr[scala.Boolean] = js.undefined,
    preventIndent: js.UndefOr[scala.Boolean] = js.undefined,
    srcName: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeObjects)) __obj.updateDynamic("assumeObjects")(assumeObjects)
    if (!js.isUndefined(compat)) __obj.updateDynamic("compat")(compat)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (destName != null) __obj.updateDynamic("destName")(destName)
    if (!js.isUndefined(explicitPartialContext)) __obj.updateDynamic("explicitPartialContext")(explicitPartialContext)
    if (!js.isUndefined(ignoreStandalone)) __obj.updateDynamic("ignoreStandalone")(ignoreStandalone)
    if (knownHelpers != null) __obj.updateDynamic("knownHelpers")(knownHelpers)
    if (!js.isUndefined(knownHelpersOnly)) __obj.updateDynamic("knownHelpersOnly")(knownHelpersOnly)
    if (!js.isUndefined(noEscape)) __obj.updateDynamic("noEscape")(noEscape)
    if (!js.isUndefined(preventIndent)) __obj.updateDynamic("preventIndent")(preventIndent)
    if (srcName != null) __obj.updateDynamic("srcName")(srcName)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[PrecompileOptions]
  }
}


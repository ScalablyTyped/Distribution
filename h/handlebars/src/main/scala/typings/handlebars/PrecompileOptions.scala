package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecompileOptions extends CompileOptions {
  var destName: js.UndefOr[String] = js.undefined
  var srcName: js.UndefOr[String] = js.undefined
}

object PrecompileOptions {
  @scala.inline
  def apply(
    assumeObjects: js.UndefOr[Boolean] = js.undefined,
    compat: js.UndefOr[Boolean] = js.undefined,
    data: js.UndefOr[Boolean] = js.undefined,
    destName: String = null,
    explicitPartialContext: js.UndefOr[Boolean] = js.undefined,
    ignoreStandalone: js.UndefOr[Boolean] = js.undefined,
    knownHelpers: Anon_BlockHelperMissing = null,
    knownHelpersOnly: js.UndefOr[Boolean] = js.undefined,
    noEscape: js.UndefOr[Boolean] = js.undefined,
    preventIndent: js.UndefOr[Boolean] = js.undefined,
    srcName: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
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


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
    knownHelpers: KnownHelpers = null,
    knownHelpersOnly: js.UndefOr[Boolean] = js.undefined,
    noEscape: js.UndefOr[Boolean] = js.undefined,
    preventIndent: js.UndefOr[Boolean] = js.undefined,
    srcName: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeObjects)) __obj.updateDynamic("assumeObjects")(assumeObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compat)) __obj.updateDynamic("compat")(compat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    if (destName != null) __obj.updateDynamic("destName")(destName.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitPartialContext)) __obj.updateDynamic("explicitPartialContext")(explicitPartialContext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreStandalone)) __obj.updateDynamic("ignoreStandalone")(ignoreStandalone.get.asInstanceOf[js.Any])
    if (knownHelpers != null) __obj.updateDynamic("knownHelpers")(knownHelpers.asInstanceOf[js.Any])
    if (!js.isUndefined(knownHelpersOnly)) __obj.updateDynamic("knownHelpersOnly")(knownHelpersOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noEscape)) __obj.updateDynamic("noEscape")(noEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventIndent)) __obj.updateDynamic("preventIndent")(preventIndent.get.asInstanceOf[js.Any])
    if (srcName != null) __obj.updateDynamic("srcName")(srcName.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecompileOptions]
  }
}


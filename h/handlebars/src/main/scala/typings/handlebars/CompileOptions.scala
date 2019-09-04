package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var assumeObjects: js.UndefOr[Boolean] = js.undefined
  var compat: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[Boolean] = js.undefined
  var explicitPartialContext: js.UndefOr[Boolean] = js.undefined
  var ignoreStandalone: js.UndefOr[Boolean] = js.undefined
  var knownHelpers: js.UndefOr[KnownHelpers] = js.undefined
  var knownHelpersOnly: js.UndefOr[Boolean] = js.undefined
  var noEscape: js.UndefOr[Boolean] = js.undefined
  var preventIndent: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object CompileOptions {
  @scala.inline
  def apply(
    assumeObjects: js.UndefOr[Boolean] = js.undefined,
    compat: js.UndefOr[Boolean] = js.undefined,
    data: js.UndefOr[Boolean] = js.undefined,
    explicitPartialContext: js.UndefOr[Boolean] = js.undefined,
    ignoreStandalone: js.UndefOr[Boolean] = js.undefined,
    knownHelpers: KnownHelpers = null,
    knownHelpersOnly: js.UndefOr[Boolean] = js.undefined,
    noEscape: js.UndefOr[Boolean] = js.undefined,
    preventIndent: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): CompileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeObjects)) __obj.updateDynamic("assumeObjects")(assumeObjects)
    if (!js.isUndefined(compat)) __obj.updateDynamic("compat")(compat)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(explicitPartialContext)) __obj.updateDynamic("explicitPartialContext")(explicitPartialContext)
    if (!js.isUndefined(ignoreStandalone)) __obj.updateDynamic("ignoreStandalone")(ignoreStandalone)
    if (knownHelpers != null) __obj.updateDynamic("knownHelpers")(knownHelpers)
    if (!js.isUndefined(knownHelpersOnly)) __obj.updateDynamic("knownHelpersOnly")(knownHelpersOnly)
    if (!js.isUndefined(noEscape)) __obj.updateDynamic("noEscape")(noEscape)
    if (!js.isUndefined(preventIndent)) __obj.updateDynamic("preventIndent")(preventIndent)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[CompileOptions]
  }
}


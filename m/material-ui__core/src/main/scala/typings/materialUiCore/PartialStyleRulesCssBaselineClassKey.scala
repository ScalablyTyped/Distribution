package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineClassKey>> */
@js.native
trait PartialStyleRulesCssBaselineClassKey extends js.Object {
  var `@global`: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCssBaselineClassKey {
  @scala.inline
  def apply(`@global`: CSSProperties = null): PartialStyleRulesCssBaselineClassKey = {
    val __obj = js.Dynamic.literal()
    if (`@global` != null) __obj.updateDynamic("@global")(`@global`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesCssBaselineClassKey]
  }
}


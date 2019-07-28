package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Collapse.CollapseClassKey>> */
trait PartialStyleRulesCollapseClassKey extends js.Object {
  var container: js.UndefOr[CSSProperties] = js.undefined
  var entered: js.UndefOr[CSSProperties] = js.undefined
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
  var wrapperInner: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesCollapseClassKey {
  @scala.inline
  def apply(
    container: CSSProperties = null,
    entered: CSSProperties = null,
    wrapper: CSSProperties = null,
    wrapperInner: CSSProperties = null
  ): PartialStyleRulesCollapseClassKey = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (entered != null) __obj.updateDynamic("entered")(entered)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    if (wrapperInner != null) __obj.updateDynamic("wrapperInner")(wrapperInner)
    __obj.asInstanceOf[PartialStyleRulesCollapseClassKey]
  }
}


package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/BottomNavigationAction.BottomNavigationActionClassKey>> */
trait PartialStyleRulesBottomNavigationActionClassKey extends js.Object {
  var iconOnly: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesBottomNavigationActionClassKey {
  @scala.inline
  def apply(
    iconOnly: CSSProperties = null,
    label: CSSProperties = null,
    root: CSSProperties = null,
    selected: CSSProperties = null,
    wrapper: CSSProperties = null
  ): PartialStyleRulesBottomNavigationActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (iconOnly != null) __obj.updateDynamic("iconOnly")(iconOnly)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[PartialStyleRulesBottomNavigationActionClassKey]
  }
}


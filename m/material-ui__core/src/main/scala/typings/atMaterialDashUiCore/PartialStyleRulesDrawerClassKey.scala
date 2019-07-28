package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Drawer.DrawerClassKey>> */
trait PartialStyleRulesDrawerClassKey extends js.Object {
  var docked: js.UndefOr[CSSProperties] = js.undefined
  var modal: js.UndefOr[CSSProperties] = js.undefined
  var paper: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorBottom: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorDockedBottom: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorDockedLeft: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorDockedRight: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorDockedTop: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorLeft: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorRight: js.UndefOr[CSSProperties] = js.undefined
  var paperAnchorTop: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesDrawerClassKey {
  @scala.inline
  def apply(
    docked: CSSProperties = null,
    modal: CSSProperties = null,
    paper: CSSProperties = null,
    paperAnchorBottom: CSSProperties = null,
    paperAnchorDockedBottom: CSSProperties = null,
    paperAnchorDockedLeft: CSSProperties = null,
    paperAnchorDockedRight: CSSProperties = null,
    paperAnchorDockedTop: CSSProperties = null,
    paperAnchorLeft: CSSProperties = null,
    paperAnchorRight: CSSProperties = null,
    paperAnchorTop: CSSProperties = null
  ): PartialStyleRulesDrawerClassKey = {
    val __obj = js.Dynamic.literal()
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (modal != null) __obj.updateDynamic("modal")(modal)
    if (paper != null) __obj.updateDynamic("paper")(paper)
    if (paperAnchorBottom != null) __obj.updateDynamic("paperAnchorBottom")(paperAnchorBottom)
    if (paperAnchorDockedBottom != null) __obj.updateDynamic("paperAnchorDockedBottom")(paperAnchorDockedBottom)
    if (paperAnchorDockedLeft != null) __obj.updateDynamic("paperAnchorDockedLeft")(paperAnchorDockedLeft)
    if (paperAnchorDockedRight != null) __obj.updateDynamic("paperAnchorDockedRight")(paperAnchorDockedRight)
    if (paperAnchorDockedTop != null) __obj.updateDynamic("paperAnchorDockedTop")(paperAnchorDockedTop)
    if (paperAnchorLeft != null) __obj.updateDynamic("paperAnchorLeft")(paperAnchorLeft)
    if (paperAnchorRight != null) __obj.updateDynamic("paperAnchorRight")(paperAnchorRight)
    if (paperAnchorTop != null) __obj.updateDynamic("paperAnchorTop")(paperAnchorTop)
    __obj.asInstanceOf[PartialStyleRulesDrawerClassKey]
  }
}


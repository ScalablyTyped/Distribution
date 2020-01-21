package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Drawer.DrawerClassKey>> */
@js.native
trait PartialStyleRulesDrawerClassKey extends js.Object {
  var docked: js.UndefOr[CSSProperties] = js.native
  var modal: js.UndefOr[CSSProperties] = js.native
  var paper: js.UndefOr[CSSProperties] = js.native
  var paperAnchorBottom: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedBottom: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedLeft: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedRight: js.UndefOr[CSSProperties] = js.native
  var paperAnchorDockedTop: js.UndefOr[CSSProperties] = js.native
  var paperAnchorLeft: js.UndefOr[CSSProperties] = js.native
  var paperAnchorRight: js.UndefOr[CSSProperties] = js.native
  var paperAnchorTop: js.UndefOr[CSSProperties] = js.native
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
    if (docked != null) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (paper != null) __obj.updateDynamic("paper")(paper.asInstanceOf[js.Any])
    if (paperAnchorBottom != null) __obj.updateDynamic("paperAnchorBottom")(paperAnchorBottom.asInstanceOf[js.Any])
    if (paperAnchorDockedBottom != null) __obj.updateDynamic("paperAnchorDockedBottom")(paperAnchorDockedBottom.asInstanceOf[js.Any])
    if (paperAnchorDockedLeft != null) __obj.updateDynamic("paperAnchorDockedLeft")(paperAnchorDockedLeft.asInstanceOf[js.Any])
    if (paperAnchorDockedRight != null) __obj.updateDynamic("paperAnchorDockedRight")(paperAnchorDockedRight.asInstanceOf[js.Any])
    if (paperAnchorDockedTop != null) __obj.updateDynamic("paperAnchorDockedTop")(paperAnchorDockedTop.asInstanceOf[js.Any])
    if (paperAnchorLeft != null) __obj.updateDynamic("paperAnchorLeft")(paperAnchorLeft.asInstanceOf[js.Any])
    if (paperAnchorRight != null) __obj.updateDynamic("paperAnchorRight")(paperAnchorRight.asInstanceOf[js.Any])
    if (paperAnchorTop != null) __obj.updateDynamic("paperAnchorTop")(paperAnchorTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesDrawerClassKey]
  }
}


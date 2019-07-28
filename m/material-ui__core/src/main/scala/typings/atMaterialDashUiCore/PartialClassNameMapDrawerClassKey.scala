package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey>> */
trait PartialClassNameMapDrawerClassKey extends js.Object {
  var docked: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[String] = js.undefined
  var paper: js.UndefOr[String] = js.undefined
  var paperAnchorBottom: js.UndefOr[String] = js.undefined
  var paperAnchorDockedBottom: js.UndefOr[String] = js.undefined
  var paperAnchorDockedLeft: js.UndefOr[String] = js.undefined
  var paperAnchorDockedRight: js.UndefOr[String] = js.undefined
  var paperAnchorDockedTop: js.UndefOr[String] = js.undefined
  var paperAnchorLeft: js.UndefOr[String] = js.undefined
  var paperAnchorRight: js.UndefOr[String] = js.undefined
  var paperAnchorTop: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapDrawerClassKey {
  @scala.inline
  def apply(
    docked: String = null,
    modal: String = null,
    paper: String = null,
    paperAnchorBottom: String = null,
    paperAnchorDockedBottom: String = null,
    paperAnchorDockedLeft: String = null,
    paperAnchorDockedRight: String = null,
    paperAnchorDockedTop: String = null,
    paperAnchorLeft: String = null,
    paperAnchorRight: String = null,
    paperAnchorTop: String = null
  ): PartialClassNameMapDrawerClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapDrawerClassKey]
  }
}


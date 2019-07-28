package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseClassKey>> */
trait PartialStyleRulesButtonBaseClassKey extends js.Object {
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesButtonBaseClassKey {
  @scala.inline
  def apply(disabled: CSSProperties = null, focusVisible: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesButtonBaseClassKey = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialStyleRulesButtonBaseClassKey]
  }
}


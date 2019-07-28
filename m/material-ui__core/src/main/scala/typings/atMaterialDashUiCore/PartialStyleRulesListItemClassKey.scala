package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItem.ListItemClassKey>> */
trait PartialStyleRulesListItemClassKey extends js.Object {
  var button: js.UndefOr[CSSProperties] = js.undefined
  var container: js.UndefOr[CSSProperties] = js.undefined
  var default: js.UndefOr[CSSProperties] = js.undefined
  var dense: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  var divider: js.UndefOr[CSSProperties] = js.undefined
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var secondaryAction: js.UndefOr[CSSProperties] = js.undefined
  var selected: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStyleRulesListItemClassKey {
  @scala.inline
  def apply(
    button: CSSProperties = null,
    container: CSSProperties = null,
    default: CSSProperties = null,
    dense: CSSProperties = null,
    disabled: CSSProperties = null,
    divider: CSSProperties = null,
    focusVisible: CSSProperties = null,
    gutters: CSSProperties = null,
    root: CSSProperties = null,
    secondaryAction: CSSProperties = null,
    selected: CSSProperties = null
  ): PartialStyleRulesListItemClassKey = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (container != null) __obj.updateDynamic("container")(container)
    if (default != null) __obj.updateDynamic("default")(default)
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (root != null) __obj.updateDynamic("root")(root)
    if (secondaryAction != null) __obj.updateDynamic("secondaryAction")(secondaryAction)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialStyleRulesListItemClassKey]
  }
}


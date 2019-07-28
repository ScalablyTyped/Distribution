package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItem/ListItem.ListItemClassKey>> */
trait PartialClassNameMapListItemClassKey extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var dense: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var divider: js.UndefOr[String] = js.undefined
  var focusVisible: js.UndefOr[String] = js.undefined
  var gutters: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var secondaryAction: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapListItemClassKey {
  @scala.inline
  def apply(
    button: String = null,
    container: String = null,
    default: String = null,
    dense: String = null,
    disabled: String = null,
    divider: String = null,
    focusVisible: String = null,
    gutters: String = null,
    root: String = null,
    secondaryAction: String = null,
    selected: String = null
  ): PartialClassNameMapListItemClassKey = {
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
    __obj.asInstanceOf[PartialClassNameMapListItemClassKey]
  }
}


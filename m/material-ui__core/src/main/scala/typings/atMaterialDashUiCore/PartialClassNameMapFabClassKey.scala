package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Fab/Fab.FabClassKey>> */
trait PartialClassNameMapFabClassKey extends js.Object {
  var colorInherit: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var extended: js.UndefOr[String] = js.undefined
  var focusVisible: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var secondary: js.UndefOr[String] = js.undefined
  var sizeMedium: js.UndefOr[String] = js.undefined
  var sizeSmall: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapFabClassKey {
  @scala.inline
  def apply(
    colorInherit: String = null,
    disabled: String = null,
    extended: String = null,
    focusVisible: String = null,
    label: String = null,
    primary: String = null,
    root: String = null,
    secondary: String = null,
    sizeMedium: String = null,
    sizeSmall: String = null
  ): PartialClassNameMapFabClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (extended != null) __obj.updateDynamic("extended")(extended)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (label != null) __obj.updateDynamic("label")(label)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (root != null) __obj.updateDynamic("root")(root)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (sizeMedium != null) __obj.updateDynamic("sizeMedium")(sizeMedium)
    if (sizeSmall != null) __obj.updateDynamic("sizeSmall")(sizeSmall)
    __obj.asInstanceOf[PartialClassNameMapFabClassKey]
  }
}


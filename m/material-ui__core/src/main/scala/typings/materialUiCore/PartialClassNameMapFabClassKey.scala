package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Fab/Fab.FabClassKey>> */
@js.native
trait PartialClassNameMapFabClassKey extends js.Object {
  var colorInherit: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var extended: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var primary: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var secondary: js.UndefOr[String] = js.native
  var sizeMedium: js.UndefOr[String] = js.native
  var sizeSmall: js.UndefOr[String] = js.native
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
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extended != null) __obj.updateDynamic("extended")(extended.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (sizeMedium != null) __obj.updateDynamic("sizeMedium")(sizeMedium.asInstanceOf[js.Any])
    if (sizeSmall != null) __obj.updateDynamic("sizeSmall")(sizeSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapFabClassKey]
  }
}


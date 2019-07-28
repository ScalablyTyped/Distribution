package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonClassKey>> */
trait PartialClassNameMapIconButtonClassKey extends js.Object {
  var colorInherit: js.UndefOr[String] = js.undefined
  var colorPrimary: js.UndefOr[String] = js.undefined
  var colorSecondary: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapIconButtonClassKey {
  @scala.inline
  def apply(
    colorInherit: String = null,
    colorPrimary: String = null,
    colorSecondary: String = null,
    disabled: String = null,
    label: String = null,
    root: String = null
  ): PartialClassNameMapIconButtonClassKey = {
    val __obj = js.Dynamic.literal()
    if (colorInherit != null) __obj.updateDynamic("colorInherit")(colorInherit)
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary)
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapIconButtonClassKey]
  }
}


package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeAction> */
trait PartialTypeAction extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var disabledBackground: js.UndefOr[java.lang.String] = js.undefined
  var hover: js.UndefOr[java.lang.String] = js.undefined
  var hoverOpacity: js.UndefOr[scala.Double] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
}

object PartialTypeAction {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    disabled: java.lang.String = null,
    disabledBackground: java.lang.String = null,
    hover: java.lang.String = null,
    hoverOpacity: scala.Int | scala.Double = null,
    selected: java.lang.String = null
  ): PartialTypeAction = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (disabledBackground != null) __obj.updateDynamic("disabledBackground")(disabledBackground)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (hoverOpacity != null) __obj.updateDynamic("hoverOpacity")(hoverOpacity.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PartialTypeAction]
  }
}


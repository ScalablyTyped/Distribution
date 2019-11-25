package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeAction> */
trait PartialTypeAction extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var disabledBackground: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[String] = js.undefined
  var hoverOpacity: js.UndefOr[Double] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object PartialTypeAction {
  @scala.inline
  def apply(
    active: String = null,
    disabled: String = null,
    disabledBackground: String = null,
    hover: String = null,
    hoverOpacity: Int | Double = null,
    selected: String = null
  ): PartialTypeAction = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledBackground != null) __obj.updateDynamic("disabledBackground")(disabledBackground.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (hoverOpacity != null) __obj.updateDynamic("hoverOpacity")(hoverOpacity.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeAction]
  }
}


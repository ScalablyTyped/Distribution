package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeAction> */
@js.native
trait PartialTypeAction extends js.Object {
  var active: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var disabledBackground: js.UndefOr[String] = js.native
  var hover: js.UndefOr[String] = js.native
  var hoverOpacity: js.UndefOr[Double] = js.native
  var selected: js.UndefOr[String] = js.native
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


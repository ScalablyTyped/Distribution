package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltip extends js.Object {
  var animation: js.UndefOr[scala.Boolean | SurfaceTooltipAnimation] = js.undefined
  var appendTo: js.UndefOr[java.lang.String | kendoDashUiLib.JQuery] = js.undefined
}

object SurfaceTooltip {
  @scala.inline
  def apply(
    animation: scala.Boolean | SurfaceTooltipAnimation = null,
    appendTo: java.lang.String | kendoDashUiLib.JQuery = null
  ): SurfaceTooltip = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltip]
  }
}


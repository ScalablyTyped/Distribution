package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltip extends js.Object {
  var animation: js.UndefOr[Boolean | SurfaceTooltipAnimation] = js.undefined
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
}

object SurfaceTooltip {
  @scala.inline
  def apply(animation: Boolean | SurfaceTooltipAnimation = null, appendTo: String | JQuery = null): SurfaceTooltip = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltip]
  }
}


package typings.jsplumb.mod

import typings.jsplumb.AnonBorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOverlayOptions extends OverlayOptions {
  var cssClass: js.UndefOr[String] = js.undefined
  var label: String
   // 0.5
  var labelStyle: js.UndefOr[AnonBorderStyle] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
}

object LabelOverlayOptions {
  @scala.inline
  def apply(
    label: String,
    cssClass: String = null,
    labelStyle: AnonBorderStyle = null,
    location: Int | Double = null
  ): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
}


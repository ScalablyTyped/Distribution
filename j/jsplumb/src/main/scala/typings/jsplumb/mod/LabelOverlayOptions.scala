package typings.jsplumb.mod

import typings.jsplumb.anon.BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOverlayOptions extends OverlayOptions {
  var cssClass: js.UndefOr[String] = js.undefined
  var label: String
   // 0.5
  var labelStyle: js.UndefOr[BorderStyle] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
}

object LabelOverlayOptions {
  @scala.inline
  def apply(
    label: String,
    cssClass: String = null,
    labelStyle: BorderStyle = null,
    location: js.UndefOr[Double] = js.undefined
  ): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
}


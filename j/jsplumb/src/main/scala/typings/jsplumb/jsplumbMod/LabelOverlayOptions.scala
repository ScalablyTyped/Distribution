package typings.jsplumb.jsplumbMod

import typings.jsplumb.Anon_BorderStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOverlayOptions extends OverlayOptions {
  var cssClass: js.UndefOr[String] = js.undefined
  var label: String
   // 0.5
  var labelStyle: js.UndefOr[Anon_BorderStyle] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
}

object LabelOverlayOptions {
  @scala.inline
  def apply(
    label: String,
    cssClass: String = null,
    labelStyle: Anon_BorderStyle = null,
    location: Int | Double = null
  ): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
}


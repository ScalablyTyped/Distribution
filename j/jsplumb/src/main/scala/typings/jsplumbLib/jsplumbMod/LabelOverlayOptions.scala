package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOverlayOptions extends OverlayOptions {
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
   // 0.5
  var labelStyle: js.UndefOr[jsplumbLib.Anon_BorderStyle] = js.undefined
  var location: js.UndefOr[scala.Double] = js.undefined
}

object LabelOverlayOptions {
  @scala.inline
  def apply(
    label: java.lang.String,
    cssClass: java.lang.String = null,
    labelStyle: jsplumbLib.Anon_BorderStyle = null,
    location: scala.Int | scala.Double = null
  ): LabelOverlayOptions = {
    val __obj = js.Dynamic.literal(label = label)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOverlayOptions]
  }
}


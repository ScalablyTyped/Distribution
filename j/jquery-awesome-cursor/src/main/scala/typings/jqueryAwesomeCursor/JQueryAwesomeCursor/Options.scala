package typings.jqueryAwesomeCursor.JQueryAwesomeCursor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var flip: js.UndefOr[typings.jqueryAwesomeCursor.JQueryAwesomeCursor.flip] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var hotspot: js.UndefOr[js.Array[Double] | String] = js.undefined
  var outline: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: String = null,
    flip: flip = null,
    font: Font = null,
    hotspot: js.Array[Double] | String = null,
    outline: String = null,
    rotate: Int | Double = null,
    size: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (hotspot != null) __obj.updateDynamic("hotspot")(hotspot.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


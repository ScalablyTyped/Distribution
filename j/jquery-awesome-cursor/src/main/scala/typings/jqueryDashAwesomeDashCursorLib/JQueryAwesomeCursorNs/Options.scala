package typings
package jqueryDashAwesomeDashCursorLib.JQueryAwesomeCursorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var flip: js.UndefOr[flip] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var hotspot: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
  var outline: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    flip: flip = null,
    font: Font = null,
    hotspot: js.Array[scala.Double] | java.lang.String = null,
    outline: java.lang.String = null,
    rotate: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (font != null) __obj.updateDynamic("font")(font)
    if (hotspot != null) __obj.updateDynamic("hotspot")(hotspot.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings.heremaps.H.map.ArrowStyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object type to specify the style of arrows to render along a polyline
  * @property fillColor {string=} - The CSS color value used to fill the arrow shapes. If omitted or the value evaluates to false it defaults to "rgba(255, 255, 255, 0.75)"
  * @property width {number=} - The width of the arrow shape. The value is taken as a factor of the width of the line, where the arrow description is applied.
  * If omitted or the value is <= 0 it defaults to 1.2
  * @property length {number=} - The length of the arrow shapes. The value is taken as a factor of the width of the line at the end of which the arrow is drawn.
  * If omitted or the value is <= 0 it defaults to 1.6
  * @property frequency {number=} - The frequency of arrow shapes. The value is taken as factor of the length of the arrow. A value of 1 results in gapless arrows.
  * If omitted or the value is false it defaults to 5
  */
trait Options extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fillColor: String = null,
    frequency: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


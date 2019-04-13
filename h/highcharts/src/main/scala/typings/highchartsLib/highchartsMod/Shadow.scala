package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  /**
    * @default 'black'
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * @default 1
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default 1
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default 0.15 / width
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default 3
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    color: java.lang.String | Gradient = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Shadow = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}


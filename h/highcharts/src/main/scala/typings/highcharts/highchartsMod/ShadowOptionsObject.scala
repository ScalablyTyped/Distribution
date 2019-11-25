package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowOptionsObject extends js.Object {
  /**
    * The shadow color.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  /**
    * The horizontal offset from the element.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * The vertical offset from the element.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * The shadow opacity.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The shadow width or distance from the element.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ShadowOptionsObject {
  @scala.inline
  def apply(
    color: ColorString = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): ShadowOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOptionsObject]
  }
}


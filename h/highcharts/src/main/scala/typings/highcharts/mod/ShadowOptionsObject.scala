package typings.highcharts.mod

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
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ShadowOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOptionsObject]
  }
}


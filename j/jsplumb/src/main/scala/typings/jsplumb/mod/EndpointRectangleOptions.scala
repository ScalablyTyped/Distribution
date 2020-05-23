package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointRectangleOptions extends js.Object {
  var cssClass: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EndpointRectangleOptions {
  @scala.inline
  def apply(
    cssClass: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hoverClass: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): EndpointRectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointRectangleOptions]
  }
}


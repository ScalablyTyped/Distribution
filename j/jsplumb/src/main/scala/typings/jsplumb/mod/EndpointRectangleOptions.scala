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
    height: Int | Double = null,
    hoverClass: String = null,
    width: Int | Double = null
  ): EndpointRectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointRectangleOptions]
  }
}


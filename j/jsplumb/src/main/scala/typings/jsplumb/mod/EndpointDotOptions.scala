package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDotOptions extends js.Object {
  var cssClass: js.UndefOr[String] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object EndpointDotOptions {
  @scala.inline
  def apply(cssClass: String = null, hoverClass: String = null, radius: js.UndefOr[Double] = js.undefined): EndpointDotOptions = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDotOptions]
  }
}


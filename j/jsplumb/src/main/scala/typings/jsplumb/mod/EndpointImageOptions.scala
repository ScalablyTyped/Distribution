package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointImageOptions extends js.Object {
  var cssClass: js.UndefOr[String] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var src: String
}

object EndpointImageOptions {
  @scala.inline
  def apply(src: String, cssClass: String = null, hoverClass: String = null): EndpointImageOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointImageOptions]
  }
}


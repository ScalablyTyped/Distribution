package typings.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageformat extends js.Object {
  var image_format: js.UndefOr[String] = js.undefined
  var image_scaling: js.UndefOr[String] = js.undefined
}

object AnonImageformat {
  @scala.inline
  def apply(image_format: String = null, image_scaling: String = null): AnonImageformat = {
    val __obj = js.Dynamic.literal()
    if (image_format != null) __obj.updateDynamic("image_format")(image_format.asInstanceOf[js.Any])
    if (image_scaling != null) __obj.updateDynamic("image_scaling")(image_scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImageformat]
  }
}


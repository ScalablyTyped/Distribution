package typings.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imageformat extends js.Object {
  var image_format: js.UndefOr[String] = js.undefined
  var image_scaling: js.UndefOr[String] = js.undefined
}

object Anon_Imageformat {
  @scala.inline
  def apply(image_format: String = null, image_scaling: String = null): Anon_Imageformat = {
    val __obj = js.Dynamic.literal()
    if (image_format != null) __obj.updateDynamic("image_format")(image_format)
    if (image_scaling != null) __obj.updateDynamic("image_scaling")(image_scaling)
    __obj.asInstanceOf[Anon_Imageformat]
  }
}


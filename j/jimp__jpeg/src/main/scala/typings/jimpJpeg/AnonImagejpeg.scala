package typings.jimpJpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagejpeg extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String]
}

object AnonImagejpeg {
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): AnonImagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagejpeg]
  }
}


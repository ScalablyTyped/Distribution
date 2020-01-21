package typings.jimpJpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagejpegString extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: String
}

object AnonImagejpegString {
  @scala.inline
  def apply(imageSlashjpeg: String): AnonImagejpegString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagejpegString]
  }
}


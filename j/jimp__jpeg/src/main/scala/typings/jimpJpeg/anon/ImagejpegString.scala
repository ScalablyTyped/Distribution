package typings.jimpJpeg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagejpegString extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: String
}

object ImagejpegString {
  @scala.inline
  def apply(imageSlashjpeg: String): ImagejpegString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagejpegString]
  }
}


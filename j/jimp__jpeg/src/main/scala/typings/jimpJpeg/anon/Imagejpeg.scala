package typings.jimpJpeg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagejpeg extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String]
}

object Imagejpeg {
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): Imagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagejpeg]
  }
}


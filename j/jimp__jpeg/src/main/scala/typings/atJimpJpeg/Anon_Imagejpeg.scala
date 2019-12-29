package typings.atJimpJpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imagejpeg extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String]
}

object Anon_Imagejpeg {
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): Anon_Imagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Imagejpeg]
  }
}


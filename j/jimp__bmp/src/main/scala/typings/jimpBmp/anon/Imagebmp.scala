package typings.jimpBmp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagebmp extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String]
}

object Imagebmp {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): Imagebmp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagebmp]
  }
}


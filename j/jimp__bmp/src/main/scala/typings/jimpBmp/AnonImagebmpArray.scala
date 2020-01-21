package typings.jimpBmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagebmpArray extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String]
}

object AnonImagebmpArray {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): AnonImagebmpArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagebmpArray]
  }
}


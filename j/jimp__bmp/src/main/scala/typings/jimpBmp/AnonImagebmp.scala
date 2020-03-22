package typings.jimpBmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagebmp extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String]
}

object AnonImagebmp {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): AnonImagebmp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagebmp]
  }
}


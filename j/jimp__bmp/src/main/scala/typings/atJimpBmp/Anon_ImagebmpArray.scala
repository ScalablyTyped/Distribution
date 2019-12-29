package typings.atJimpBmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImagebmpArray extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String]
}

object Anon_ImagebmpArray {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): Anon_ImagebmpArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImagebmpArray]
  }
}


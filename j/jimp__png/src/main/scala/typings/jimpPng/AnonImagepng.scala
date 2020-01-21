package typings.jimpPng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImagepng extends js.Object {
  @JSName("image/png")
  var imageSlashpng: js.Array[String]
}

object AnonImagepng {
  @scala.inline
  def apply(imageSlashpng: js.Array[String]): AnonImagepng = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagepng]
  }
}


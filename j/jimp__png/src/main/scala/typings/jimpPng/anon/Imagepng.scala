package typings.jimpPng.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagepng extends js.Object {
  @JSName("image/png")
  var imageSlashpng: js.Array[String]
}

object Imagepng {
  @scala.inline
  def apply(imageSlashpng: js.Array[String]): Imagepng = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagepng]
  }
}


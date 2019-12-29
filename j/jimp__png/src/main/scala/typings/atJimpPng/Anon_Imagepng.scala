package typings.atJimpPng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imagepng extends js.Object {
  @JSName("image/png")
  var imageSlashpng: js.Array[String]
}

object Anon_Imagepng {
  @scala.inline
  def apply(imageSlashpng: js.Array[String]): Anon_Imagepng = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Imagepng]
  }
}


package typings.atJimpCore.typesEtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var bitmap: Bitmap
}

object Image {
  @scala.inline
  def apply(bitmap: Bitmap): Image = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}


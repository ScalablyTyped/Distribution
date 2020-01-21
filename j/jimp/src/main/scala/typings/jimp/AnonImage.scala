package typings.jimp

import typings.jimp.mod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: DepreciatedJimp
  var percent: Double
}

object AnonImage {
  @scala.inline
  def apply(image: DepreciatedJimp, percent: Double): AnonImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImage]
  }
}


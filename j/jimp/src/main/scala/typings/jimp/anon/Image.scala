package typings.jimp.anon

import typings.jimp.mod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: DepreciatedJimp
  var percent: Double
}

object Image {
  @scala.inline
  def apply(image: DepreciatedJimp, percent: Double): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}


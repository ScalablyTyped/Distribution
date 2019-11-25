package typings.jimp

import typings.jimp.jimpMod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: DepreciatedJimp
  var percent: Double
}

object Anon_Image {
  @scala.inline
  def apply(image: DepreciatedJimp, percent: Double): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Image]
  }
}


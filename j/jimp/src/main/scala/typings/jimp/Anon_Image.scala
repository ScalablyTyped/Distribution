package typings.jimp

import typings.jimp.jimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: Jimp
  var percent: Double
}

object Anon_Image {
  @scala.inline
  def apply(image: Jimp, percent: Double): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, percent = percent)
  
    __obj.asInstanceOf[Anon_Image]
  }
}


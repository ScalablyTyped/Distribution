package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: jimpLib.jimpMod.Jimp
  var percent: scala.Double
}

object Anon_Image {
  @scala.inline
  def apply(image: jimpLib.jimpMod.Jimp, percent: scala.Double): Anon_Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("percent")(percent)
    __obj.asInstanceOf[Anon_Image]
  }
}


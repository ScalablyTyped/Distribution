package typings.jimp.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends js.Object {
  var a: Double
  var b: Double
  var g: Double
  var r: Double
}

object RGBA {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, r = r)
  
    __obj.asInstanceOf[RGBA]
  }
}


package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object RGBA {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, g: scala.Double, r: scala.Double): RGBA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[RGBA]
  }
}


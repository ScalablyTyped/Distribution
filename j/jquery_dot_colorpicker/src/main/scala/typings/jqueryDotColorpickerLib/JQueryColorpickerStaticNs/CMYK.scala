package typings
package jqueryDotColorpickerLib.JQueryColorpickerStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMYK extends js.Object {
  var c: scala.Double
  var k: scala.Double
  var m: scala.Double
  var y: scala.Double
}

object CMYK {
  @scala.inline
  def apply(c: scala.Double, k: scala.Double, m: scala.Double, y: scala.Double): CMYK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("k")(k)
    __obj.updateDynamic("m")(m)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[CMYK]
  }
}


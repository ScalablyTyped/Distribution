package typings
package jqueryDotColorpickerLib.JQueryColorpickerStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LAB extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var l: scala.Double
}

object LAB {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, l: scala.Double): LAB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("l")(l)
    __obj.asInstanceOf[LAB]
  }
}


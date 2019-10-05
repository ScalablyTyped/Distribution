package typings.jqueryDotColorpicker.JQueryColorpickerStatic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSV extends js.Object {
  var h: Double
  var s: Double
  var v: Double
}

object HSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): HSV = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
  
    __obj.asInstanceOf[HSV]
  }
}


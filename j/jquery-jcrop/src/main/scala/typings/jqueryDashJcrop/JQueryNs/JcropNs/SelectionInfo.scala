package typings.jqueryDashJcrop.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInfo extends js.Object {
  var h: Double
  var w: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object SelectionInfo {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, x2: Double, y: Double, y2: Double): SelectionInfo = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, x2 = x2, y = y, y2 = y2)
  
    __obj.asInstanceOf[SelectionInfo]
  }
}


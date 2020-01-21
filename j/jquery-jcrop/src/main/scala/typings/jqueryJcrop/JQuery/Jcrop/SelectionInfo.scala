package typings.jqueryJcrop.JQuery.Jcrop

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
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionInfo]
  }
}


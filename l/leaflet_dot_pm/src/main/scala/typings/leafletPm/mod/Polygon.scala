package typings.leafletPm.mod

import typings.leafletPm.mod.PM.Edit.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends js.Object {
  var pm: Line
}

object Polygon {
  @scala.inline
  def apply(pm: Line): Polygon = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Polygon]
  }
}


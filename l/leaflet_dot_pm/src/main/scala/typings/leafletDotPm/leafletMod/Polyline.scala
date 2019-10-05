package typings.leafletDotPm.leafletMod

import typings.leafletDotPm.leafletMod.PM.Edit.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline extends js.Object {
  var pm: Line
}

object Polyline {
  @scala.inline
  def apply(pm: Line): Polyline = {
    val __obj = js.Dynamic.literal(pm = pm)
  
    __obj.asInstanceOf[Polyline]
  }
}


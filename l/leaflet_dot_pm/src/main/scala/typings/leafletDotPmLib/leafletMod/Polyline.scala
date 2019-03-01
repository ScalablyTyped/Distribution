package typings
package leafletDotPmLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline extends js.Object {
  var pm: leafletDotPmLib.leafletMod.PMNs.EditNs.Line
}

object Polyline {
  @scala.inline
  def apply(pm: leafletDotPmLib.leafletMod.PMNs.EditNs.Line): Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Polyline]
  }
}


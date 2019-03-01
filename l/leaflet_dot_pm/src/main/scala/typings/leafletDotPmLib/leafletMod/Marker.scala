package typings
package leafletDotPmLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  var pm: leafletDotPmLib.leafletMod.PMNs.EditNs.Marker
}

object Marker {
  @scala.inline
  def apply(pm: leafletDotPmLib.leafletMod.PMNs.EditNs.Marker): Marker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Marker]
  }
}


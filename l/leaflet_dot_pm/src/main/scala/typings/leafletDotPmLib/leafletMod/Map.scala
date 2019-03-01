package typings
package leafletDotPmLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var pm: leafletDotPmLib.leafletMod.PMNs.Map
}

object Map {
  @scala.inline
  def apply(pm: leafletDotPmLib.leafletMod.PMNs.Map): Map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Map]
  }
}


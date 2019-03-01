package typings
package haversineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinates extends js.Object {
  var coordinates: haversineLib.haversineMod.haversineNs.LatLonTuple
}

object Anon_Coordinates {
  @scala.inline
  def apply(coordinates: haversineLib.haversineMod.haversineNs.LatLonTuple): Anon_Coordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coordinates")(coordinates)
    __obj.asInstanceOf[Anon_Coordinates]
  }
}


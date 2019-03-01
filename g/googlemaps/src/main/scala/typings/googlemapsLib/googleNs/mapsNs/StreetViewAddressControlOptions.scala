package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewAddressControlOptions extends js.Object {
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object StreetViewAddressControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null): StreetViewAddressControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[StreetViewAddressControlOptions]
  }
}


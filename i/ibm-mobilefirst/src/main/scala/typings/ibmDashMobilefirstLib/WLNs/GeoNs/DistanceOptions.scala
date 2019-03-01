package typings
package ibmDashMobilefirstLib.WLNs.GeoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceOptions extends js.Object {
  var bufferZoneWidth: scala.Double
}

object DistanceOptions {
  @scala.inline
  def apply(bufferZoneWidth: scala.Double): DistanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferZoneWidth")(bufferZoneWidth)
    __obj.asInstanceOf[DistanceOptions]
  }
}


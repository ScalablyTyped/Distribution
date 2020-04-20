package typings.ibmMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceOptions extends js.Object {
  var bufferZoneWidth: Double
}

object DistanceOptions {
  @scala.inline
  def apply(bufferZoneWidth: Double): DistanceOptions = {
    val __obj = js.Dynamic.literal(bufferZoneWidth = bufferZoneWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceOptions]
  }
}


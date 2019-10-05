package typings.googlemaps.google.maps

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingOptions extends js.Object {
  var departureTime: Date
  var trafficModel: js.UndefOr[TrafficModel] = js.undefined
}

object DrivingOptions {
  @scala.inline
  def apply(departureTime: Date, trafficModel: TrafficModel = null): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime)
    if (trafficModel != null) __obj.updateDynamic("trafficModel")(trafficModel)
    __obj.asInstanceOf[DrivingOptions]
  }
}


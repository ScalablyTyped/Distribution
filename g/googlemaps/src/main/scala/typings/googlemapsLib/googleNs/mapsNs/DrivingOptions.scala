package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingOptions extends js.Object {
  var departureTime: stdLib.Date
  var trafficModel: js.UndefOr[TrafficModel] = js.undefined
}

object DrivingOptions {
  @scala.inline
  def apply(departureTime: stdLib.Date, trafficModel: TrafficModel = null): DrivingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("departureTime")(departureTime)
    if (trafficModel != null) __obj.updateDynamic("trafficModel")(trafficModel)
    __obj.asInstanceOf[DrivingOptions]
  }
}


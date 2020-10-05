package typings.googlemaps.google.maps

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingOptions extends js.Object {
  var departureTime: Date = js.native
  var trafficModel: js.UndefOr[TrafficModel] = js.native
}

object DrivingOptions {
  @scala.inline
  def apply(departureTime: Date): DrivingOptions = {
    val __obj = js.Dynamic.literal(departureTime = departureTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingOptions]
  }
  @scala.inline
  implicit class DrivingOptionsOps[Self <: DrivingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDepartureTime(value: Date): Self = this.set("departureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficModel(value: TrafficModel): Self = this.set("trafficModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficModel: Self = this.set("trafficModel", js.undefined)
  }
  
}


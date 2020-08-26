package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayPosition extends js.Object {
  var Address: AdditionalData = js.native
  var DisplayPosition: Longitude = js.native
  var LocationId: String = js.native
  var LocationType: String = js.native
  var MapView: BottomRight = js.native
  var NavigationPosition: js.Array[Longitude] = js.native
}

object DisplayPosition {
  @scala.inline
  def apply(
    Address: AdditionalData,
    DisplayPosition: Longitude,
    LocationId: String,
    LocationType: String,
    MapView: BottomRight,
    NavigationPosition: js.Array[Longitude]
  ): DisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayPosition]
  }
  @scala.inline
  implicit class DisplayPositionOps[Self <: DisplayPosition] (val x: Self) extends AnyVal {
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
    def setAddress(value: AdditionalData): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayPosition(value: Longitude): Self = this.set("DisplayPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationId(value: String): Self = this.set("LocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationType(value: String): Self = this.set("LocationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapView(value: BottomRight): Self = this.set("MapView", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationPositionVarargs(value: Longitude*): Self = this.set("NavigationPosition", js.Array(value :_*))
    @scala.inline
    def setNavigationPosition(value: js.Array[Longitude]): Self = this.set("NavigationPosition", value.asInstanceOf[js.Any])
  }
  
}


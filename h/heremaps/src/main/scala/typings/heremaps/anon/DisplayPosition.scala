package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayPosition extends js.Object {
  var Address: AdditionalData
  var DisplayPosition: Longitude
  var LocationId: String
  var LocationType: String
  var MapView: BottomRight
  var NavigationPosition: js.Array[Longitude]
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
}


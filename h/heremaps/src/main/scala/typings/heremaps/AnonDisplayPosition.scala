package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayPosition extends js.Object {
  var Address: AnonAdditionalData
  var DisplayPosition: AnonLongitude
  var LocationId: String
  var LocationType: String
  var MapView: AnonBottomRight
  var NavigationPosition: js.Array[AnonLongitude]
}

object AnonDisplayPosition {
  @scala.inline
  def apply(
    Address: AnonAdditionalData,
    DisplayPosition: AnonLongitude,
    LocationId: String,
    LocationType: String,
    MapView: AnonBottomRight,
    NavigationPosition: js.Array[AnonLongitude]
  ): AnonDisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisplayPosition]
  }
}


package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMatrixRequest extends js.Object {
  var avoidFerries: js.UndefOr[Boolean] = js.native
  var avoidHighways: js.UndefOr[Boolean] = js.native
  var avoidTolls: js.UndefOr[Boolean] = js.native
  var destinations: js.UndefOr[js.Array[String | LatLng | LatLngLiteral | Place]] = js.native
  var drivingOptions: js.UndefOr[DrivingOptions] = js.native
  var durationInTraffic: js.UndefOr[Boolean] = js.native
  var origins: js.UndefOr[js.Array[String | LatLng | LatLngLiteral | Place]] = js.native
  var region: js.UndefOr[String] = js.native
  var transitOptions: js.UndefOr[TransitOptions] = js.native
  var travelMode: js.UndefOr[TravelMode] = js.native
  var unitSystem: js.UndefOr[UnitSystem] = js.native
}

object DistanceMatrixRequest {
  @scala.inline
  def apply(): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
  @scala.inline
  implicit class DistanceMatrixRequestOps[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
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
    def setAvoidFerries(value: Boolean): Self = this.set("avoidFerries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidFerries: Self = this.set("avoidFerries", js.undefined)
    @scala.inline
    def setAvoidHighways(value: Boolean): Self = this.set("avoidHighways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidHighways: Self = this.set("avoidHighways", js.undefined)
    @scala.inline
    def setAvoidTolls(value: Boolean): Self = this.set("avoidTolls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidTolls: Self = this.set("avoidTolls", js.undefined)
    @scala.inline
    def setDestinationsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setDrivingOptions(value: DrivingOptions): Self = this.set("drivingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrivingOptions: Self = this.set("drivingOptions", js.undefined)
    @scala.inline
    def setDurationInTraffic(value: Boolean): Self = this.set("durationInTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInTraffic: Self = this.set("durationInTraffic", js.undefined)
    @scala.inline
    def setOriginsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTransitOptions(value: TransitOptions): Self = this.set("transitOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitOptions: Self = this.set("transitOptions", js.undefined)
    @scala.inline
    def setTravelMode(value: TravelMode): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = this.set("unitSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitSystem: Self = this.set("unitSystem", js.undefined)
  }
  
}


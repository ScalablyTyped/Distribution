package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationResult extends js.Object {
  var elevation: Double = js.native
  var location: LatLng = js.native
  var resolution: Double = js.native
}

object ElevationResult {
  @scala.inline
  def apply(elevation: Double, location: LatLng, resolution: Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationResult]
  }
  @scala.inline
  implicit class ElevationResultOps[Self <: ElevationResult] (val x: Self) extends AnyVal {
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
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
  }
  
}


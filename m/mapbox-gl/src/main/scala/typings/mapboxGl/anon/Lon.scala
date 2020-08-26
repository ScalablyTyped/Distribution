package typings.mapboxGl.anon

import typings.mapboxGl.mod._LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lon extends _LngLatLike {
  var lat: Double = js.native
  var lon: Double = js.native
}

object Lon {
  @scala.inline
  def apply(lat: Double, lon: Double): Lon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  @scala.inline
  implicit class LonOps[Self <: Lon] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLon(value: Double): Self = this.set("lon", value.asInstanceOf[js.Any])
  }
  
}


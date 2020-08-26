package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var location: LatLngLiteral = js.native
  var location_type: String = js.native
  var viewport: Northeast = js.native
}

object Location {
  @scala.inline
  def apply(location: LatLngLiteral, location_type: String, viewport: Northeast): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLocation(value: LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation_type(value: String): Self = this.set("location_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: Northeast): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
  
}


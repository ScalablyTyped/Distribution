package typings.leafletGeosearch

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var location: LatLngLiteral
  var location_type: String
  var viewport: AnonNortheast
}

object AnonLocation {
  @scala.inline
  def apply(location: LatLngLiteral, location_type: String, viewport: AnonNortheast): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocation]
  }
}


package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var location: LatLngLiteral
  var location_type: String
  var viewport: Northeast
}

object Location {
  @scala.inline
  def apply(location: LatLngLiteral, location_type: String, viewport: Northeast): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


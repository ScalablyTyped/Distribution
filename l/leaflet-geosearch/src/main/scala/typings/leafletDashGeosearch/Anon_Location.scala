package typings.leafletDashGeosearch

import typings.leafletDashGeosearch.leafletDashGeosearchMod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: LatLngLiteral
  var location_type: String
  var viewport: Anon_Northeast
}

object Anon_Location {
  @scala.inline
  def apply(location: LatLngLiteral, location_type: String, viewport: Anon_Northeast): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location, location_type = location_type, viewport = viewport)
  
    __obj.asInstanceOf[Anon_Location]
  }
}


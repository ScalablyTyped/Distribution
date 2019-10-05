package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromQueryRequest extends js.Object {
  var fields: js.Array[String]
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  var query: String
}

object FindPlaceFromQueryRequest {
  @scala.inline
  def apply(fields: js.Array[String], query: String, locationBias: LocationBias = null): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields, query = query)
    if (locationBias != null) __obj.updateDynamic("locationBias")(locationBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
}


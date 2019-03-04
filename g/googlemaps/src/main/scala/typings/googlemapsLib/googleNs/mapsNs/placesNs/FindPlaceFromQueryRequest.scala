package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindPlaceFromQueryRequest extends js.Object {
  var fields: js.Array[java.lang.String]
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  var query: java.lang.String
}

object FindPlaceFromQueryRequest {
  @scala.inline
  def apply(fields: js.Array[java.lang.String], query: java.lang.String, locationBias: LocationBias = null): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields, query = query)
    if (locationBias != null) __obj.updateDynamic("locationBias")(locationBias.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
}


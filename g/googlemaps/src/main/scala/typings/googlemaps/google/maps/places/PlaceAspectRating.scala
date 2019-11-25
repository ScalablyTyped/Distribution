package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAspectRating extends js.Object {
  var rating: Double
  var `type`: String
}

object PlaceAspectRating {
  @scala.inline
  def apply(rating: Double, `type`: String): PlaceAspectRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAspectRating]
  }
}


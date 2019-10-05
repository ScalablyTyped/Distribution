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
    val __obj = js.Dynamic.literal(rating = rating)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaceAspectRating]
  }
}


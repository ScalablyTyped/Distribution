package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAspectRating extends js.Object {
  var rating: scala.Double
  var `type`: java.lang.String
}

object PlaceAspectRating {
  @scala.inline
  def apply(rating: scala.Double, `type`: java.lang.String): PlaceAspectRating = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("rating")(rating)
    __obj.asInstanceOf[PlaceAspectRating]
  }
}


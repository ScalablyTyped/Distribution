package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating]
  var author_name: java.lang.String
  var author_url: java.lang.String
  var language: java.lang.String
  var text: java.lang.String
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[PlaceAspectRating],
    author_name: java.lang.String,
    author_url: java.lang.String,
    language: java.lang.String,
    text: java.lang.String
  ): PlaceReview = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspects")(aspects)
    __obj.updateDynamic("author_name")(author_name)
    __obj.updateDynamic("author_url")(author_url)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PlaceReview]
  }
}


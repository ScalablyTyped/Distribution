package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating]
  var author_name: String
  var author_url: String
  var language: String
  var text: String
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[PlaceAspectRating],
    author_name: String,
    author_url: String,
    language: String,
    text: String
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects, author_name = author_name, author_url = author_url, language = language, text = text)
  
    __obj.asInstanceOf[PlaceReview]
  }
}


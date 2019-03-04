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
    val __obj = js.Dynamic.literal(aspects = aspects, author_name = author_name, author_url = author_url, language = language, text = text)
  
    __obj.asInstanceOf[PlaceReview]
  }
}


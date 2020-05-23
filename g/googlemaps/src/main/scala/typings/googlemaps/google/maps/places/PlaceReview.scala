package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating]
  var author_name: String
  var author_url: js.UndefOr[String] = js.undefined
  var language: String
  var profile_photo_url: String
  // TODO rating is documented in the HTTP API (https://developers.google.com/places/web-service/details#PlaceDetailsResults) but not in the Javascript API.
  var rating: Double
  var relative_time_description: String
  var text: String
  var time: Double
}

object PlaceReview {
  @scala.inline
  def apply(
    aspects: js.Array[PlaceAspectRating],
    author_name: String,
    language: String,
    profile_photo_url: String,
    rating: Double,
    relative_time_description: String,
    text: String,
    time: Double,
    author_url: String = null
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], profile_photo_url = profile_photo_url.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], relative_time_description = relative_time_description.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (author_url != null) __obj.updateDynamic("author_url")(author_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
}


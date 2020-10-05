package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceReview extends js.Object {
  var aspects: js.Array[PlaceAspectRating] = js.native
  var author_name: String = js.native
  var author_url: js.UndefOr[String] = js.native
  var language: String = js.native
  var profile_photo_url: String = js.native
  // TODO rating is documented in the HTTP API (https://developers.google.com/places/web-service/details#PlaceDetailsResults) but not in the Javascript API.
  var rating: Double = js.native
  var relative_time_description: String = js.native
  var text: String = js.native
  var time: Double = js.native
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
    time: Double
  ): PlaceReview = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], profile_photo_url = profile_photo_url.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], relative_time_description = relative_time_description.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceReview]
  }
  @scala.inline
  implicit class PlaceReviewOps[Self <: PlaceReview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAspectsVarargs(value: PlaceAspectRating*): Self = this.set("aspects", js.Array(value :_*))
    @scala.inline
    def setAspects(value: js.Array[PlaceAspectRating]): Self = this.set("aspects", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_name(value: String): Self = this.set("author_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile_photo_url(value: String): Self = this.set("profile_photo_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative_time_description(value: String): Self = this.set("relative_time_description", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_url(value: String): Self = this.set("author_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor_url: Self = this.set("author_url", js.undefined)
  }
  
}


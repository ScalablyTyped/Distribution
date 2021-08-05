package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceReview extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: PlaceReview](x: Self) {
    
    inline def setAspects(value: js.Array[PlaceAspectRating]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    inline def setAspectsVarargs(value: PlaceAspectRating*): Self = StObject.set(x, "aspects", js.Array(value :_*))
    
    inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    inline def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
    
    inline def setAuthor_urlUndefined: Self = StObject.set(x, "author_url", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setProfile_photo_url(value: String): Self = StObject.set(x, "profile_photo_url", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRelative_time_description(value: String): Self = StObject.set(x, "relative_time_description", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

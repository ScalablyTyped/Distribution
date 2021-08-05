package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.GeocoderAddressComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceResult extends StObject {
  
  var address_components: js.UndefOr[js.Array[GeocoderAddressComponent]] = js.undefined
  
  var adr_address: js.UndefOr[String] = js.undefined
  
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.undefined
  
  var formatted_address: js.UndefOr[String] = js.undefined
  
  var formatted_phone_number: js.UndefOr[String] = js.undefined
  
  var geometry: js.UndefOr[PlaceGeometry] = js.undefined
  
  var html_attributions: js.UndefOr[js.Array[String]] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var international_phone_number: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var opening_hours: js.UndefOr[OpeningHours] = js.undefined
  
  var permanently_closed: js.UndefOr[Boolean] = js.undefined
  
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
  
  var place_id: js.UndefOr[String] = js.undefined
  
  var plus_code: js.UndefOr[PlacePlusCode] = js.undefined
  
  var price_level: js.UndefOr[Double] = js.undefined
  
  var rating: js.UndefOr[Double] = js.undefined
  
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var user_ratings_total: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated utc_offset is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use PlaceResult.utc_offset_minutes instead.
    */
  var utc_offset: js.UndefOr[Double] = js.undefined
  
  var utc_offset_minutes: js.UndefOr[Double] = js.undefined
  
  var vicinity: js.UndefOr[String] = js.undefined
  
  var website: js.UndefOr[String] = js.undefined
}
object PlaceResult {
  
  inline def apply(name: String): PlaceResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceResult]
  }
  
  extension [Self <: PlaceResult](x: Self) {
    
    inline def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsUndefined: Self = StObject.set(x, "address_components", js.undefined)
    
    inline def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    inline def setAdr_address(value: String): Self = StObject.set(x, "adr_address", value.asInstanceOf[js.Any])
    
    inline def setAdr_addressUndefined: Self = StObject.set(x, "adr_address", js.undefined)
    
    inline def setAspects(value: js.Array[PlaceAspectRating]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    inline def setAspectsUndefined: Self = StObject.set(x, "aspects", js.undefined)
    
    inline def setAspectsVarargs(value: PlaceAspectRating*): Self = StObject.set(x, "aspects", js.Array(value :_*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setFormatted_addressUndefined: Self = StObject.set(x, "formatted_address", js.undefined)
    
    inline def setFormatted_phone_number(value: String): Self = StObject.set(x, "formatted_phone_number", value.asInstanceOf[js.Any])
    
    inline def setFormatted_phone_numberUndefined: Self = StObject.set(x, "formatted_phone_number", js.undefined)
    
    inline def setGeometry(value: PlaceGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    inline def setHtml_attributionsUndefined: Self = StObject.set(x, "html_attributions", js.undefined)
    
    inline def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value :_*))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternational_phone_number(value: String): Self = StObject.set(x, "international_phone_number", value.asInstanceOf[js.Any])
    
    inline def setInternational_phone_numberUndefined: Self = StObject.set(x, "international_phone_number", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpening_hours(value: OpeningHours): Self = StObject.set(x, "opening_hours", value.asInstanceOf[js.Any])
    
    inline def setOpening_hoursUndefined: Self = StObject.set(x, "opening_hours", js.undefined)
    
    inline def setPermanently_closed(value: Boolean): Self = StObject.set(x, "permanently_closed", value.asInstanceOf[js.Any])
    
    inline def setPermanently_closedUndefined: Self = StObject.set(x, "permanently_closed", js.undefined)
    
    inline def setPhotos(value: js.Array[PlacePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: PlacePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    inline def setPlus_code(value: PlacePlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
    
    inline def setPlus_codeUndefined: Self = StObject.set(x, "plus_code", js.undefined)
    
    inline def setPrice_level(value: Double): Self = StObject.set(x, "price_level", value.asInstanceOf[js.Any])
    
    inline def setPrice_levelUndefined: Self = StObject.set(x, "price_level", js.undefined)
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setReviews(value: js.Array[PlaceReview]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    inline def setReviewsVarargs(value: PlaceReview*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser_ratings_total(value: Double): Self = StObject.set(x, "user_ratings_total", value.asInstanceOf[js.Any])
    
    inline def setUser_ratings_totalUndefined: Self = StObject.set(x, "user_ratings_total", js.undefined)
    
    inline def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
    
    inline def setUtc_offsetUndefined: Self = StObject.set(x, "utc_offset", js.undefined)
    
    inline def setUtc_offset_minutes(value: Double): Self = StObject.set(x, "utc_offset_minutes", value.asInstanceOf[js.Any])
    
    inline def setUtc_offset_minutesUndefined: Self = StObject.set(x, "utc_offset_minutes", js.undefined)
    
    inline def setVicinity(value: String): Self = StObject.set(x, "vicinity", value.asInstanceOf[js.Any])
    
    inline def setVicinityUndefined: Self = StObject.set(x, "vicinity", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}

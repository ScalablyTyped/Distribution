package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.GeocoderAddressComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceResult extends StObject {
  
  var address_components: js.UndefOr[js.Array[GeocoderAddressComponent]] = js.native
  
  var adr_address: js.UndefOr[String] = js.native
  
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.native
  
  var formatted_address: js.UndefOr[String] = js.native
  
  var formatted_phone_number: js.UndefOr[String] = js.native
  
  var geometry: js.UndefOr[PlaceGeometry] = js.native
  
  var html_attributions: js.UndefOr[js.Array[String]] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var international_phone_number: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var opening_hours: js.UndefOr[OpeningHours] = js.native
  
  var permanently_closed: js.UndefOr[Boolean] = js.native
  
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.native
  
  var place_id: js.UndefOr[String] = js.native
  
  var plus_code: js.UndefOr[PlacePlusCode] = js.native
  
  var price_level: js.UndefOr[Double] = js.native
  
  var rating: js.UndefOr[Double] = js.native
  
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.native
  
  var types: js.UndefOr[js.Array[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var user_ratings_total: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated utc_offset is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use PlaceResult.utc_offset_minutes instead.
    */
  var utc_offset: js.UndefOr[Double] = js.native
  
  var utc_offset_minutes: js.UndefOr[Double] = js.native
  
  var vicinity: js.UndefOr[String] = js.native
  
  var website: js.UndefOr[String] = js.native
}
object PlaceResult {
  
  @scala.inline
  def apply(name: String): PlaceResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceResult]
  }
  
  @scala.inline
  implicit class PlaceResultMutableBuilder[Self <: PlaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_componentsUndefined: Self = StObject.set(x, "address_components", js.undefined)
    
    @scala.inline
    def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    @scala.inline
    def setAdr_address(value: String): Self = StObject.set(x, "adr_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdr_addressUndefined: Self = StObject.set(x, "adr_address", js.undefined)
    
    @scala.inline
    def setAspects(value: js.Array[PlaceAspectRating]): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectsUndefined: Self = StObject.set(x, "aspects", js.undefined)
    
    @scala.inline
    def setAspectsVarargs(value: PlaceAspectRating*): Self = StObject.set(x, "aspects", js.Array(value :_*))
    
    @scala.inline
    def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatted_addressUndefined: Self = StObject.set(x, "formatted_address", js.undefined)
    
    @scala.inline
    def setFormatted_phone_number(value: String): Self = StObject.set(x, "formatted_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatted_phone_numberUndefined: Self = StObject.set(x, "formatted_phone_number", js.undefined)
    
    @scala.inline
    def setGeometry(value: PlaceGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_attributionsUndefined: Self = StObject.set(x, "html_attributions", js.undefined)
    
    @scala.inline
    def setHtml_attributionsVarargs(value: String*): Self = StObject.set(x, "html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternational_phone_number(value: String): Self = StObject.set(x, "international_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternational_phone_numberUndefined: Self = StObject.set(x, "international_phone_number", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpening_hours(value: OpeningHours): Self = StObject.set(x, "opening_hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpening_hoursUndefined: Self = StObject.set(x, "opening_hours", js.undefined)
    
    @scala.inline
    def setPermanently_closed(value: Boolean): Self = StObject.set(x, "permanently_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanently_closedUndefined: Self = StObject.set(x, "permanently_closed", js.undefined)
    
    @scala.inline
    def setPhotos(value: js.Array[PlacePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: PlacePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    @scala.inline
    def setPlus_code(value: PlacePlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlus_codeUndefined: Self = StObject.set(x, "plus_code", js.undefined)
    
    @scala.inline
    def setPrice_level(value: Double): Self = StObject.set(x, "price_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice_levelUndefined: Self = StObject.set(x, "price_level", js.undefined)
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setReviews(value: js.Array[PlaceReview]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: PlaceReview*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUser_ratings_total(value: Double): Self = StObject.set(x, "user_ratings_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_ratings_totalUndefined: Self = StObject.set(x, "user_ratings_total", js.undefined)
    
    @scala.inline
    def setUtc_offset(value: Double): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtc_offsetUndefined: Self = StObject.set(x, "utc_offset", js.undefined)
    
    @scala.inline
    def setUtc_offset_minutes(value: Double): Self = StObject.set(x, "utc_offset_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtc_offset_minutesUndefined: Self = StObject.set(x, "utc_offset_minutes", js.undefined)
    
    @scala.inline
    def setVicinity(value: String): Self = StObject.set(x, "vicinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVicinityUndefined: Self = StObject.set(x, "vicinity", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}

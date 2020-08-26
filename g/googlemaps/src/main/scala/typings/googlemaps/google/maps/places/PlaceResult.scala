package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.GeocoderAddressComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceResult extends js.Object {
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
  implicit class PlaceResultOps[Self <: PlaceResult] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = this.set("address_components", js.Array(value :_*))
    @scala.inline
    def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = this.set("address_components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress_components: Self = this.set("address_components", js.undefined)
    @scala.inline
    def setAdr_address(value: String): Self = this.set("adr_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdr_address: Self = this.set("adr_address", js.undefined)
    @scala.inline
    def setAspectsVarargs(value: PlaceAspectRating*): Self = this.set("aspects", js.Array(value :_*))
    @scala.inline
    def setAspects(value: js.Array[PlaceAspectRating]): Self = this.set("aspects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspects: Self = this.set("aspects", js.undefined)
    @scala.inline
    def setFormatted_address(value: String): Self = this.set("formatted_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted_address: Self = this.set("formatted_address", js.undefined)
    @scala.inline
    def setFormatted_phone_number(value: String): Self = this.set("formatted_phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted_phone_number: Self = this.set("formatted_phone_number", js.undefined)
    @scala.inline
    def setGeometry(value: PlaceGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setHtml_attributionsVarargs(value: String*): Self = this.set("html_attributions", js.Array(value :_*))
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = this.set("html_attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml_attributions: Self = this.set("html_attributions", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternational_phone_number(value: String): Self = this.set("international_phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternational_phone_number: Self = this.set("international_phone_number", js.undefined)
    @scala.inline
    def setOpening_hours(value: OpeningHours): Self = this.set("opening_hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpening_hours: Self = this.set("opening_hours", js.undefined)
    @scala.inline
    def setPermanently_closed(value: Boolean): Self = this.set("permanently_closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanently_closed: Self = this.set("permanently_closed", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: PlacePhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[PlacePhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setPlace_id(value: String): Self = this.set("place_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlace_id: Self = this.set("place_id", js.undefined)
    @scala.inline
    def setPlus_code(value: PlacePlusCode): Self = this.set("plus_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlus_code: Self = this.set("plus_code", js.undefined)
    @scala.inline
    def setPrice_level(value: Double): Self = this.set("price_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice_level: Self = this.set("price_level", js.undefined)
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setReviewsVarargs(value: PlaceReview*): Self = this.set("reviews", js.Array(value :_*))
    @scala.inline
    def setReviews(value: js.Array[PlaceReview]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviews: Self = this.set("reviews", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUser_ratings_total(value: Double): Self = this.set("user_ratings_total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_ratings_total: Self = this.set("user_ratings_total", js.undefined)
    @scala.inline
    def setUtc_offset(value: Double): Self = this.set("utc_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtc_offset: Self = this.set("utc_offset", js.undefined)
    @scala.inline
    def setUtc_offset_minutes(value: Double): Self = this.set("utc_offset_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtc_offset_minutes: Self = this.set("utc_offset_minutes", js.undefined)
    @scala.inline
    def setVicinity(value: String): Self = this.set("vicinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVicinity: Self = this.set("vicinity", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}


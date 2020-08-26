package typings.mapboxMapboxSdk.geocodingMod

import typings.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeRequest extends js.Object {
  /**
    * Forward geocoding only. Return autocomplete results or not. Options are  true or  false and the default is  true .
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
  /**
    * Forward geocoding only. Limit results to a bounding box. Options are in the format  minX,minY,maxX,maxY .
    */
  var bbox: js.UndefOr[BoundingBox] = js.native
  /**
    * Limit results to one or more countries. Options are ISO 3166 alpha 2 country codes
    */
  var countries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the language to use for response text and, for forward geocoding, query result weighting.
    * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more
    * IETF subtags for country or script.
    */
  var language: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limit the number of results returned. The default is  5 for forward geocoding and  1 for reverse geocoding.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Either  mapbox.places for ephemeral geocoding, or  mapbox.places-permanent for storing results and batch geocoding.
    */
  var mode: GeocodeMode = js.native
  /**
    * Bias local results based on a provided location. Options are  longitude,latitude coordinates.
    */
  var proximity: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A location. This will be a place name for forward geocoding or a coordinate pair (longitude, latitude) for reverse geocoding.
    */
  var query: String | LngLatLike = js.native
  /**
    * Filter results by one or more feature types
    */
  var types: js.UndefOr[js.Array[GeocodeQueryType]] = js.native
}

object GeocodeRequest {
  @scala.inline
  def apply(mode: GeocodeMode, query: String | LngLatLike): GeocodeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeRequest]
  }
  @scala.inline
  implicit class GeocodeRequestOps[Self <: GeocodeRequest] (val x: Self) extends AnyVal {
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
    def setMode(value: GeocodeMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String | LngLatLike): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setBbox(value: BoundingBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    @scala.inline
    def setCountries(value: js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    @scala.inline
    def setLanguageVarargs(value: String*): Self = this.set("language", js.Array(value :_*))
    @scala.inline
    def setLanguage(value: js.Array[String]): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setProximityVarargs(value: Double*): Self = this.set("proximity", js.Array(value :_*))
    @scala.inline
    def setProximity(value: js.Array[Double]): Self = this.set("proximity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProximity: Self = this.set("proximity", js.undefined)
    @scala.inline
    def setTypesVarargs(value: GeocodeQueryType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[GeocodeQueryType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}


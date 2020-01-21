package typings.mapboxMapboxSdk.geocodingMod

import typings.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeRequest extends js.Object {
  /**
    * Forward geocoding only. Return autocomplete results or not. Options are  true or  false and the default is  true .
    */
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  /**
    * Forward geocoding only. Limit results to a bounding box. Options are in the format  minX,minY,maxX,maxY .
    */
  var bbox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * Limit results to one or more countries. Options are ISO 3166 alpha 2 country codes
    */
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specify the language to use for response text and, for forward geocoding, query result weighting.
    * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more
    * IETF subtags for country or script.
    */
  var language: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Limit the number of results returned. The default is  5 for forward geocoding and  1 for reverse geocoding.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Either  mapbox.places for ephemeral geocoding, or  mapbox.places-permanent for storing results and batch geocoding.
    */
  var mode: GeocodeMode
  /**
    * Bias local results based on a provided location. Options are  longitude,latitude coordinates.
    */
  var proximity: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A location. This will be a place name for forward geocoding or a coordinate pair (longitude, latitude) for reverse geocoding.
    */
  var query: String | LngLatLike
  /**
    * Filter results by one or more feature types
    */
  var types: js.UndefOr[js.Array[GeocodeQueryType]] = js.undefined
}

object GeocodeRequest {
  @scala.inline
  def apply(
    mode: GeocodeMode,
    query: String | LngLatLike,
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    bbox: BoundingBox = null,
    countries: js.Array[String] = null,
    language: js.Array[String] = null,
    limit: Int | Double = null,
    proximity: js.Array[Double] = null,
    types: js.Array[GeocodeQueryType] = null
  ): GeocodeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (proximity != null) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeRequest]
  }
}


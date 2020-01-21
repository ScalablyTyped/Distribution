package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeProperties extends GeocodeFeature {
  /**
    * A string of comma-separated categories for the returned  poi feature.
    */
  var category: js.UndefOr[String] = js.undefined
  /**
    * A boolean value indicating whether a  poi feature is a landmark. Landmarks are
    * particularly notable or long-lived features like schools, parks, museums and places of worship.
    */
  var landmark: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a suggested Maki icon to visualize a  poi feature based on its  category .
    */
  var maki: js.UndefOr[String] = js.undefined
  /**
    * The ISO 3166-1 country and ISO 3166-2 region code for the returned feature.
    */
  var short_code: String
  /**
    * A formatted string of the telephone number for the returned  poi feature.
    */
  var tel: js.UndefOr[String] = js.undefined
  /**
    * The Wikidata identifier for the returned feature.
    */
  var wikidata: js.UndefOr[String] = js.undefined
}

object GeocodeProperties {
  @scala.inline
  def apply(
    center: js.Array[Double],
    context: js.Array[GeocodeFeature],
    geometry: Geometry,
    id: String,
    language: String,
    matching_place_name: String,
    matching_text: String,
    place_name: String,
    place_type: js.Array[String],
    properties: GeocodeProperties,
    relevance: Double,
    short_code: String,
    text: String,
    `type`: String,
    address: String = null,
    bbox: js.Array[Double] = null,
    category: String = null,
    landmark: js.UndefOr[Boolean] = js.undefined,
    maki: String = null,
    tel: String = null,
    wikidata: String = null
  ): GeocodeProperties = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(landmark)) __obj.updateDynamic("landmark")(landmark.asInstanceOf[js.Any])
    if (maki != null) __obj.updateDynamic("maki")(maki.asInstanceOf[js.Any])
    if (tel != null) __obj.updateDynamic("tel")(tel.asInstanceOf[js.Any])
    if (wikidata != null) __obj.updateDynamic("wikidata")(wikidata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeProperties]
  }
}


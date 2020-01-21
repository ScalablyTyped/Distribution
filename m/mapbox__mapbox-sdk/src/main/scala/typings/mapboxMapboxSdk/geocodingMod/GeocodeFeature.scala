package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeFeature extends js.Object {
  /**
    * A string of the house number for the returned  address feature. Note that unlike the
    * address property for  poi features, this property is outside the  properties object.
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * An array bounding box in the form [ minX,minY,maxX,maxY ] .
    */
  var bbox: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * An array in the form [ longitude,latitude ] at the center of the specified  bbox .
    */
  var center: js.Array[Double]
  /**
    * An array representing the hierarchy of encompassing parent features. Each parent feature may include any of the above properties
    */
  var context: js.Array[GeocodeFeature]
  /**
    * An object describing the spatial geometry of the returned feature
    */
  var geometry: Geometry
  /**
    * A string feature id in the form  {type}.{id} where  {type} is the lowest hierarchy feature in the  place_type field.
    * The  {id} suffix of the feature id is unstable and may change within versions.
    */
  var id: String
  /**
    * A string of the IETF language tag of the query's primary language.
    * Can be used to identity text and place_name properties on this object
    * in the format text_{language}, place_name_{language} and language_{language}
    */
  var language: String
  /**
    * A string analogous to the  place_name field that more closely matches the query than results in the specified language.
    * For example, querying "Köln, Germany" with language set to English might return a feature with the place_name "Cologne, Germany"
    * and a  matching_place_name of "Köln, North Rhine-Westphalia, Germany".
    */
  var matching_place_name: String
  /**
    * A string analogous to the  text field that more closely matches the query than results in the specified language.
    * For example, querying "Köln, Germany" with language set to English might return a feature with the
    * text "Cologne" and the  matching_text "Köln".
    */
  var matching_text: String
  /**
    * A string representing the feature in the requested language, if specified, and its full result hierarchy.
    */
  var place_name: String
  /**
    * An array of feature types describing the feature. Options are  country ,  region ,  postcode ,  district ,  place , locality ,  neighborhood ,
    * address ,  poi , and  poi.landmark . Most features have only one type, but if the feature has multiple types,
    * all applicable types will be listed in the array. (For example, Vatican City is a  country , region , and  place .)
    */
  var place_type: js.Array[String]
  /**
    * An object describing the feature. The property object is unstable and only Carmen GeoJSON properties are guaranteed.
    * Your implementation should check for the presence of these values in a response before it attempts to use them.
    */
  var properties: GeocodeProperties
  /**
    * A numerical score from 0 (least relevant) to 0.99 (most relevant) measuring how well each returned feature matches the query.
    * You can use the  relevance property to remove results that don't fully match the query.
    */
  var relevance: Double
  /**
    * A string representing the feature in the requested language, if specified.
    */
  var text: String
  /**
    * "Feature" , a GeoJSON type from the GeoJSON specification.
    */
  var `type`: String
}

object GeocodeFeature {
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
    text: String,
    `type`: String,
    address: String = null,
    bbox: js.Array[Double] = null
  ): GeocodeFeature = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeFeature]
  }
}


package typings.atMapboxMapboxDashSdk.servicesGeocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResponse extends js.Object {
  /**
    * A string attributing the results of the Mapbox Geocoding API to Mapbox and links to Mapbox's terms of service and data sources.
    */
  var attribution: String
  /**
    * An array of feature objects.
    */
  var features: js.Array[GeocodeFeature]
  /**
    * An array of space and punctuation-separated strings from the original query.
    */
  var query: js.Array[String]
  /**
    * "Feature Collection" , a GeoJSON type from the GeoJSON specification.
    */
  var `type`: String
}

object GeocodeResponse {
  @scala.inline
  def apply(attribution: String, features: js.Array[GeocodeFeature], query: js.Array[String], `type`: String): GeocodeResponse = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
}


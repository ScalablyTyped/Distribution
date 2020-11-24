package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodeResponse extends js.Object {
  
  /**
    * A string attributing the results of the Mapbox Geocoding API to Mapbox and links to Mapbox's terms of service and data sources.
    */
  var attribution: String = js.native
  
  /**
    * An array of feature objects.
    */
  var features: js.Array[GeocodeFeature] = js.native
  
  /**
    * An array of space and punctuation-separated strings from the original query.
    */
  var query: js.Array[String] = js.native
  
  /**
    * "Feature Collection" , a GeoJSON type from the GeoJSON specification.
    */
  var `type`: String = js.native
}
object GeocodeResponse {
  
  @scala.inline
  def apply(attribution: String, features: js.Array[GeocodeFeature], query: js.Array[String], `type`: String): GeocodeResponse = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
  
  @scala.inline
  implicit class GeocodeResponseOps[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: GeocodeFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[GeocodeFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVarargs(value: String*): Self = this.set("query", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: js.Array[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

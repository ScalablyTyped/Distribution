package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodeFeature extends js.Object {
  
  /**
    * A string of the house number for the returned  address feature. Note that unlike the
    * address property for  poi features, this property is outside the  properties object.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * An array bounding box in the form [ minX,minY,maxX,maxY ] .
    */
  var bbox: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * An array in the form [ longitude,latitude ] at the center of the specified  bbox .
    */
  var center: js.Array[Double] = js.native
  
  /**
    * An array representing the hierarchy of encompassing parent features. Each parent feature may include any of the above properties
    */
  var context: js.Array[GeocodeFeature] = js.native
  
  /**
    * An object describing the spatial geometry of the returned feature
    */
  var geometry: Geometry = js.native
  
  /**
    * A string feature id in the form  {type}.{id} where  {type} is the lowest hierarchy feature in the  place_type field.
    * The  {id} suffix of the feature id is unstable and may change within versions.
    */
  var id: String = js.native
  
  /**
    * A string of the IETF language tag of the query's primary language.
    * Can be used to identity text and place_name properties on this object
    * in the format text_{language}, place_name_{language} and language_{language}
    */
  var language: String = js.native
  
  /**
    * A string analogous to the  place_name field that more closely matches the query than results in the specified language.
    * For example, querying "Köln, Germany" with language set to English might return a feature with the place_name "Cologne, Germany"
    * and a  matching_place_name of "Köln, North Rhine-Westphalia, Germany".
    */
  var matching_place_name: String = js.native
  
  /**
    * A string analogous to the  text field that more closely matches the query than results in the specified language.
    * For example, querying "Köln, Germany" with language set to English might return a feature with the
    * text "Cologne" and the  matching_text "Köln".
    */
  var matching_text: String = js.native
  
  /**
    * A string representing the feature in the requested language, if specified, and its full result hierarchy.
    */
  var place_name: String = js.native
  
  /**
    * An array of feature types describing the feature. Options are  country ,  region ,  postcode ,  district ,  place , locality ,  neighborhood ,
    * address ,  poi , and  poi.landmark . Most features have only one type, but if the feature has multiple types,
    * all applicable types will be listed in the array. (For example, Vatican City is a  country , region , and  place .)
    */
  var place_type: js.Array[String] = js.native
  
  /**
    * An object describing the feature. The property object is unstable and only Carmen GeoJSON properties are guaranteed.
    * Your implementation should check for the presence of these values in a response before it attempts to use them.
    */
  var properties: GeocodeProperties = js.native
  
  /**
    * A numerical score from 0 (least relevant) to 0.99 (most relevant) measuring how well each returned feature matches the query.
    * You can use the  relevance property to remove results that don't fully match the query.
    */
  var relevance: Double = js.native
  
  /**
    * A string representing the feature in the requested language, if specified.
    */
  var text: String = js.native
  
  /**
    * "Feature" , a GeoJSON type from the GeoJSON specification.
    */
  var `type`: String = js.native
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
    `type`: String
  ): GeocodeFeature = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeFeature]
  }
  
  @scala.inline
  implicit class GeocodeFeatureOps[Self <: GeocodeFeature] (val x: Self) extends AnyVal {
    
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
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextVarargs(value: GeocodeFeature*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: js.Array[GeocodeFeature]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_place_name(value: String): Self = this.set("matching_place_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_text(value: String): Self = this.set("matching_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_name(value: String): Self = this.set("place_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_typeVarargs(value: String*): Self = this.set("place_type", js.Array(value :_*))
    
    @scala.inline
    def setPlace_type(value: js.Array[String]): Self = this.set("place_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: GeocodeProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBboxVarargs(value: Double*): Self = this.set("bbox", js.Array(value :_*))
    
    @scala.inline
    def setBbox(value: js.Array[Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
  }
}

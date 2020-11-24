package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodeProperties extends GeocodeFeature {
  
  /**
    * A string of comma-separated categories for the returned  poi feature.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * A boolean value indicating whether a  poi feature is a landmark. Landmarks are
    * particularly notable or long-lived features like schools, parks, museums and places of worship.
    */
  var landmark: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of a suggested Maki icon to visualize a  poi feature based on its  category .
    */
  var maki: js.UndefOr[String] = js.native
  
  /**
    * The ISO 3166-1 country and ISO 3166-2 region code for the returned feature.
    */
  var short_code: String = js.native
  
  /**
    * A formatted string of the telephone number for the returned  poi feature.
    */
  var tel: js.UndefOr[String] = js.native
  
  /**
    * The Wikidata identifier for the returned feature.
    */
  var wikidata: js.UndefOr[String] = js.native
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
    `type`: String
  ): GeocodeProperties = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeProperties]
  }
  
  @scala.inline
  implicit class GeocodePropertiesOps[Self <: GeocodeProperties] (val x: Self) extends AnyVal {
    
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
    def setShort_code(value: String): Self = this.set("short_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setLandmark(value: Boolean): Self = this.set("landmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmark: Self = this.set("landmark", js.undefined)
    
    @scala.inline
    def setMaki(value: String): Self = this.set("maki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaki: Self = this.set("maki", js.undefined)
    
    @scala.inline
    def setTel(value: String): Self = this.set("tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTel: Self = this.set("tel", js.undefined)
    
    @scala.inline
    def setWikidata(value: String): Self = this.set("wikidata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWikidata: Self = this.set("wikidata", js.undefined)
  }
}

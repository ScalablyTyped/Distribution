package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mapboxGlStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined geojson.geojson.Feature<geojson.geojson.Geometry, geojson.geojson.GeoJsonProperties> & {  layer :mapbox-gl.mapbox-gl.Layer,   source :string,   sourceLayer :string,   state :{[key: string] : any}} */
@js.native
trait MapboxGeoJSONFeature extends js.Object {
  
  /**
    * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
    * The value of the bbox member is an array of length 2*n where n is the number of dimensions
    * represented in the contained geometries, with all axes of the most southwesterly point
    * followed by all axes of the more northeasterly point.
    * The axes order of a bbox follows the axes order of geometries.
    * https://tools.ietf.org/html/rfc7946#section-5
    */
  var bbox: js.UndefOr[BBox] = js.native
  
  /**
    * The feature's geometry
    */
  var geometry: Geometry = js.native
  
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.native
  
  var layer: Layer = js.native
  
  /**
    * Properties associated with this feature.
    */
  var properties: GeoJsonProperties = js.native
  
  var source: String = js.native
  
  var sourceLayer: String = js.native
  
  var state: StringDictionary[js.Any] = js.native
  
  var `type`: Feature = js.native
}
object MapboxGeoJSONFeature {
  
  @scala.inline
  def apply(
    geometry: Geometry,
    layer: Layer,
    source: String,
    sourceLayer: String,
    state: StringDictionary[js.Any],
    `type`: Feature
  ): MapboxGeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLayer = sourceLayer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxGeoJSONFeature]
  }
  
  @scala.inline
  implicit class MapboxGeoJSONFeatureOps[Self <: MapboxGeoJSONFeature] (val x: Self) extends AnyVal {
    
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
    def setGeometry(value: Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLayer(value: String): Self = this.set("sourceLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: StringDictionary[js.Any]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Feature): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: BBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setProperties(value: GeoJsonProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesNull: Self = this.set("properties", null)
  }
}

package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsPolygonOutput extends js.Object {
  
  var polygon_geojson: js.UndefOr[Double] = js.native
  
  var polygon_kml: js.UndefOr[Double] = js.native
  
  var polygon_svg: js.UndefOr[Double] = js.native
  
  var polygon_text: js.UndefOr[Double] = js.native
  
  var polygon_threshold: js.UndefOr[String] = js.native
}
object OpenStreetMapProviderOptionsPolygonOutput {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsPolygonOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsPolygonOutput]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsPolygonOutputOps[Self <: OpenStreetMapProviderOptionsPolygonOutput] (val x: Self) extends AnyVal {
    
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
    def setPolygon_geojson(value: Double): Self = this.set("polygon_geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon_geojson: Self = this.set("polygon_geojson", js.undefined)
    
    @scala.inline
    def setPolygon_kml(value: Double): Self = this.set("polygon_kml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon_kml: Self = this.set("polygon_kml", js.undefined)
    
    @scala.inline
    def setPolygon_svg(value: Double): Self = this.set("polygon_svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon_svg: Self = this.set("polygon_svg", js.undefined)
    
    @scala.inline
    def setPolygon_text(value: Double): Self = this.set("polygon_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon_text: Self = this.set("polygon_text", js.undefined)
    
    @scala.inline
    def setPolygon_threshold(value: String): Self = this.set("polygon_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon_threshold: Self = this.set("polygon_threshold", js.undefined)
  }
}

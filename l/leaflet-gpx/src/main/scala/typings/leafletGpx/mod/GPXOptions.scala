package typings.leafletGpx.mod

import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import typings.leafletGpx.anon.ParseElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPXOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var gpx_options: js.UndefOr[ParseElements] = js.native
  
  var marker_options: js.UndefOr[MarkerOptions] = js.native
  
  var max_point_interval: js.UndefOr[Double] = js.native
  
  var polyline_options: js.UndefOr[PolylineOptions] = js.native
}
object GPXOptions {
  
  @scala.inline
  def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  @scala.inline
  implicit class GPXOptionsOps[Self <: GPXOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setGpx_options(value: ParseElements): Self = this.set("gpx_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpx_options: Self = this.set("gpx_options", js.undefined)
    
    @scala.inline
    def setMarker_options(value: MarkerOptions): Self = this.set("marker_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker_options: Self = this.set("marker_options", js.undefined)
    
    @scala.inline
    def setMax_point_interval(value: Double): Self = this.set("max_point_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_point_interval: Self = this.set("max_point_interval", js.undefined)
    
    @scala.inline
    def setPolyline_options(value: PolylineOptions): Self = this.set("polyline_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyline_options: Self = this.set("polyline_options", js.undefined)
  }
}

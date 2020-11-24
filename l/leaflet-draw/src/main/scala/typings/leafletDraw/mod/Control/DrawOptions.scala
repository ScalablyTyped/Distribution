package typings.leafletDraw.mod.Control

import typings.leafletDraw.leafletDrawBooleans.`false`
import typings.leafletDraw.mod.DrawOptions.CircleMarkerOptions
import typings.leafletDraw.mod.DrawOptions.CircleOptions
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import typings.leafletDraw.mod.DrawOptions.PolygonOptions
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawOptions extends js.Object {
  
  /**
    * Circle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circle: js.UndefOr[CircleOptions | `false`] = js.native
  
  /**
    * Circle marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circlemarker: js.UndefOr[CircleMarkerOptions | `false`] = js.native
  
  /**
    * Marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var marker: js.UndefOr[MarkerOptions | `false`] = js.native
  
  /**
    * Polygon draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polygon: js.UndefOr[PolygonOptions | `false`] = js.native
  
  /**
    * Polyline draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polyline: js.UndefOr[PolylineOptions | `false`] = js.native
  
  /**
    * Rectangle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var rectangle: js.UndefOr[RectangleOptions | `false`] = js.native
}
object DrawOptions {
  
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
    
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
    def setCircle(value: CircleOptions | `false`): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setCirclemarker(value: CircleMarkerOptions | `false`): Self = this.set("circlemarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCirclemarker: Self = this.set("circlemarker", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerOptions | `false`): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setPolygon(value: PolygonOptions | `false`): Self = this.set("polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
    
    @scala.inline
    def setPolyline(value: PolylineOptions | `false`): Self = this.set("polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    
    @scala.inline
    def setRectangle(value: RectangleOptions | `false`): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
}

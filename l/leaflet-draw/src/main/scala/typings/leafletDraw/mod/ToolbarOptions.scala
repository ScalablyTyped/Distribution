package typings.leafletDraw.mod

import typings.leafletDraw.mod.DrawOptions.CircleOptions
import typings.leafletDraw.mod.DrawOptions.MarkerOptions
import typings.leafletDraw.mod.DrawOptions.PolygonOptions
import typings.leafletDraw.mod.DrawOptions.PolylineOptions
import typings.leafletDraw.mod.DrawOptions.RectangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarOptions extends StObject {
  
  var circle: js.UndefOr[CircleOptions] = js.native
  
  var circlemarker: js.UndefOr[CircleOptions] = js.native
  
  var marker: js.UndefOr[MarkerOptions] = js.native
  
  var polygon: js.UndefOr[PolygonOptions] = js.native
  
  var polyline: js.UndefOr[PolylineOptions] = js.native
  
  var rectangle: js.UndefOr[RectangleOptions] = js.native
}
object ToolbarOptions {
  
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  
  @scala.inline
  implicit class ToolbarOptionsMutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: CircleOptions): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setCirclemarker(value: CircleOptions): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCirclemarkerUndefined: Self = StObject.set(x, "circlemarker", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPolygon(value: PolygonOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    @scala.inline
    def setPolyline(value: PolylineOptions): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    @scala.inline
    def setRectangle(value: RectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}

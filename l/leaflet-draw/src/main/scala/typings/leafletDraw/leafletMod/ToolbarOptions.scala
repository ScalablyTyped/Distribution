package typings.leafletDraw.leafletMod

import typings.leafletDraw.leafletMod.DrawOptions.CircleOptions
import typings.leafletDraw.leafletMod.DrawOptions.MarkerOptions
import typings.leafletDraw.leafletMod.DrawOptions.PolygonOptions
import typings.leafletDraw.leafletMod.DrawOptions.PolylineOptions
import typings.leafletDraw.leafletMod.DrawOptions.RectangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarOptions extends StObject {
  
  var circle: js.UndefOr[CircleOptions] = js.undefined
  
  var circlemarker: js.UndefOr[CircleOptions] = js.undefined
  
  var marker: js.UndefOr[MarkerOptions] = js.undefined
  
  var polygon: js.UndefOr[PolygonOptions] = js.undefined
  
  var polyline: js.UndefOr[PolylineOptions] = js.undefined
  
  var rectangle: js.UndefOr[RectangleOptions] = js.undefined
}
object ToolbarOptions {
  
  inline def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: CircleOptions): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setCirclemarker(value: CircleOptions): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
    
    inline def setCirclemarkerUndefined: Self = StObject.set(x, "circlemarker", js.undefined)
    
    inline def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPolygon(value: PolygonOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    inline def setPolyline(value: PolylineOptions): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setRectangle(value: RectangleOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}

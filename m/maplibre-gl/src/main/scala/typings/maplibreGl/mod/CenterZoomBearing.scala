package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterZoomBearing extends StObject {
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[LngLatLike] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object CenterZoomBearing {
  
  inline def apply(): CenterZoomBearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CenterZoomBearing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CenterZoomBearing] (val x: Self) extends AnyVal {
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}

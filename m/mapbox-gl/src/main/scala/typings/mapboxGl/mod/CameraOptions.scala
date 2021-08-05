package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraOptions extends StObject {
  
  /** If zooming, the zoom center (defaults to map center) */
  var around: js.UndefOr[LngLatLike] = js.undefined
  
  /** Map rotation bearing in degrees counter-clockwise from north */
  var bearing: js.UndefOr[Double] = js.undefined
  
  /** Map center */
  var center: js.UndefOr[LngLatLike] = js.undefined
  
  /** Map angle in degrees at which the camera is looking at the ground */
  var pitch: js.UndefOr[Double] = js.undefined
  
  /** Map zoom level */
  var zoom: js.UndefOr[Double] = js.undefined
}
object CameraOptions {
  
  inline def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  extension [Self <: CameraOptions](x: Self) {
    
    inline def setAround(value: LngLatLike): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}

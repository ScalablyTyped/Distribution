package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerResult extends StObject {
  
  var around: js.UndefOr[^ | Null] = js.undefined
  
  var bearingDelta: js.UndefOr[Double] = js.undefined
  
  var cameraAnimation: js.UndefOr[js.Function1[/* map */ Map, Any]] = js.undefined
  
  var needsRenderFrame: js.UndefOr[Boolean] = js.undefined
  
  var noInertia: js.UndefOr[Boolean] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var panDelta: js.UndefOr[^] = js.undefined
  
  var pinchAround: js.UndefOr[^ | Null] = js.undefined
  
  var pitchDelta: js.UndefOr[Double] = js.undefined
  
  var zoomDelta: js.UndefOr[Double] = js.undefined
}
object HandlerResult {
  
  inline def apply(): HandlerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerResult]
  }
  
  extension [Self <: HandlerResult](x: Self) {
    
    inline def setAround(value: ^): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundNull: Self = StObject.set(x, "around", null)
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    inline def setBearingDelta(value: Double): Self = StObject.set(x, "bearingDelta", value.asInstanceOf[js.Any])
    
    inline def setBearingDeltaUndefined: Self = StObject.set(x, "bearingDelta", js.undefined)
    
    inline def setCameraAnimation(value: /* map */ Map => Any): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1(value))
    
    inline def setCameraAnimationUndefined: Self = StObject.set(x, "cameraAnimation", js.undefined)
    
    inline def setNeedsRenderFrame(value: Boolean): Self = StObject.set(x, "needsRenderFrame", value.asInstanceOf[js.Any])
    
    inline def setNeedsRenderFrameUndefined: Self = StObject.set(x, "needsRenderFrame", js.undefined)
    
    inline def setNoInertia(value: Boolean): Self = StObject.set(x, "noInertia", value.asInstanceOf[js.Any])
    
    inline def setNoInertiaUndefined: Self = StObject.set(x, "noInertia", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setPanDelta(value: ^): Self = StObject.set(x, "panDelta", value.asInstanceOf[js.Any])
    
    inline def setPanDeltaUndefined: Self = StObject.set(x, "panDelta", js.undefined)
    
    inline def setPinchAround(value: ^): Self = StObject.set(x, "pinchAround", value.asInstanceOf[js.Any])
    
    inline def setPinchAroundNull: Self = StObject.set(x, "pinchAround", null)
    
    inline def setPinchAroundUndefined: Self = StObject.set(x, "pinchAround", js.undefined)
    
    inline def setPitchDelta(value: Double): Self = StObject.set(x, "pitchDelta", value.asInstanceOf[js.Any])
    
    inline def setPitchDeltaUndefined: Self = StObject.set(x, "pitchDelta", js.undefined)
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    inline def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
  }
}

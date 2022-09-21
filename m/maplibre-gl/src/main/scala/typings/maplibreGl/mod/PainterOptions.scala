package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PainterOptions extends StObject {
  
  var fadeDuration: Double
  
  var gpuTiming: Boolean
  
  var moving: Boolean
  
  var rotating: Boolean
  
  var showOverdrawInspector: Boolean
  
  var showPadding: Boolean
  
  var showTileBoundaries: Boolean
  
  var zooming: Boolean
}
object PainterOptions {
  
  inline def apply(
    fadeDuration: Double,
    gpuTiming: Boolean,
    moving: Boolean,
    rotating: Boolean,
    showOverdrawInspector: Boolean,
    showPadding: Boolean,
    showTileBoundaries: Boolean,
    zooming: Boolean
  ): PainterOptions = {
    val __obj = js.Dynamic.literal(fadeDuration = fadeDuration.asInstanceOf[js.Any], gpuTiming = gpuTiming.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], rotating = rotating.asInstanceOf[js.Any], showOverdrawInspector = showOverdrawInspector.asInstanceOf[js.Any], showPadding = showPadding.asInstanceOf[js.Any], showTileBoundaries = showTileBoundaries.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[PainterOptions]
  }
  
  extension [Self <: PainterOptions](x: Self) {
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    inline def setGpuTiming(value: Boolean): Self = StObject.set(x, "gpuTiming", value.asInstanceOf[js.Any])
    
    inline def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
    
    inline def setRotating(value: Boolean): Self = StObject.set(x, "rotating", value.asInstanceOf[js.Any])
    
    inline def setShowOverdrawInspector(value: Boolean): Self = StObject.set(x, "showOverdrawInspector", value.asInstanceOf[js.Any])
    
    inline def setShowPadding(value: Boolean): Self = StObject.set(x, "showPadding", value.asInstanceOf[js.Any])
    
    inline def setShowTileBoundaries(value: Boolean): Self = StObject.set(x, "showTileBoundaries", value.asInstanceOf[js.Any])
    
    inline def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
  }
}

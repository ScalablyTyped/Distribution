package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.`mapbox-gl-draw-cold`
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.`mapbox-gl-draw-hot`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COLD extends StObject {
  
  var COLD: `mapbox-gl-draw-cold`
  
  var HOT: `mapbox-gl-draw-hot`
}
object COLD {
  
  inline def apply(): COLD = {
    val __obj = js.Dynamic.literal(COLD = "mapbox-gl-draw-cold", HOT = "mapbox-gl-draw-hot")
    __obj.asInstanceOf[COLD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: COLD] (val x: Self) extends AnyVal {
    
    inline def setCOLD(value: `mapbox-gl-draw-cold`): Self = StObject.set(x, "COLD", value.asInstanceOf[js.Any])
    
    inline def setHOT(value: `mapbox-gl-draw-hot`): Self = StObject.set(x, "HOT", value.asInstanceOf[js.Any])
  }
}

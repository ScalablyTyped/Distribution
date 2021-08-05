package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[BackgroundLayout] = js.undefined
  
  var paint: js.UndefOr[BackgroundPaint] = js.undefined
  
  var `type`: background
}
object BackgroundLayer {
  
  inline def apply(id: String): BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[BackgroundLayer]
  }
  
  extension [Self <: BackgroundLayer](x: Self) {
    
    inline def setLayout(value: BackgroundLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: BackgroundPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: background): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`fill-extrusion`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillExtrusionLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[FillExtrusionLayout] = js.undefined
  
  var paint: js.UndefOr[FillExtrusionPaint] = js.undefined
  
  var `type`: `fill-extrusion`
}
object FillExtrusionLayer {
  
  inline def apply(id: String): FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[FillExtrusionLayer]
  }
  
  extension [Self <: FillExtrusionLayer](x: Self) {
    
    inline def setLayout(value: FillExtrusionLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: FillExtrusionPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: `fill-extrusion`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

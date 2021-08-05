package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[CircleLayout] = js.undefined
  
  var paint: js.UndefOr[CirclePaint] = js.undefined
  
  var `type`: circle
}
object CircleLayer {
  
  inline def apply(id: String): CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[CircleLayer]
  }
  
  extension [Self <: CircleLayer](x: Self) {
    
    inline def setLayout(value: CircleLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: CirclePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

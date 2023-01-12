package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_CircleLayer: js.UndefOr[CircleLayout] = js.undefined
  
  @JSName("paint")
  var paint_CircleLayer: js.UndefOr[CirclePaint] = js.undefined
  
  @JSName("type")
  var type_CircleLayer: circle
}
object CircleLayer {
  
  inline def apply(id: String): CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[CircleLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: CircleLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: CirclePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

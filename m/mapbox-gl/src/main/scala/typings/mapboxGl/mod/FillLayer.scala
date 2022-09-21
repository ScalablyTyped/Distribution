package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_FillLayer: js.UndefOr[FillLayout] = js.undefined
  
  @JSName("paint")
  var paint_FillLayer: js.UndefOr[FillPaint] = js.undefined
  
  @JSName("type")
  var type_FillLayer: fill
}
object FillLayer {
  
  inline def apply(id: String): FillLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[FillLayer]
  }
  
  extension [Self <: FillLayer](x: Self) {
    
    inline def setLayout(value: FillLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: FillPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

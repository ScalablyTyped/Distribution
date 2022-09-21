package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.sky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkyLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_SkyLayer: js.UndefOr[SkyLayout] = js.undefined
  
  @JSName("paint")
  var paint_SkyLayer: js.UndefOr[SkyPaint] = js.undefined
  
  @JSName("type")
  var type_SkyLayer: sky
}
object SkyLayer {
  
  inline def apply(id: String): SkyLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sky")
    __obj.asInstanceOf[SkyLayer]
  }
  
  extension [Self <: SkyLayer](x: Self) {
    
    inline def setLayout(value: SkyLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: SkyPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: sky): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

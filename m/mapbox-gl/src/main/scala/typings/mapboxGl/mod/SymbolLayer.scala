package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_SymbolLayer: js.UndefOr[SymbolLayout] = js.undefined
  
  @JSName("paint")
  var paint_SymbolLayer: js.UndefOr[SymbolPaint] = js.undefined
  
  @JSName("type")
  var type_SymbolLayer: symbol
}
object SymbolLayer {
  
  inline def apply(id: String): SymbolLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[SymbolLayer]
  }
  
  extension [Self <: SymbolLayer](x: Self) {
    
    inline def setLayout(value: SymbolLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: SymbolPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

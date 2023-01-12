package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_LineLayer: js.UndefOr[LineLayout] = js.undefined
  
  @JSName("paint")
  var paint_LineLayer: js.UndefOr[LinePaint] = js.undefined
  
  @JSName("type")
  var type_LineLayer: line
}
object LineLayer {
  
  inline def apply(id: String): LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[LineLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: LineLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: LinePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

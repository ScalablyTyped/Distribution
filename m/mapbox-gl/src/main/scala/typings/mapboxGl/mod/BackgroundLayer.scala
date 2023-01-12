package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundLayer
  extends StObject
     with Layer
     with AnyLayer {
  
  @JSName("layout")
  var layout_BackgroundLayer: js.UndefOr[BackgroundLayout] = js.undefined
  
  @JSName("paint")
  var paint_BackgroundLayer: js.UndefOr[BackgroundPaint] = js.undefined
  
  @JSName("type")
  var type_BackgroundLayer: background
}
object BackgroundLayer {
  
  inline def apply(id: String): BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[BackgroundLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundLayer] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: BackgroundLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: BackgroundPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: background): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

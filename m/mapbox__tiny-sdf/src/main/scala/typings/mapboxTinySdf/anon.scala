package typings.mapboxTinySdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.typedarray.Uint8ClampedArray
    
    var glyphAdvance: Double
    
    var glyphHeight: Double
    
    var glyphLeft: Double
    
    var glyphTop: Double
    
    var glyphWidth: Double
    
    var height: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(
      data: js.typedarray.Uint8ClampedArray,
      glyphAdvance: Double,
      glyphHeight: Double,
      glyphLeft: Double,
      glyphTop: Double,
      glyphWidth: Double,
      height: Double,
      width: Double
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], glyphAdvance = glyphAdvance.asInstanceOf[js.Any], glyphHeight = glyphHeight.asInstanceOf[js.Any], glyphLeft = glyphLeft.asInstanceOf[js.Any], glyphTop = glyphTop.asInstanceOf[js.Any], glyphWidth = glyphWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGlyphAdvance(value: Double): Self = StObject.set(x, "glyphAdvance", value.asInstanceOf[js.Any])
      
      inline def setGlyphHeight(value: Double): Self = StObject.set(x, "glyphHeight", value.asInstanceOf[js.Any])
      
      inline def setGlyphLeft(value: Double): Self = StObject.set(x, "glyphLeft", value.asInstanceOf[js.Any])
      
      inline def setGlyphTop(value: Double): Self = StObject.set(x, "glyphTop", value.asInstanceOf[js.Any])
      
      inline def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

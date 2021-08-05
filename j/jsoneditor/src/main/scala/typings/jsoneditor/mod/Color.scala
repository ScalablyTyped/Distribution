package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var hex: String
  
  var hslString: String
  
  var hsla: js.Array[Double]
  
  var hslaString: String
  
  var rgbString: String
  
  var rgba: js.Array[Double]
  
  var rgbaString: String
}
object Color {
  
  inline def apply(
    hex: String,
    hslString: String,
    hsla: js.Array[Double],
    hslaString: String,
    rgbString: String,
    rgba: js.Array[Double],
    rgbaString: String
  ): Color = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hslString = hslString.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hslaString = hslaString.asInstanceOf[js.Any], rgbString = rgbString.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], rgbaString = rgbaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHslString(value: String): Self = StObject.set(x, "hslString", value.asInstanceOf[js.Any])
    
    inline def setHsla(value: js.Array[Double]): Self = StObject.set(x, "hsla", value.asInstanceOf[js.Any])
    
    inline def setHslaString(value: String): Self = StObject.set(x, "hslaString", value.asInstanceOf[js.Any])
    
    inline def setHslaVarargs(value: Double*): Self = StObject.set(x, "hsla", js.Array(value :_*))
    
    inline def setRgbString(value: String): Self = StObject.set(x, "rgbString", value.asInstanceOf[js.Any])
    
    inline def setRgba(value: js.Array[Double]): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    inline def setRgbaString(value: String): Self = StObject.set(x, "rgbaString", value.asInstanceOf[js.Any])
    
    inline def setRgbaVarargs(value: Double*): Self = StObject.set(x, "rgba", js.Array(value :_*))
  }
}

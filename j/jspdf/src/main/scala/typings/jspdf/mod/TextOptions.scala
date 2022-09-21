package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptions
  extends StObject
     with TextOptionsLight {
  
  var text: String | js.Array[String]
  
  var x: Double
  
  var y: Double
}
object TextOptions {
  
  inline def apply(text: String | js.Array[String], x: Double, y: Double): TextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
  
  extension [Self <: TextOptions](x: Self) {
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

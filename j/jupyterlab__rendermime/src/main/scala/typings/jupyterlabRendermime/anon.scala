package typings.jupyterlabRendermime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Math extends StObject {
    
    var math: js.Array[String]
    
    var text: String
  }
  object Math {
    
    inline def apply(math: js.Array[String], text: String): Math = {
      val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Math]
    }
    
    extension [Self <: Math](x: Self) {
      
      inline def setMath(value: js.Array[String]): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
      
      inline def setMathVarargs(value: String*): Self = StObject.set(x, "math", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}

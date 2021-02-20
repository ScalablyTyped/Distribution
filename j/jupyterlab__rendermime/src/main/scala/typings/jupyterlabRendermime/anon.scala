package typings.jupyterlabRendermime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Math extends StObject {
    
    var math: js.Array[String] = js.native
    
    var text: String = js.native
  }
  object Math {
    
    @scala.inline
    def apply(math: js.Array[String], text: String): Math = {
      val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Math]
    }
    
    @scala.inline
    implicit class MathMutableBuilder[Self <: Math] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMath(value: js.Array[String]): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathVarargs(value: String*): Self = StObject.set(x, "math", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}

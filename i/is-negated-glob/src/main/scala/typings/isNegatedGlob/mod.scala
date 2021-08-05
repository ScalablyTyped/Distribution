package typings.isNegatedGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String): Result = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("is-negated-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result extends StObject {
    
    var negated: Boolean
    
    var original: String
    
    var pattern: String
  }
  object Result {
    
    inline def apply(negated: Boolean, original: String, pattern: String): Result = {
      val __obj = js.Dynamic.literal(negated = negated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}

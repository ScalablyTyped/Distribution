package typings.koaBetterBody

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Custom extends StObject {
    
    var custom: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Custom {
    
    inline def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: String | js.Array[String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: String*): Self = StObject.set(x, "custom", js.Array(value*))
    }
  }
}

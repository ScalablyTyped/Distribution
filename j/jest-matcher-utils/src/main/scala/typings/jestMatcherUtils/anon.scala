package typings.jestMatcherUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ReplacedExpected extends StObject {
    
    var replacedExpected: Any
    
    var replacedReceived: Any
  }
  object ReplacedExpected {
    
    inline def apply(replacedExpected: Any, replacedReceived: Any): ReplacedExpected = {
      val __obj = js.Dynamic.literal(replacedExpected = replacedExpected.asInstanceOf[js.Any], replacedReceived = replacedReceived.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacedExpected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplacedExpected] (val x: Self) extends AnyVal {
      
      inline def setReplacedExpected(value: Any): Self = StObject.set(x, "replacedExpected", value.asInstanceOf[js.Any])
      
      inline def setReplacedReceived(value: Any): Self = StObject.set(x, "replacedReceived", value.asInstanceOf[js.Any])
    }
  }
}

package typings.gulpStylint

import typings.gulpStylint.gulpStylintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FailOnWarning extends StObject {
    
    var failOnWarning: `true`
  }
  object FailOnWarning {
    
    inline def apply(): FailOnWarning = {
      val __obj = js.Dynamic.literal(failOnWarning = true)
      __obj.asInstanceOf[FailOnWarning]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailOnWarning] (val x: Self) extends AnyVal {
      
      inline def setFailOnWarning(value: `true`): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
    }
  }
}

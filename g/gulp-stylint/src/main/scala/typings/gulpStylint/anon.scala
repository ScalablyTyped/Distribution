package typings.gulpStylint

import typings.gulpStylint.gulpStylintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FailOnWarning extends StObject {
    
    var failOnWarning: `true` = js.native
  }
  object FailOnWarning {
    
    @scala.inline
    def apply(failOnWarning: `true`): FailOnWarning = {
      val __obj = js.Dynamic.literal(failOnWarning = failOnWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailOnWarning]
    }
    
    @scala.inline
    implicit class FailOnWarningMutableBuilder[Self <: FailOnWarning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailOnWarning(value: `true`): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
    }
  }
}

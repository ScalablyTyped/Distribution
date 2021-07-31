package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaConfigMod {
  
  trait LambdaConfig extends StObject {
    
    var allowNullInjection: Boolean
  }
  object LambdaConfig {
    
    @scala.inline
    def apply(allowNullInjection: Boolean): LambdaConfig = {
      val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaConfig]
    }
    
    @scala.inline
    implicit class LambdaConfigMutableBuilder[Self <: LambdaConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNullInjection(value: Boolean): Self = StObject.set(x, "allowNullInjection", value.asInstanceOf[js.Any])
    }
  }
}

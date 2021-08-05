package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaConfigMod {
  
  trait LambdaConfig extends StObject {
    
    var allowNullInjection: Boolean
  }
  object LambdaConfig {
    
    inline def apply(allowNullInjection: Boolean): LambdaConfig = {
      val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaConfig]
    }
    
    extension [Self <: LambdaConfig](x: Self) {
      
      inline def setAllowNullInjection(value: Boolean): Self = StObject.set(x, "allowNullInjection", value.asInstanceOf[js.Any])
    }
  }
}

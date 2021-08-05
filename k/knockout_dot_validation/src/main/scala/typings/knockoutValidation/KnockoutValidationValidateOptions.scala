package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationValidateOptions extends StObject {
  
  var throttle: js.UndefOr[Double] = js.undefined
}
object KnockoutValidationValidateOptions {
  
  inline def apply(): KnockoutValidationValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationValidateOptions]
  }
  
  extension [Self <: KnockoutValidationValidateOptions](x: Self) {
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}

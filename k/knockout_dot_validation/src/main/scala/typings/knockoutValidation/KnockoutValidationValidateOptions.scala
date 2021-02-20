package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationValidateOptions extends StObject {
  
  var throttle: js.UndefOr[Double] = js.native
}
object KnockoutValidationValidateOptions {
  
  @scala.inline
  def apply(): KnockoutValidationValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationValidateOptions]
  }
  
  @scala.inline
  implicit class KnockoutValidationValidateOptionsMutableBuilder[Self <: KnockoutValidationValidateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}

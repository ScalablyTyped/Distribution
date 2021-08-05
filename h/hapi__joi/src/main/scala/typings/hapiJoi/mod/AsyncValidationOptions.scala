package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncValidationOptions
  extends StObject
     with ValidationOptions {
  
  /**
    * when true, warnings are returned alongside the value (i.e. `{ value, warning }`).
    *
    * @default false
    */
  var warnings: js.UndefOr[Boolean] = js.undefined
}
object AsyncValidationOptions {
  
  inline def apply(): AsyncValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncValidationOptions]
  }
  
  extension [Self <: AsyncValidationOptions](x: Self) {
    
    inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}

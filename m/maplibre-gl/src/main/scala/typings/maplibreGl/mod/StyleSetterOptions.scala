package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSetterOptions extends StObject {
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object StyleSetterOptions {
  
  inline def apply(): StyleSetterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSetterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSetterOptions] (val x: Self) extends AnyVal {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}

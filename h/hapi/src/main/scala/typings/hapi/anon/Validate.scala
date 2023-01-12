package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validate extends StObject {
  
  var validate: js.Object
}
object Validate {
  
  inline def apply(validate: js.Object): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validate] (val x: Self) extends AnyVal {
    
    inline def setValidate(value: js.Object): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}

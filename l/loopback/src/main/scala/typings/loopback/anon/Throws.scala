package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Throws extends StObject {
  
  var throws: Boolean
  
  var validate: Boolean
}
object Throws {
  
  inline def apply(throws: Boolean, validate: Boolean): Throws = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throws]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Throws] (val x: Self) extends AnyVal {
    
    inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}

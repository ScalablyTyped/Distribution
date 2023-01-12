package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedExpectation extends StObject {
  
  var message: String
}
object DeprecatedExpectation {
  
  inline def apply(message: String): DeprecatedExpectation = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedExpectation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedExpectation] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMatcherResult extends StObject {
  
  def message(): String
  
  var pass: Boolean
}
object CustomMatcherResult {
  
  inline def apply(message: () => String, pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcherResult]
  }
  
  extension [Self <: CustomMatcherResult](x: Self) {
    
    inline def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}

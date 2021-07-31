package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMatcherResult extends StObject {
  
  def message(): String
  
  var pass: Boolean
}
object CustomMatcherResult {
  
  @scala.inline
  def apply(message: () => String, pass: Boolean): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcherResult]
  }
  
  @scala.inline
  implicit class CustomMatcherResultMutableBuilder[Self <: CustomMatcherResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}

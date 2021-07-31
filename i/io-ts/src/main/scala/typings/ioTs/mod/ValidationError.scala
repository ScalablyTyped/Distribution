package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  /** where the error originated */
  val context: Context
  
  /** optional custom error message */
  val message: js.UndefOr[String] = js.undefined
  
  /** the offending (sub)value */
  val value: js.Any
}
object ValidationError {
  
  @scala.inline
  def apply(context: Context, value: js.Any): ValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextVarargs(value: ContextEntry*): Self = StObject.set(x, "context", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

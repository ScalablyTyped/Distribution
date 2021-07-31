package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackFrame extends StObject {
  
  /** Set of arguments passed to this function. Note that this might not be populated for all stack frames. */
  var arguments: js.UndefOr[js.Array[Variable]] = js.undefined
  
  /** Demangled function name at the call site. */
  var function: js.UndefOr[String] = js.undefined
  
  /** Set of local variables at the stack frame location. Note that this might not be populated for all stack frames. */
  var locals: js.UndefOr[js.Array[Variable]] = js.undefined
  
  /** Source location of the call site. */
  var location: js.UndefOr[SourceLocation] = js.undefined
}
object StackFrame {
  
  @scala.inline
  def apply(): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Variable]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: Variable*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setLocals(value: js.Array[Variable]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setLocalsVarargs(value: Variable*): Self = StObject.set(x, "locals", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: SourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}

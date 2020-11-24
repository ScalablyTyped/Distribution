package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrame extends js.Object {
  
  /** Set of arguments passed to this function. Note that this might not be populated for all stack frames. */
  var arguments: js.UndefOr[js.Array[Variable]] = js.native
  
  /** Demangled function name at the call site. */
  var function: js.UndefOr[String] = js.native
  
  /** Set of local variables at the stack frame location. Note that this might not be populated for all stack frames. */
  var locals: js.UndefOr[js.Array[Variable]] = js.native
  
  /** Source location of the call site. */
  var location: js.UndefOr[SourceLocation] = js.native
}
object StackFrame {
  
  @scala.inline
  def apply(): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentsVarargs(value: Variable*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Variable]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setLocalsVarargs(value: Variable*): Self = this.set("locals", js.Array(value :_*))
    
    @scala.inline
    def setLocals(value: js.Array[Variable]): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setLocation(value: SourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}

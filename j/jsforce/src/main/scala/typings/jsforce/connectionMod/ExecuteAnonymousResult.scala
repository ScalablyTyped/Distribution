package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteAnonymousResult extends js.Object {
  
  var column: Double = js.native
  
  var compileProblem: String = js.native
  
  var compiled: Boolean = js.native
  
  var exceptionMessage: String = js.native
  
  var exceptionStackTrace: String = js.native
  
  var line: Double = js.native
  
  var success: Boolean = js.native
}
object ExecuteAnonymousResult {
  
  @scala.inline
  def apply(
    column: Double,
    compileProblem: String,
    compiled: Boolean,
    exceptionMessage: String,
    exceptionStackTrace: String,
    line: Double,
    success: Boolean
  ): ExecuteAnonymousResult = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compileProblem = compileProblem.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], exceptionMessage = exceptionMessage.asInstanceOf[js.Any], exceptionStackTrace = exceptionStackTrace.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteAnonymousResult]
  }
  
  @scala.inline
  implicit class ExecuteAnonymousResultOps[Self <: ExecuteAnonymousResult] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompileProblem(value: String): Self = this.set("compileProblem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionMessage(value: String): Self = this.set("exceptionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionStackTrace(value: String): Self = this.set("exceptionStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}

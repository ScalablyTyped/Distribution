package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcedureInvocationResult extends js.Object {
  
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  var isSuccessful: Boolean = js.native
}
object ProcedureInvocationResult {
  
  @scala.inline
  def apply(isSuccessful: Boolean): ProcedureInvocationResult = {
    val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationResult]
  }
  
  @scala.inline
  implicit class ProcedureInvocationResultOps[Self <: ProcedureInvocationResult] (val x: Self) extends AnyVal {
    
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
    def setIsSuccessful(value: Boolean): Self = this.set("isSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}

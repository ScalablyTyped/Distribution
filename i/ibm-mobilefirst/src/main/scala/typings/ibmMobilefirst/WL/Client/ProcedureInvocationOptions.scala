package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcedureInvocationOptions extends Options {
  
  @JSName("onSuccess")
  def onSuccess_MProcedureInvocationOptions(response: ProcedureResponse): Unit = js.native
  
  var timeout: Double = js.native
}
object ProcedureInvocationOptions {
  
  @scala.inline
  def apply(onSuccess: ProcedureResponse => Unit, timeout: Double): ProcedureInvocationOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationOptions]
  }
  
  @scala.inline
  implicit class ProcedureInvocationOptionsOps[Self <: ProcedureInvocationOptions] (val x: Self) extends AnyVal {
    
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
    def setOnSuccess(value: ProcedureResponse => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}

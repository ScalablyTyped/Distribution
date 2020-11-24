package typings.jestAxe.mod

import typings.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionsResult extends js.Object {
  
  /**
    * Actual checked aXe verification results.
    */
  var actual: js.Array[Result] = js.native
  
  /**
    * @returns Message from the Jest assertion.
    */
  def message(): String = js.native
  
  /**
    * Whether the assertion passed.
    */
  var pass: Boolean = js.native
}
object AssertionsResult {
  
  @scala.inline
  def apply(actual: js.Array[Result], message: () => String, pass: Boolean): AssertionsResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionsResult]
  }
  
  @scala.inline
  implicit class AssertionsResultOps[Self <: AssertionsResult] (val x: Self) extends AnyVal {
    
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
    def setActualVarargs(value: Result*): Self = this.set("actual", js.Array(value :_*))
    
    @scala.inline
    def setActual(value: js.Array[Result]): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: () => String): Self = this.set("message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
  }
}

package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignMethod extends js.Object {
  
  var assign: String = js.native
  
  def method(request: js.Any, _h: js.Any): js.Promise[Config] = js.native
}
object AssignMethod {
  
  @scala.inline
  def apply(assign: String, method: (js.Any, js.Any) => js.Promise[Config]): AssignMethod = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[AssignMethod]
  }
  
  @scala.inline
  implicit class AssignMethodOps[Self <: AssignMethod] (val x: Self) extends AnyVal {
    
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
    def setAssign(value: String): Self = this.set("assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: (js.Any, js.Any) => js.Promise[Config]): Self = this.set("method", js.Any.fromFunction2(value))
  }
}

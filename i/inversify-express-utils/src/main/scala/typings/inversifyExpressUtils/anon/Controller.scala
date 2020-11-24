package typings.inversifyExpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controller extends js.Object {
  
  var controller: js.Any = js.native
  
  var endpoints: js.Array[Args] = js.native
}
object Controller {
  
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[Args]): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
    
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
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: Args*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[Args]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
  }
}

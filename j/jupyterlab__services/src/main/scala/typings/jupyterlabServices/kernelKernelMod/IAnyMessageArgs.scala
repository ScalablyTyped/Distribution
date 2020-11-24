package typings.jupyterlabServices.kernelKernelMod

import typings.jupyterlabServices.anon.ReadonlyIMessageMessageTy
import typings.jupyterlabServices.jupyterlabServicesStrings.recv
import typings.jupyterlabServices.jupyterlabServicesStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnyMessageArgs extends js.Object {
  
  /**
    * The direction of the message.
    */
  var direction: send | recv = js.native
  
  /**
    * The message that is being signaled.
    */
  var msg: ReadonlyIMessageMessageTy = js.native
}
object IAnyMessageArgs {
  
  @scala.inline
  def apply(direction: send | recv, msg: ReadonlyIMessageMessageTy): IAnyMessageArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnyMessageArgs]
  }
  
  @scala.inline
  implicit class IAnyMessageArgsOps[Self <: IAnyMessageArgs] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: send | recv): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: ReadonlyIMessageMessageTy): Self = this.set("msg", value.asInstanceOf[js.Any])
  }
}

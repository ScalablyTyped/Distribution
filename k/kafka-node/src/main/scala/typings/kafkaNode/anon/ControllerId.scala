package typings.kafkaNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerId extends js.Object {
  
  var controllerId: Double = js.native
}
object ControllerId {
  
  @scala.inline
  def apply(controllerId: Double): ControllerId = {
    val __obj = js.Dynamic.literal(controllerId = controllerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerId]
  }
  
  @scala.inline
  implicit class ControllerIdOps[Self <: ControllerId] (val x: Self) extends AnyVal {
    
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
    def setControllerId(value: Double): Self = this.set("controllerId", value.asInstanceOf[js.Any])
  }
}

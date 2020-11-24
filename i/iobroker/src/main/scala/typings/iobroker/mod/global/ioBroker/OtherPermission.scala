package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.execute
import typings.iobroker.iobrokerStrings.http
import typings.iobroker.iobrokerStrings.other
import typings.iobroker.iobrokerStrings.sendto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherPermission extends Permission {
  
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto = js.native
  
  @JSName("type")
  var type_OtherPermission: other = js.native
}
object OtherPermission {
  
  @scala.inline
  def apply(operation: execute | http | sendto, `type`: other): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherPermission]
  }
  
  @scala.inline
  implicit class OtherPermissionOps[Self <: OtherPermission] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: execute | http | sendto): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: other): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

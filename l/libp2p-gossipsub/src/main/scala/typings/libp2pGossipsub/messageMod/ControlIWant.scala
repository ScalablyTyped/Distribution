package typings.libp2pGossipsub.messageMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlIWant extends js.Object {
  
  var messageIDs: js.Array[Uint8Array] = js.native
}
object ControlIWant {
  
  @scala.inline
  def apply(messageIDs: js.Array[Uint8Array]): ControlIWant = {
    val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlIWant]
  }
  
  @scala.inline
  implicit class ControlIWantOps[Self <: ControlIWant] (val x: Self) extends AnyVal {
    
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
    def setMessageIDsVarargs(value: Uint8Array*): Self = this.set("messageIDs", js.Array(value :_*))
    
    @scala.inline
    def setMessageIDs(value: js.Array[Uint8Array]): Self = this.set("messageIDs", value.asInstanceOf[js.Any])
  }
}

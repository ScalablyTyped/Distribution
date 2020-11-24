package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDAPMessageJsonObject
  extends /* k */ StringDictionary[js.Any] {
  
  var controls: js.Array[Control] = js.native
  
  var messageID: Double = js.native
  
  var protocolOp: js.UndefOr[String] = js.native
}
object LDAPMessageJsonObject {
  
  @scala.inline
  def apply(controls: js.Array[Control], messageID: Double): LDAPMessageJsonObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObject]
  }
  
  @scala.inline
  implicit class LDAPMessageJsonObjectOps[Self <: LDAPMessageJsonObject] (val x: Self) extends AnyVal {
    
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
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: Double): Self = this.set("messageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolOp(value: String): Self = this.set("protocolOp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolOp: Self = this.set("protocolOp", js.undefined)
  }
}

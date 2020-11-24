package typings.ipAddress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupIndividual extends js.Object {
  
  var groupIndividual: Boolean = js.native
  
  var nonce: String = js.native
  
  var reserved: Boolean = js.native
  
  var universalLocal: Boolean = js.native
}
object GroupIndividual {
  
  @scala.inline
  def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): GroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], universalLocal = universalLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIndividual]
  }
  
  @scala.inline
  implicit class GroupIndividualOps[Self <: GroupIndividual] (val x: Self) extends AnyVal {
    
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
    def setGroupIndividual(value: Boolean): Self = this.set("groupIndividual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserved(value: Boolean): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalLocal(value: Boolean): Self = this.set("universalLocal", value.asInstanceOf[js.Any])
  }
}

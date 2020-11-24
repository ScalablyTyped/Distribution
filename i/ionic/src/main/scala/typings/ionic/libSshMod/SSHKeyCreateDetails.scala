package typings.ionic.libSshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSHKeyCreateDetails extends js.Object {
  
  var pubkey: String = js.native
}
object SSHKeyCreateDetails {
  
  @scala.inline
  def apply(pubkey: String): SSHKeyCreateDetails = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHKeyCreateDetails]
  }
  
  @scala.inline
  implicit class SSHKeyCreateDetailsOps[Self <: SSHKeyCreateDetails] (val x: Self) extends AnyVal {
    
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
    def setPubkey(value: String): Self = this.set("pubkey", value.asInstanceOf[js.Any])
  }
}

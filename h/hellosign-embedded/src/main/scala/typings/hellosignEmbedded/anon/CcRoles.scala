package typings.hellosignEmbedded.anon

import typings.hellosignEmbedded.mod.HelloSign.SignerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcRoles extends js.Object {
  
  var ccRoles: String = js.native
  
  var message: String = js.native
  
  var signerRoles: SignerRole = js.native
  
  var title: String = js.native
}
object CcRoles {
  
  @scala.inline
  def apply(ccRoles: String, message: String, signerRoles: SignerRole, title: String): CcRoles = {
    val __obj = js.Dynamic.literal(ccRoles = ccRoles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signerRoles = signerRoles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcRoles]
  }
  
  @scala.inline
  implicit class CcRolesOps[Self <: CcRoles] (val x: Self) extends AnyVal {
    
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
    def setCcRoles(value: String): Self = this.set("ccRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerRoles(value: SignerRole): Self = this.set("signerRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}

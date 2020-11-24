package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakTokenParsed extends js.Object {
  
  var exp: js.UndefOr[Double] = js.native
  
  var iat: js.UndefOr[Double] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var realm_access: js.UndefOr[KeycloakRoles] = js.native
  
  var resource_access: js.UndefOr[KeycloakResourceAccess] = js.native
  
  var session_state: js.UndefOr[String] = js.native
  
  var sub: js.UndefOr[String] = js.native
}
object KeycloakTokenParsed {
  
  @scala.inline
  def apply(): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
  
  @scala.inline
  implicit class KeycloakTokenParsedOps[Self <: KeycloakTokenParsed] (val x: Self) extends AnyVal {
    
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
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setRealm_access(value: KeycloakRoles): Self = this.set("realm_access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm_access: Self = this.set("realm_access", js.undefined)
    
    @scala.inline
    def setResource_access(value: KeycloakResourceAccess): Self = this.set("resource_access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource_access: Self = this.set("resource_access", js.undefined)
    
    @scala.inline
    def setSession_state(value: String): Self = this.set("session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession_state: Self = this.set("session_state", js.undefined)
    
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
  }
}

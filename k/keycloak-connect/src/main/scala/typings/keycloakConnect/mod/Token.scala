package typings.keycloakConnect.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  var clientId: String = js.native
  
  var content: TokenContent = js.native
  
  def hasApplicationRole(appName: String, roleName: String): Boolean = js.native
  
  def hasPermission(resource: String, scope: String): Boolean = js.native
  
  def hasRealmRole(roleName: String): Boolean = js.native
  
  def hasRole(roleName: String): Boolean = js.native
  
  var header: js.UndefOr[js.Any] = js.native
  
  def isExpired(): Boolean = js.native
  
  var signature: js.UndefOr[Buffer] = js.native
  
  var signed: js.UndefOr[String] = js.native
  
  var token: String = js.native
}
object Token {
  
  @scala.inline
  def apply(
    clientId: String,
    content: TokenContent,
    hasApplicationRole: (String, String) => Boolean,
    hasPermission: (String, String) => Boolean,
    hasRealmRole: String => Boolean,
    hasRole: String => Boolean,
    isExpired: () => Boolean,
    token: String
  ): Token = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hasApplicationRole = js.Any.fromFunction2(hasApplicationRole), hasPermission = js.Any.fromFunction2(hasPermission), hasRealmRole = js.Any.fromFunction1(hasRealmRole), hasRole = js.Any.fromFunction1(hasRole), isExpired = js.Any.fromFunction0(isExpired), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TokenContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasApplicationRole(value: (String, String) => Boolean): Self = this.set("hasApplicationRole", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasPermission(value: (String, String) => Boolean): Self = this.set("hasPermission", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasRealmRole(value: String => Boolean): Self = this.set("hasRealmRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasRole(value: String => Boolean): Self = this.set("hasRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsExpired(value: () => Boolean): Self = this.set("isExpired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSigned(value: String): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
}

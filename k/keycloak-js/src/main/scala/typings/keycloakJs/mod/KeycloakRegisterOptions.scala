package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<keycloak-js.keycloak-js.KeycloakLoginOptions, 'action'> */
@js.native
trait KeycloakRegisterOptions extends js.Object {
  
  var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.native
  
  var idpHint: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var loginHint: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var prompt: js.UndefOr[none | login] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object KeycloakRegisterOptions {
  
  @scala.inline
  def apply(): KeycloakRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakRegisterOptions]
  }
  
  @scala.inline
  implicit class KeycloakRegisterOptionsOps[Self <: KeycloakRegisterOptions] (val x: Self) extends AnyVal {
    
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
    def setCordovaOptions(value: StringDictionary[String]): Self = this.set("cordovaOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCordovaOptions: Self = this.set("cordovaOptions", js.undefined)
    
    @scala.inline
    def setIdpHint(value: String): Self = this.set("idpHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdpHint: Self = this.set("idpHint", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPrompt(value: none | login): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}

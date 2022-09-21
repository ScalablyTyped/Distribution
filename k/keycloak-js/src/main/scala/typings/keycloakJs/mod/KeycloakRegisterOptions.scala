package typings.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keycloakJs.keycloakJsStrings.login
import typings.keycloakJs.keycloakJsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<keycloak-js.keycloak-js.KeycloakLoginOptions, 'action'> */
trait KeycloakRegisterOptions extends StObject {
  
  var acr: js.UndefOr[Acr] = js.undefined
  
  var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var idpHint: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var loginHint: js.UndefOr[String] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var prompt: js.UndefOr[none | login] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object KeycloakRegisterOptions {
  
  inline def apply(): KeycloakRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakRegisterOptions]
  }
  
  extension [Self <: KeycloakRegisterOptions](x: Self) {
    
    inline def setAcr(value: Acr): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setCordovaOptions(value: StringDictionary[String]): Self = StObject.set(x, "cordovaOptions", value.asInstanceOf[js.Any])
    
    inline def setCordovaOptionsUndefined: Self = StObject.set(x, "cordovaOptions", js.undefined)
    
    inline def setIdpHint(value: String): Self = StObject.set(x, "idpHint", value.asInstanceOf[js.Any])
    
    inline def setIdpHintUndefined: Self = StObject.set(x, "idpHint", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
    
    inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setPrompt(value: none | login): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}

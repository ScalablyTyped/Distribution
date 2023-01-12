package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakLogoutOptions extends StObject {
  
  /**
  	 * Specifies the uri to redirect to after logout.
  	 */
  var redirectUri: js.UndefOr[String] = js.undefined
}
object KeycloakLogoutOptions {
  
  inline def apply(): KeycloakLogoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakLogoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakLogoutOptions] (val x: Self) extends AnyVal {
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}

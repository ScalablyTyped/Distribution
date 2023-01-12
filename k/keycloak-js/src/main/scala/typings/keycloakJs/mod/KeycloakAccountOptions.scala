package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakAccountOptions extends StObject {
  
  /**
  	 * Specifies the uri to redirect to when redirecting back to the application.
  	 */
  var redirectUri: js.UndefOr[String] = js.undefined
}
object KeycloakAccountOptions {
  
  inline def apply(): KeycloakAccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakAccountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakAccountOptions] (val x: Self) extends AnyVal {
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}

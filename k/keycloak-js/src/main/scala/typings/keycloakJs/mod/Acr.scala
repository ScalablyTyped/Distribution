package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acr extends StObject {
  
  /**
  	 * This parameter specifies if ACR claims is considered essential or not.
  	 */
  var essential: Boolean
  
  /**
  	 * Array of values, which will be used inside ID Token `acr` claim sent inside the `claims` parameter to Keycloak server during login.
  	 * Values should correspond to the ACR levels defined in the ACR to Loa mapping for realm or client or to the numbers (levels) inside defined
  	 * Keycloak authentication flow. See section 5.5.1 of OIDC 1.0 specification for the details.
  	 */
  var values: js.Array[String]
}
object Acr {
  
  inline def apply(essential: Boolean, values: js.Array[String]): Acr = {
    val __obj = js.Dynamic.literal(essential = essential.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acr]
  }
  
  extension [Self <: Acr](x: Self) {
    
    inline def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

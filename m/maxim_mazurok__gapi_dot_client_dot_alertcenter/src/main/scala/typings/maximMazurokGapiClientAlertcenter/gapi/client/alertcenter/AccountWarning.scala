package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountWarning extends StObject {
  
  /** Required. The email of the user that this event belongs to. */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Details of the login action associated with the warning event. This is only available for: * Suspicious login * Suspicious login (less secure app) * Suspicious
    * programmatic login * User suspended (suspicious activity)
    */
  var loginDetails: js.UndefOr[LoginDetails] = js.undefined
}
object AccountWarning {
  
  inline def apply(): AccountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountWarning] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLoginDetails(value: LoginDetails): Self = StObject.set(x, "loginDetails", value.asInstanceOf[js.Any])
    
    inline def setLoginDetailsUndefined: Self = StObject.set(x, "loginDetails", js.undefined)
  }
}

package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsForwardingaddressesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The forwarding address to be retrieved.
    */
  var forwardingEmail: js.UndefOr[String] = js.undefined
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsForwardingaddressesGet {
  
  inline def apply(): ParamsResourceUsersSettingsForwardingaddressesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsForwardingaddressesGet]
  }
  
  extension [Self <: ParamsResourceUsersSettingsForwardingaddressesGet](x: Self) {
    
    inline def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
    
    inline def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

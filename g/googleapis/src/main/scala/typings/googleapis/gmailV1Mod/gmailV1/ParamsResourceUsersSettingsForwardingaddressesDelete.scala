package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsForwardingaddressesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The forwarding address to be deleted.
    */
  var forwardingEmail: js.UndefOr[String] = js.undefined
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsForwardingaddressesDelete {
  
  inline def apply(): ParamsResourceUsersSettingsForwardingaddressesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsForwardingaddressesDelete]
  }
  
  extension [Self <: ParamsResourceUsersSettingsForwardingaddressesDelete](x: Self) {
    
    inline def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
    
    inline def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

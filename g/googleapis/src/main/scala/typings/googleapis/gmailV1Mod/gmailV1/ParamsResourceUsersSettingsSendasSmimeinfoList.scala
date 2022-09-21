package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsSendasSmimeinfoList
  extends StObject
     with StandardParameters {
  
  /**
    * The email address that appears in the "From:" header for mail sent using this alias.
    */
  var sendAsEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value `me` can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsSendasSmimeinfoList {
  
  inline def apply(): ParamsResourceUsersSettingsSendasSmimeinfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasSmimeinfoList]
  }
  
  extension [Self <: ParamsResourceUsersSettingsSendasSmimeinfoList](x: Self) {
    
    inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

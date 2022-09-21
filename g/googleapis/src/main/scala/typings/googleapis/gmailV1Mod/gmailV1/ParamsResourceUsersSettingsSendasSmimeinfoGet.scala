package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsSendasSmimeinfoGet
  extends StObject
     with StandardParameters {
  
  /**
    * The immutable ID for the SmimeInfo.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The email address that appears in the "From:" header for mail sent using this alias.
    */
  var sendAsEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value `me` can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsSendasSmimeinfoGet {
  
  inline def apply(): ParamsResourceUsersSettingsSendasSmimeinfoGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasSmimeinfoGet]
  }
  
  extension [Self <: ParamsResourceUsersSettingsSendasSmimeinfoGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

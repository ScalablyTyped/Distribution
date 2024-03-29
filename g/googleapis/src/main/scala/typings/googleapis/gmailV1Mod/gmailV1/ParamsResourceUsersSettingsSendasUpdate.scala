package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsSendasUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSendAs] = js.undefined
  
  /**
    * The send-as alias to be updated.
    */
  var sendAsEmail: js.UndefOr[String] = js.undefined
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsSendasUpdate {
  
  inline def apply(): ParamsResourceUsersSettingsSendasUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasUpdate]
  }
  
  extension [Self <: ParamsResourceUsersSettingsSendasUpdate](x: Self) {
    
    inline def setRequestBody(value: SchemaSendAs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

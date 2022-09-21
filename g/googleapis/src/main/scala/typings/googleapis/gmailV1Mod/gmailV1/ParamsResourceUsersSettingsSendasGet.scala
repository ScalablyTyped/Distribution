package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsSendasGet
  extends StObject
     with StandardParameters {
  
  /**
    * The send-as alias to be retrieved.
    */
  var sendAsEmail: js.UndefOr[String] = js.undefined
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsSendasGet {
  
  inline def apply(): ParamsResourceUsersSettingsSendasGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsSendasGet]
  }
  
  extension [Self <: ParamsResourceUsersSettingsSendasGet](x: Self) {
    
    inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

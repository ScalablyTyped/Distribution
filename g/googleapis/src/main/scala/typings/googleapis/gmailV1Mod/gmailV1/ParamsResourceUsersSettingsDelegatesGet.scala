package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSettingsDelegatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The email address of the user whose delegate relationship is to be retrieved.
    */
  var delegateEmail: js.UndefOr[String] = js.undefined
  
  /**
    * User's email address. The special value "me" can be used to indicate the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSettingsDelegatesGet {
  
  inline def apply(): ParamsResourceUsersSettingsDelegatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSettingsDelegatesGet]
  }
  
  extension [Self <: ParamsResourceUsersSettingsDelegatesGet](x: Self) {
    
    inline def setDelegateEmail(value: String): Self = StObject.set(x, "delegateEmail", value.asInstanceOf[js.Any])
    
    inline def setDelegateEmailUndefined: Self = StObject.set(x, "delegateEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInvitation extends StObject {
  
  /** Number of invitation emails sent to the user. */
  var mailsSentCount: js.UndefOr[String] = js.undefined
  
  /** Shall be of the form `customers/{customer}/userinvitations/{user_email_address}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** State of the `UserInvitation`. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Time when the `UserInvitation` was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object UserInvitation {
  
  inline def apply(): UserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInvitation]
  }
  
  extension [Self <: UserInvitation](x: Self) {
    
    inline def setMailsSentCount(value: String): Self = StObject.set(x, "mailsSentCount", value.asInstanceOf[js.Any])
    
    inline def setMailsSentCountUndefined: Self = StObject.set(x, "mailsSentCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}

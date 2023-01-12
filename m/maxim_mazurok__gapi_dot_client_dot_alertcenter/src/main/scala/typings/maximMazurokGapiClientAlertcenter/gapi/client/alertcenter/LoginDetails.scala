package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginDetails extends StObject {
  
  /** Optional. The human-readable IP address (for example, `11.22.33.44`) that is associated with the warning event. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** Optional. The successful login time that is associated with the warning event. This isn't present for blocked login attempts. */
  var loginTime: js.UndefOr[String] = js.undefined
}
object LoginDetails {
  
  inline def apply(): LoginDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginDetails] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLoginTime(value: String): Self = StObject.set(x, "loginTime", value.asInstanceOf[js.Any])
    
    inline def setLoginTimeUndefined: Self = StObject.set(x, "loginTime", js.undefined)
  }
}

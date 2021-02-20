package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details of the login action.
  */
@js.native
trait SchemaLoginDetails extends StObject {
  
  /**
    * Optional. The human-readable IP address (for example, `11.22.33.44`) that
    * is associated with the warning event.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Optional. The successful login time that is associated with the warning
    * event. This will not be present for blocked login attempts.
    */
  var loginTime: js.UndefOr[String] = js.native
}
object SchemaLoginDetails {
  
  @scala.inline
  def apply(): SchemaLoginDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginDetails]
  }
  
  @scala.inline
  implicit class SchemaLoginDetailsMutableBuilder[Self <: SchemaLoginDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setLoginTime(value: String): Self = StObject.set(x, "loginTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginTimeUndefined: Self = StObject.set(x, "loginTime", js.undefined)
  }
}

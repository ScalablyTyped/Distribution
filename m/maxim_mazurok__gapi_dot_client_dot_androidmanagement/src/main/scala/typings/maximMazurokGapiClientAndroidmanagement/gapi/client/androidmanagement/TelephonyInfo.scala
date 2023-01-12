package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelephonyInfo extends StObject {
  
  /** The carrier name associated with this SIM card. */
  var carrierName: js.UndefOr[String] = js.undefined
  
  /** The phone number associated with this SIM card. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object TelephonyInfo {
  
  inline def apply(): TelephonyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelephonyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelephonyInfo] (val x: Self) extends AnyVal {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}

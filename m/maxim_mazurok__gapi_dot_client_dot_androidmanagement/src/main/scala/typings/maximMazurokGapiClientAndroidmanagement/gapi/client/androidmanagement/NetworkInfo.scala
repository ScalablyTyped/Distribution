package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInfo extends StObject {
  
  /** IMEI number of the GSM device. For example, A1000031212. */
  var imei: js.UndefOr[String] = js.undefined
  
  /** MEID number of the CDMA device. For example, A00000292788E1. */
  var meid: js.UndefOr[String] = js.undefined
  
  /** Alphabetic name of current registered operator. For example, Vodafone. */
  var networkOperatorName: js.UndefOr[String] = js.undefined
  
  /** Provides telephony information associated with each SIM card on the device. Only supported on fully managed devices starting from Android API level 23. */
  var telephonyInfos: js.UndefOr[js.Array[TelephonyInfo]] = js.undefined
  
  /** Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11. */
  var wifiMacAddress: js.UndefOr[String] = js.undefined
}
object NetworkInfo {
  
  inline def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    inline def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    inline def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    inline def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    inline def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    inline def setNetworkOperatorName(value: String): Self = StObject.set(x, "networkOperatorName", value.asInstanceOf[js.Any])
    
    inline def setNetworkOperatorNameUndefined: Self = StObject.set(x, "networkOperatorName", js.undefined)
    
    inline def setTelephonyInfos(value: js.Array[TelephonyInfo]): Self = StObject.set(x, "telephonyInfos", value.asInstanceOf[js.Any])
    
    inline def setTelephonyInfosUndefined: Self = StObject.set(x, "telephonyInfos", js.undefined)
    
    inline def setTelephonyInfosVarargs(value: TelephonyInfo*): Self = StObject.set(x, "telephonyInfos", js.Array(value*))
    
    inline def setWifiMacAddress(value: String): Self = StObject.set(x, "wifiMacAddress", value.asInstanceOf[js.Any])
    
    inline def setWifiMacAddressUndefined: Self = StObject.set(x, "wifiMacAddress", js.undefined)
  }
}

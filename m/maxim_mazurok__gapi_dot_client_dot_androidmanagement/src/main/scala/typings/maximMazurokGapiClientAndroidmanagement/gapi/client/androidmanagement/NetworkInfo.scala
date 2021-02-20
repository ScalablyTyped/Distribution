package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends StObject {
  
  /** IMEI number of the GSM device. For example, A1000031212. */
  var imei: js.UndefOr[String] = js.native
  
  /** MEID number of the CDMA device. For example, A00000292788E1. */
  var meid: js.UndefOr[String] = js.native
  
  /** Alphabetic name of current registered operator. For example, Vodafone. */
  var networkOperatorName: js.UndefOr[String] = js.native
  
  /** Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11. */
  var wifiMacAddress: js.UndefOr[String] = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImei(value: String): Self = StObject.set(x, "imei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImeiUndefined: Self = StObject.set(x, "imei", js.undefined)
    
    @scala.inline
    def setMeid(value: String): Self = StObject.set(x, "meid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeidUndefined: Self = StObject.set(x, "meid", js.undefined)
    
    @scala.inline
    def setNetworkOperatorName(value: String): Self = StObject.set(x, "networkOperatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkOperatorNameUndefined: Self = StObject.set(x, "networkOperatorName", js.undefined)
    
    @scala.inline
    def setWifiMacAddress(value: String): Self = StObject.set(x, "wifiMacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiMacAddressUndefined: Self = StObject.set(x, "wifiMacAddress", js.undefined)
  }
}

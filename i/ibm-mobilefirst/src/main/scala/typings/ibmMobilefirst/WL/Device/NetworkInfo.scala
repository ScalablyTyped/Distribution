package typings.ibmMobilefirst.WL.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends js.Object {
  
  var Ipv4Addresses: js.UndefOr[js.Array[AddressPair]] = js.native
  
  var Ipv6Addresses: js.UndefOr[js.Array[AddressPair]] = js.native
  
  var carrierName: js.UndefOr[String] = js.native
  
  var ipAddress: js.UndefOr[String] = js.native
  
  var isAirplaneMode: js.UndefOr[Boolean] = js.native
  
  var isNetworkConnected: js.UndefOr[Boolean] = js.native
  
  var isRoaming: js.UndefOr[Boolean] = js.native
  
  var networkConnectionType: js.UndefOr[String] = js.native
  
  var telephonyNetworkType: js.UndefOr[String] = js.native
  
  var wifiName: js.UndefOr[String] = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpv4AddressesVarargs(value: AddressPair*): Self = this.set("Ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Addresses(value: js.Array[AddressPair]): Self = this.set("Ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Addresses: Self = this.set("Ipv4Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: AddressPair*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: js.Array[AddressPair]): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setCarrierName(value: String): Self = this.set("carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierName: Self = this.set("carrierName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setIsAirplaneMode(value: Boolean): Self = this.set("isAirplaneMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAirplaneMode: Self = this.set("isAirplaneMode", js.undefined)
    
    @scala.inline
    def setIsNetworkConnected(value: Boolean): Self = this.set("isNetworkConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNetworkConnected: Self = this.set("isNetworkConnected", js.undefined)
    
    @scala.inline
    def setIsRoaming(value: Boolean): Self = this.set("isRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRoaming: Self = this.set("isRoaming", js.undefined)
    
    @scala.inline
    def setNetworkConnectionType(value: String): Self = this.set("networkConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConnectionType: Self = this.set("networkConnectionType", js.undefined)
    
    @scala.inline
    def setTelephonyNetworkType(value: String): Self = this.set("telephonyNetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelephonyNetworkType: Self = this.set("telephonyNetworkType", js.undefined)
    
    @scala.inline
    def setWifiName(value: String): Self = this.set("wifiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiName: Self = this.set("wifiName", js.undefined)
  }
}

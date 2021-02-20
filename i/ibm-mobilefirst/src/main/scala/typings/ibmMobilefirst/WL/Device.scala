package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Device {
  
  @js.native
  trait AddressPair extends StObject {
    
    var `3GAddress`: String = js.native
    
    var wifiAddress: String = js.native
  }
  object AddressPair {
    
    @scala.inline
    def apply(`3GAddress`: String, wifiAddress: String): AddressPair = {
      val __obj = js.Dynamic.literal(wifiAddress = wifiAddress.asInstanceOf[js.Any])
      __obj.updateDynamic("3GAddress")(`3GAddress`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressPair]
    }
    
    @scala.inline
    implicit class AddressPairMutableBuilder[Self <: AddressPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set3GAddress(value: String): Self = StObject.set(x, "3GAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWifiAddress(value: String): Self = StObject.set(x, "wifiAddress", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInfo extends StObject {
    
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
    implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setIpv4Addresses(value: js.Array[AddressPair]): Self = StObject.set(x, "Ipv4Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv4AddressesUndefined: Self = StObject.set(x, "Ipv4Addresses", js.undefined)
      
      @scala.inline
      def setIpv4AddressesVarargs(value: AddressPair*): Self = StObject.set(x, "Ipv4Addresses", js.Array(value :_*))
      
      @scala.inline
      def setIpv6Addresses(value: js.Array[AddressPair]): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
      
      @scala.inline
      def setIpv6AddressesVarargs(value: AddressPair*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
      
      @scala.inline
      def setIsAirplaneMode(value: Boolean): Self = StObject.set(x, "isAirplaneMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAirplaneModeUndefined: Self = StObject.set(x, "isAirplaneMode", js.undefined)
      
      @scala.inline
      def setIsNetworkConnected(value: Boolean): Self = StObject.set(x, "isNetworkConnected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNetworkConnectedUndefined: Self = StObject.set(x, "isNetworkConnected", js.undefined)
      
      @scala.inline
      def setIsRoaming(value: Boolean): Self = StObject.set(x, "isRoaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRoamingUndefined: Self = StObject.set(x, "isRoaming", js.undefined)
      
      @scala.inline
      def setNetworkConnectionType(value: String): Self = StObject.set(x, "networkConnectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkConnectionTypeUndefined: Self = StObject.set(x, "networkConnectionType", js.undefined)
      
      @scala.inline
      def setTelephonyNetworkType(value: String): Self = StObject.set(x, "telephonyNetworkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelephonyNetworkTypeUndefined: Self = StObject.set(x, "telephonyNetworkType", js.undefined)
      
      @scala.inline
      def setWifiName(value: String): Self = StObject.set(x, "wifiName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWifiNameUndefined: Self = StObject.set(x, "wifiName", js.undefined)
    }
  }
}

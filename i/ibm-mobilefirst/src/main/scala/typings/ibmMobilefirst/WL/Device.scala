package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Device {
  
  trait AddressPair extends StObject {
    
    var `3GAddress`: String
    
    var wifiAddress: String
  }
  object AddressPair {
    
    inline def apply(`3GAddress`: String, wifiAddress: String): AddressPair = {
      val __obj = js.Dynamic.literal(wifiAddress = wifiAddress.asInstanceOf[js.Any])
      __obj.updateDynamic("3GAddress")(`3GAddress`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressPair]
    }
    
    extension [Self <: AddressPair](x: Self) {
      
      inline def set3GAddress(value: String): Self = StObject.set(x, "3GAddress", value.asInstanceOf[js.Any])
      
      inline def setWifiAddress(value: String): Self = StObject.set(x, "wifiAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInfo extends StObject {
    
    var Ipv4Addresses: js.UndefOr[js.Array[AddressPair]] = js.undefined
    
    var Ipv6Addresses: js.UndefOr[js.Array[AddressPair]] = js.undefined
    
    var carrierName: js.UndefOr[String] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var isAirplaneMode: js.UndefOr[Boolean] = js.undefined
    
    var isNetworkConnected: js.UndefOr[Boolean] = js.undefined
    
    var isRoaming: js.UndefOr[Boolean] = js.undefined
    
    var networkConnectionType: js.UndefOr[String] = js.undefined
    
    var telephonyNetworkType: js.UndefOr[String] = js.undefined
    
    var wifiName: js.UndefOr[String] = js.undefined
  }
  object NetworkInfo {
    
    inline def apply(): NetworkInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInfo]
    }
    
    extension [Self <: NetworkInfo](x: Self) {
      
      inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
      
      inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setIpv4Addresses(value: js.Array[AddressPair]): Self = StObject.set(x, "Ipv4Addresses", value.asInstanceOf[js.Any])
      
      inline def setIpv4AddressesUndefined: Self = StObject.set(x, "Ipv4Addresses", js.undefined)
      
      inline def setIpv4AddressesVarargs(value: AddressPair*): Self = StObject.set(x, "Ipv4Addresses", js.Array(value :_*))
      
      inline def setIpv6Addresses(value: js.Array[AddressPair]): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
      
      inline def setIpv6AddressesVarargs(value: AddressPair*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
      
      inline def setIsAirplaneMode(value: Boolean): Self = StObject.set(x, "isAirplaneMode", value.asInstanceOf[js.Any])
      
      inline def setIsAirplaneModeUndefined: Self = StObject.set(x, "isAirplaneMode", js.undefined)
      
      inline def setIsNetworkConnected(value: Boolean): Self = StObject.set(x, "isNetworkConnected", value.asInstanceOf[js.Any])
      
      inline def setIsNetworkConnectedUndefined: Self = StObject.set(x, "isNetworkConnected", js.undefined)
      
      inline def setIsRoaming(value: Boolean): Self = StObject.set(x, "isRoaming", value.asInstanceOf[js.Any])
      
      inline def setIsRoamingUndefined: Self = StObject.set(x, "isRoaming", js.undefined)
      
      inline def setNetworkConnectionType(value: String): Self = StObject.set(x, "networkConnectionType", value.asInstanceOf[js.Any])
      
      inline def setNetworkConnectionTypeUndefined: Self = StObject.set(x, "networkConnectionType", js.undefined)
      
      inline def setTelephonyNetworkType(value: String): Self = StObject.set(x, "telephonyNetworkType", value.asInstanceOf[js.Any])
      
      inline def setTelephonyNetworkTypeUndefined: Self = StObject.set(x, "telephonyNetworkType", js.undefined)
      
      inline def setWifiName(value: String): Self = StObject.set(x, "wifiName", value.asInstanceOf[js.Any])
      
      inline def setWifiNameUndefined: Self = StObject.set(x, "wifiName", js.undefined)
    }
  }
}

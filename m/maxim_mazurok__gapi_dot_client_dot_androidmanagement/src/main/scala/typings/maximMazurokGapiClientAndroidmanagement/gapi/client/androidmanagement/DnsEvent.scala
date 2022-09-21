package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsEvent extends StObject {
  
  /** The hostname that was looked up. */
  var hostname: js.UndefOr[String] = js.undefined
  
  /** The (possibly truncated) list of the IP addresses returned for DNS lookup (max 10 IPv4 or IPv6 addresses). */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The package name of the UID that performed the DNS lookup. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The number of IP addresses returned from the DNS lookup event. May be higher than the amount of ip_addresses if there were too many addresses to log. */
  var totalIpAddressesReturned: js.UndefOr[String] = js.undefined
}
object DnsEvent {
  
  inline def apply(): DnsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsEvent]
  }
  
  extension [Self <: DnsEvent](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setTotalIpAddressesReturned(value: String): Self = StObject.set(x, "totalIpAddressesReturned", value.asInstanceOf[js.Any])
    
    inline def setTotalIpAddressesReturnedUndefined: Self = StObject.set(x, "totalIpAddressesReturned", js.undefined)
  }
}

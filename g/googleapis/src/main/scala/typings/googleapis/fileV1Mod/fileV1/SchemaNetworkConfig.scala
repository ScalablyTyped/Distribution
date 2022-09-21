package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
    */
  var connectMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. IPv4 addresses in the format `{octet1\}.{octet2\}.{octet3\}.{octet4\}` or IPv6 addresses in the format `{block1\}:{block2\}:{block3\}:{block4\}:{block5\}:{block6\}:{block7\}:{block8\}`.
    */
  var ipAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
    */
  var modes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier, a /24 CIDR block for High Scale tier, or a /26 CIDR block for Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29, 192.168.0.0/24 or 192.168.0.0/26, respectively. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Filestore instances in the selected VPC network.
    */
  var reservedIpRange: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setConnectMode(value: String): Self = StObject.set(x, "connectMode", value.asInstanceOf[js.Any])
    
    inline def setConnectModeNull: Self = StObject.set(x, "connectMode", null)
    
    inline def setConnectModeUndefined: Self = StObject.set(x, "connectMode", js.undefined)
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesNull: Self = StObject.set(x, "ipAddresses", null)
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesNull: Self = StObject.set(x, "modes", null)
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value*))
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeNull: Self = StObject.set(x, "reservedIpRange", null)
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
  }
}

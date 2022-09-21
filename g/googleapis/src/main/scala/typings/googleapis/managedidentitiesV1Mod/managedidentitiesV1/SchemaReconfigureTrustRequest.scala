package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReconfigureTrustRequest extends StObject {
  
  /**
    * Required. The target DNS server IP addresses to resolve the remote domain involved in the trust.
    */
  var targetDnsIpAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The fully-qualified target domain name which will be in trust with current domain.
    */
  var targetDomainName: js.UndefOr[String | Null] = js.undefined
}
object SchemaReconfigureTrustRequest {
  
  inline def apply(): SchemaReconfigureTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReconfigureTrustRequest]
  }
  
  extension [Self <: SchemaReconfigureTrustRequest](x: Self) {
    
    inline def setTargetDnsIpAddresses(value: js.Array[String]): Self = StObject.set(x, "targetDnsIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setTargetDnsIpAddressesNull: Self = StObject.set(x, "targetDnsIpAddresses", null)
    
    inline def setTargetDnsIpAddressesUndefined: Self = StObject.set(x, "targetDnsIpAddresses", js.undefined)
    
    inline def setTargetDnsIpAddressesVarargs(value: String*): Self = StObject.set(x, "targetDnsIpAddresses", js.Array(value*))
    
    inline def setTargetDomainName(value: String): Self = StObject.set(x, "targetDomainName", value.asInstanceOf[js.Any])
    
    inline def setTargetDomainNameNull: Self = StObject.set(x, "targetDomainName", null)
    
    inline def setTargetDomainNameUndefined: Self = StObject.set(x, "targetDomainName", js.undefined)
  }
}

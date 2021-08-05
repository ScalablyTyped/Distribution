package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessConfig extends StObject {
  
  /** [Output Only] Type of the resource. Always compute#accessConfig for access configs. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of this access configuration. The default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared
    * ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.undefined
  
  /**
    * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD.
    *
    * If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier.
    *
    * If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
    */
  var networkTier: js.UndefOr[String] = js.undefined
  
  /** The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled. */
  var publicPtrDomainName: js.UndefOr[String] = js.undefined
  
  /** Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. */
  var setPublicPtr: js.UndefOr[Boolean] = js.undefined
  
  /** The type of configuration. The default and only option is ONE_TO_ONE_NAT. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AccessConfig {
  
  inline def apply(): AccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConfig]
  }
  
  extension [Self <: AccessConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatIP(value: String): Self = StObject.set(x, "natIP", value.asInstanceOf[js.Any])
    
    inline def setNatIPUndefined: Self = StObject.set(x, "natIP", js.undefined)
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
    
    inline def setPublicPtrDomainName(value: String): Self = StObject.set(x, "publicPtrDomainName", value.asInstanceOf[js.Any])
    
    inline def setPublicPtrDomainNameUndefined: Self = StObject.set(x, "publicPtrDomainName", js.undefined)
    
    inline def setSetPublicPtr(value: Boolean): Self = StObject.set(x, "setPublicPtr", value.asInstanceOf[js.Any])
    
    inline def setSetPublicPtrUndefined: Self = StObject.set(x, "setPublicPtr", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

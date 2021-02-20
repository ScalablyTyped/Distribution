package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access configuration attached to an instance&#39;s network interface.
  * Only one access config per instance is supported.
  */
@js.native
trait SchemaAccessConfig extends StObject {
  
  /**
    * [Output Only] Type of the resource. Always compute#accessConfig for
    * access configs.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of this access configuration. The default and recommended name
    * is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * An external IP address associated with this instance. Specify an unused
    * static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you
    * specify a static external IP address, it must live in the same region as
    * the zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.native
  
  /**
    * This signifies the networking tier used for configuring this access
    * configuration and can only take the following values: PREMIUM, STANDARD.
    * If an AccessConfig is specified without a valid external IP address, an
    * ephemeral IP will be created with this networkTier.  If an AccessConfig
    * with a valid external IP address is specified, it must match that of the
    * networkTier associated with the Address resource owning that IP.
    */
  var networkTier: js.UndefOr[String] = js.native
  
  /**
    * The DNS domain name for the public PTR record. This field can only be set
    * when the set_public_ptr field is enabled.
    */
  var publicPtrDomainName: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether a public DNS ?PTR? record should be created to map the
    * external IP address of the instance to a DNS domain name.
    */
  var setPublicPtr: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAccessConfig {
  
  @scala.inline
  def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  
  @scala.inline
  implicit class SchemaAccessConfigMutableBuilder[Self <: SchemaAccessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNatIP(value: String): Self = StObject.set(x, "natIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatIPUndefined: Self = StObject.set(x, "natIP", js.undefined)
    
    @scala.inline
    def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
    
    @scala.inline
    def setPublicPtrDomainName(value: String): Self = StObject.set(x, "publicPtrDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPtrDomainNameUndefined: Self = StObject.set(x, "publicPtrDomainName", js.undefined)
    
    @scala.inline
    def setSetPublicPtr(value: Boolean): Self = StObject.set(x, "setPublicPtr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPublicPtrUndefined: Self = StObject.set(x, "setPublicPtr", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

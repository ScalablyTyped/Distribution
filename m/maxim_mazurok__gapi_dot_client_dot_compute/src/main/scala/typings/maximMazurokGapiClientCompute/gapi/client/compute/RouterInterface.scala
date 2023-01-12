package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterInterface extends StObject {
  
  /**
    * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE:
    * Do not truncate the address as it represents the IP address of the interface.
    */
  var ipRange: js.UndefOr[String] = js.undefined
  
  /**
    * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect
    * attachment, or a virtual machine instance.
    */
  var linkedInterconnectAttachment: js.UndefOr[String] = js.undefined
  
  /**
    * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or
    * a virtual machine instance.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an
    * interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this
    * type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
}
object RouterInterface {
  
  inline def apply(): RouterInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterInterface] (val x: Self) extends AnyVal {
    
    inline def setIpRange(value: String): Self = StObject.set(x, "ipRange", value.asInstanceOf[js.Any])
    
    inline def setIpRangeUndefined: Self = StObject.set(x, "ipRange", js.undefined)
    
    inline def setLinkedInterconnectAttachment(value: String): Self = StObject.set(x, "linkedInterconnectAttachment", value.asInstanceOf[js.Any])
    
    inline def setLinkedInterconnectAttachmentUndefined: Self = StObject.set(x, "linkedInterconnectAttachment", js.undefined)
    
    inline def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

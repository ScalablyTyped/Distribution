package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEndpoint extends StObject {
  
  /** Metadata defined as annotations on the network endpoint. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NetworkEndpoint & TopLevel[js.Any]
  ] = js.undefined
  
  /** Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT. */
  var fqdn: js.UndefOr[String] = js.undefined
  
  /**
    * The name for a specific VM instance that the IP address belongs to. This is required for network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network
    * endpoint group.
    *
    * The name must be 1-63 characters long, and comply with RFC1035.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not
    * specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Optional port number of network endpoint. If not specified and the NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network endpoint group will be
    * used.
    */
  var port: js.UndefOr[Double] = js.undefined
}
object NetworkEndpoint {
  
  @scala.inline
  def apply(): NetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpoint]
  }
  
  @scala.inline
  implicit class NetworkEndpointMutableBuilder[Self <: NetworkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NetworkEndpoint & TopLevel[js.Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}

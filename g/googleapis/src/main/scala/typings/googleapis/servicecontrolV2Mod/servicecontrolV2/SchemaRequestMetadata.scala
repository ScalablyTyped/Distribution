package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestMetadata extends StObject {
  
  /**
    * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6 address. For caller from a Compute Engine VM with external IP address, this will be the VM's external IP address. For caller from a Compute Engine VM without external IP address, if the VM is in the same organization (or project) as the accessed resource, `caller_ip` will be the VM's internal IPv4 address, otherwise the `caller_ip` will be redacted to "gce-internal-ip". See https://cloud.google.com/compute/docs/vpc/ for more information.
    */
  var callerIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network of the caller. Set only if the network host project is part of the same GCP organization (or project) as the accessed resource. See https://cloud.google.com/compute/docs/vpc/ for more information. This is a scheme-less URI full resource name. For example: "//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID"
    */
  var callerNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user agent of the caller. This information is not authenticated and should be treated accordingly. For example: + `google-api-python-client/1.4.0`: The request was made by the Google API client for Python. + `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`: The request was made by the Google Cloud SDK CLI (gcloud). + `AppEngine-Google; (+http://code.google.com/appengine; appid: s~my-project`: The request was made from the `my-project` App Engine app. NOLINT
    */
  var callerSuppliedUserAgent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The destination of a network activity, such as accepting a TCP connection. In a multi hop network activity, the destination represents the receiver of the last hop. Only two fields are used in this message, Peer.port and Peer.ip. These fields are optionally populated by those services utilizing the IAM condition feature.
    */
  var destinationAttributes: js.UndefOr[SchemaPeer] = js.undefined
  
  /**
    * Request attributes used in IAM condition evaluation. This field contains request attributes like request time and access levels associated with the request. To get the whole view of the attributes used in IAM condition evaluation, the user must also look into `AuditLog.authentication_info.resource_attributes`.
    */
  var requestAttributes: js.UndefOr[SchemaRequest] = js.undefined
}
object SchemaRequestMetadata {
  
  inline def apply(): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
  
  extension [Self <: SchemaRequestMetadata](x: Self) {
    
    inline def setCallerIp(value: String): Self = StObject.set(x, "callerIp", value.asInstanceOf[js.Any])
    
    inline def setCallerIpNull: Self = StObject.set(x, "callerIp", null)
    
    inline def setCallerIpUndefined: Self = StObject.set(x, "callerIp", js.undefined)
    
    inline def setCallerNetwork(value: String): Self = StObject.set(x, "callerNetwork", value.asInstanceOf[js.Any])
    
    inline def setCallerNetworkNull: Self = StObject.set(x, "callerNetwork", null)
    
    inline def setCallerNetworkUndefined: Self = StObject.set(x, "callerNetwork", js.undefined)
    
    inline def setCallerSuppliedUserAgent(value: String): Self = StObject.set(x, "callerSuppliedUserAgent", value.asInstanceOf[js.Any])
    
    inline def setCallerSuppliedUserAgentNull: Self = StObject.set(x, "callerSuppliedUserAgent", null)
    
    inline def setCallerSuppliedUserAgentUndefined: Self = StObject.set(x, "callerSuppliedUserAgent", js.undefined)
    
    inline def setDestinationAttributes(value: SchemaPeer): Self = StObject.set(x, "destinationAttributes", value.asInstanceOf[js.Any])
    
    inline def setDestinationAttributesUndefined: Self = StObject.set(x, "destinationAttributes", js.undefined)
    
    inline def setRequestAttributes(value: SchemaRequest): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
  }
}

package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceResolver extends StObject {
  
  /**
    * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the
    * filtered list for each request. For endpoint filter syntax and examples, see
    * https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
    */
  var endpointFilter: js.UndefOr[String] = js.undefined
  
  /** Required. The hostname of the EKM replica used at TLS and HTTP layers. */
  var hostname: js.UndefOr[String] = js.undefined
  
  /** Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica. Currently, a maximum of 10 Certificate is supported. */
  var serverCertificates: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  /** Required. The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/ *‍/locations/ *‍/namespaces/ *‍/services/ *`. */
  var serviceDirectoryService: js.UndefOr[String] = js.undefined
}
object ServiceResolver {
  
  inline def apply(): ServiceResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResolver]
  }
  
  extension [Self <: ServiceResolver](x: Self) {
    
    inline def setEndpointFilter(value: String): Self = StObject.set(x, "endpointFilter", value.asInstanceOf[js.Any])
    
    inline def setEndpointFilterUndefined: Self = StObject.set(x, "endpointFilter", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setServerCertificates(value: js.Array[Certificate]): Self = StObject.set(x, "serverCertificates", value.asInstanceOf[js.Any])
    
    inline def setServerCertificatesUndefined: Self = StObject.set(x, "serverCertificates", js.undefined)
    
    inline def setServerCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "serverCertificates", js.Array(value*))
    
    inline def setServiceDirectoryService(value: String): Self = StObject.set(x, "serviceDirectoryService", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryServiceUndefined: Self = StObject.set(x, "serviceDirectoryService", js.undefined)
  }
}

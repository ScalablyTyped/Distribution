package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterAuth extends StObject {
  
  /** [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster endpoint. */
  var clientCertificate: js.UndefOr[String] = js.undefined
  
  /** Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued. */
  var clientCertificateConfig: js.UndefOr[ClientCertificateConfig] = js.undefined
  
  /** [Output only] Base64-encoded private key used by clients to authenticate to the cluster endpoint. */
  var clientKey: js.UndefOr[String] = js.undefined
  
  /** [Output only] Base64-encoded public certificate that is the root of trust for the cluster. */
  var clusterCaCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is
    * provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list
    * of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or
    * setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended
    * authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
    */
  var username: js.UndefOr[String] = js.undefined
}
object MasterAuth {
  
  inline def apply(): MasterAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MasterAuth] (val x: Self) extends AnyVal {
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateConfig(value: ClientCertificateConfig): Self = StObject.set(x, "clientCertificateConfig", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateConfigUndefined: Self = StObject.set(x, "clientCertificateConfig", js.undefined)
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setClusterCaCertificate(value: String): Self = StObject.set(x, "clusterCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setClusterCaCertificateUndefined: Self = StObject.set(x, "clusterCaCertificate", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

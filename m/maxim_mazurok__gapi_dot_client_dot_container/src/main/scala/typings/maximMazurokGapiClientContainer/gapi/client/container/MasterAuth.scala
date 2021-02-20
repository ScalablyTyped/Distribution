package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterAuth extends StObject {
  
  /** [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster endpoint. */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /** Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued. */
  var clientCertificateConfig: js.UndefOr[ClientCertificateConfig] = js.native
  
  /** [Output only] Base64-encoded private key used by clients to authenticate to the cluster endpoint. */
  var clientKey: js.UndefOr[String] = js.native
  
  /** [Output only] Base64-encoded public certificate that is the root of trust for the cluster. */
  var clusterCaCertificate: js.UndefOr[String] = js.native
  
  /**
    * The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is
    * provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list
    * of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or
    * setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended
    * authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
    */
  var username: js.UndefOr[String] = js.native
}
object MasterAuth {
  
  @scala.inline
  def apply(): MasterAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuth]
  }
  
  @scala.inline
  implicit class MasterAuthMutableBuilder[Self <: MasterAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateConfig(value: ClientCertificateConfig): Self = StObject.set(x, "clientCertificateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateConfigUndefined: Self = StObject.set(x, "clientCertificateConfig", js.undefined)
    
    @scala.inline
    def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    @scala.inline
    def setClusterCaCertificate(value: String): Self = StObject.set(x, "clusterCaCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCaCertificateUndefined: Self = StObject.set(x, "clusterCaCertificate", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

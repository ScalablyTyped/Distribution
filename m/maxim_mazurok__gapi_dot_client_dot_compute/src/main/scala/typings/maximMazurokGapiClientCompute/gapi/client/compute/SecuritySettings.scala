package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySettings extends StObject {
  
  /**
    * Optional. A URL referring to a networksecurity.ClientTlsPolicy resource that describes how clients should authenticate with this service's backends.
    * clientTlsPolicy only applies to a global BackendService with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
    * If left blank, communications are not encrypted.
    * Note: This field currently has no impact.
    */
  var clientTlsPolicy: js.UndefOr[String] = js.native
  
  /**
    * Optional. A list of Subject Alternative Names (SANs) that the client verifies during a mutual TLS handshake with an server/endpoint for this BackendService. When the server presents
    * its X.509 certificate to the client, the client inspects the certificate's subjectAltName field. If the field contains one of the specified values, the communication continues.
    * Otherwise, it fails. This additional check enables the client to verify that the server is authorized to run the requested service.
    * Note that the contents of the server certificate's subjectAltName field are configured by the Public Key Infrastructure which provisions server identities.
    * Only applies to a global BackendService with loadBalancingScheme set to INTERNAL_SELF_MANAGED. Only applies when BackendService has an attached clientTlsPolicy with
    * clientCertificate (mTLS mode).
    * Note: This field currently has no impact.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.native
}
object SecuritySettings {
  
  @scala.inline
  def apply(): SecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySettings]
  }
  
  @scala.inline
  implicit class SecuritySettingsMutableBuilder[Self <: SecuritySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientTlsPolicy(value: String): Self = StObject.set(x, "clientTlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTlsPolicyUndefined: Self = StObject.set(x, "clientTlsPolicy", js.undefined)
    
    @scala.inline
    def setSubjectAltNames(value: js.Array[String]): Self = StObject.set(x, "subjectAltNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAltNamesUndefined: Self = StObject.set(x, "subjectAltNames", js.undefined)
    
    @scala.inline
    def setSubjectAltNamesVarargs(value: String*): Self = StObject.set(x, "subjectAltNames", js.Array(value :_*))
  }
}

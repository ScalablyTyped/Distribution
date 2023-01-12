package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectCredentialsRequest extends StObject {
  
  /** Required. The cluster UUID. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The encrypted credentials being injected in to the cluster.The client is responsible for encrypting the credentials in a way that is supported by the cluster.A wrapped
    * value is used here so that the actual contents of the encrypted credentials are not written to audit logs.
    */
  var credentialsCiphertext: js.UndefOr[String] = js.undefined
}
object InjectCredentialsRequest {
  
  inline def apply(): InjectCredentialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectCredentialsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InjectCredentialsRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setCredentialsCiphertext(value: String): Self = StObject.set(x, "credentialsCiphertext", value.asInstanceOf[js.Any])
    
    inline def setCredentialsCiphertextUndefined: Self = StObject.set(x, "credentialsCiphertext", js.undefined)
  }
}

package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInjectCredentialsRequest extends StObject {
  
  /**
    * Required. The cluster UUID.
    */
  var clusterUuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The encrypted credentials being injected in to the cluster.The client is responsible for encrypting the credentials in a way that is supported by the cluster.A wrapped value is used here so that the actual contents of the encrypted credentials are not written to audit logs.
    */
  var credentialsCiphertext: js.UndefOr[String | Null] = js.undefined
}
object SchemaInjectCredentialsRequest {
  
  inline def apply(): SchemaInjectCredentialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInjectCredentialsRequest]
  }
  
  extension [Self <: SchemaInjectCredentialsRequest](x: Self) {
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidNull: Self = StObject.set(x, "clusterUuid", null)
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setCredentialsCiphertext(value: String): Self = StObject.set(x, "credentialsCiphertext", value.asInstanceOf[js.Any])
    
    inline def setCredentialsCiphertextNull: Self = StObject.set(x, "credentialsCiphertext", null)
    
    inline def setCredentialsCiphertextUndefined: Self = StObject.set(x, "credentialsCiphertext", js.undefined)
  }
}

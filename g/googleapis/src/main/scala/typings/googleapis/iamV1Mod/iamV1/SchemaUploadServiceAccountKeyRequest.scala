package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadServiceAccountKeyRequest extends StObject {
  
  /**
    * The public key to associate with the service account. Must be an RSA public key that is wrapped in an X.509 v3 certificate. Include the first line, `-----BEGIN CERTIFICATE-----`, and the last line, `-----END CERTIFICATE-----`.
    */
  var publicKeyData: js.UndefOr[String | Null] = js.undefined
}
object SchemaUploadServiceAccountKeyRequest {
  
  inline def apply(): SchemaUploadServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadServiceAccountKeyRequest]
  }
  
  extension [Self <: SchemaUploadServiceAccountKeyRequest](x: Self) {
    
    inline def setPublicKeyData(value: String): Self = StObject.set(x, "publicKeyData", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyDataNull: Self = StObject.set(x, "publicKeyData", null)
    
    inline def setPublicKeyDataUndefined: Self = StObject.set(x, "publicKeyData", js.undefined)
  }
}

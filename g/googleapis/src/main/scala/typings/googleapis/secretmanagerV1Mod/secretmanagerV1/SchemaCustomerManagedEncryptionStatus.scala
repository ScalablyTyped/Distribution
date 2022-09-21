package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerManagedEncryptionStatus extends StObject {
  
  /**
    * Required. The resource name of the Cloud KMS CryptoKeyVersion used to encrypt the secret payload, in the following format: `projects/x/locations/x/keyRings/x/cryptoKeys/x/versions/x`.
    */
  var kmsKeyVersionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerManagedEncryptionStatus {
  
  inline def apply(): SchemaCustomerManagedEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerManagedEncryptionStatus]
  }
  
  extension [Self <: SchemaCustomerManagedEncryptionStatus](x: Self) {
    
    inline def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNameNull: Self = StObject.set(x, "kmsKeyVersionName", null)
    
    inline def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
  }
}

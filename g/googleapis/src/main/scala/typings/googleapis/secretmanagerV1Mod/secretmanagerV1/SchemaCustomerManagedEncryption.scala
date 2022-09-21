package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerManagedEncryption extends StObject {
  
  /**
    * Required. The resource name of the Cloud KMS CryptoKey used to encrypt secret payloads. For secrets using the UserManaged replication policy type, Cloud KMS CryptoKeys must reside in the same location as the replica location. For secrets using the Automatic replication policy type, Cloud KMS CryptoKeys must reside in `global`. The expected format is `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerManagedEncryption {
  
  inline def apply(): SchemaCustomerManagedEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerManagedEncryption]
  }
  
  extension [Self <: SchemaCustomerManagedEncryption](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}

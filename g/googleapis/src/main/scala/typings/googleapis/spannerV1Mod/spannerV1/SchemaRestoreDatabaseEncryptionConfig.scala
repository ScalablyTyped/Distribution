package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreDatabaseEncryptionConfig extends StObject {
  
  /**
    * Required. The encryption type of the restored database.
    */
  var encryptionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The Cloud KMS key that will be used to encrypt/decrypt the restored database. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values are of the form `projects//locations//keyRings//cryptoKeys/`.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreDatabaseEncryptionConfig {
  
  inline def apply(): SchemaRestoreDatabaseEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreDatabaseEncryptionConfig]
  }
  
  extension [Self <: SchemaRestoreDatabaseEncryptionConfig](x: Self) {
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeNull: Self = StObject.set(x, "encryptionType", null)
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}

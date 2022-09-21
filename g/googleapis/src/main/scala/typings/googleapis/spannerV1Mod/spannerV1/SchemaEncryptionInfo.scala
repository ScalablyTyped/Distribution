package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptionInfo extends StObject {
  
  /**
    * Output only. If present, the status of a recent encrypt/decrypt call on underlying data for this database or backup. Regardless of status, data is always encrypted at rest.
    */
  var encryptionStatus: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The type of encryption.
    */
  var encryptionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A Cloud KMS key version that is being used to protect the database or backup.
    */
  var kmsKeyVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaEncryptionInfo {
  
  inline def apply(): SchemaEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionInfo]
  }
  
  extension [Self <: SchemaEncryptionInfo](x: Self) {
    
    inline def setEncryptionStatus(value: SchemaStatus): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeNull: Self = StObject.set(x, "encryptionType", null)
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyVersion(value: String): Self = StObject.set(x, "kmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNull: Self = StObject.set(x, "kmsKeyVersion", null)
    
    inline def setKmsKeyVersionUndefined: Self = StObject.set(x, "kmsKeyVersion", js.undefined)
  }
}

package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1EncryptionConfig extends StObject {
  
  /**
    * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a training job. It has the following format: `projects/{PROJECT_ID\}/locations/{REGION\}/keyRings/{KEY_RING_NAME\}/cryptoKeys/{KEY_NAME\}`
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1EncryptionConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1EncryptionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1EncryptionConfig](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}

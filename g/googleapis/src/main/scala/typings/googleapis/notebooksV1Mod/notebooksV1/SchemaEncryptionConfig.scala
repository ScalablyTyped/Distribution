package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptionConfig extends StObject {
  
  /**
    * The Cloud KMS resource identifier of the customer-managed encryption key used to protect a resource, such as a disks. It has the following format: `projects/{PROJECT_ID\}/locations/{REGION\}/keyRings/{KEY_RING_NAME\}/cryptoKeys/{KEY_NAME\}`
    */
  var kmsKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaEncryptionConfig {
  
  inline def apply(): SchemaEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfig]
  }
  
  extension [Self <: SchemaEncryptionConfig](x: Self) {
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNull: Self = StObject.set(x, "kmsKey", null)
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
  }
}

package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncryptionKey extends StObject {
  
  /**
    * Google Cloud KMS encryption key. Format: `projects/x/locations/x/keyRings/x/cryptoKeys/x`
    */
  var gcpKmsEncryptionKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaEncryptionKey {
  
  inline def apply(): SchemaEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionKey]
  }
  
  extension [Self <: SchemaEncryptionKey](x: Self) {
    
    inline def setGcpKmsEncryptionKey(value: String): Self = StObject.set(x, "gcpKmsEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setGcpKmsEncryptionKeyNull: Self = StObject.set(x, "gcpKmsEncryptionKey", null)
    
    inline def setGcpKmsEncryptionKeyUndefined: Self = StObject.set(x, "gcpKmsEncryptionKey", js.undefined)
  }
}

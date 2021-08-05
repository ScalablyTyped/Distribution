package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSignBlobResponse extends StObject {
  
  /**
    * The ID of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.undefined
  
  /**
    * The signed blob.
    */
  var signedBlob: js.UndefOr[String] = js.undefined
}
object SchemaSignBlobResponse {
  
  inline def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  
  extension [Self <: SchemaSignBlobResponse](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setSignedBlob(value: String): Self = StObject.set(x, "signedBlob", value.asInstanceOf[js.Any])
    
    inline def setSignedBlobUndefined: Self = StObject.set(x, "signedBlob", js.undefined)
  }
}

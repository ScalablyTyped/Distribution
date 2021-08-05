package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account sign blob response.
  */
trait SchemaSignBlobResponse extends StObject {
  
  /**
    * The id of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.undefined
  
  /**
    * The signed blob.
    */
  var signature: js.UndefOr[String] = js.undefined
}
object SchemaSignBlobResponse {
  
  inline def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  
  extension [Self <: SchemaSignBlobResponse](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}

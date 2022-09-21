package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSignature extends StObject {
  
  /**
    * Optional. An image of the user's signature.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Optional. Metadata associated with the user's signature. For example, the user's name or the user's title.
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Timestamp of the signature.
    */
  var signatureTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User's UUID provided by the client.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSignature {
  
  inline def apply(): SchemaSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignature]
  }
  
  extension [Self <: SchemaSignature](x: Self) {
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSignatureTime(value: String): Self = StObject.set(x, "signatureTime", value.asInstanceOf[js.Any])
    
    inline def setSignatureTimeNull: Self = StObject.set(x, "signatureTime", null)
    
    inline def setSignatureTimeUndefined: Self = StObject.set(x, "signatureTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

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
  
  @scala.inline
  def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  
  @scala.inline
  implicit class SchemaSignBlobResponseMutableBuilder[Self <: SchemaSignBlobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setSignedBlob(value: String): Self = StObject.set(x, "signedBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedBlobUndefined: Self = StObject.set(x, "signedBlob", js.undefined)
  }
}

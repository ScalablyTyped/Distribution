package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSignBlobResponse extends js.Object {
  
  /**
    * The ID of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  
  /**
    * The signed blob.
    */
  var signedBlob: js.UndefOr[String] = js.native
}
object SchemaSignBlobResponse {
  
  @scala.inline
  def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  
  @scala.inline
  implicit class SchemaSignBlobResponseOps[Self <: SchemaSignBlobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setSignedBlob(value: String): Self = this.set("signedBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedBlob: Self = this.set("signedBlob", js.undefined)
  }
}

package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account key create request.
  */
@js.native
trait SchemaCreateServiceAccountKeyRequest extends js.Object {
  
  /**
    * Which type of key and algorithm to use for the key. The default is
    * currently a 2K RSA key.  However this may change in the future.
    */
  var keyAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * The output format of the private key. The default value is
    * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
    * format.
    */
  var privateKeyType: js.UndefOr[String] = js.native
}
object SchemaCreateServiceAccountKeyRequest {
  
  @scala.inline
  def apply(): SchemaCreateServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateServiceAccountKeyRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateServiceAccountKeyRequestOps[Self <: SchemaCreateServiceAccountKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setKeyAlgorithm(value: String): Self = this.set("keyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("keyAlgorithm", js.undefined)
    
    @scala.inline
    def setPrivateKeyType(value: String): Self = this.set("privateKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeyType: Self = this.set("privateKeyType", js.undefined)
  }
}

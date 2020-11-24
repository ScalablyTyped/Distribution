package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds encrypted information that is only decrypted and stored in RAM by the
  * worker VM when running the pipeline.
  */
@js.native
trait SchemaSecret extends js.Object {
  
  /**
    * The value of the cipherText response from the `encrypt` method. This
    * field is intentionally unaudited.
    */
  var cipherText: js.UndefOr[String] = js.native
  
  /**
    * The name of the Cloud KMS key that will be used to decrypt the secret
    * value. The VM service account must have the required permissions and
    * authentication scopes to invoke the `decrypt` method on the specified
    * key.
    */
  var keyName: js.UndefOr[String] = js.native
}
object SchemaSecret {
  
  @scala.inline
  def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  @scala.inline
  implicit class SchemaSecretOps[Self <: SchemaSecret] (val x: Self) extends AnyVal {
    
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
    def setCipherText(value: String): Self = this.set("cipherText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipherText: Self = this.set("cipherText", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
  }
}

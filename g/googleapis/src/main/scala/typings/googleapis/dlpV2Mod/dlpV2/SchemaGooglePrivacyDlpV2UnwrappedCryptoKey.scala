package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Using raw keys is prone to security risks due to accidentally leaking the
  * key. Choose another type of key if possible.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UnwrappedCryptoKey extends js.Object {
  
  /**
    * A 128/192/256 bit key. [required]
    */
  var key: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2UnwrappedCryptoKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UnwrappedCryptoKeyOps[Self <: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}

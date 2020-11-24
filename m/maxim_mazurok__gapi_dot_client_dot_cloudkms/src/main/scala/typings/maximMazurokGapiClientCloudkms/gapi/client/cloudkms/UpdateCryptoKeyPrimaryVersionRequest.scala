package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  
  /** Required. The id of the child CryptoKeyVersion to use as primary. */
  var cryptoKeyVersionId: js.UndefOr[String] = js.native
}
object UpdateCryptoKeyPrimaryVersionRequest {
  
  @scala.inline
  def apply(): UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCryptoKeyPrimaryVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateCryptoKeyPrimaryVersionRequestOps[Self <: UpdateCryptoKeyPrimaryVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setCryptoKeyVersionId(value: String): Self = this.set("cryptoKeyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKeyVersionId: Self = this.set("cryptoKeyVersionId", js.undefined)
  }
}

package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalProtectionLevelOptions extends js.Object {
  
  /** The URI for an external resource that this CryptoKeyVersion represents. */
  var externalKeyUri: js.UndefOr[String] = js.native
}
object ExternalProtectionLevelOptions {
  
  @scala.inline
  def apply(): ExternalProtectionLevelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProtectionLevelOptions]
  }
  
  @scala.inline
  implicit class ExternalProtectionLevelOptionsOps[Self <: ExternalProtectionLevelOptions] (val x: Self) extends AnyVal {
    
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
    def setExternalKeyUri(value: String): Self = this.set("externalKeyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalKeyUri: Self = this.set("externalKeyUri", js.undefined)
  }
}

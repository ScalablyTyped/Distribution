package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationMetadata extends js.Object {
  
  /** Indicates whether CryptoKeys with protection_level EXTERNAL can be created in this location. */
  var ekmAvailable: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether CryptoKeys with protection_level HSM can be created in this location. */
  var hsmAvailable: js.UndefOr[Boolean] = js.native
}
object LocationMetadata {
  
  @scala.inline
  def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  @scala.inline
  implicit class LocationMetadataOps[Self <: LocationMetadata] (val x: Self) extends AnyVal {
    
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
    def setEkmAvailable(value: Boolean): Self = this.set("ekmAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEkmAvailable: Self = this.set("ekmAvailable", js.undefined)
    
    @scala.inline
    def setHsmAvailable(value: Boolean): Self = this.set("hsmAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmAvailable: Self = this.set("hsmAvailable", js.undefined)
  }
}

package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseResourceCommitment extends js.Object {
  
  /** The number of licenses purchased. */
  var amount: js.UndefOr[String] = js.native
  
  /** Specifies the core range of the instance for which this license applies. */
  var coresPerLicense: js.UndefOr[String] = js.native
  
  /** Any applicable license URI. */
  var license: js.UndefOr[String] = js.native
}
object LicenseResourceCommitment {
  
  @scala.inline
  def apply(): LicenseResourceCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseResourceCommitment]
  }
  
  @scala.inline
  implicit class LicenseResourceCommitmentOps[Self <: LicenseResourceCommitment] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setCoresPerLicense(value: String): Self = this.set("coresPerLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoresPerLicense: Self = this.set("coresPerLicense", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
  }
}

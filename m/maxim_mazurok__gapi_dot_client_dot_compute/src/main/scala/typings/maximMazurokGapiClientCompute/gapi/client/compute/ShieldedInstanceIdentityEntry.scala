package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceIdentityEntry extends js.Object {
  
  /** A PEM-encoded X.509 certificate. This field can be empty. */
  var ekCert: js.UndefOr[String] = js.native
  
  /** A PEM-encoded public key. */
  var ekPub: js.UndefOr[String] = js.native
}
object ShieldedInstanceIdentityEntry {
  
  @scala.inline
  def apply(): ShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceIdentityEntry]
  }
  
  @scala.inline
  implicit class ShieldedInstanceIdentityEntryOps[Self <: ShieldedInstanceIdentityEntry] (val x: Self) extends AnyVal {
    
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
    def setEkCert(value: String): Self = this.set("ekCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEkCert: Self = this.set("ekCert", js.undefined)
    
    @scala.inline
    def setEkPub(value: String): Self = this.set("ekPub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEkPub: Self = this.set("ekPub", js.undefined)
  }
}

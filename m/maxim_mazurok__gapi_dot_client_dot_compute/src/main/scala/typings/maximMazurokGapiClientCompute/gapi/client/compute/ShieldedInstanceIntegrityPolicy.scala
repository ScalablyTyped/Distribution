package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceIntegrityPolicy extends js.Object {
  
  /** Updates the integrity policy baseline using the measurements from the VM instance's most recent boot. */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}
object ShieldedInstanceIntegrityPolicy {
  
  @scala.inline
  def apply(): ShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceIntegrityPolicy]
  }
  
  @scala.inline
  implicit class ShieldedInstanceIntegrityPolicyOps[Self <: ShieldedInstanceIntegrityPolicy] (val x: Self) extends AnyVal {
    
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
    def setUpdateAutoLearnPolicy(value: Boolean): Self = this.set("updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAutoLearnPolicy: Self = this.set("updateAutoLearnPolicy", js.undefined)
  }
}

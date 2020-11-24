package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseResourceRequirements extends js.Object {
  
  /** Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start. */
  var minGuestCpuCount: js.UndefOr[Double] = js.native
  
  /** Minimum memory required to use the Instance. Enforced at Instance creation and Instance start. */
  var minMemoryMb: js.UndefOr[Double] = js.native
}
object LicenseResourceRequirements {
  
  @scala.inline
  def apply(): LicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseResourceRequirements]
  }
  
  @scala.inline
  implicit class LicenseResourceRequirementsOps[Self <: LicenseResourceRequirements] (val x: Self) extends AnyVal {
    
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
    def setMinGuestCpuCount(value: Double): Self = this.set("minGuestCpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinGuestCpuCount: Self = this.set("minGuestCpuCount", js.undefined)
    
    @scala.inline
    def setMinMemoryMb(value: Double): Self = this.set("minMemoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMemoryMb: Self = this.set("minMemoryMb", js.undefined)
  }
}

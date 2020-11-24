package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageIssue extends js.Object {
  
  /** Required. The location of the vulnerability. */
  var affectedLocation: js.UndefOr[VulnerabilityLocation] = js.native
  
  /** The location of the available fix for vulnerability. */
  var fixedLocation: js.UndefOr[VulnerabilityLocation] = js.native
  
  /** Deprecated, use Details.effective_severity instead The severity (e.g., distro assigned severity) for this vulnerability. */
  var severityName: js.UndefOr[String] = js.native
}
object PackageIssue {
  
  @scala.inline
  def apply(): PackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageIssue]
  }
  
  @scala.inline
  implicit class PackageIssueOps[Self <: PackageIssue] (val x: Self) extends AnyVal {
    
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
    def setAffectedLocation(value: VulnerabilityLocation): Self = this.set("affectedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffectedLocation: Self = this.set("affectedLocation", js.undefined)
    
    @scala.inline
    def setFixedLocation(value: VulnerabilityLocation): Self = this.set("fixedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedLocation: Self = this.set("fixedLocation", js.undefined)
    
    @scala.inline
    def setSeverityName(value: String): Self = this.set("severityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityName: Self = this.set("severityName", js.undefined)
  }
}

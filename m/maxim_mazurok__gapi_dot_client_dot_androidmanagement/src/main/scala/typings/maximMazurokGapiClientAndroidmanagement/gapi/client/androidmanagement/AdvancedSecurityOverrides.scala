package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSecurityOverrides extends js.Object {
  
  /**
    * Controls Common Criteria Mode—security standards defined in the Common Criteria for Information Technology Security Evaluation (https://www.commoncriteriaportal.org/) (CC). Enabling
    * Common Criteria Mode increases certain security components on a device, including AES-GCM encryption of Bluetooth Long Term Keys, and Wi-Fi configuration stores.Warning: Common
    * Criteria Mode enforces a strict security model typically only required for IT products used in national security systems and other highly sensitive organizations. Standard device
    * use may be affected. Only enabled if required.
    */
  var commonCriteriaMode: js.UndefOr[String] = js.native
  
  /** The policy for untrusted apps (apps from unknown sources) enforced on the device. Replaces install_unknown_sources_allowed (deprecated). */
  var untrustedAppsPolicy: js.UndefOr[String] = js.native
}
object AdvancedSecurityOverrides {
  
  @scala.inline
  def apply(): AdvancedSecurityOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOverrides]
  }
  
  @scala.inline
  implicit class AdvancedSecurityOverridesOps[Self <: AdvancedSecurityOverrides] (val x: Self) extends AnyVal {
    
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
    def setCommonCriteriaMode(value: String): Self = this.set("commonCriteriaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonCriteriaMode: Self = this.set("commonCriteriaMode", js.undefined)
    
    @scala.inline
    def setUntrustedAppsPolicy(value: String): Self = this.set("untrustedAppsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntrustedAppsPolicy: Self = this.set("untrustedAppsPolicy", js.undefined)
  }
}

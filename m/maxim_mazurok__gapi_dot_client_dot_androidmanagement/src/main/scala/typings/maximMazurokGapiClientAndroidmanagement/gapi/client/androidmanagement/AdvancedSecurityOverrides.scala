package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOverrides extends StObject {
  
  /**
    * Controls Common Criteria Mode—security standards defined in the Common Criteria for Information Technology Security Evaluation (https://www.commoncriteriaportal.org/) (CC). Enabling
    * Common Criteria Mode increases certain security components on a device, including AES-GCM encryption of Bluetooth Long Term Keys, and Wi-Fi configuration stores.Warning: Common
    * Criteria Mode enforces a strict security model typically only required for IT products used in national security systems and other highly sensitive organizations. Standard device
    * use may be affected. Only enabled if required.
    */
  var commonCriteriaMode: js.UndefOr[String] = js.undefined
  
  /** The policy for untrusted apps (apps from unknown sources) enforced on the device. Replaces install_unknown_sources_allowed (deprecated). */
  var untrustedAppsPolicy: js.UndefOr[String] = js.undefined
}
object AdvancedSecurityOverrides {
  
  @scala.inline
  def apply(): AdvancedSecurityOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOverrides]
  }
  
  @scala.inline
  implicit class AdvancedSecurityOverridesMutableBuilder[Self <: AdvancedSecurityOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonCriteriaMode(value: String): Self = StObject.set(x, "commonCriteriaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCriteriaModeUndefined: Self = StObject.set(x, "commonCriteriaMode", js.undefined)
    
    @scala.inline
    def setUntrustedAppsPolicy(value: String): Self = StObject.set(x, "untrustedAppsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntrustedAppsPolicyUndefined: Self = StObject.set(x, "untrustedAppsPolicy", js.undefined)
  }
}

package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityCenterSettings extends StObject {
  
  /**
    * The resource name of the project to send logs to. This project must be part of the organization this resource resides in. The format is `projects/{project_id\}`. An empty value disables logging. This value is only referenced by services that support log sink. Please refer to the documentation for an updated list of compatible services. This may only be specified for organization level onboarding.
    */
  var logSinkProject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the SecurityCenterSettings. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of when the customer organization was onboarded to SCC.
    */
  var onboardingTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The organization level service account to be used for security center components.
    */
  var orgServiceAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityCenterSettings {
  
  inline def apply(): SchemaSecurityCenterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityCenterSettings]
  }
  
  extension [Self <: SchemaSecurityCenterSettings](x: Self) {
    
    inline def setLogSinkProject(value: String): Self = StObject.set(x, "logSinkProject", value.asInstanceOf[js.Any])
    
    inline def setLogSinkProjectNull: Self = StObject.set(x, "logSinkProject", null)
    
    inline def setLogSinkProjectUndefined: Self = StObject.set(x, "logSinkProject", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnboardingTime(value: String): Self = StObject.set(x, "onboardingTime", value.asInstanceOf[js.Any])
    
    inline def setOnboardingTimeNull: Self = StObject.set(x, "onboardingTime", null)
    
    inline def setOnboardingTimeUndefined: Self = StObject.set(x, "onboardingTime", js.undefined)
    
    inline def setOrgServiceAccount(value: String): Self = StObject.set(x, "orgServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setOrgServiceAccountNull: Self = StObject.set(x, "orgServiceAccount", null)
    
    inline def setOrgServiceAccountUndefined: Self = StObject.set(x, "orgServiceAccount", js.undefined)
  }
}

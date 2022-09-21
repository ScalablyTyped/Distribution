package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetonboardingstate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the OnboardingState to retrieve. Formats: * organizations/{organization\}/onboardingState * folders/{folder\}/onboardingState * projects/{project\}/onboardingState
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetonboardingstate {
  
  inline def apply(): ParamsResourceOrganizationsGetonboardingstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetonboardingstate]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetonboardingstate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

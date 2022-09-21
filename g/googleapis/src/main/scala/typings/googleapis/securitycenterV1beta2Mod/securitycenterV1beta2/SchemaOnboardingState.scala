package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnboardingState extends StObject {
  
  /**
    * The resource name of the OnboardingState. Format: organizations/{organization\}/onboardingState Format: folders/{folder\}/onboardingState Format: projects/{project\}/onboardingState
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the level a given organization, folder, or project is onboarded with SCC. If the resource wasn't onboarded, NOT_FOUND would have been thrown.
    */
  var onboardingLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaOnboardingState {
  
  inline def apply(): SchemaOnboardingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnboardingState]
  }
  
  extension [Self <: SchemaOnboardingState](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnboardingLevel(value: String): Self = StObject.set(x, "onboardingLevel", value.asInstanceOf[js.Any])
    
    inline def setOnboardingLevelNull: Self = StObject.set(x, "onboardingLevel", null)
    
    inline def setOnboardingLevelUndefined: Self = StObject.set(x, "onboardingLevel", js.undefined)
  }
}

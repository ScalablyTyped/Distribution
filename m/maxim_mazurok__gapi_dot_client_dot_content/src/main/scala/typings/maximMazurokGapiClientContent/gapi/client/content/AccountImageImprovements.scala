package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountImageImprovements extends StObject {
  
  /**
    * Determines how the images should be automatically updated. If this field is not present, then the settings will be deleted. If there are no settings for subaccount, they are
    * inherited from aggregator.
    */
  var accountImageImprovementsSettings: js.UndefOr[AccountImageImprovementsSettings] = js.undefined
  
  /**
    * Output only. The effective value of allow_automatic_image_improvements. If account_image_improvements_settings is present, then this value is the same. Otherwise, it represents the
    * inherited value of the parent account. Read-only.
    */
  var effectiveAllowAutomaticImageImprovements: js.UndefOr[Boolean] = js.undefined
}
object AccountImageImprovements {
  
  inline def apply(): AccountImageImprovements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountImageImprovements]
  }
  
  extension [Self <: AccountImageImprovements](x: Self) {
    
    inline def setAccountImageImprovementsSettings(value: AccountImageImprovementsSettings): Self = StObject.set(x, "accountImageImprovementsSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountImageImprovementsSettingsUndefined: Self = StObject.set(x, "accountImageImprovementsSettings", js.undefined)
    
    inline def setEffectiveAllowAutomaticImageImprovements(value: Boolean): Self = StObject.set(x, "effectiveAllowAutomaticImageImprovements", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowAutomaticImageImprovementsUndefined: Self = StObject.set(x, "effectiveAllowAutomaticImageImprovements", js.undefined)
  }
}

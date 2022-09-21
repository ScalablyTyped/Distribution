package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountImageImprovements extends StObject {
  
  /**
    * Determines how the images should be automatically updated. If this field is not present, then the settings will be deleted. If there are no settings for subaccount, they are inherited from aggregator.
    */
  var accountImageImprovementsSettings: js.UndefOr[SchemaAccountImageImprovementsSettings] = js.undefined
  
  /**
    * Output only. The effective value of allow_automatic_image_improvements. If account_image_improvements_settings is present, then this value is the same. Otherwise, it represents the inherited value of the parent account. Read-only.
    */
  var effectiveAllowAutomaticImageImprovements: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountImageImprovements {
  
  inline def apply(): SchemaAccountImageImprovements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountImageImprovements]
  }
  
  extension [Self <: SchemaAccountImageImprovements](x: Self) {
    
    inline def setAccountImageImprovementsSettings(value: SchemaAccountImageImprovementsSettings): Self = StObject.set(x, "accountImageImprovementsSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountImageImprovementsSettingsUndefined: Self = StObject.set(x, "accountImageImprovementsSettings", js.undefined)
    
    inline def setEffectiveAllowAutomaticImageImprovements(value: Boolean): Self = StObject.set(x, "effectiveAllowAutomaticImageImprovements", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAllowAutomaticImageImprovementsNull: Self = StObject.set(x, "effectiveAllowAutomaticImageImprovements", null)
    
    inline def setEffectiveAllowAutomaticImageImprovementsUndefined: Self = StObject.set(x, "effectiveAllowAutomaticImageImprovements", js.undefined)
  }
}

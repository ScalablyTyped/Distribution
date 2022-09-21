package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirstAndThirdPartyAudienceGroup extends StObject {
  
  /**
    * Required. All first and third party audience targeting settings in first and third party audience group. Repeated settings with same id are not allowed.
    */
  var settings: js.UndefOr[js.Array[SchemaFirstAndThirdPartyAudienceTargetingSetting]] = js.undefined
}
object SchemaFirstAndThirdPartyAudienceGroup {
  
  inline def apply(): SchemaFirstAndThirdPartyAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstAndThirdPartyAudienceGroup]
  }
  
  extension [Self <: SchemaFirstAndThirdPartyAudienceGroup](x: Self) {
    
    inline def setSettings(value: js.Array[SchemaFirstAndThirdPartyAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SchemaFirstAndThirdPartyAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}

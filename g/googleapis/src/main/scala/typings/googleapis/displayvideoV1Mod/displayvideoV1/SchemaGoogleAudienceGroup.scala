package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAudienceGroup extends StObject {
  
  /**
    * Required. All Google audience targeting settings in Google audience group. Repeated settings with same id will be ignored.
    */
  var settings: js.UndefOr[js.Array[SchemaGoogleAudienceTargetingSetting]] = js.undefined
}
object SchemaGoogleAudienceGroup {
  
  inline def apply(): SchemaGoogleAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAudienceGroup]
  }
  
  extension [Self <: SchemaGoogleAudienceGroup](x: Self) {
    
    inline def setSettings(value: js.Array[SchemaGoogleAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SchemaGoogleAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}

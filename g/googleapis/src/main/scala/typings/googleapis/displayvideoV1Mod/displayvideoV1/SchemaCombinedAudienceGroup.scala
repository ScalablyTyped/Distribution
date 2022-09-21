package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCombinedAudienceGroup extends StObject {
  
  /**
    * Required. All combined audience targeting settings in combined audience group. Repeated settings with same id will be ignored. The number of combined audience settings should be no more than five, error will be thrown otherwise.
    */
  var settings: js.UndefOr[js.Array[SchemaCombinedAudienceTargetingSetting]] = js.undefined
}
object SchemaCombinedAudienceGroup {
  
  inline def apply(): SchemaCombinedAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCombinedAudienceGroup]
  }
  
  extension [Self <: SchemaCombinedAudienceGroup](x: Self) {
    
    inline def setSettings(value: js.Array[SchemaCombinedAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SchemaCombinedAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}

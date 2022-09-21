package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCombinedAudienceTargetingSetting extends StObject {
  
  /**
    * Required. Combined audience id of combined audience targeting setting. This id is combined_audience_id.
    */
  var combinedAudienceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCombinedAudienceTargetingSetting {
  
  inline def apply(): SchemaCombinedAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCombinedAudienceTargetingSetting]
  }
  
  extension [Self <: SchemaCombinedAudienceTargetingSetting](x: Self) {
    
    inline def setCombinedAudienceId(value: String): Self = StObject.set(x, "combinedAudienceId", value.asInstanceOf[js.Any])
    
    inline def setCombinedAudienceIdNull: Self = StObject.set(x, "combinedAudienceId", null)
    
    inline def setCombinedAudienceIdUndefined: Self = StObject.set(x, "combinedAudienceId", js.undefined)
  }
}

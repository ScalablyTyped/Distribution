package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAudienceTargetingSetting extends StObject {
  
  /**
    * Required. Google audience id of the Google audience targeting setting. This id is google_audience_id.
    */
  var googleAudienceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAudienceTargetingSetting {
  
  inline def apply(): SchemaGoogleAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAudienceTargetingSetting]
  }
  
  extension [Self <: SchemaGoogleAudienceTargetingSetting](x: Self) {
    
    inline def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceIdNull: Self = StObject.set(x, "googleAudienceId", null)
    
    inline def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
  }
}

package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirstAndThirdPartyAudienceTargetingSetting extends StObject {
  
  /**
    * Required. First and third party audience id of the first and third party audience targeting setting. This id is first_and_third_party_audience_id.
    */
  var firstAndThirdPartyAudienceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The recency of the first and third party audience targeting setting. Only applicable to first party audiences, otherwise will be ignored. For more info, refer to https://support.google.com/displayvideo/answer/2949947#recency When unspecified, no recency limit will be used.
    */
  var recency: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirstAndThirdPartyAudienceTargetingSetting {
  
  inline def apply(): SchemaFirstAndThirdPartyAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirstAndThirdPartyAudienceTargetingSetting]
  }
  
  extension [Self <: SchemaFirstAndThirdPartyAudienceTargetingSetting](x: Self) {
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdNull: Self = StObject.set(x, "firstAndThirdPartyAudienceId", null)
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    inline def setRecency(value: String): Self = StObject.set(x, "recency", value.asInstanceOf[js.Any])
    
    inline def setRecencyNull: Self = StObject.set(x, "recency", null)
    
    inline def setRecencyUndefined: Self = StObject.set(x, "recency", js.undefined)
  }
}

package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirstandthirdpartyaudiencesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the owner advertiser of the updated FirstAndThirdPartyAudience.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique ID of the first and third party audience. Assigned by the system.
    */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFirstAndThirdPartyAudience] = js.undefined
  
  /**
    * Required. The mask to control which fields to update. Updates are only supported for the following fields: * `displayName` * `description` * `membershipDurationDays`
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirstandthirdpartyaudiencesPatch {
  
  inline def apply(): ParamsResourceFirstandthirdpartyaudiencesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirstandthirdpartyaudiencesPatch]
  }
  
  extension [Self <: ParamsResourceFirstandthirdpartyaudiencesPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    inline def setRequestBody(value: SchemaFirstAndThirdPartyAudience): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

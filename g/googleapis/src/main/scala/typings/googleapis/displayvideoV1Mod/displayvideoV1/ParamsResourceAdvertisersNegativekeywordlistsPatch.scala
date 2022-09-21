package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersNegativekeywordlistsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the negative keyword list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique ID of the negative keyword list. Assigned by the system.
    */
  var negativeKeywordListId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaNegativeKeywordList] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersNegativekeywordlistsPatch {
  
  inline def apply(): ParamsResourceAdvertisersNegativekeywordlistsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersNegativekeywordlistsPatch]
  }
  
  extension [Self <: ParamsResourceAdvertisersNegativekeywordlistsPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
    
    inline def setRequestBody(value: SchemaNegativeKeywordList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}

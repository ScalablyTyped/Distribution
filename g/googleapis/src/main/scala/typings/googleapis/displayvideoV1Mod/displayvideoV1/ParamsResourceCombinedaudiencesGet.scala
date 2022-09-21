package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCombinedaudiencesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that has access to the fetched combined audience.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the combined audience to fetch.
    */
  var combinedAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that has access to the fetched combined audience.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCombinedaudiencesGet {
  
  inline def apply(): ParamsResourceCombinedaudiencesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCombinedaudiencesGet]
  }
  
  extension [Self <: ParamsResourceCombinedaudiencesGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCombinedAudienceId(value: String): Self = StObject.set(x, "combinedAudienceId", value.asInstanceOf[js.Any])
    
    inline def setCombinedAudienceIdUndefined: Self = StObject.set(x, "combinedAudienceId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}

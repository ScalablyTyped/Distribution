package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersCampaignsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser this campaign belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the campaign to fetch.
    */
  var campaignId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersCampaignsGet {
  
  inline def apply(): ParamsResourceAdvertisersCampaignsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersCampaignsGet]
  }
  
  extension [Self <: ParamsResourceAdvertisersCampaignsGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
  }
}

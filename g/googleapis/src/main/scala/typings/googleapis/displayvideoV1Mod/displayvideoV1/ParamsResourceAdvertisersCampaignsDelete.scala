package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersCampaignsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser this campaign belongs to.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the campaign we need to delete.
    */
  var campaignId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersCampaignsDelete {
  
  inline def apply(): ParamsResourceAdvertisersCampaignsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersCampaignsDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersCampaignsDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
  }
}

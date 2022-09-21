package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersAudit
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser to audit.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The specific fields to return. If no mask is specified, all fields in the response proto will be filled. Valid values are: * usedLineItemsCount * usedInsertionOrdersCount * usedCampaignsCount * channelsCount * negativelyTargetedChannelsCount * negativeKeywordListsCount * adGroupCriteriaCount * campaignCriteriaCount
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersAudit {
  
  inline def apply(): ParamsResourceAdvertisersAudit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersAudit]
  }
  
  extension [Self <: ParamsResourceAdvertisersAudit](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}

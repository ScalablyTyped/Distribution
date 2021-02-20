package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditAdvertiserResponse extends StObject {
  
  /**
    * The number of individual targeting options from the following targeting types that are assigned to a line item under this advertiser. These individual targeting options count
    * towards the limit of 4500000 ad group targeting options per advertiser. Qualifying Targeting types: * Channels, URLs, apps, and collections * Demographic * Google Audiences,
    * including Affinity, Custom Affinity, and In-market audiences * Inventory source * Keyword * Mobile app category * User lists * Video targeting * Viewability
    */
  var adGroupCriteriaCount: js.UndefOr[String] = js.native
  
  /**
    * The number of individual targeting options from the following targeting types that are assigned to a line item under this advertiser. These individual targeting options count
    * towards the limit of 900000 campaign targeting options per advertiser. Qualifying Targeting types: * Position * Browser * Connection speed * Day and time * Device and operating
    * system * Digital content label * Sensitive categories * Environment * Geography, including business chains and proximity * ISP * Language * Third-party verification
    */
  var campaignCriteriaCount: js.UndefOr[String] = js.native
  
  /** The number of channels created under this advertiser. These channels count towards the limit of 1000 channels per advertiser. */
  var channelsCount: js.UndefOr[String] = js.native
  
  /** The number of negative keyword lists created under this advertiser. These negative keyword lists count towards the limit of 20 negative keyword lists per advertiser. */
  var negativeKeywordListsCount: js.UndefOr[String] = js.native
  
  /**
    * The number of negatively targeted channels created under this advertiser. These negatively targeted channels count towards the limit of 5 negatively targeted channels per
    * advertiser.
    */
  var negativelyTargetedChannelsCount: js.UndefOr[String] = js.native
  
  /** The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards the limit of 9999 campaigns per advertiser. */
  var usedCampaignsCount: js.UndefOr[String] = js.native
  
  /** The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion orders count towards the limit of 9999 insertion orders per advertiser. */
  var usedInsertionOrdersCount: js.UndefOr[String] = js.native
  
  /** The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items count towards the limit of 9999 line items per advertiser. */
  var usedLineItemsCount: js.UndefOr[String] = js.native
}
object AuditAdvertiserResponse {
  
  @scala.inline
  def apply(): AuditAdvertiserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditAdvertiserResponse]
  }
  
  @scala.inline
  implicit class AuditAdvertiserResponseMutableBuilder[Self <: AuditAdvertiserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdGroupCriteriaCount(value: String): Self = StObject.set(x, "adGroupCriteriaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdGroupCriteriaCountUndefined: Self = StObject.set(x, "adGroupCriteriaCount", js.undefined)
    
    @scala.inline
    def setCampaignCriteriaCount(value: String): Self = StObject.set(x, "campaignCriteriaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignCriteriaCountUndefined: Self = StObject.set(x, "campaignCriteriaCount", js.undefined)
    
    @scala.inline
    def setChannelsCount(value: String): Self = StObject.set(x, "channelsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsCountUndefined: Self = StObject.set(x, "channelsCount", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListsCount(value: String): Self = StObject.set(x, "negativeKeywordListsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeKeywordListsCountUndefined: Self = StObject.set(x, "negativeKeywordListsCount", js.undefined)
    
    @scala.inline
    def setNegativelyTargetedChannelsCount(value: String): Self = StObject.set(x, "negativelyTargetedChannelsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativelyTargetedChannelsCountUndefined: Self = StObject.set(x, "negativelyTargetedChannelsCount", js.undefined)
    
    @scala.inline
    def setUsedCampaignsCount(value: String): Self = StObject.set(x, "usedCampaignsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedCampaignsCountUndefined: Self = StObject.set(x, "usedCampaignsCount", js.undefined)
    
    @scala.inline
    def setUsedInsertionOrdersCount(value: String): Self = StObject.set(x, "usedInsertionOrdersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedInsertionOrdersCountUndefined: Self = StObject.set(x, "usedInsertionOrdersCount", js.undefined)
    
    @scala.inline
    def setUsedLineItemsCount(value: String): Self = StObject.set(x, "usedLineItemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedLineItemsCountUndefined: Self = StObject.set(x, "usedLineItemsCount", js.undefined)
  }
}

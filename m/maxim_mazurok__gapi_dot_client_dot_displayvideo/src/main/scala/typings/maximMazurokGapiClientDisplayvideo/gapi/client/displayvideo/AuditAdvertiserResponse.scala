package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditAdvertiserResponse extends js.Object {
  
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
  implicit class AuditAdvertiserResponseOps[Self <: AuditAdvertiserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdGroupCriteriaCount(value: String): Self = this.set("adGroupCriteriaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdGroupCriteriaCount: Self = this.set("adGroupCriteriaCount", js.undefined)
    
    @scala.inline
    def setCampaignCriteriaCount(value: String): Self = this.set("campaignCriteriaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignCriteriaCount: Self = this.set("campaignCriteriaCount", js.undefined)
    
    @scala.inline
    def setChannelsCount(value: String): Self = this.set("channelsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelsCount: Self = this.set("channelsCount", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListsCount(value: String): Self = this.set("negativeKeywordListsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywordListsCount: Self = this.set("negativeKeywordListsCount", js.undefined)
    
    @scala.inline
    def setNegativelyTargetedChannelsCount(value: String): Self = this.set("negativelyTargetedChannelsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativelyTargetedChannelsCount: Self = this.set("negativelyTargetedChannelsCount", js.undefined)
    
    @scala.inline
    def setUsedCampaignsCount(value: String): Self = this.set("usedCampaignsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedCampaignsCount: Self = this.set("usedCampaignsCount", js.undefined)
    
    @scala.inline
    def setUsedInsertionOrdersCount(value: String): Self = this.set("usedInsertionOrdersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedInsertionOrdersCount: Self = this.set("usedInsertionOrdersCount", js.undefined)
    
    @scala.inline
    def setUsedLineItemsCount(value: String): Self = this.set("usedLineItemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedLineItemsCount: Self = this.set("usedLineItemsCount", js.undefined)
  }
}

package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItem extends StObject {
  
  /** Account ID of this inventory item. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad slots of this inventory item. If this inventory item represents a standalone placement, there will be exactly one ad slot. If this inventory item represents a placement group,
    * there will be more than one ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.undefined
  
  /** Advertiser ID of this inventory item. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Content category ID of this inventory item. */
  var contentCategoryId: js.UndefOr[String] = js.undefined
  
  /** Estimated click-through rate of this inventory item. */
  var estimatedClickThroughRate: js.UndefOr[String] = js.undefined
  
  /** Estimated conversion rate of this inventory item. */
  var estimatedConversionRate: js.UndefOr[String] = js.undefined
  
  /** ID of this inventory item. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Whether this inventory item is in plan. */
  var inPlan: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItem". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Information about the most recent modification of this inventory item. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  
  /**
    * Name of this inventory item. For standalone inventory items, this is the same name as that of its only ad slot. For group inventory items, this can differ from the name of any of
    * its ad slots.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Negotiation channel ID of this inventory item. */
  var negotiationChannelId: js.UndefOr[String] = js.undefined
  
  /** Order ID of this inventory item. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** Placement strategy ID of this inventory item. */
  var placementStrategyId: js.UndefOr[String] = js.undefined
  
  /** Pricing of this inventory item. */
  var pricing: js.UndefOr[Pricing] = js.undefined
  
  /** Project ID of this inventory item. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** RFP ID of this inventory item. */
  var rfpId: js.UndefOr[String] = js.undefined
  
  /** ID of the site this inventory item is associated with. */
  var siteId: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this inventory item. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Type of inventory item. */
  var `type`: js.UndefOr[String] = js.undefined
}
object InventoryItem {
  
  @scala.inline
  def apply(): InventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit class InventoryItemMutableBuilder[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdSlots(value: js.Array[AdSlot]): Self = StObject.set(x, "adSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdSlotsUndefined: Self = StObject.set(x, "adSlots", js.undefined)
    
    @scala.inline
    def setAdSlotsVarargs(value: AdSlot*): Self = StObject.set(x, "adSlots", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setContentCategoryId(value: String): Self = StObject.set(x, "contentCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCategoryIdUndefined: Self = StObject.set(x, "contentCategoryId", js.undefined)
    
    @scala.inline
    def setEstimatedClickThroughRate(value: String): Self = StObject.set(x, "estimatedClickThroughRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedClickThroughRateUndefined: Self = StObject.set(x, "estimatedClickThroughRate", js.undefined)
    
    @scala.inline
    def setEstimatedConversionRate(value: String): Self = StObject.set(x, "estimatedConversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedConversionRateUndefined: Self = StObject.set(x, "estimatedConversionRate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInPlan(value: Boolean): Self = StObject.set(x, "inPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPlanUndefined: Self = StObject.set(x, "inPlan", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNegotiationChannelId(value: String): Self = StObject.set(x, "negotiationChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegotiationChannelIdUndefined: Self = StObject.set(x, "negotiationChannelId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPlacementStrategyId(value: String): Self = StObject.set(x, "placementStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyIdUndefined: Self = StObject.set(x, "placementStrategyId", js.undefined)
    
    @scala.inline
    def setPricing(value: Pricing): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRfpId(value: String): Self = StObject.set(x, "rfpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRfpIdUndefined: Self = StObject.set(x, "rfpId", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

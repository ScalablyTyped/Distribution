package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a buy from the Planning inventory store.
  */
@js.native
trait SchemaInventoryItem extends js.Object {
  
  /**
    * Account ID of this inventory item.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Ad slots of this inventory item. If this inventory item represents a
    * standalone placement, there will be exactly one ad slot. If this
    * inventory item represents a placement group, there will be more than one
    * ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[SchemaAdSlot]] = js.native
  
  /**
    * Advertiser ID of this inventory item.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Content category ID of this inventory item.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  
  /**
    * Estimated click-through rate of this inventory item.
    */
  var estimatedClickThroughRate: js.UndefOr[String] = js.native
  
  /**
    * Estimated conversion rate of this inventory item.
    */
  var estimatedConversionRate: js.UndefOr[String] = js.native
  
  /**
    * ID of this inventory item.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this inventory item is in plan.
    */
  var inPlan: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Information about the most recent modification of this inventory item.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Name of this inventory item. For standalone inventory items, this is the
    * same name as that of its only ad slot. For group inventory items, this
    * can differ from the name of any of its ad slots.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Negotiation channel ID of this inventory item.
    */
  var negotiationChannelId: js.UndefOr[String] = js.native
  
  /**
    * Order ID of this inventory item.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * Placement strategy ID of this inventory item.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  
  /**
    * Pricing of this inventory item.
    */
  var pricing: js.UndefOr[SchemaPricing] = js.native
  
  /**
    * Project ID of this inventory item.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * RFP ID of this inventory item.
    */
  var rfpId: js.UndefOr[String] = js.native
  
  /**
    * ID of the site this inventory item is associated with.
    */
  var siteId: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this inventory item.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Type of inventory item.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInventoryItem {
  
  @scala.inline
  def apply(): SchemaInventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItem]
  }
  
  @scala.inline
  implicit class SchemaInventoryItemOps[Self <: SchemaInventoryItem] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdSlotsVarargs(value: SchemaAdSlot*): Self = this.set("adSlots", js.Array(value :_*))
    
    @scala.inline
    def setAdSlots(value: js.Array[SchemaAdSlot]): Self = this.set("adSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdSlots: Self = this.set("adSlots", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setContentCategoryId(value: String): Self = this.set("contentCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCategoryId: Self = this.set("contentCategoryId", js.undefined)
    
    @scala.inline
    def setEstimatedClickThroughRate(value: String): Self = this.set("estimatedClickThroughRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedClickThroughRate: Self = this.set("estimatedClickThroughRate", js.undefined)
    
    @scala.inline
    def setEstimatedConversionRate(value: String): Self = this.set("estimatedConversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedConversionRate: Self = this.set("estimatedConversionRate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInPlan(value: Boolean): Self = this.set("inPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlan: Self = this.set("inPlan", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNegotiationChannelId(value: String): Self = this.set("negotiationChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegotiationChannelId: Self = this.set("negotiationChannelId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    
    @scala.inline
    def setPricing(value: SchemaPricing): Self = this.set("pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRfpId(value: String): Self = this.set("rfpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRfpId: Self = this.set("rfpId", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

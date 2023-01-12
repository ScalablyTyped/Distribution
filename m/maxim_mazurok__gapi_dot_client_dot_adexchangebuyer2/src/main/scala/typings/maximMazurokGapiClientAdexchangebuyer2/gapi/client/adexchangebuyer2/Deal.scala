package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deal extends StObject {
  
  /** Proposed flight end time of the deal. This will generally be stored in a granularity of a second. A value is not required for Private Auction deals or Preferred Deals. */
  var availableEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Proposed flight start time of the deal. This will generally be stored in the granularity of one second since deal serving starts at seconds boundary. Any time specified
    * with more granularity (e.g., in milliseconds) will be truncated towards the start of time in seconds.
    */
  var availableStartTime: js.UndefOr[String] = js.undefined
  
  /** Buyer private data (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.undefined
  
  /**
    * The product ID from which this deal was created. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an
    * error.
    */
  var createProductId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Revision number of the product that the deal was created from. If present on create, and the server `product_revision` has advanced since the passed-in
    * `create_product_revision`, an `ABORTED` error will be returned. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will
    * result in an error.
    */
  var createProductRevision: js.UndefOr[String] = js.undefined
  
  /** Output only. The time of the deal creation. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Specifies the creative pre-approval policy. */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.undefined
  
  /** Output only. Restricitions about the creatives associated with the deal (i.e., size) This is available for Programmatic Guaranteed/Preferred Deals in Ad Manager. */
  var creativeRestrictions: js.UndefOr[CreativeRestrictions] = js.undefined
  
  /** Output only. Specifies whether the creative is safeFrame compatible. */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.undefined
  
  /** Output only. A unique deal ID for the deal (server-assigned). */
  var dealId: js.UndefOr[String] = js.undefined
  
  /** Output only. Metadata about the serving status of this deal. */
  var dealServingMetadata: js.UndefOr[DealServingMetadata] = js.undefined
  
  /** The negotiable terms of the deal. */
  var dealTerms: js.UndefOr[DealTerms] = js.undefined
  
  /** The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. */
  var deliveryControl: js.UndefOr[DeliveryControl] = js.undefined
  
  /** Description for the deal terms. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The name of the deal. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The external deal ID assigned to this deal once the deal is finalized. This is the deal ID that shows up in serving/reporting etc. */
  var externalDealId: js.UndefOr[String] = js.undefined
  
  /** Output only. True, if the buyside inventory setup is complete for this deal. */
  var isSetupComplete: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Specifies the creative source for programmatic deals. PUBLISHER means creative is provided by seller and ADVERTISER means creative is provided by buyer. */
  var programmaticCreativeSource: js.UndefOr[String] = js.undefined
  
  /** Output only. ID of the proposal that this deal is part of. */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /** Output only. Seller contact information for the deal. */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  
  /**
    * The syndication product associated with the deal. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an
    * error.
    */
  var syndicationProduct: js.UndefOr[String] = js.undefined
  
  /** Output only. Specifies the subset of inventory targeted by the deal. */
  var targeting: js.UndefOr[MarketplaceTargeting] = js.undefined
  
  /** The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd together. */
  var targetingCriterion: js.UndefOr[js.Array[TargetingCriteria]] = js.undefined
  
  /** Output only. The time when the deal was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** The web property code for the seller copied over from the product. */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object Deal {
  
  inline def apply(): Deal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deal] (val x: Self) extends AnyVal {
    
    inline def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    inline def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    inline def setBuyerPrivateData(value: PrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setCreateProductId(value: String): Self = StObject.set(x, "createProductId", value.asInstanceOf[js.Any])
    
    inline def setCreateProductIdUndefined: Self = StObject.set(x, "createProductId", js.undefined)
    
    inline def setCreateProductRevision(value: String): Self = StObject.set(x, "createProductRevision", value.asInstanceOf[js.Any])
    
    inline def setCreateProductRevisionUndefined: Self = StObject.set(x, "createProductRevision", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreativePreApprovalPolicy(value: String): Self = StObject.set(x, "creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    inline def setCreativePreApprovalPolicyUndefined: Self = StObject.set(x, "creativePreApprovalPolicy", js.undefined)
    
    inline def setCreativeRestrictions(value: CreativeRestrictions): Self = StObject.set(x, "creativeRestrictions", value.asInstanceOf[js.Any])
    
    inline def setCreativeRestrictionsUndefined: Self = StObject.set(x, "creativeRestrictions", js.undefined)
    
    inline def setCreativeSafeFrameCompatibility(value: String): Self = StObject.set(x, "creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    
    inline def setCreativeSafeFrameCompatibilityUndefined: Self = StObject.set(x, "creativeSafeFrameCompatibility", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setDealServingMetadata(value: DealServingMetadata): Self = StObject.set(x, "dealServingMetadata", value.asInstanceOf[js.Any])
    
    inline def setDealServingMetadataUndefined: Self = StObject.set(x, "dealServingMetadata", js.undefined)
    
    inline def setDealTerms(value: DealTerms): Self = StObject.set(x, "dealTerms", value.asInstanceOf[js.Any])
    
    inline def setDealTermsUndefined: Self = StObject.set(x, "dealTerms", js.undefined)
    
    inline def setDeliveryControl(value: DeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    inline def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    inline def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    inline def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    inline def setProgrammaticCreativeSource(value: String): Self = StObject.set(x, "programmaticCreativeSource", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticCreativeSourceUndefined: Self = StObject.set(x, "programmaticCreativeSource", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setSellerContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value*))
    
    inline def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    inline def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    inline def setTargeting(value: MarketplaceTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    inline def setTargetingCriterion(value: js.Array[TargetingCriteria]): Self = StObject.set(x, "targetingCriterion", value.asInstanceOf[js.Any])
    
    inline def setTargetingCriterionUndefined: Self = StObject.set(x, "targetingCriterion", js.undefined)
    
    inline def setTargetingCriterionVarargs(value: TargetingCriteria*): Self = StObject.set(x, "targetingCriterion", js.Array(value*))
    
    inline def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}

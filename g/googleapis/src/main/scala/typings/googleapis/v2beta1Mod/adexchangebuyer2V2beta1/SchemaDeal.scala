package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A deal represents a segment of inventory for displaying ads on. A proposal
  * can contain multiple deals. A deal contains the terms and targeting
  * information that is used for serving.
  */
trait SchemaDeal extends StObject {
  
  /**
    * Proposed flight end time of the deal. This will generally be stored in a
    * granularity of a second. A value is not required for Private Auction
    * deals or Preferred Deals.
    */
  var availableEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional proposed flight start time of the deal. This will generally be
    * stored in the granularity of one second since deal serving starts at
    * seconds boundary. Any time specified with more granularity (e.g., in
    * milliseconds) will be truncated towards the start of time in seconds.
    */
  var availableStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.undefined
  
  /**
    * The product ID from which this deal was created.  Note: This field may be
    * set only when creating the resource. Modifying this field while updating
    * the resource will result in an error.
    */
  var createProductId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional revision number of the product that the deal was created from.
    * If present on create, and the server `product_revision` has advanced
    * sinced the passed-in `create_product_revision`, an `ABORTED` error will
    * be returned.  Note: This field may be set only when creating the
    * resource. Modifying this field while updating the resource will result in
    * an error.
    */
  var createProductRevision: js.UndefOr[String] = js.undefined
  
  /**
    * The time of the deal creation. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the creative pre-approval policy. @OutputOnly
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Restricitions about the creatives associated with the deal (i.e., size)
    * This is available for Programmatic Guaranteed/Preferred Deals in Ad
    * Manager. @OutputOnly
    */
  var creativeRestrictions: js.UndefOr[SchemaCreativeRestrictions] = js.undefined
  
  /**
    * Specifies whether the creative is safeFrame compatible. @OutputOnly
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.undefined
  
  /**
    * A unique deal ID for the deal (server-assigned). @OutputOnly
    */
  var dealId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the serving status of this deal. @OutputOnly
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.undefined
  
  /**
    * The negotiable terms of the deal.
    */
  var dealTerms: js.UndefOr[SchemaDealTerms] = js.undefined
  
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.undefined
  
  /**
    * Description for the deal terms.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the deal.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The external deal ID assigned to this deal once the deal is finalized.
    * This is the deal ID that shows up in serving/reporting etc. @OutputOnly
    */
  var externalDealId: js.UndefOr[String] = js.undefined
  
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the creative source for programmatic deals. PUBLISHER means
    * creative is provided by seller and ADVERTISER means creative is provided
    * by buyer. @OutputOnly
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the proposal that this deal is part of. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Seller contact information for the deal. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * The syndication product associated with the deal.  Note: This field may
    * be set only when creating the resource. Modifying this field while
    * updating the resource will result in an error.
    */
  var syndicationProduct: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the subset of inventory targeted by the deal. @OutputOnly
    */
  var targeting: js.UndefOr[SchemaMarketplaceTargeting] = js.undefined
  
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.undefined
  
  /**
    * The time when the deal was last updated. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The web property code for the seller copied over from the product.
    */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object SchemaDeal {
  
  @scala.inline
  def apply(): SchemaDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeal]
  }
  
  @scala.inline
  implicit class SchemaDealMutableBuilder[Self <: SchemaDeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    @scala.inline
    def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    @scala.inline
    def setCreateProductId(value: String): Self = StObject.set(x, "createProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateProductIdUndefined: Self = StObject.set(x, "createProductId", js.undefined)
    
    @scala.inline
    def setCreateProductRevision(value: String): Self = StObject.set(x, "createProductRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateProductRevisionUndefined: Self = StObject.set(x, "createProductRevision", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreativePreApprovalPolicy(value: String): Self = StObject.set(x, "creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativePreApprovalPolicyUndefined: Self = StObject.set(x, "creativePreApprovalPolicy", js.undefined)
    
    @scala.inline
    def setCreativeRestrictions(value: SchemaCreativeRestrictions): Self = StObject.set(x, "creativeRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeRestrictionsUndefined: Self = StObject.set(x, "creativeRestrictions", js.undefined)
    
    @scala.inline
    def setCreativeSafeFrameCompatibility(value: String): Self = StObject.set(x, "creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSafeFrameCompatibilityUndefined: Self = StObject.set(x, "creativeSafeFrameCompatibility", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    @scala.inline
    def setDealServingMetadata(value: SchemaDealServingMetadata): Self = StObject.set(x, "dealServingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealServingMetadataUndefined: Self = StObject.set(x, "dealServingMetadata", js.undefined)
    
    @scala.inline
    def setDealTerms(value: SchemaDealTerms): Self = StObject.set(x, "dealTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealTermsUndefined: Self = StObject.set(x, "dealTerms", js.undefined)
    
    @scala.inline
    def setDeliveryControl(value: SchemaDeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    @scala.inline
    def setProgrammaticCreativeSource(value: String): Self = StObject.set(x, "programmaticCreativeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgrammaticCreativeSourceUndefined: Self = StObject.set(x, "programmaticCreativeSource", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    @scala.inline
    def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    @scala.inline
    def setSellerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value :_*))
    
    @scala.inline
    def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    @scala.inline
    def setTargeting(value: SchemaMarketplaceTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = StObject.set(x, "targetingCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingCriterionUndefined: Self = StObject.set(x, "targetingCriterion", js.undefined)
    
    @scala.inline
    def setTargetingCriterionVarargs(value: SchemaTargetingCriteria*): Self = StObject.set(x, "targetingCriterion", js.Array(value :_*))
    
    @scala.inline
    def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}

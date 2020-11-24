package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A deal represents a segment of inventory for displaying ads on. A proposal
  * can contain multiple deals. A deal contains the terms and targeting
  * information that is used for serving.
  */
@js.native
trait SchemaDeal extends js.Object {
  
  /**
    * Proposed flight end time of the deal. This will generally be stored in a
    * granularity of a second. A value is not required for Private Auction
    * deals or Preferred Deals.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  
  /**
    * Optional proposed flight start time of the deal. This will generally be
    * stored in the granularity of one second since deal serving starts at
    * seconds boundary. Any time specified with more granularity (e.g., in
    * milliseconds) will be truncated towards the start of time in seconds.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  
  /**
    * The product ID from which this deal was created.  Note: This field may be
    * set only when creating the resource. Modifying this field while updating
    * the resource will result in an error.
    */
  var createProductId: js.UndefOr[String] = js.native
  
  /**
    * Optional revision number of the product that the deal was created from.
    * If present on create, and the server `product_revision` has advanced
    * sinced the passed-in `create_product_revision`, an `ABORTED` error will
    * be returned.  Note: This field may be set only when creating the
    * resource. Modifying this field while updating the resource will result in
    * an error.
    */
  var createProductRevision: js.UndefOr[String] = js.native
  
  /**
    * The time of the deal creation. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Specifies the creative pre-approval policy. @OutputOnly
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  
  /**
    * Restricitions about the creatives associated with the deal (i.e., size)
    * This is available for Programmatic Guaranteed/Preferred Deals in Ad
    * Manager. @OutputOnly
    */
  var creativeRestrictions: js.UndefOr[SchemaCreativeRestrictions] = js.native
  
  /**
    * Specifies whether the creative is safeFrame compatible. @OutputOnly
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  
  /**
    * A unique deal ID for the deal (server-assigned). @OutputOnly
    */
  var dealId: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the serving status of this deal. @OutputOnly
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.native
  
  /**
    * The negotiable terms of the deal.
    */
  var dealTerms: js.UndefOr[SchemaDealTerms] = js.native
  
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.native
  
  /**
    * Description for the deal terms.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the deal.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The external deal ID assigned to this deal once the deal is finalized.
    * This is the deal ID that shows up in serving/reporting etc. @OutputOnly
    */
  var externalDealId: js.UndefOr[String] = js.native
  
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the creative source for programmatic deals. PUBLISHER means
    * creative is provided by seller and ADVERTISER means creative is provided
    * by buyer. @OutputOnly
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  
  /**
    * ID of the proposal that this deal is part of. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * Seller contact information for the deal. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  
  /**
    * The syndication product associated with the deal.  Note: This field may
    * be set only when creating the resource. Modifying this field while
    * updating the resource will result in an error.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  
  /**
    * Specifies the subset of inventory targeted by the deal. @OutputOnly
    */
  var targeting: js.UndefOr[SchemaMarketplaceTargeting] = js.native
  
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  
  /**
    * The time when the deal was last updated. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * The web property code for the seller copied over from the product.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}
object SchemaDeal {
  
  @scala.inline
  def apply(): SchemaDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeal]
  }
  
  @scala.inline
  implicit class SchemaDealOps[Self <: SchemaDeal] (val x: Self) extends AnyVal {
    
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
    def setAvailableEndTime(value: String): Self = this.set("availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableEndTime: Self = this.set("availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: String): Self = this.set("availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableStartTime: Self = this.set("availableStartTime", js.undefined)
    
    @scala.inline
    def setBuyerPrivateData(value: SchemaPrivateData): Self = this.set("buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerPrivateData: Self = this.set("buyerPrivateData", js.undefined)
    
    @scala.inline
    def setCreateProductId(value: String): Self = this.set("createProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateProductId: Self = this.set("createProductId", js.undefined)
    
    @scala.inline
    def setCreateProductRevision(value: String): Self = this.set("createProductRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateProductRevision: Self = this.set("createProductRevision", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCreativePreApprovalPolicy(value: String): Self = this.set("creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativePreApprovalPolicy: Self = this.set("creativePreApprovalPolicy", js.undefined)
    
    @scala.inline
    def setCreativeRestrictions(value: SchemaCreativeRestrictions): Self = this.set("creativeRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeRestrictions: Self = this.set("creativeRestrictions", js.undefined)
    
    @scala.inline
    def setCreativeSafeFrameCompatibility(value: String): Self = this.set("creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSafeFrameCompatibility: Self = this.set("creativeSafeFrameCompatibility", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    
    @scala.inline
    def setDealServingMetadata(value: SchemaDealServingMetadata): Self = this.set("dealServingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealServingMetadata: Self = this.set("dealServingMetadata", js.undefined)
    
    @scala.inline
    def setDealTerms(value: SchemaDealTerms): Self = this.set("dealTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealTerms: Self = this.set("dealTerms", js.undefined)
    
    @scala.inline
    def setDeliveryControl(value: SchemaDeliveryControl): Self = this.set("deliveryControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryControl: Self = this.set("deliveryControl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExternalDealId(value: String): Self = this.set("externalDealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDealId: Self = this.set("externalDealId", js.undefined)
    
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = this.set("isSetupComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSetupComplete: Self = this.set("isSetupComplete", js.undefined)
    
    @scala.inline
    def setProgrammaticCreativeSource(value: String): Self = this.set("programmaticCreativeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgrammaticCreativeSource: Self = this.set("programmaticCreativeSource", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
    
    @scala.inline
    def setSellerContactsVarargs(value: SchemaContactInformation*): Self = this.set("sellerContacts", js.Array(value :_*))
    
    @scala.inline
    def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = this.set("sellerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerContacts: Self = this.set("sellerContacts", js.undefined)
    
    @scala.inline
    def setSyndicationProduct(value: String): Self = this.set("syndicationProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyndicationProduct: Self = this.set("syndicationProduct", js.undefined)
    
    @scala.inline
    def setTargeting(value: SchemaMarketplaceTargeting): Self = this.set("targeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargeting: Self = this.set("targeting", js.undefined)
    
    @scala.inline
    def setTargetingCriterionVarargs(value: SchemaTargetingCriteria*): Self = this.set("targetingCriterion", js.Array(value :_*))
    
    @scala.inline
    def setTargetingCriterion(value: js.Array[SchemaTargetingCriteria]): Self = this.set("targetingCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingCriterion: Self = this.set("targetingCriterion", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = this.set("webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyCode: Self = this.set("webPropertyCode", js.undefined)
  }
}

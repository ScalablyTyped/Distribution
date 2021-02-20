package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A proposal can contain multiple deals. A deal contains the terms and
  * targeting information that is used for serving.
  */
@js.native
trait SchemaMarketplaceDeal extends StObject {
  
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  
  /**
    * The time (ms since epoch) of the deal creation. (readonly)
    */
  var creationTimeMs: js.UndefOr[String] = js.native
  
  /**
    * Specifies the creative pre-approval policy (buyer-readonly)
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the creative is safeFrame compatible (buyer-readonly)
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  
  /**
    * A unique deal-id for the deal (readonly).
    */
  var dealId: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the serving status of this deal (readonly, writes via
    * custom actions)
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.native
  
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher. This
    * message is assigned an id of 100 since some day we would want to model
    * this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.native
  
  /**
    * The external deal id assigned to this deal once the deal is finalized.
    * This is the deal-id that shows up in serving/reporting etc. (readonly)
    */
  var externalDealId: js.UndefOr[String] = js.native
  
  /**
    * Proposed flight end time of the deal (ms since epoch) This will generally
    * be stored in a granularity of a second. (updatable)
    */
  var flightEndTimeMs: js.UndefOr[String] = js.native
  
  /**
    * Proposed flight start time of the deal (ms since epoch) This will
    * generally be stored in a granularity of a second. (updatable)
    */
  var flightStartTimeMs: js.UndefOr[String] = js.native
  
  /**
    * Description for the deal terms. (buyer-readonly)
    */
  var inventoryDescription: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the current deal is a RFP template. RFP template is
    * created by buyer and not based on seller created products.
    */
  var isRfpTemplate: js.UndefOr[Boolean] = js.native
  
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * (readonly, except via OrderSetupCompleted action)
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#marketplaceDeal&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The time (ms since epoch) when the deal was last updated. (readonly)
    */
  var lastUpdateTimeMs: js.UndefOr[String] = js.native
  
  /**
    * The name of the deal. (updatable)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The product-id from which this deal was created. (readonly, except on
    * create)
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The revision number of the product that the deal was created from
    * (readonly, except on create)
    */
  var productRevisionNumber: js.UndefOr[String] = js.native
  
  /**
    * Specifies the creative source for programmatic deals, PUBLISHER means
    * creative is provided by seller and ADVERTISR means creative is provided
    * by buyer. (buyer-readonly)
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * Optional Seller contact information for the deal (buyer-readonly)
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together. (updatable)
    */
  var sharedTargetings: js.UndefOr[js.Array[SchemaSharedTargeting]] = js.native
  
  /**
    * The syndication product associated with the deal. (readonly, except on
    * create)
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  
  /**
    * The negotiable terms of the deal. (updatable)
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.native
  
  var webPropertyCode: js.UndefOr[String] = js.native
}
object SchemaMarketplaceDeal {
  
  @scala.inline
  def apply(): SchemaMarketplaceDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDeal]
  }
  
  @scala.inline
  implicit class SchemaMarketplaceDealMutableBuilder[Self <: SchemaMarketplaceDeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    @scala.inline
    def setCreationTimeMs(value: String): Self = StObject.set(x, "creationTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeMsUndefined: Self = StObject.set(x, "creationTimeMs", js.undefined)
    
    @scala.inline
    def setCreativePreApprovalPolicy(value: String): Self = StObject.set(x, "creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativePreApprovalPolicyUndefined: Self = StObject.set(x, "creativePreApprovalPolicy", js.undefined)
    
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
    def setDeliveryControl(value: SchemaDeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    @scala.inline
    def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    @scala.inline
    def setFlightEndTimeMs(value: String): Self = StObject.set(x, "flightEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightEndTimeMsUndefined: Self = StObject.set(x, "flightEndTimeMs", js.undefined)
    
    @scala.inline
    def setFlightStartTimeMs(value: String): Self = StObject.set(x, "flightStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightStartTimeMsUndefined: Self = StObject.set(x, "flightStartTimeMs", js.undefined)
    
    @scala.inline
    def setInventoryDescription(value: String): Self = StObject.set(x, "inventoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryDescriptionUndefined: Self = StObject.set(x, "inventoryDescription", js.undefined)
    
    @scala.inline
    def setIsRfpTemplate(value: Boolean): Self = StObject.set(x, "isRfpTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRfpTemplateUndefined: Self = StObject.set(x, "isRfpTemplate", js.undefined)
    
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastUpdateTimeMs(value: String): Self = StObject.set(x, "lastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeMsUndefined: Self = StObject.set(x, "lastUpdateTimeMs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductRevisionNumber(value: String): Self = StObject.set(x, "productRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductRevisionNumberUndefined: Self = StObject.set(x, "productRevisionNumber", js.undefined)
    
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
    def setSharedTargetings(value: js.Array[SchemaSharedTargeting]): Self = StObject.set(x, "sharedTargetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTargetingsUndefined: Self = StObject.set(x, "sharedTargetings", js.undefined)
    
    @scala.inline
    def setSharedTargetingsVarargs(value: SchemaSharedTargeting*): Self = StObject.set(x, "sharedTargetings", js.Array(value :_*))
    
    @scala.inline
    def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    @scala.inline
    def setTerms(value: SchemaDealTerms): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}

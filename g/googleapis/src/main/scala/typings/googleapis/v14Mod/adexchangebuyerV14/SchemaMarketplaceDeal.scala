package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMarketplaceDeal extends StObject {
  
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.undefined
  
  /**
    * The time (ms since epoch) of the deal creation. (readonly)
    */
  var creationTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the creative pre-approval policy (buyer-readonly)
    */
  var creativePreApprovalPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether the creative is safeFrame compatible (buyer-readonly)
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique deal-id for the deal (readonly).
    */
  var dealId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the serving status of this deal (readonly, writes via custom actions)
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.undefined
  
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.undefined
  
  /**
    * The external deal id assigned to this deal once the deal is finalized. This is the deal-id that shows up in serving/reporting etc. (readonly)
    */
  var externalDealId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Proposed flight end time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable)
    */
  var flightEndTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Proposed flight start time of the deal (ms since epoch) This will generally be stored in a granularity of a second. (updatable)
    */
  var flightStartTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description for the deal terms. (buyer-readonly)
    */
  var inventoryDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the current deal is a RFP template. RFP template is created by buyer and not based on seller created products.
    */
  var isRfpTemplate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True, if the buyside inventory setup is complete for this deal. (readonly, except via OrderSetupCompleted action)
    */
  var isSetupComplete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceDeal".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time (ms since epoch) when the deal was last updated. (readonly)
    */
  var lastUpdateTimeMs: js.UndefOr[String | Null] = js.undefined
  
  var makegoodRequestedReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the deal. (updatable)
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The product-id from which this deal was created. (readonly, except on create)
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The revision number of the product that the deal was created from (readonly, except on create)
    */
  var productRevisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the creative source for programmatic deals, PUBLISHER means creative is provided by seller and ADVERTISR means creative is provided by buyer. (buyer-readonly)
    */
  var programmaticCreativeSource: js.UndefOr[String | Null] = js.undefined
  
  var proposalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional Seller contact information for the deal (buyer-readonly)
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting entity is AND'd together. (updatable)
    */
  var sharedTargetings: js.UndefOr[js.Array[SchemaSharedTargeting]] = js.undefined
  
  /**
    * The syndication product associated with the deal. (readonly, except on create)
    */
  var syndicationProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The negotiable terms of the deal. (updatable)
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.undefined
  
  var webPropertyCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaMarketplaceDeal {
  
  inline def apply(): SchemaMarketplaceDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDeal]
  }
  
  extension [Self <: SchemaMarketplaceDeal](x: Self) {
    
    inline def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setCreationTimeMs(value: String): Self = StObject.set(x, "creationTimeMs", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeMsNull: Self = StObject.set(x, "creationTimeMs", null)
    
    inline def setCreationTimeMsUndefined: Self = StObject.set(x, "creationTimeMs", js.undefined)
    
    inline def setCreativePreApprovalPolicy(value: String): Self = StObject.set(x, "creativePreApprovalPolicy", value.asInstanceOf[js.Any])
    
    inline def setCreativePreApprovalPolicyNull: Self = StObject.set(x, "creativePreApprovalPolicy", null)
    
    inline def setCreativePreApprovalPolicyUndefined: Self = StObject.set(x, "creativePreApprovalPolicy", js.undefined)
    
    inline def setCreativeSafeFrameCompatibility(value: String): Self = StObject.set(x, "creativeSafeFrameCompatibility", value.asInstanceOf[js.Any])
    
    inline def setCreativeSafeFrameCompatibilityNull: Self = StObject.set(x, "creativeSafeFrameCompatibility", null)
    
    inline def setCreativeSafeFrameCompatibilityUndefined: Self = StObject.set(x, "creativeSafeFrameCompatibility", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdNull: Self = StObject.set(x, "dealId", null)
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setDealServingMetadata(value: SchemaDealServingMetadata): Self = StObject.set(x, "dealServingMetadata", value.asInstanceOf[js.Any])
    
    inline def setDealServingMetadataUndefined: Self = StObject.set(x, "dealServingMetadata", js.undefined)
    
    inline def setDeliveryControl(value: SchemaDeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    inline def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    inline def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdNull: Self = StObject.set(x, "externalDealId", null)
    
    inline def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    inline def setFlightEndTimeMs(value: String): Self = StObject.set(x, "flightEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFlightEndTimeMsNull: Self = StObject.set(x, "flightEndTimeMs", null)
    
    inline def setFlightEndTimeMsUndefined: Self = StObject.set(x, "flightEndTimeMs", js.undefined)
    
    inline def setFlightStartTimeMs(value: String): Self = StObject.set(x, "flightStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFlightStartTimeMsNull: Self = StObject.set(x, "flightStartTimeMs", null)
    
    inline def setFlightStartTimeMsUndefined: Self = StObject.set(x, "flightStartTimeMs", js.undefined)
    
    inline def setInventoryDescription(value: String): Self = StObject.set(x, "inventoryDescription", value.asInstanceOf[js.Any])
    
    inline def setInventoryDescriptionNull: Self = StObject.set(x, "inventoryDescription", null)
    
    inline def setInventoryDescriptionUndefined: Self = StObject.set(x, "inventoryDescription", js.undefined)
    
    inline def setIsRfpTemplate(value: Boolean): Self = StObject.set(x, "isRfpTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsRfpTemplateNull: Self = StObject.set(x, "isRfpTemplate", null)
    
    inline def setIsRfpTemplateUndefined: Self = StObject.set(x, "isRfpTemplate", js.undefined)
    
    inline def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    inline def setIsSetupCompleteNull: Self = StObject.set(x, "isSetupComplete", null)
    
    inline def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdateTimeMs(value: String): Self = StObject.set(x, "lastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeMsNull: Self = StObject.set(x, "lastUpdateTimeMs", null)
    
    inline def setLastUpdateTimeMsUndefined: Self = StObject.set(x, "lastUpdateTimeMs", js.undefined)
    
    inline def setMakegoodRequestedReason(value: String): Self = StObject.set(x, "makegoodRequestedReason", value.asInstanceOf[js.Any])
    
    inline def setMakegoodRequestedReasonNull: Self = StObject.set(x, "makegoodRequestedReason", null)
    
    inline def setMakegoodRequestedReasonUndefined: Self = StObject.set(x, "makegoodRequestedReason", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductRevisionNumber(value: String): Self = StObject.set(x, "productRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProductRevisionNumberNull: Self = StObject.set(x, "productRevisionNumber", null)
    
    inline def setProductRevisionNumberUndefined: Self = StObject.set(x, "productRevisionNumber", js.undefined)
    
    inline def setProgrammaticCreativeSource(value: String): Self = StObject.set(x, "programmaticCreativeSource", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticCreativeSourceNull: Self = StObject.set(x, "programmaticCreativeSource", null)
    
    inline def setProgrammaticCreativeSourceUndefined: Self = StObject.set(x, "programmaticCreativeSource", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdNull: Self = StObject.set(x, "proposalId", null)
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value*))
    
    inline def setSharedTargetings(value: js.Array[SchemaSharedTargeting]): Self = StObject.set(x, "sharedTargetings", value.asInstanceOf[js.Any])
    
    inline def setSharedTargetingsUndefined: Self = StObject.set(x, "sharedTargetings", js.undefined)
    
    inline def setSharedTargetingsVarargs(value: SchemaSharedTargeting*): Self = StObject.set(x, "sharedTargetings", js.Array(value*))
    
    inline def setSyndicationProduct(value: String): Self = StObject.set(x, "syndicationProduct", value.asInstanceOf[js.Any])
    
    inline def setSyndicationProductNull: Self = StObject.set(x, "syndicationProduct", null)
    
    inline def setSyndicationProductUndefined: Self = StObject.set(x, "syndicationProduct", js.undefined)
    
    inline def setTerms(value: SchemaDealTerms): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setWebPropertyCode(value: String): Self = StObject.set(x, "webPropertyCode", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyCodeNull: Self = StObject.set(x, "webPropertyCode", null)
    
    inline def setWebPropertyCodeUndefined: Self = StObject.set(x, "webPropertyCode", js.undefined)
  }
}

package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProduct extends StObject {
  
  /**
    * The billed buyer corresponding to the buyer that created the offer. (readonly, except on create)
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The buyer that created the offer if this is a buyer initiated offer (readonly, except on create)
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * Creation time in ms. since epoch (readonly)
    */
  var creationTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional contact information for the creator of this product. (buyer-readonly)
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * The role that created the offer. Set to BUYER for buyer initiated offers.
    */
  var creatorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of fields around delivery control that are interesting for a buyer to see but are non-negotiable. These are set by the publisher. This message is assigned an id of 100 since some day we would want to model this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.undefined
  
  /**
    * The proposed end time for the deal (ms since epoch) (buyer-readonly)
    */
  var flightEndTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Inventory availability dates. (times are in ms since epoch) The granularity is generally in the order of seconds. (buyer-readonly)
    */
  var flightStartTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the creator has already signed off on the product, then the buyer can finalize the deal by accepting the product as is. When copying to a proposal, if any of the terms are changed, then auto_finalize is automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * What exchange will provide this inventory (readonly, except on create).
    */
  var inventorySource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#product".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional List of labels for the product (optional, buyer-readonly).
    */
  var labels: js.UndefOr[js.Array[SchemaMarketplaceLabel]] = js.undefined
  
  /**
    * Time of last update in ms. since epoch (readonly)
    */
  var lastUpdateTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional legacy offer id if this offer is a preferred deal offer.
    */
  var legacyOfferId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Marketplace publisher profile Id. This Id differs from the regular publisher_profile_id in that 1. This is a new id, the old Id will be deprecated in 2017. 2. This id uniquely identifies a publisher profile by itself.
    */
  var marketplacePublisherProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for this product as set by the seller. (buyer-readonly)
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional private auction id if this offer is a private auction offer.
    */
  var privateAuctionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id for the product (readonly)
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of the publisher profile for a given seller. A (seller.account_id, publisher_profile_id) pair uniquely identifies a publisher profile. Buyers can call the PublisherProfiles::List endpoint to get a list of publisher profiles for a given seller.
    */
  var publisherProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher self-provided forecast information.
    */
  var publisherProvidedForecast: js.UndefOr[SchemaPublisherProvidedForecast] = js.undefined
  
  /**
    * The revision number of the product. (readonly)
    */
  var revisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the seller that created this product (readonly, except on create)
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
  
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting criteria has a specified key and for each key there is a list of inclusion value or exclusion values. (buyer-readonly)
    */
  var sharedTargetings: js.UndefOr[js.Array[SchemaSharedTargeting]] = js.undefined
  
  /**
    * The state of the product. (buyer-readonly)
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The syndication product associated with the deal. (readonly, except on create)
    */
  var syndicationProduct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The negotiable terms of the deal (buyer-readonly)
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.undefined
  
  /**
    * The web property code for the seller. This field is meant to be copied over as is when creating deals.
    */
  var webPropertyCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaProduct {
  
  inline def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  extension [Self <: SchemaProduct](x: Self) {
    
    inline def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setCreationTimeMs(value: String): Self = StObject.set(x, "creationTimeMs", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeMsNull: Self = StObject.set(x, "creationTimeMs", null)
    
    inline def setCreationTimeMsUndefined: Self = StObject.set(x, "creationTimeMs", js.undefined)
    
    inline def setCreatorContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "creatorContacts", value.asInstanceOf[js.Any])
    
    inline def setCreatorContactsUndefined: Self = StObject.set(x, "creatorContacts", js.undefined)
    
    inline def setCreatorContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "creatorContacts", js.Array(value*))
    
    inline def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    inline def setCreatorRoleNull: Self = StObject.set(x, "creatorRole", null)
    
    inline def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    inline def setDeliveryControl(value: SchemaDeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    inline def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    inline def setFlightEndTimeMs(value: String): Self = StObject.set(x, "flightEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFlightEndTimeMsNull: Self = StObject.set(x, "flightEndTimeMs", null)
    
    inline def setFlightEndTimeMsUndefined: Self = StObject.set(x, "flightEndTimeMs", js.undefined)
    
    inline def setFlightStartTimeMs(value: String): Self = StObject.set(x, "flightStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFlightStartTimeMsNull: Self = StObject.set(x, "flightStartTimeMs", null)
    
    inline def setFlightStartTimeMsUndefined: Self = StObject.set(x, "flightStartTimeMs", js.undefined)
    
    inline def setHasCreatorSignedOff(value: Boolean): Self = StObject.set(x, "hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasCreatorSignedOffNull: Self = StObject.set(x, "hasCreatorSignedOff", null)
    
    inline def setHasCreatorSignedOffUndefined: Self = StObject.set(x, "hasCreatorSignedOff", js.undefined)
    
    inline def setInventorySource(value: String): Self = StObject.set(x, "inventorySource", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceNull: Self = StObject.set(x, "inventorySource", null)
    
    inline def setInventorySourceUndefined: Self = StObject.set(x, "inventorySource", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaMarketplaceLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaMarketplaceLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLastUpdateTimeMs(value: String): Self = StObject.set(x, "lastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeMsNull: Self = StObject.set(x, "lastUpdateTimeMs", null)
    
    inline def setLastUpdateTimeMsUndefined: Self = StObject.set(x, "lastUpdateTimeMs", js.undefined)
    
    inline def setLegacyOfferId(value: String): Self = StObject.set(x, "legacyOfferId", value.asInstanceOf[js.Any])
    
    inline def setLegacyOfferIdNull: Self = StObject.set(x, "legacyOfferId", null)
    
    inline def setLegacyOfferIdUndefined: Self = StObject.set(x, "legacyOfferId", js.undefined)
    
    inline def setMarketplacePublisherProfileId(value: String): Self = StObject.set(x, "marketplacePublisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setMarketplacePublisherProfileIdNull: Self = StObject.set(x, "marketplacePublisherProfileId", null)
    
    inline def setMarketplacePublisherProfileIdUndefined: Self = StObject.set(x, "marketplacePublisherProfileId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    inline def setPrivateAuctionIdNull: Self = StObject.set(x, "privateAuctionId", null)
    
    inline def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileIdNull: Self = StObject.set(x, "publisherProfileId", null)
    
    inline def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    inline def setPublisherProvidedForecast(value: SchemaPublisherProvidedForecast): Self = StObject.set(x, "publisherProvidedForecast", value.asInstanceOf[js.Any])
    
    inline def setPublisherProvidedForecastUndefined: Self = StObject.set(x, "publisherProvidedForecast", js.undefined)
    
    inline def setRevisionNumber(value: String): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberNull: Self = StObject.set(x, "revisionNumber", null)
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setSharedTargetings(value: js.Array[SchemaSharedTargeting]): Self = StObject.set(x, "sharedTargetings", value.asInstanceOf[js.Any])
    
    inline def setSharedTargetingsUndefined: Self = StObject.set(x, "sharedTargetings", js.undefined)
    
    inline def setSharedTargetingsVarargs(value: SchemaSharedTargeting*): Self = StObject.set(x, "sharedTargetings", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
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

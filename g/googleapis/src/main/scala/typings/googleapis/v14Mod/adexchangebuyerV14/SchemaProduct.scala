package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product is segment of inventory that a seller wishes to sell. It is
  * associated with certain terms and targeting information which helps buyer
  * know more about the inventory. Each field in a product can have one of the
  * following setting:  (readonly) - It is an error to try and set this field.
  * (buyer-readonly) - Only the seller can set this field. (seller-readonly) -
  * Only the buyer can set this field. (updatable) - The field is updatable at
  * all times by either buyer or the seller.
  */
trait SchemaProduct extends StObject {
  
  /**
    * The billed buyer corresponding to the buyer that created the offer.
    * (readonly, except on create)
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The buyer that created the offer if this is a buyer initiated offer
    * (readonly, except on create)
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * Creation time in ms. since epoch (readonly)
    */
  var creationTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * Optional contact information for the creator of this product.
    * (buyer-readonly)
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * The role that created the offer. Set to BUYER for buyer initiated offers.
    */
  var creatorRole: js.UndefOr[String] = js.undefined
  
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher. This
    * message is assigned an id of 100 since some day we would want to model
    * this as a protobuf extension.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.undefined
  
  /**
    * The proposed end time for the deal (ms since epoch) (buyer-readonly)
    */
  var flightEndTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory availability dates. (times are in ms since epoch) The
    * granularity is generally in the order of seconds. (buyer-readonly)
    */
  var flightStartTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * If the creator has already signed off on the product, then the buyer can
    * finalize the deal by accepting the product as is. When copying to a
    * proposal, if any of the terms are changed, then auto_finalize is
    * automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What exchange will provide this inventory (readonly, except on create).
    */
  var inventorySource: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#product&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Optional List of labels for the product (optional, buyer-readonly).
    */
  var labels: js.UndefOr[js.Array[SchemaMarketplaceLabel]] = js.undefined
  
  /**
    * Time of last update in ms. since epoch (readonly)
    */
  var lastUpdateTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * Optional legacy offer id if this offer is a preferred deal offer.
    */
  var legacyOfferId: js.UndefOr[String] = js.undefined
  
  /**
    * Marketplace publisher profile Id. This Id differs from the regular
    * publisher_profile_id in that 1. This is a new id, the old Id will be
    * deprecated in 2017. 2. This id uniquely identifies a publisher profile by
    * itself.
    */
  var marketplacePublisherProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The name for this product as set by the seller. (buyer-readonly)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional private auction id if this offer is a private auction offer.
    */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique id for the product (readonly)
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the publisher profile for a given seller. A (seller.account_id,
    * publisher_profile_id) pair uniquely identifies a publisher profile.
    * Buyers can call the PublisherProfiles::List endpoint to get a list of
    * publisher profiles for a given seller.
    */
  var publisherProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * Publisher self-provided forecast information.
    */
  var publisherProvidedForecast: js.UndefOr[SchemaPublisherProvidedForecast] = js.undefined
  
  /**
    * The revision number of the product. (readonly)
    */
  var revisionNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the seller that created this product (readonly, except
    * on create)
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
  
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting
    * criteria has a specified key and for each key there is a list of
    * inclusion value or exclusion values. (buyer-readonly)
    */
  var sharedTargetings: js.UndefOr[js.Array[SchemaSharedTargeting]] = js.undefined
  
  /**
    * The state of the product. (buyer-readonly)
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The syndication product associated with the deal. (readonly, except on
    * create)
    */
  var syndicationProduct: js.UndefOr[String] = js.undefined
  
  /**
    * The negotiable terms of the deal (buyer-readonly)
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.undefined
  
  /**
    * The web property code for the seller. This field is meant to be copied
    * over as is when creating deals.
    */
  var webPropertyCode: js.UndefOr[String] = js.undefined
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductMutableBuilder[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setCreationTimeMs(value: String): Self = StObject.set(x, "creationTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeMsUndefined: Self = StObject.set(x, "creationTimeMs", js.undefined)
    
    @scala.inline
    def setCreatorContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "creatorContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorContactsUndefined: Self = StObject.set(x, "creatorContacts", js.undefined)
    
    @scala.inline
    def setCreatorContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "creatorContacts", js.Array(value :_*))
    
    @scala.inline
    def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    @scala.inline
    def setDeliveryControl(value: SchemaDeliveryControl): Self = StObject.set(x, "deliveryControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryControlUndefined: Self = StObject.set(x, "deliveryControl", js.undefined)
    
    @scala.inline
    def setFlightEndTimeMs(value: String): Self = StObject.set(x, "flightEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightEndTimeMsUndefined: Self = StObject.set(x, "flightEndTimeMs", js.undefined)
    
    @scala.inline
    def setFlightStartTimeMs(value: String): Self = StObject.set(x, "flightStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightStartTimeMsUndefined: Self = StObject.set(x, "flightStartTimeMs", js.undefined)
    
    @scala.inline
    def setHasCreatorSignedOff(value: Boolean): Self = StObject.set(x, "hasCreatorSignedOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCreatorSignedOffUndefined: Self = StObject.set(x, "hasCreatorSignedOff", js.undefined)
    
    @scala.inline
    def setInventorySource(value: String): Self = StObject.set(x, "inventorySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceUndefined: Self = StObject.set(x, "inventorySource", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaMarketplaceLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaMarketplaceLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdateTimeMs(value: String): Self = StObject.set(x, "lastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeMsUndefined: Self = StObject.set(x, "lastUpdateTimeMs", js.undefined)
    
    @scala.inline
    def setLegacyOfferId(value: String): Self = StObject.set(x, "legacyOfferId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyOfferIdUndefined: Self = StObject.set(x, "legacyOfferId", js.undefined)
    
    @scala.inline
    def setMarketplacePublisherProfileId(value: String): Self = StObject.set(x, "marketplacePublisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketplacePublisherProfileIdUndefined: Self = StObject.set(x, "marketplacePublisherProfileId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    @scala.inline
    def setPublisherProvidedForecast(value: SchemaPublisherProvidedForecast): Self = StObject.set(x, "publisherProvidedForecast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProvidedForecastUndefined: Self = StObject.set(x, "publisherProvidedForecast", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: String): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    @scala.inline
    def setSharedTargetings(value: js.Array[SchemaSharedTargeting]): Self = StObject.set(x, "sharedTargetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTargetingsUndefined: Self = StObject.set(x, "sharedTargetings", js.undefined)
    
    @scala.inline
    def setSharedTargetingsVarargs(value: SchemaSharedTargeting*): Self = StObject.set(x, "sharedTargetings", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
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

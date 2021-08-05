package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proposal extends StObject {
  
  /** Reference to the buyer that will get billed for this proposal. (readonly) */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  
  /** Reference to the buyer on the proposal. (readonly, except on create) */
  var buyer: js.UndefOr[Buyer] = js.undefined
  
  /** Optional contact information of the buyer. (seller-readonly) */
  var buyerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  
  /** Private data for buyer. (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.undefined
  
  /** IDs of DBM advertisers permission to this proposal. */
  var dbmAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both sides have signed off on a deal, the proposal can be finalized by the seller.
    * (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both sides have signed off on a deal, the proposal can be finalized by the seller.
    * (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[Boolean] = js.undefined
  
  /** What exchange will provide this inventory (readonly, except on create). */
  var inventorySource: js.UndefOr[String] = js.undefined
  
  /** True if the proposal is being renegotiated (readonly). */
  var isRenegotiating: js.UndefOr[Boolean] = js.undefined
  
  /** True, if the buyside inventory setup is complete for this proposal. (readonly, except via OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag. */
  var isSetupComplete: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of labels associated with the proposal. (readonly) */
  var labels: js.UndefOr[js.Array[MarketplaceLabel]] = js.undefined
  
  /** The role of the last user that either updated the proposal or left a comment. (readonly) */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.undefined
  
  /** The name for the proposal (updatable) */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional negotiation id if this proposal is a preferred deal proposal. */
  var negotiationId: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the buyer/seller created the proposal.(readonly) */
  var originatorRole: js.UndefOr[String] = js.undefined
  
  /** Optional private auction id if this proposal is a private auction proposal. */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  
  /** The unique id of the proposal. (readonly). */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /** The current state of the proposal. (readonly) */
  var proposalState: js.UndefOr[String] = js.undefined
  
  /** The revision number for the proposal (readonly). */
  var revisionNumber: js.UndefOr[String] = js.undefined
  
  /** The time (ms since epoch) when the proposal was last revised (readonly). */
  var revisionTimeMs: js.UndefOr[String] = js.undefined
  
  /** Reference to the seller on the proposal. (readonly, except on create) */
  var seller: js.UndefOr[Seller] = js.undefined
  
  /** Optional contact information of the seller (buyer-readonly). */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
}
object Proposal {
  
  inline def apply(): Proposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proposal]
  }
  
  extension [Self <: Proposal](x: Self) {
    
    inline def setBilledBuyer(value: Buyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: Buyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    inline def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    inline def setBuyerContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "buyerContacts", js.Array(value :_*))
    
    inline def setBuyerPrivateData(value: PrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setDbmAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "dbmAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setDbmAdvertiserIdsUndefined: Self = StObject.set(x, "dbmAdvertiserIds", js.undefined)
    
    inline def setDbmAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "dbmAdvertiserIds", js.Array(value :_*))
    
    inline def setHasBuyerSignedOff(value: Boolean): Self = StObject.set(x, "hasBuyerSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasBuyerSignedOffUndefined: Self = StObject.set(x, "hasBuyerSignedOff", js.undefined)
    
    inline def setHasSellerSignedOff(value: Boolean): Self = StObject.set(x, "hasSellerSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasSellerSignedOffUndefined: Self = StObject.set(x, "hasSellerSignedOff", js.undefined)
    
    inline def setInventorySource(value: String): Self = StObject.set(x, "inventorySource", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceUndefined: Self = StObject.set(x, "inventorySource", js.undefined)
    
    inline def setIsRenegotiating(value: Boolean): Self = StObject.set(x, "isRenegotiating", value.asInstanceOf[js.Any])
    
    inline def setIsRenegotiatingUndefined: Self = StObject.set(x, "isRenegotiating", js.undefined)
    
    inline def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    inline def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Array[MarketplaceLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: MarketplaceLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setLastUpdaterOrCommentorRole(value: String): Self = StObject.set(x, "lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterOrCommentorRoleUndefined: Self = StObject.set(x, "lastUpdaterOrCommentorRole", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegotiationId(value: String): Self = StObject.set(x, "negotiationId", value.asInstanceOf[js.Any])
    
    inline def setNegotiationIdUndefined: Self = StObject.set(x, "negotiationId", js.undefined)
    
    inline def setOriginatorRole(value: String): Self = StObject.set(x, "originatorRole", value.asInstanceOf[js.Any])
    
    inline def setOriginatorRoleUndefined: Self = StObject.set(x, "originatorRole", js.undefined)
    
    inline def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    inline def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setProposalState(value: String): Self = StObject.set(x, "proposalState", value.asInstanceOf[js.Any])
    
    inline def setProposalStateUndefined: Self = StObject.set(x, "proposalState", js.undefined)
    
    inline def setRevisionNumber(value: String): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setRevisionTimeMs(value: String): Self = StObject.set(x, "revisionTimeMs", value.asInstanceOf[js.Any])
    
    inline def setRevisionTimeMsUndefined: Self = StObject.set(x, "revisionTimeMs", js.undefined)
    
    inline def setSeller(value: Seller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value :_*))
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
  }
}

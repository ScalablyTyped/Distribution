package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProposal extends StObject {
  
  /**
    * Reference to the buyer that will get billed for this proposal. (readonly)
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * Reference to the buyer on the proposal. (readonly, except on create)
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * Optional contact information of the buyer. (seller-readonly)
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
  
  /**
    * Private data for buyer. (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.undefined
  
  /**
    * IDs of DBM advertisers permission to this proposal.
    */
  var dbmAdvertiserIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off. Once both sides have signed off on a deal, the proposal can be finalized by the seller. (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has signed off Once both sides have signed off on a deal, the proposal can be finalized by the seller. (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * What exchange will provide this inventory (readonly, except on create).
    */
  var inventorySource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the proposal is being renegotiated (readonly).
    */
  var isRenegotiating: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True, if the buyside inventory setup is complete for this proposal. (readonly, except via OrderSetupCompleted action) Deprecated in favor of deal level setup complete flag.
    */
  var isSetupComplete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#proposal".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of labels associated with the proposal. (readonly)
    */
  var labels: js.UndefOr[js.Array[SchemaMarketplaceLabel]] = js.undefined
  
  /**
    * The role of the last user that either updated the proposal or left a comment. (readonly)
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for the proposal (updatable)
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional negotiation id if this proposal is a preferred deal proposal.
    */
  var negotiationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the buyer/seller created the proposal.(readonly)
    */
  var originatorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional private auction id if this proposal is a private auction proposal.
    */
  var privateAuctionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id of the proposal. (readonly).
    */
  var proposalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current state of the proposal. (readonly)
    */
  var proposalState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The revision number for the proposal (readonly).
    */
  var revisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time (ms since epoch) when the proposal was last revised (readonly).
    */
  var revisionTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reference to the seller on the proposal. (readonly, except on create)
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
  
  /**
    * Optional contact information of the seller (buyer-readonly).
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.undefined
}
object SchemaProposal {
  
  inline def apply(): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProposal]
  }
  
  extension [Self <: SchemaProposal](x: Self) {
    
    inline def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    inline def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    inline def setBuyerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "buyerContacts", js.Array(value*))
    
    inline def setBuyerPrivateData(value: SchemaPrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setDbmAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "dbmAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setDbmAdvertiserIdsNull: Self = StObject.set(x, "dbmAdvertiserIds", null)
    
    inline def setDbmAdvertiserIdsUndefined: Self = StObject.set(x, "dbmAdvertiserIds", js.undefined)
    
    inline def setDbmAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "dbmAdvertiserIds", js.Array(value*))
    
    inline def setHasBuyerSignedOff(value: Boolean): Self = StObject.set(x, "hasBuyerSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasBuyerSignedOffNull: Self = StObject.set(x, "hasBuyerSignedOff", null)
    
    inline def setHasBuyerSignedOffUndefined: Self = StObject.set(x, "hasBuyerSignedOff", js.undefined)
    
    inline def setHasSellerSignedOff(value: Boolean): Self = StObject.set(x, "hasSellerSignedOff", value.asInstanceOf[js.Any])
    
    inline def setHasSellerSignedOffNull: Self = StObject.set(x, "hasSellerSignedOff", null)
    
    inline def setHasSellerSignedOffUndefined: Self = StObject.set(x, "hasSellerSignedOff", js.undefined)
    
    inline def setInventorySource(value: String): Self = StObject.set(x, "inventorySource", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceNull: Self = StObject.set(x, "inventorySource", null)
    
    inline def setInventorySourceUndefined: Self = StObject.set(x, "inventorySource", js.undefined)
    
    inline def setIsRenegotiating(value: Boolean): Self = StObject.set(x, "isRenegotiating", value.asInstanceOf[js.Any])
    
    inline def setIsRenegotiatingNull: Self = StObject.set(x, "isRenegotiating", null)
    
    inline def setIsRenegotiatingUndefined: Self = StObject.set(x, "isRenegotiating", js.undefined)
    
    inline def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    inline def setIsSetupCompleteNull: Self = StObject.set(x, "isSetupComplete", null)
    
    inline def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaMarketplaceLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaMarketplaceLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLastUpdaterOrCommentorRole(value: String): Self = StObject.set(x, "lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterOrCommentorRoleNull: Self = StObject.set(x, "lastUpdaterOrCommentorRole", null)
    
    inline def setLastUpdaterOrCommentorRoleUndefined: Self = StObject.set(x, "lastUpdaterOrCommentorRole", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegotiationId(value: String): Self = StObject.set(x, "negotiationId", value.asInstanceOf[js.Any])
    
    inline def setNegotiationIdNull: Self = StObject.set(x, "negotiationId", null)
    
    inline def setNegotiationIdUndefined: Self = StObject.set(x, "negotiationId", js.undefined)
    
    inline def setOriginatorRole(value: String): Self = StObject.set(x, "originatorRole", value.asInstanceOf[js.Any])
    
    inline def setOriginatorRoleNull: Self = StObject.set(x, "originatorRole", null)
    
    inline def setOriginatorRoleUndefined: Self = StObject.set(x, "originatorRole", js.undefined)
    
    inline def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    inline def setPrivateAuctionIdNull: Self = StObject.set(x, "privateAuctionId", null)
    
    inline def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdNull: Self = StObject.set(x, "proposalId", null)
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setProposalState(value: String): Self = StObject.set(x, "proposalState", value.asInstanceOf[js.Any])
    
    inline def setProposalStateNull: Self = StObject.set(x, "proposalState", null)
    
    inline def setProposalStateUndefined: Self = StObject.set(x, "proposalState", js.undefined)
    
    inline def setRevisionNumber(value: String): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberNull: Self = StObject.set(x, "revisionNumber", null)
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
    
    inline def setRevisionTimeMs(value: String): Self = StObject.set(x, "revisionTimeMs", value.asInstanceOf[js.Any])
    
    inline def setRevisionTimeMsNull: Self = StObject.set(x, "revisionTimeMs", null)
    
    inline def setRevisionTimeMsUndefined: Self = StObject.set(x, "revisionTimeMs", js.undefined)
    
    inline def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: SchemaContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value*))
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
  }
}

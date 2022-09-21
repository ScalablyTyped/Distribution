package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMarketplaceNote extends StObject {
  
  /**
    * The role of the person (buyer/seller) creating the note. (readonly)
    */
  var creatorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notes can optionally be associated with a deal. (readonly, except on create)
    */
  var dealId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The actual note to attach. (readonly, except on create)
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique id for the note. (readonly)
    */
  var noteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The proposalId that a note is attached to. (readonly)
    */
  var proposalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the note is associated with a proposal revision number, then store that here. (readonly, except on create)
    */
  var proposalRevisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp (ms since epoch) that this note was created. (readonly)
    */
  var timestampMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaMarketplaceNote {
  
  inline def apply(): SchemaMarketplaceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceNote]
  }
  
  extension [Self <: SchemaMarketplaceNote](x: Self) {
    
    inline def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    inline def setCreatorRoleNull: Self = StObject.set(x, "creatorRole", null)
    
    inline def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdNull: Self = StObject.set(x, "dealId", null)
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    inline def setNoteIdNull: Self = StObject.set(x, "noteId", null)
    
    inline def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdNull: Self = StObject.set(x, "proposalId", null)
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberNull: Self = StObject.set(x, "proposalRevisionNumber", null)
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setTimestampMs(value: String): Self = StObject.set(x, "timestampMs", value.asInstanceOf[js.Any])
    
    inline def setTimestampMsNull: Self = StObject.set(x, "timestampMs", null)
    
    inline def setTimestampMsUndefined: Self = StObject.set(x, "timestampMs", js.undefined)
  }
}

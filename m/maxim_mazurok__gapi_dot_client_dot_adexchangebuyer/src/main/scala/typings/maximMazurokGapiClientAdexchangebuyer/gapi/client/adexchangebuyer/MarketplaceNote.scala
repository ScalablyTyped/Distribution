package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketplaceNote extends StObject {
  
  /** The role of the person (buyer/seller) creating the note. (readonly) */
  var creatorRole: js.UndefOr[String] = js.undefined
  
  /** Notes can optionally be associated with a deal. (readonly, except on create) */
  var dealId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The actual note to attach. (readonly, except on create) */
  var note: js.UndefOr[String] = js.undefined
  
  /** The unique id for the note. (readonly) */
  var noteId: js.UndefOr[String] = js.undefined
  
  /** The proposalId that a note is attached to. (readonly) */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /** If the note is associated with a proposal revision number, then store that here. (readonly, except on create) */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  
  /** The timestamp (ms since epoch) that this note was created. (readonly) */
  var timestampMs: js.UndefOr[String] = js.undefined
}
object MarketplaceNote {
  
  inline def apply(): MarketplaceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarketplaceNote] (val x: Self) extends AnyVal {
    
    inline def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    inline def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    inline def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setTimestampMs(value: String): Self = StObject.set(x, "timestampMs", value.asInstanceOf[js.Any])
    
    inline def setTimestampMsUndefined: Self = StObject.set(x, "timestampMs", js.undefined)
  }
}

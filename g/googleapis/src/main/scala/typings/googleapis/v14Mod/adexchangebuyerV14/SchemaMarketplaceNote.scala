package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A proposal is associated with a bunch of notes which may optionally be
  * associated with a deal and/or revision number.
  */
@js.native
trait SchemaMarketplaceNote extends StObject {
  
  /**
    * The role of the person (buyer/seller) creating the note. (readonly)
    */
  var creatorRole: js.UndefOr[String] = js.native
  
  /**
    * Notes can optionally be associated with a deal. (readonly, except on
    * create)
    */
  var dealId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#marketplaceNote&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The actual note to attach. (readonly, except on create)
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The unique id for the note. (readonly)
    */
  var noteId: js.UndefOr[String] = js.native
  
  /**
    * The proposalId that a note is attached to. (readonly)
    */
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * If the note is associated with a proposal revision number, then store
    * that here. (readonly, except on create)
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  
  /**
    * The timestamp (ms since epoch) that this note was created. (readonly)
    */
  var timestampMs: js.UndefOr[String] = js.native
}
object SchemaMarketplaceNote {
  
  @scala.inline
  def apply(): SchemaMarketplaceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceNote]
  }
  
  @scala.inline
  implicit class SchemaMarketplaceNoteMutableBuilder[Self <: SchemaMarketplaceNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    @scala.inline
    def setTimestampMs(value: String): Self = StObject.set(x, "timestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMsUndefined: Self = StObject.set(x, "timestampMs", js.undefined)
  }
}

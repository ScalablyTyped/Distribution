package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  /** Output only. The timestamp for when this note was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The role of the person (buyer/seller) creating the note. */
  var creatorRole: js.UndefOr[String] = js.undefined
  
  /**
    * The actual note to attach. (max-length: 1024 unicode code units) Note: This field may be set only when creating the resource. Modifying this field while updating the resource will
    * result in an error.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID for the note. */
  var noteId: js.UndefOr[String] = js.undefined
  
  /** Output only. The revision number of the proposal when the note is created. */
  var proposalRevision: js.UndefOr[String] = js.undefined
}
object Note {
  
  @scala.inline
  def apply(): Note = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
  }
}

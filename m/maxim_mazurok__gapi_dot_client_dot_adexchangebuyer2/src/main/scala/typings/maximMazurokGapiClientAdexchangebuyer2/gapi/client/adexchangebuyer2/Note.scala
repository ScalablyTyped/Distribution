package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends js.Object {
  
  /** Output only. The timestamp for when this note was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The role of the person (buyer/seller) creating the note. */
  var creatorRole: js.UndefOr[String] = js.native
  
  /**
    * The actual note to attach. (max-length: 1024 unicode code units) Note: This field may be set only when creating the resource. Modifying this field while updating the resource will
    * result in an error.
    */
  var note: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID for the note. */
  var noteId: js.UndefOr[String] = js.native
  
  /** Output only. The revision number of the proposal when the note is created. */
  var proposalRevision: js.UndefOr[String] = js.native
}
object Note {
  
  @scala.inline
  def apply(): Note = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteOps[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCreatorRole(value: String): Self = this.set("creatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRole: Self = this.set("creatorRole", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setNoteId(value: String): Self = this.set("noteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteId: Self = this.set("noteId", js.undefined)
    
    @scala.inline
    def setProposalRevision(value: String): Self = this.set("proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalRevision: Self = this.set("proposalRevision", js.undefined)
  }
}

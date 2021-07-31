package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A proposal may be associated to several notes.
  */
trait SchemaNote extends StObject {
  
  /**
    * The timestamp for when this note was created. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The role of the person (buyer/seller) creating the note. @OutputOnly
    */
  var creatorRole: js.UndefOr[String] = js.undefined
  
  /**
    * The actual note to attach. (max-length: 1024 unicode code units)  Note:
    * This field may be set only when creating the resource. Modifying this
    * field while updating the resource will result in an error.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the note. @OutputOnly
    */
  var noteId: js.UndefOr[String] = js.undefined
  
  /**
    * The revision number of the proposal when the note is created. @OutputOnly
    */
  var proposalRevision: js.UndefOr[String] = js.undefined
}
object SchemaNote {
  
  @scala.inline
  def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  
  @scala.inline
  implicit class SchemaNoteMutableBuilder[Self <: SchemaNote] (val x: Self) extends AnyVal {
    
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

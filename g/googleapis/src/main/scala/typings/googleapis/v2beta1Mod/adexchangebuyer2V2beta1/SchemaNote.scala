package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNote extends StObject {
  
  /**
    * Output only. The timestamp for when this note was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The role of the person (buyer/seller) creating the note.
    */
  var creatorRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The actual note to attach. (max-length: 1024 unicode code units) Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error.
    */
  var note: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique ID for the note.
    */
  var noteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revision number of the proposal when the note is created.
    */
  var proposalRevision: js.UndefOr[String | Null] = js.undefined
}
object SchemaNote {
  
  inline def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  
  extension [Self <: SchemaNote](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    inline def setCreatorRoleNull: Self = StObject.set(x, "creatorRole", null)
    
    inline def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteId(value: String): Self = StObject.set(x, "noteId", value.asInstanceOf[js.Any])
    
    inline def setNoteIdNull: Self = StObject.set(x, "noteId", null)
    
    inline def setNoteIdUndefined: Self = StObject.set(x, "noteId", js.undefined)
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNull: Self = StObject.set(x, "proposalRevision", null)
    
    inline def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
  }
}

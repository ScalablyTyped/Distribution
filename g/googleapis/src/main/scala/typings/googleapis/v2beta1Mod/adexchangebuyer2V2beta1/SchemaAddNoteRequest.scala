package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for adding a note to a given proposal.
  */
@js.native
trait SchemaAddNoteRequest extends js.Object {
  
  /**
    * Details of the note to add.
    */
  var note: js.UndefOr[SchemaNote] = js.native
}
object SchemaAddNoteRequest {
  
  @scala.inline
  def apply(): SchemaAddNoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNoteRequest]
  }
  
  @scala.inline
  implicit class SchemaAddNoteRequestOps[Self <: SchemaAddNoteRequest] (val x: Self) extends AnyVal {
    
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
    def setNote(value: SchemaNote): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
  }
}

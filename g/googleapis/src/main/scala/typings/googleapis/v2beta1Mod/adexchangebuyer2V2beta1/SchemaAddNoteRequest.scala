package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for adding a note to a given proposal.
  */
trait SchemaAddNoteRequest extends StObject {
  
  /**
    * Details of the note to add.
    */
  var note: js.UndefOr[SchemaNote] = js.undefined
}
object SchemaAddNoteRequest {
  
  @scala.inline
  def apply(): SchemaAddNoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNoteRequest]
  }
  
  @scala.inline
  implicit class SchemaAddNoteRequestMutableBuilder[Self <: SchemaAddNoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNote(value: SchemaNote): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}

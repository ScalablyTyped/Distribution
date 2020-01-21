package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(note: SchemaNote = null): SchemaAddNoteRequest = {
    val __obj = js.Dynamic.literal()
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddNoteRequest]
  }
}


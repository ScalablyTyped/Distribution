package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for creating notes in batch.
  */
@js.native
trait SchemaBatchCreateNotesResponse extends js.Object {
  /**
    * The notes that were created.
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.native
}

object SchemaBatchCreateNotesResponse {
  @scala.inline
  def apply(notes: js.Array[SchemaNote] = null): SchemaBatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchCreateNotesResponse]
  }
}


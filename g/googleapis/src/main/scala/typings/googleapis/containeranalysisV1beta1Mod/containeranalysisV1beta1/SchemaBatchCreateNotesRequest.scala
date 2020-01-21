package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create notes in batch.
  */
@js.native
trait SchemaBatchCreateNotesRequest extends js.Object {
  /**
    * The notes to create. Max allowed length is 1000.
    */
  var notes: js.UndefOr[StringDictionary[SchemaNote]] = js.native
}

object SchemaBatchCreateNotesRequest {
  @scala.inline
  def apply(notes: StringDictionary[SchemaNote] = null): SchemaBatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchCreateNotesRequest]
  }
}


package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for creating occurrences in batch.
  */
@js.native
trait SchemaBatchCreateOccurrencesResponse extends js.Object {
  /**
    * The occurrences that were created.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaBatchCreateOccurrencesResponse {
  @scala.inline
  def apply(occurrences: js.Array[SchemaOccurrence] = null): SchemaBatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesResponse]
  }
}


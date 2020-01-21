package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create occurrences in batch.
  */
@js.native
trait SchemaBatchCreateOccurrencesRequest extends js.Object {
  /**
    * The occurrences to create. Max allowed length is 1000.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaBatchCreateOccurrencesRequest {
  @scala.inline
  def apply(occurrences: js.Array[SchemaOccurrence] = null): SchemaBatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesRequest]
  }
}


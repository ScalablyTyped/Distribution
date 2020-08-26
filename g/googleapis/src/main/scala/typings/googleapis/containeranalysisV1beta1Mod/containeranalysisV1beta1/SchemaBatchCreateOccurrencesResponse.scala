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
  def apply(): SchemaBatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateOccurrencesResponse]
  }
  @scala.inline
  implicit class SchemaBatchCreateOccurrencesResponseOps[Self <: SchemaBatchCreateOccurrencesResponse] (val x: Self) extends AnyVal {
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
    def setOccurrencesVarargs(value: SchemaOccurrence*): Self = this.set("occurrences", js.Array(value :_*))
    @scala.inline
    def setOccurrences(value: js.Array[SchemaOccurrence]): Self = this.set("occurrences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrences: Self = this.set("occurrences", js.undefined)
  }
  
}


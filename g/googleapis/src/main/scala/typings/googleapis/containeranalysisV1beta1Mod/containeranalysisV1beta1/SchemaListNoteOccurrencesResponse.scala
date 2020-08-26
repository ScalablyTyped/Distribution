package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing occurrences for a note.
  */
@js.native
trait SchemaListNoteOccurrencesResponse extends js.Object {
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences attached to the specified note.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaListNoteOccurrencesResponse {
  @scala.inline
  def apply(): SchemaListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNoteOccurrencesResponse]
  }
  @scala.inline
  implicit class SchemaListNoteOccurrencesResponseOps[Self <: SchemaListNoteOccurrencesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOccurrencesVarargs(value: SchemaOccurrence*): Self = this.set("occurrences", js.Array(value :_*))
    @scala.inline
    def setOccurrences(value: js.Array[SchemaOccurrence]): Self = this.set("occurrences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrences: Self = this.set("occurrences", js.undefined)
  }
  
}


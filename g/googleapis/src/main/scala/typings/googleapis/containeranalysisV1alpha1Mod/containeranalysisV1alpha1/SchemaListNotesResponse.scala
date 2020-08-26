package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed notes.
  */
@js.native
trait SchemaListNotesResponse extends js.Object {
  /**
    * The next pagination token in the list response. It should be used as
    * page_token for the following request. An empty value means no more
    * result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences requested
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.native
}

object SchemaListNotesResponse {
  @scala.inline
  def apply(): SchemaListNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotesResponse]
  }
  @scala.inline
  implicit class SchemaListNotesResponseOps[Self <: SchemaListNotesResponse] (val x: Self) extends AnyVal {
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
    def setNotesVarargs(value: SchemaNote*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: js.Array[SchemaNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
  
}


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
  def apply(nextPageToken: String = null, notes: js.Array[SchemaNote] = null): SchemaListNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNotesResponse]
  }
}


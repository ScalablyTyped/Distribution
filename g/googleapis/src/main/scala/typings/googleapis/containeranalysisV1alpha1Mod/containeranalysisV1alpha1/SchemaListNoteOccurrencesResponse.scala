package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed occurrences for a note.
  */
@js.native
trait SchemaListNoteOccurrencesResponse extends js.Object {
  /**
    * Token to receive the next page of notes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences attached to the specified note.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaListNoteOccurrencesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, occurrences: js.Array[SchemaOccurrence] = null): SchemaListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (occurrences != null) __obj.updateDynamic("occurrences")(occurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNoteOccurrencesResponse]
  }
}


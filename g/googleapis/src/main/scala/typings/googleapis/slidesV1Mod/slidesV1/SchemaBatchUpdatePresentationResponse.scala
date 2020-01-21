package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message from a batch update.
  */
@js.native
trait SchemaBatchUpdatePresentationResponse extends js.Object {
  /**
    * The presentation the updates were applied to.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.native
}

object SchemaBatchUpdatePresentationResponse {
  @scala.inline
  def apply(
    presentationId: String = null,
    replies: js.Array[SchemaResponse] = null,
    writeControl: SchemaWriteControl = null
  ): SchemaBatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    if (presentationId != null) __obj.updateDynamic("presentationId")(presentationId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdatePresentationResponse]
  }
}


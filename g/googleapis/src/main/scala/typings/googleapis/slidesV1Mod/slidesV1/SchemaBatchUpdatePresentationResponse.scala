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
  def apply(): SchemaBatchUpdatePresentationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePresentationResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdatePresentationResponseOps[Self <: SchemaBatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
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
    def setPresentationId(value: String): Self = this.set("presentationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationId: Self = this.set("presentationId", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: SchemaResponse*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[SchemaResponse]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setWriteControl(value: SchemaWriteControl): Self = this.set("writeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteControl: Self = this.set("writeControl", js.undefined)
  }
  
}


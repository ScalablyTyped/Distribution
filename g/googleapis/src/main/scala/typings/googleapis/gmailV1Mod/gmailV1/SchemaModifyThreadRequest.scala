package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModifyThreadRequest extends js.Object {
  /**
    * A list of IDs of labels to add to this thread.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IDs of labels to remove from this thread.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyThreadRequest {
  @scala.inline
  def apply(): SchemaModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyThreadRequest]
  }
  @scala.inline
  implicit class SchemaModifyThreadRequestOps[Self <: SchemaModifyThreadRequest] (val x: Self) extends AnyVal {
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
    def setAddLabelIdsVarargs(value: String*): Self = this.set("addLabelIds", js.Array(value :_*))
    @scala.inline
    def setAddLabelIds(value: js.Array[String]): Self = this.set("addLabelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddLabelIds: Self = this.set("addLabelIds", js.undefined)
    @scala.inline
    def setRemoveLabelIdsVarargs(value: String*): Self = this.set("removeLabelIds", js.Array(value :_*))
    @scala.inline
    def setRemoveLabelIds(value: js.Array[String]): Self = this.set("removeLabelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveLabelIds: Self = this.set("removeLabelIds", js.undefined)
  }
  
}


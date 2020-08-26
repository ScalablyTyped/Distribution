package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountsCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccountsCustomBatchRequestEntry]] = js.native
}

object SchemaAccountsCustomBatchRequest {
  @scala.inline
  def apply(): SchemaAccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequest]
  }
  @scala.inline
  implicit class SchemaAccountsCustomBatchRequestOps[Self <: SchemaAccountsCustomBatchRequest] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: SchemaAccountsCustomBatchRequestEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaAccountsCustomBatchRequestEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}


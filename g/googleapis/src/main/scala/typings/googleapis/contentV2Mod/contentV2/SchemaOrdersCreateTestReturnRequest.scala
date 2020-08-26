package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestReturnRequest extends js.Object {
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}

object SchemaOrdersCreateTestReturnRequest {
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnRequest]
  }
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnRequestOps[Self <: SchemaOrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}


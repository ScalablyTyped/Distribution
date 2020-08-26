package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends js.Object {
  /**
    * Optional description of the return reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  @scala.inline
  def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOptionOps[Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}


package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOptionOps[Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] (val x: Self) extends AnyVal {
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


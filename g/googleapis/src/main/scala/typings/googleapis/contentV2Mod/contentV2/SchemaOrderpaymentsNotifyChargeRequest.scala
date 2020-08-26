package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyChargeRequest extends js.Object {
  /**
    * Whether charge was successful.
    */
  var chargeState: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the charge.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyChargeRequest]
  }
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyChargeRequestOps[Self <: SchemaOrderpaymentsNotifyChargeRequest] (val x: Self) extends AnyVal {
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
    def setChargeState(value: String): Self = this.set("chargeState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChargeState: Self = this.set("chargeState", js.undefined)
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    @scala.inline
    def setInvoiceIdsVarargs(value: String*): Self = this.set("invoiceIds", js.Array(value :_*))
    @scala.inline
    def setInvoiceIds(value: js.Array[String]): Self = this.set("invoiceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoiceIds: Self = this.set("invoiceIds", js.undefined)
  }
  
}


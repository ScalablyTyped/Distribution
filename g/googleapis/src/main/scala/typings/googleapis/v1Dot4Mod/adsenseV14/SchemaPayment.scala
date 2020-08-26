package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPayment extends js.Object {
  /**
    * Unique identifier of this Payment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#payment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The amount to be paid.
    */
  var paymentAmount: js.UndefOr[String] = js.native
  /**
    * The currency code for the amount to be paid.
    */
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.native
  /**
    * The date this payment was/will be credited to the user, or none if the
    * payment threshold has not been met.
    */
  var paymentDate: js.UndefOr[String] = js.native
}

object SchemaPayment {
  @scala.inline
  def apply(): SchemaPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayment]
  }
  @scala.inline
  implicit class SchemaPaymentOps[Self <: SchemaPayment] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPaymentAmount(value: String): Self = this.set("paymentAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentAmount: Self = this.set("paymentAmount", js.undefined)
    @scala.inline
    def setPaymentAmountCurrencyCode(value: String): Self = this.set("paymentAmountCurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentAmountCurrencyCode: Self = this.set("paymentAmountCurrencyCode", js.undefined)
    @scala.inline
    def setPaymentDate(value: String): Self = this.set("paymentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentDate: Self = this.set("paymentDate", js.undefined)
  }
  
}


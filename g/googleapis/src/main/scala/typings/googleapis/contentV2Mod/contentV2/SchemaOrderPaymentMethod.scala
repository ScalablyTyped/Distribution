package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderPaymentMethod extends js.Object {
  /**
    * The billing address.
    */
  var billingAddress: js.UndefOr[SchemaOrderAddress] = js.native
  /**
    * The card expiration month (January = 1, February = 2 etc.).
    */
  var expirationMonth: js.UndefOr[Double] = js.native
  /**
    * The card expiration year (4-digit, e.g. 2015).
    */
  var expirationYear: js.UndefOr[Double] = js.native
  /**
    * The last four digits of the card number.
    */
  var lastFourDigits: js.UndefOr[String] = js.native
  /**
    * The billing phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The type of instrument.  Acceptable values are:   - &quot;AMEX&quot;  -
    * &quot;DISCOVER&quot;  - &quot;JCB&quot;  - &quot;MASTERCARD&quot;  -
    * &quot;UNIONPAY&quot;  - &quot;VISA&quot;  - &quot;&quot;
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaOrderPaymentMethod {
  @scala.inline
  def apply(): SchemaOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPaymentMethod]
  }
  @scala.inline
  implicit class SchemaOrderPaymentMethodOps[Self <: SchemaOrderPaymentMethod] (val x: Self) extends AnyVal {
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
    def setBillingAddress(value: SchemaOrderAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setExpirationMonth(value: Double): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    @scala.inline
    def setExpirationYear(value: Double): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    @scala.inline
    def setLastFourDigits(value: String): Self = this.set("lastFourDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFourDigits: Self = this.set("lastFourDigits", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


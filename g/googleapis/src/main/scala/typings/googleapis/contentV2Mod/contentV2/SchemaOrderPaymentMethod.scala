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
  def apply(
    billingAddress: SchemaOrderAddress = null,
    expirationMonth: js.UndefOr[Double] = js.undefined,
    expirationYear: js.UndefOr[Double] = js.undefined,
    lastFourDigits: String = null,
    phoneNumber: String = null,
    `type`: String = null
  ): SchemaOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationMonth)) __obj.updateDynamic("expirationMonth")(expirationMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationYear)) __obj.updateDynamic("expirationYear")(expirationYear.get.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderPaymentMethod]
  }
}


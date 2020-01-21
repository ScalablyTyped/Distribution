package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  /**
    * Authorized amount for pre-tax charge on user&#39;s credit card.
    */
  var authAmountPretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * Authorized amount for tax charge on user&#39;s credit card.
    */
  var authAmountTax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaOrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(authAmountPretax: SchemaPrice = null, authAmountTax: SchemaPrice = null): SchemaOrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    if (authAmountPretax != null) __obj.updateDynamic("authAmountPretax")(authAmountPretax.asInstanceOf[js.Any])
    if (authAmountTax != null) __obj.updateDynamic("authAmountTax")(authAmountTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthApprovedRequest]
  }
}


package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnitInvoiceAdditionalCharge extends js.Object {
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(additionalChargeAmount: SchemaAmount = null, `type`: String = null): SchemaUnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeAmount != null) __obj.updateDynamic("additionalChargeAmount")(additionalChargeAmount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnitInvoiceAdditionalCharge]
  }
}


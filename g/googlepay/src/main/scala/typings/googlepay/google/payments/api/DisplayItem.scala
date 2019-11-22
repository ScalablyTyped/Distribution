package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayItem extends js.Object {
  var label: String
  var price: String
  var status: js.UndefOr[DisplayItemStatus] = js.undefined
  var `type`: DisplayItemType
}

object DisplayItem {
  @scala.inline
  def apply(label: String, price: String, `type`: DisplayItemType, status: DisplayItemStatus = null): DisplayItem = {
    val __obj = js.Dynamic.literal(label = label, price = price)
    __obj.updateDynamic("type")(`type`)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DisplayItem]
  }
}


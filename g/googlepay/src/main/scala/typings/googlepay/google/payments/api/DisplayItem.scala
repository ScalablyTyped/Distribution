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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayItem]
  }
}


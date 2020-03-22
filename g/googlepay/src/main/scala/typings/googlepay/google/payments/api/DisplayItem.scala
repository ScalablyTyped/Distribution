package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a cart item.
  */
trait DisplayItem extends js.Object {
  /**
    * The label to be displayed for the item.
    *
    * This field is required.
    */
  var label: String
  /**
    * Price of this item.
    *
    * The format of this string should follow the regular expression
    * format:
    * `^[0-9]+(\.[0-9][0-9])?$` (e.g., `"10.45"`)
    */
  var price: String
  /**
    * The status of a DisplayItem.
    *
    * This field is optional and default value is
    * [[DisplayItemStatus|`FINAL`]] if absent.
    */
  var status: js.UndefOr[DisplayItemStatus] = js.undefined
  /**
    * Type of displayed line item, this is going to be used for analysis
    * purpose.
    *
    * This field is required.
    */
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


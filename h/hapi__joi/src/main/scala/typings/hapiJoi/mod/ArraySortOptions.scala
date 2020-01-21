package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.ascending
import typings.hapiJoi.hapiJoiStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySortOptions extends js.Object {
  var by: js.UndefOr[String | Reference] = js.undefined
  /**
    * @default 'ascending'
    */
  var order: js.UndefOr[ascending | descending] = js.undefined
}

object ArraySortOptions {
  @scala.inline
  def apply(by: String | Reference = null, order: ascending | descending = null): ArraySortOptions = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySortOptions]
  }
}


package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: String
  var order: js.UndefOr[String] = js.undefined
}

object AnonColumn {
  @scala.inline
  def apply(column: String, order: String = null): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}


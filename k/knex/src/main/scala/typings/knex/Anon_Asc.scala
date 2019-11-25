package typings.knex

import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc[TRecord] extends js.Object {
  var column: String
  var order: js.UndefOr[asc | desc] = js.undefined
}

object Anon_Asc {
  @scala.inline
  def apply[TRecord](column: String, order: asc | desc = null): Anon_Asc[TRecord] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc[TRecord]]
  }
}


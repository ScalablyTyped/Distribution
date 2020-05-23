package typings.knex.anon

import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import typings.knex.mod.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[TRecord] extends js.Object {
  var column: (/* keyof TRecord */ String) | (QueryBuilder[_, _])
  var order: js.UndefOr[asc | desc] = js.undefined
}

object Column {
  @scala.inline
  def apply[TRecord](column: (/* keyof TRecord */ String) | (QueryBuilder[_, _]), order: asc | desc = null): Column[TRecord] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[TRecord]]
  }
}


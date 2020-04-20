package typings.knex

import typings.knex.mod.QueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  column  :string | knex.knex.QueryBuilder<any, any>,   order ? :string}> */
trait ReadonlycolumnstringQuery extends js.Object {
  val column: String | (QueryBuilder[_, _])
  val order: js.UndefOr[String] = js.undefined
}

object ReadonlycolumnstringQuery {
  @scala.inline
  def apply(column: String | (QueryBuilder[_, _]), order: String = null): ReadonlycolumnstringQuery = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlycolumnstringQuery]
  }
}


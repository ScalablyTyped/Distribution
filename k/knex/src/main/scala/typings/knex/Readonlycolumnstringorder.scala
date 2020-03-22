package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  column  :string,   order ? :string}> */
trait Readonlycolumnstringorder extends js.Object {
  val column: String
  val order: js.UndefOr[String] = js.undefined
}

object Readonlycolumnstringorder {
  @scala.inline
  def apply(column: String, order: String = null): Readonlycolumnstringorder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlycolumnstringorder]
  }
}


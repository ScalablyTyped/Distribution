package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: String
  var order: js.UndefOr[String] = js.undefined
}

object Anon_Column {
  @scala.inline
  def apply(column: String, order: String = null): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_Column]
  }
}


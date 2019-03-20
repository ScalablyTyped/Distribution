package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: java.lang.String
  var order: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Column {
  @scala.inline
  def apply(column: java.lang.String, order: java.lang.String = null): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_Column]
  }
}


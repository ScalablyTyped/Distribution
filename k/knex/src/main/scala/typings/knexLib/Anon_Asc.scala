package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc[TRecord] extends js.Object {
  var column: java.lang.String
  var order: js.UndefOr[knexLib.knexLibStrings.asc | knexLib.knexLibStrings.desc] = js.undefined
}

object Anon_Asc {
  @scala.inline
  def apply[TRecord](column: java.lang.String, order: knexLib.knexLibStrings.asc | knexLib.knexLibStrings.desc = null): Anon_Asc[TRecord] = {
    val __obj = js.Dynamic.literal(column = column)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc[TRecord]]
  }
}


package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql extends js.Object {
  var bindings: js.Array[knexLib.Value]
  var method: java.lang.String
  var options: js.Any
  var sql: java.lang.String
}

object Sql {
  @scala.inline
  def apply(
    bindings: js.Array[knexLib.Value],
    method: java.lang.String,
    options: js.Any,
    sql: java.lang.String
  ): Sql = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindings")(bindings)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[Sql]
  }
}


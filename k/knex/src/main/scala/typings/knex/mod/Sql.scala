package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql extends js.Object {
  var bindings: js.Array[Value]
  var method: String
  var options: js.Any
  var sql: String
  def toNative(): SqlNative
}

object Sql {
  @scala.inline
  def apply(bindings: js.Array[Value], method: String, options: js.Any, sql: String, toNative: () => SqlNative): Sql = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], toNative = js.Any.fromFunction0(toNative))
    __obj.asInstanceOf[Sql]
  }
}


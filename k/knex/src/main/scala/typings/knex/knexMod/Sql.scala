package typings.knex.knexMod

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
    val __obj = js.Dynamic.literal(bindings = bindings, method = method, options = options, sql = sql, toNative = js.Any.fromFunction0(toNative))
  
    __obj.asInstanceOf[Sql]
  }
}


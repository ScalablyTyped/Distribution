package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql extends js.Object {
  var bindings: js.Array[Value]
  var method: java.lang.String
  var options: js.Any
  var sql: java.lang.String
  def toNative(): SqlNative
}

object Sql {
  @scala.inline
  def apply(
    bindings: js.Array[Value],
    method: java.lang.String,
    options: js.Any,
    sql: java.lang.String,
    toNative: () => SqlNative
  ): Sql = {
    val __obj = js.Dynamic.literal(bindings = bindings, method = method, options = options, sql = sql, toNative = js.Any.fromFunction0(toNative))
  
    __obj.asInstanceOf[Sql]
  }
}


package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlNative extends js.Object {
  var bindings: js.Array[Value]
  var sql: String
}

object SqlNative {
  @scala.inline
  def apply(bindings: js.Array[Value], sql: String): SqlNative = {
    val __obj = js.Dynamic.literal(bindings = bindings, sql = sql)
  
    __obj.asInstanceOf[SqlNative]
  }
}


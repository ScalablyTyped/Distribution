package typings.knex.mod

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
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlNative]
  }
}


package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlNative extends js.Object {
  var bindings: js.Array[knexLib.Value]
  var sql: java.lang.String
}

object SqlNative {
  @scala.inline
  def apply(bindings: js.Array[knexLib.Value], sql: java.lang.String): SqlNative = {
    val __obj = js.Dynamic.literal(bindings = bindings, sql = sql)
  
    __obj.asInstanceOf[SqlNative]
  }
}


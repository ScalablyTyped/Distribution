package typings.jupyterlabStatedb.anon

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[T]
}

object Values {
  @scala.inline
  def apply[T](ids: js.Array[String], values: js.Array[T]): Values[T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
}


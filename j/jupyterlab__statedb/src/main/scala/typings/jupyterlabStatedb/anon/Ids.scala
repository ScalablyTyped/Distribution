package typings.jupyterlabStatedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids[V, T] extends js.Object {
  var ids: js.Array[V]
  var values: js.Array[T]
}

object Ids {
  @scala.inline
  def apply[V, T](ids: js.Array[V], values: js.Array[T]): Ids[V, T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids[V, T]]
  }
}


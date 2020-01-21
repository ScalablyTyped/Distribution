package typings.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIds[V, T] extends js.Object {
  var ids: js.Array[V]
  var values: js.Array[T]
}

object AnonIds {
  @scala.inline
  def apply[V, T](ids: js.Array[V], values: js.Array[T]): AnonIds[V, T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIds[V, T]]
  }
}


package typings
package atJupyterlabCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids[V, T] extends js.Object {
  var ids: js.Array[V]
  var values: js.Array[T]
}

object Anon_Ids {
  @scala.inline
  def apply[V, T](ids: js.Array[V], values: js.Array[T]): Anon_Ids[V, T] = {
    val __obj = js.Dynamic.literal(ids = ids, values = values)
  
    __obj.asInstanceOf[Anon_Ids[V, T]]
  }
}


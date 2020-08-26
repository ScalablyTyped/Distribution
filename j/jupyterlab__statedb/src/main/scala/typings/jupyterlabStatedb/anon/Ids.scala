package typings.jupyterlabStatedb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ids[V, T] extends js.Object {
  var ids: js.Array[V] = js.native
  var values: js.Array[T] = js.native
}

object Ids {
  @scala.inline
  def apply[V, T](ids: js.Array[V], values: js.Array[T]): Ids[V, T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids[V, T]]
  }
  @scala.inline
  implicit class IdsOps[Self <: Ids[_, _], V, T] (val x: Self with (Ids[V, T])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdsVarargs(value: V*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[V]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: T*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[T]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}


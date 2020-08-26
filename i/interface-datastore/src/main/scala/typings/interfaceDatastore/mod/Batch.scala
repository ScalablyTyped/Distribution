package typings.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch[Value] extends js.Object {
  def commit(): js.Promise[Unit] = js.native
  def delete(key: Key): Unit = js.native
  def put(key: Key, value: Value): Unit = js.native
}

object Batch {
  @scala.inline
  def apply[Value](commit: () => js.Promise[Unit], delete: Key => Unit, put: (Key, Value) => Unit): Batch[Value] = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), delete = js.Any.fromFunction1(delete), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Batch[Value]]
  }
  @scala.inline
  implicit class BatchOps[Self <: Batch[_], Value] (val x: Self with Batch[Value]) extends AnyVal {
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
    def setCommit(value: () => js.Promise[Unit]): Self = this.set("commit", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: Key => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setPut(value: (Key, Value) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
  }
  
}


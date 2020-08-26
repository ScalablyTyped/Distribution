package typings.interfaceDatastore.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datastore[Value] extends js.Object {
  def batch(): Batch[Value] = js.native
  def close(): js.Promise[Unit] = js.native
  def delete(key: Key): js.Promise[Unit] = js.native
  def get(key: Key): js.Promise[Value] = js.native
  def has(key: Key): js.Promise[Boolean] = js.native
  def open(): js.Promise[Unit] = js.native
  def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
  def query(q: Query[Value]): AsyncIterable[Result[Value]] = js.native
}

object Datastore {
  @scala.inline
  def apply[Value](
    batch: () => Batch[Value],
    close: () => js.Promise[Unit],
    delete: Key => js.Promise[Unit],
    get: Key => js.Promise[Value],
    has: Key => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    put: (Key, Value) => js.Promise[Unit],
    query: Query[Value] => AsyncIterable[Result[Value]]
  ): Datastore[Value] = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction0(batch), close = js.Any.fromFunction0(close), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), open = js.Any.fromFunction0(open), put = js.Any.fromFunction2(put), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[Datastore[Value]]
  }
  @scala.inline
  implicit class DatastoreOps[Self <: Datastore[_], Value] (val x: Self with Datastore[Value]) extends AnyVal {
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
    def setBatch(value: () => Batch[Value]): Self = this.set("batch", js.Any.fromFunction0(value))
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: Key => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => js.Promise[Value]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: Key => js.Promise[Boolean]): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setPut(value: (Key, Value) => js.Promise[Unit]): Self = this.set("put", js.Any.fromFunction2(value))
    @scala.inline
    def setQuery(value: Query[Value] => AsyncIterable[Result[Value]]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}


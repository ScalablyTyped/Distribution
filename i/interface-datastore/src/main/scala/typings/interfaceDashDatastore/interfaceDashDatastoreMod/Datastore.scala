package typings.interfaceDashDatastore.interfaceDashDatastoreMod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datastore[Value] extends js.Object {
  def batch(): Batch[Value]
  def close(): js.Promise[Unit]
  def delete(key: Key): js.Promise[Unit]
  def get(key: Key): js.Promise[Value]
  def has(key: Key): js.Promise[Boolean]
  def open(): js.Promise[Unit]
  def put(key: Key, `val`: Value): js.Promise[Unit]
  def query(q: Query[Value]): AsyncIterable[Result[Value]]
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
}


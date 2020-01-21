package typings.interfaceDatastore.mod

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("interface-datastore", "MemoryDatastore")
@js.native
class MemoryDatastore[Value] () extends Datastore[Value] {
  /* CompleteClass */
  override def batch(): Batch[Value] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[Value] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[Value]): AsyncIterable[Result[Value]] = js.native
}


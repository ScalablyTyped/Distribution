package typings.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Batch[Value] extends js.Object {
  def commit(): js.Promise[Unit]
  def delete(key: Key): Unit
  def put(key: Key, value: Value): Unit
}

object Batch {
  @scala.inline
  def apply[Value](commit: () => js.Promise[Unit], delete: Key => Unit, put: (Key, Value) => Unit): Batch[Value] = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), delete = js.Any.fromFunction1(delete), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Batch[Value]]
  }
}


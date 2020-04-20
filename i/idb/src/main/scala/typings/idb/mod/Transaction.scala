package typings.idb.mod

import typings.idb.idbStrings.readonly
import typings.idb.idbStrings.readwrite
import typings.idb.idbStrings.versionchange
import typings.std.DOMStringList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  /** Resolves when transaction completes, rejects if transaction aborts or errors. */
  val complete: js.Promise[Unit]
  /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible values, see the Constants section below. The default value is readonly. */
  val mode: readonly | readwrite | versionchange
  /** Returns a DOMStringList of the names of IDBObjectStore objects. */
  val objectStoreNames: DOMStringList
  /** Rolls back all the changes to objects in the database associated with this transaction. If this transaction has been aborted or completed, then this method throws an error event. */
  def abort(): Unit
  /** Returns an ObjectStore object representing an object store that is part of the scope of this transaction.
    * @param name The name of the requested object store.
    * @returns The object store in the context of the transaction. */
  def objectStore[TValue, TKey](name: String): ObjectStore[TValue, TKey]
}

object Transaction {
  @scala.inline
  def apply(
    abort: () => Unit,
    complete: js.Promise[Unit],
    mode: readonly | readwrite | versionchange,
    objectStore: String => ObjectStore[js.Any, js.Any],
    objectStoreNames: DOMStringList
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), complete = complete.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}


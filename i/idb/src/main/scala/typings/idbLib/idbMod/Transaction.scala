package typings
package idbLib.idbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  /** Resolves when transaction completes, rejects if transaction aborts or errors. */
  val complete: js.Promise[scala.Unit]
  /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible values, see the Constants section below. The default value is readonly. */
  val mode: idbLib.idbLibStrings.readonly | idbLib.idbLibStrings.readwrite | idbLib.idbLibStrings.versionchange
  /** Returns a DOMStringList of the names of IDBObjectStore objects. */
  val objectStoreNames: stdLib.DOMStringList
  /** Rolls back all the changes to objects in the database associated with this transaction. If this transaction has been aborted or completed, then this method throws an error event. */
  def abort(): scala.Unit
  /** Returns an ObjectStore object representing an object store that is part of the scope of this transaction.
    * @param name The name of the requested object store.
    * @returns The object store in the context of the transaction. */
  def objectStore[TValue, TKey](name: java.lang.String): ObjectStore[TValue, TKey]
}

object Transaction {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    complete: js.Promise[scala.Unit],
    mode: idbLib.idbLibStrings.readonly | idbLib.idbLibStrings.readwrite | idbLib.idbLibStrings.versionchange,
    objectStore: java.lang.String => ObjectStore[js.Any, js.Any],
    objectStoreNames: stdLib.DOMStringList
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), complete = complete, mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames)
  
    __obj.asInstanceOf[Transaction]
  }
}

